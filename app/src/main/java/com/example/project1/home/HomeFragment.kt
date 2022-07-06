package com.example.project1.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.project1.R
import com.example.project1.databinding.HomeFragmentBinding
import com.example.project1.model.RecommendedHotelData


class HomeFragment : Fragment() {
    private lateinit var binding: HomeFragmentBinding
    private lateinit var viewModel: HomeFragmentViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.home_fragment,container,false)
        viewModel = ViewModelProvider(this).get(HomeFragmentViewModel::class.java)

        // Tes menggunakan text view
        // adapter.dt = viewModel.data_source

        // Menggunakan data class DataSource pada view model
        // adapter.submitList(viewModel.data_source)

        // Tell Recycler View about Adapter
        // Popular Hotel Adapter
        val adapter = PopularHotelAdapter()
        binding.popularHotelList.adapter = adapter
        adapter.submitList(viewModel.generateData())

        // Recommended Hotel Adapter
        val recommended_adapter = RecommendedHotelAdapter(RecommendedHotelAdapter.OnClickListener{
            this.findNavController().navigate(
                HomeFragmentDirections.actionHomeFragmentToRecommendedDetailFragment(it))
        })
        binding.recommendedHotelList.adapter = recommended_adapter
        recommended_adapter.submitList(viewModel.generateRecommendedData())

        // Popular Hotel Manager
        val manager = GridLayoutManager(activity, 1, GridLayoutManager.HORIZONTAL, false)
        binding.popularHotelList.layoutManager = manager

        // Recommended Hotel Manager
        val recommended_manager = GridLayoutManager(activity, 1, GridLayoutManager.VERTICAL, false)
        binding.recommendedHotelList.layoutManager = recommended_manager

        // Navigate when TextView Clicked
        binding.seeAllMenu.setOnClickListener(){ view: View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_popularDetailFragment)
        }
        return binding.root
    }
}
