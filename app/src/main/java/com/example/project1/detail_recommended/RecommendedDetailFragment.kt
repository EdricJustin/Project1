package com.example.project1.detail_recommended

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.project1.R
import com.example.project1.databinding.RecommendedDetailFragmentBinding
import com.google.android.material.tabs.TabLayoutMediator


class RecommendedDetailFragment : Fragment(){
    private lateinit var binding : RecommendedDetailFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.recommended_detail_fragment,container,false)

        val recommendedHotelData = RecommendedDetailFragmentArgs.fromBundle(requireArguments()).selectedProperty

        binding.headerDetailRecommended.setText(recommendedHotelData.name)
        //binding.recommendedDetailImage.setImageResource(recommendedHotelData.imageSrc)
        binding.recommendedDetailPrice.setText(recommendedHotelData.price)

        // Adapter
        //binding.detailViewPager.adapter = RecommendedDetailAdapter(this@RecommendedDetailFragment)
        binding.detailViewPager.adapter = RecommendedDetailAdapter(recommendedHotelData.imageSrc2)

        //Tab Layout
        TabLayoutMediator(binding.detailTabLayout, binding.detailViewPager,
            TabLayoutMediator.TabConfigurationStrategy({ tab, position -> })).attach()

        // Navigate when Button Clicked
        binding.closeIcon.setOnClickListener(){ view: View ->
            view.findNavController().navigate(R.id.action_recommendedDetailFragment_to_homeFragment)
        }

        return binding.root
    }
}