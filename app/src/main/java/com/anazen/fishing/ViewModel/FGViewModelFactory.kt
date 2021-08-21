package com.anazen.fishing.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.anazen.fishing.FishinGroundsViewModel
import com.anazen.fishing.Repository.Repository

class FGViewModelFactory(var repository: Repository): ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FishinGroundsViewModel::class.java)) {
            return FishinGroundsViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}


