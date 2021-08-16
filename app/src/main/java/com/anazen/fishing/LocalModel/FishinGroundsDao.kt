package com.anazen.fishing

import androidx.room.Dao
import androidx.room.Query

@Dao
interface FishinGroundsDao {
    @Query( "SElECT*FROM fishinGrounds")
    fun getAll():List<FishinGrounds>
}