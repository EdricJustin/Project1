package com.example.project1.detail_popular

import PopularDetailAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.project1.R
import com.example.project1.databinding.PopularDetailFragmentBinding
import com.example.project1.home.PopularHotelAdapter

class PopularDetailFragment : Fragment() {
    private lateinit var binding: PopularDetailFragmentBinding
    private lateinit var viewModel : PopularDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.popular_detail_fragment,container,false)
        viewModel = ViewModelProvider(this).get(PopularDetailViewModel::class.java)

        //Tell Recycler View about Adapter
        val adapter = PopularDetailAdapter()
        binding.popularDetailList.adapter = adapter
        adapter.submitList(viewModel.generateData())

        // Layout Manager
        val manager = GridLayoutManager(activity, 1, GridLayoutManager.VERTICAL, false)
        binding.popularDetailList.layoutManager = manager

        // Navigate when Button Clicked
        binding.backButton.setOnClickListener(){ view: View ->
            view.findNavController().navigate(R.id.action_popularDetailFragment_to_homeFragment)
        }

        return binding.root
    }

}