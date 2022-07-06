package com.example.project1.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.project1.databinding.ListRecommendedHotelBinding
import com.example.project1.model.RecommendedHotelData

class RecommendedHotelAdapter(private val onClickListener: OnClickListener) :
    ListAdapter<RecommendedHotelData, RecommendedHotelAdapter.ViewHolder>(
        RecommendedHotelDiffCallback()
    ) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.itemView.setOnClickListener{
            onClickListener.onClick(item)
        }
        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    class ViewHolder private constructor(val binding: ListRecommendedHotelBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: RecommendedHotelData) {
            binding.recommended = item
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ListRecommendedHotelBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }

    class OnClickListener(val clickListener: (recommendedHotelData: RecommendedHotelData) -> Unit){
        fun onClick(recommendedHotelData: RecommendedHotelData) = clickListener(recommendedHotelData)
    }
}

class RecommendedHotelDiffCallback : DiffUtil.ItemCallback<RecommendedHotelData>() {
    override fun areItemsTheSame(
        oldItem: RecommendedHotelData,
        newItem: RecommendedHotelData
    ): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(
        oldItem: RecommendedHotelData,
        newItem: RecommendedHotelData
    ): Boolean {
        return oldItem == newItem
    }
}