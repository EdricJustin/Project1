package com.example.project1.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.project1.databinding.ListPopularHotelBinding
import com.example.project1.model.PopularHotelData

/* Tes menggunakan textview saja
class HomeFragmentAdapter: RecyclerView.Adapter<TextItemViewHolder>() {
    var dt = listOf<HomeFragmentViewModel.DataSource>()

    override fun getItemCount() = dt.size

    override fun onBindViewHolder(holder: TextItemViewHolder, position: Int) {
        val item = dt[position]
        holder.textView.text = item.data.toString()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.list_popular_hotel, parent, false) as TextView

        return TextItemViewHolder(view)
    }
}
*/

/* Menggunakan data class DataSource pada view model
class HomeFragmentAdapter : ListAdapter<HomeFragmentViewModel.DataSource, HomeFragmentAdapter.ViewHolder>(
    PopularHotelDiffCallback()
){

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    class ViewHolder private constructor(val binding: ListPopularHotelBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(item: HomeFragmentViewModel.DataSource) {
            binding.hotel = item
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ListPopularHotelBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }

    class PopularHotelDiffCallback : DiffUtil.ItemCallback<HomeFragmentViewModel.DataSource>() {

        override fun areItemsTheSame(
            oldItem: HomeFragmentViewModel.DataSource,
            newItem: HomeFragmentViewModel.DataSource
        ): Boolean {
            return oldItem.data[0] == newItem.data[0]
        }

        override fun areContentsTheSame(
            oldItem: HomeFragmentViewModel.DataSource,
            newItem: HomeFragmentViewModel.DataSource
        ): Boolean {
            return oldItem == newItem
        }
    }
}
*/

class PopularHotelAdapter :
    ListAdapter<PopularHotelData, PopularHotelAdapter.ViewHolder>(
        PopularHotelDiffCallback()
    ) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    class ViewHolder private constructor(val binding: ListPopularHotelBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: PopularHotelData) {
            binding.hotel = item
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ListPopularHotelBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }

    class PopularHotelDiffCallback : DiffUtil.ItemCallback<PopularHotelData>() {
        override fun areItemsTheSame(
            oldItem: PopularHotelData,
            newItem: PopularHotelData
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: PopularHotelData,
            newItem: PopularHotelData
        ): Boolean {
            return oldItem == newItem
        }
    }
}