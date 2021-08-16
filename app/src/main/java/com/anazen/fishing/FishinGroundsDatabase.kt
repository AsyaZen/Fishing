package com.anazen.fishing

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(FishinGrounds::class), version = 1)
abstract class FishinGroundsDatabase: RoomDatabase() {
    abstract fun fishinGrounds(): FishinGroundsDao
}