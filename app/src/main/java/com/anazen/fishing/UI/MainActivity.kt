package com.anazen.fishing
import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var fishList = mutableListOf<FishinGrounds>()
    lateinit var viewModel: FishinGroundsViewModel
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db: FishinGroundsDatabase = Room.databaseBuilder(
            applicationContext,
            FishinGroundsDatabase::class.java,
            "fishinGrounds"
        )
            .createFromAsset("fishinGrounds.db")
            .allowMainThreadQueries()/*Открытие не в основном потоке*/
            .build()

        fishList = db.fishinGrounds().getAll() as MutableList<FishinGrounds>
        Log.d("!!!fish", fishList.toString())

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHost) as NavHostFragment
        val navController = navHostFragment.navController

        setSupportActionBar(toolbar)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.ListFragment,R.id.MapsFragment,R.id.InfoFragment
            ), drawer_layout
        )
        setupActionBarWithNavController(navController,appBarConfiguration)
        toolbar.setupWithNavController(navController,drawer_layout)
        nav_view.setupWithNavController(navController)

        viewModel = ViewModelProvider(this).get(FishinGroundsViewModel::class.java)
        viewModel.fishinGroundsLife.postValue(fishList)

    }
}