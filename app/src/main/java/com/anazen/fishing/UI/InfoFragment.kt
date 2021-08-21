package com.anazen.fishing.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.anazen.fishing.FishinGroundsViewModel
import com.anazen.fishing.LocalModel.LocalModel
import com.anazen.fishing.MainActivity
import com.anazen.fishing.R
import com.anazen.fishing.Repository.Repository
import com.anazen.fishing.ViewModel.FGViewModelFactory

class InfoFragment : Fragment() {

    lateinit var viewModel: FishinGroundsViewModel
    lateinit var navController: NavController
    lateinit var viewModelFactory: FGViewModelFactory
    lateinit var repository: Repository

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        repository = Repository(localModel = LocalModel(requireContext()))
        viewModelFactory = FGViewModelFactory(repository)
        viewModel = ViewModelProvider(activity as MainActivity, viewModelFactory)
            .get(FishinGroundsViewModel::class.java)
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = view.findNavController()
    }
}