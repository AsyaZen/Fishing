package com.anazen.fishing
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.anazen.fishing.LocalModel.LocalModel
import com.anazen.fishing.Repository.Repository
import com.anazen.fishing.ViewModel.FGViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var fishList = mutableListOf<FishinGrounds>()
    lateinit var viewModel: FishinGroundsViewModel
    lateinit var viewModelFactory: FGViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        val localModel = LocalModel(this)
        var repository = Repository(localModel)

        viewModelFactory = FGViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory)
            .get(FishinGroundsViewModel::class.java)
        viewModel.repository = repository
    }
}