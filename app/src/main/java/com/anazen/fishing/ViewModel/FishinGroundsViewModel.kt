package com.anazen.fishing

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.anazen.fishing.Repository.Repository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FishinGroundsViewModel(var repository: Repository): ViewModel() {

    val fishinGroundsLife = MutableLiveData<MutableList<FishinGrounds>>(mutableListOf())
    var fgDetails: FishinGrounds? = null
    val scope = CoroutineScope(Dispatchers.IO)

    fun getAll() {
        scope.launch {
            val data = repository.getAll()
            fishinGroundsLife.postValue(data)
        }
    }
}