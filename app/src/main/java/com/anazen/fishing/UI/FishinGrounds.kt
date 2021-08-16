package com.anazen.fishing

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fishinGrounds")
data class FishinGrounds(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String?,
    val location: String?,
    val area: Double?,
    val method: String?,
    val region: String?,
    val district: String?,
    val additions: String?,
    val latitude: Double?,
    val longitude: Double?,
    val image: String?
)