package com.anazen.fishing

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
//import com.anazen.fishing.Repository.Repository
//import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FishinGroundsViewModel: ViewModel() {

    val fishinGroundsLife = MutableLiveData<MutableList<FishinGrounds>>(mutableListOf())
    var fgDetails: FishinGrounds? = null

}