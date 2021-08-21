package com.anazen.fishing.Repository

import com.anazen.fishing.FishinGrounds
import com.anazen.fishing.LocalModel.LocalModel

class Repository(val localModel: LocalModel) {

    suspend fun getAll(): MutableList<FishinGrounds> {
        var fishList = localModel.getAll()
        return fishList
    }
}