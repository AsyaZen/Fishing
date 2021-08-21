package com.anazen.fishing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.anazen.fishing.LocalModel.LocalModel
import com.anazen.fishing.Repository.Repository
import com.anazen.fishing.ViewModel.FGViewModelFactory
import kotlinx.android.synthetic.main.fragment_details.*

class DetailsFragment : Fragment() {

    lateinit var navController: NavController
    lateinit var viewModel: FishinGroundsViewModel
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
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        navController = findNavController()
        detName.text = viewModel.fgDetails?.name
        detRegion.text = viewModel.fgDetails?.region
        detDistrict.text = viewModel.fgDetails?.district
        detAdditions.text = viewModel.fgDetails?.additions
        detMethod.text = viewModel.fgDetails?.method
        detLocation.text = viewModel.fgDetails?.location
    }
}