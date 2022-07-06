package com.example.project1.detail_recommended

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.project1.R
import com.example.project1.model.RecommendedHotelData
import kotlin.coroutines.coroutineContext

/*
class RecommendedDetailAdapter(var context:Context) : RecyclerView.Adapter<RecommendedDetailAdapter.RecommendedDetailViewHolder>() {

    var source:RecommendedHotelData?=null
    get() = source

    class RecommendedDetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        lateinit var imageView : ImageView

        init {
            imageView = itemView.findViewById(R.id.list_recommended_detailImage) as ImageView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecommendedDetailViewHolder {
        return RecommendedDetailViewHolder(LayoutInflater.from(context).inflate(R.layout.list_recommended_detail,parent,false))
    }

    override fun onBindViewHolder(holder: RecommendedDetailViewHolder, position: Int) {
        source?.let { holder.imageView.setImageResource(it.imageSrc) }
    }

    override fun getItemCount(): Int {
        return source?.imageSrc2?.size!!
    }
}
 */

class RecommendedDetailAdapter(private var list_image: List<String>): RecyclerView.Adapter<RecommendedDetailAdapter.RecommendedDetailViewHolder>(){

    inner class RecommendedDetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val itemImage : ImageView = itemView.findViewById(R.id.list_recommended_detailImage)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecommendedDetailAdapter.RecommendedDetailViewHolder {
        return RecommendedDetailViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_recommended_detail,parent,false))
    }

    override fun onBindViewHolder(
        holder: RecommendedDetailAdapter.RecommendedDetailViewHolder,
        position: Int
    ) {
        Glide.with(holder.itemView.context)
            .load(list_image[position])
            .apply(RequestOptions()
                .placeholder(R.drawable.loading_animation)
                .error(R.drawable.ic_broken_image))
            .centerCrop()
            .into(holder.itemImage)
    }

    override fun getItemCount(): Int {
        return list_image.size
    }

}
