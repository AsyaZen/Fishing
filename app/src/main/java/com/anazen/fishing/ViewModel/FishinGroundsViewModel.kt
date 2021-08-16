package com.anazen.fishing

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
//import com.anazen.fishing.Repository.Repository
//import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FishinGroundsViewModel: ViewModel() {
//    val fishinGroundsLife: MutableLiveData<MutableList<FishinGrounds>> by lazy {
//        MutableLiveData<MutableList<FishinGrounds>>(mutableListOf())
//    }

    val fishinGroundsLife = MutableLiveData<MutableList<FishinGrounds>>(mutableListOf())
    var fgDetails: FishinGrounds? = null
//    val scope = CoroutineScope(Dispatchers.IO)
//    lateinit var repository: Repository

//    fun getDB() {
//        scope.launch {
//            val data = repository.getDB()
//            fishinGroundsLife.postValue(data)
//        }
//    }
}