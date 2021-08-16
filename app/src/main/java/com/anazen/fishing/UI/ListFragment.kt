package com.anazen.fishing

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment() {

    lateinit var navController: NavController
    lateinit var viewModel: FishinGroundsViewModel
    lateinit var adapter: MyAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(activity as MainActivity).get(FishinGroundsViewModel::class.java)
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = findNavController()

        adapter = MyAdapter(viewModel.fishinGroundsLife.value!!, this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(activity as MainActivity)

        viewModel.fishinGroundsLife.observe(activity as MainActivity, Observer {
            Log.d("!!!",it.toString())
            var flNew = mutableListOf<FishinGrounds>()
            for(fg in it) {
                if (fg.latitude != null && fg.longitude !=null) {
                    flNew.add(fg)
                    Log.d("!!!new",flNew.toString())
                }
            }
            adapter.list = flNew
            recyclerView.adapter?.notifyDataSetChanged()
        })
    }

    fun showDetails(position: Int) {
        viewModel.fgDetails = viewModel.fishinGroundsLife.value?.get(position)
        navController.navigate(R.id.DetailsFragment)
    }
}