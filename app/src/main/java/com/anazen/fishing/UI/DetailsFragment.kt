package com.anazen.fishing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_details.*

class DetailsFragment : Fragment() {

lateinit var viewModel: FishinGroundsViewModel
lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(activity as MainActivity).get(FishinGroundsViewModel::class.java)
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