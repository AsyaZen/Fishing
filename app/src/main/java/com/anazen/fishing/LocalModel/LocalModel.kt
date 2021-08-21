package com.anazen.fishing.LocalModel

import android.content.Context
import androidx.room.Room
import com.anazen.fishing.FishinGrounds
import com.anazen.fishing.FishinGroundsDatabase

class LocalModel(private val context: Context) {
    val db: FishinGroundsDatabase = Room.databaseBuilder(
        context,
        FishinGroundsDatabase::class.java,
        "fishinGrounds"
    )
        .createFromAsset("fishinGrounds.db")
        .build()

    suspend fun getAll(): MutableList<FishinGrounds> {
        return db.fishinGrounds().getAll()
    }
}
