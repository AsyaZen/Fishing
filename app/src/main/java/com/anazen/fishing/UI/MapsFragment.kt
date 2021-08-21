package com.anazen.fishing

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.anazen.fishing.LocalModel.LocalModel
import com.anazen.fishing.Repository.Repository
import com.anazen.fishing.ViewModel.FGViewModelFactory
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*


class MapsFragment : Fragment() {

    lateinit var viewModel: FishinGroundsViewModel
    lateinit var viewModelFactory: FGViewModelFactory
    lateinit var repository: Repository
    lateinit var fragment: ListFragment

    private val callback = OnMapReadyCallback { googleMap ->

        val Belarus = LatLng(53.626574, 28.107063)
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Belarus,6f))
        val iconDesc = BitmapDescriptorFactory.fromResource(R.drawable.icon)


        val fishList = viewModel.fishinGroundsLife.value!!
        for(fg in fishList) {
            if (fg.latitude != null && fg.longitude != null) {
                googleMap.addMarker(
                    MarkerOptions()
                        .position(LatLng(fg.latitude, fg.longitude)).title(fg.name).icon(iconDesc)
                )

            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        repository = Repository(localModel = LocalModel(requireContext()))
        viewModelFactory = FGViewModelFactory(repository)
        viewModel = ViewModelProvider(activity as MainActivity, viewModelFactory)
            .get(FishinGroundsViewModel::class.java)
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}

