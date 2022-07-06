package com.example.project1.home

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.project1.R
import com.example.project1.model.PopularHotelData
import com.example.project1.model.RecommendedHotelData

/*
@BindingAdapter("hotelImage")
fun ImageView.setHotelImage(item: HomeFragmentViewModel.DataSource){
    setImageResource(when(item.data[0].toInt()){
        1 -> R.drawable.popular_hotel_1
        2 -> R.drawable.popular_hotel_2
        3 -> R.drawable.popular_hotel_3
        4 -> R.drawable.popular_hotel_4
        else -> R.drawable.popular_hotel_5
    })
}

@BindingAdapter("hotelName")
fun TextView.setHotelName(item: HomeFragmentViewModel.DataSource){
    text = item.data[2]
}

@BindingAdapter("hotelLocation")
fun TextView.setHotelLocation(item: HomeFragmentViewModel.DataSource){
    text = item.data[3]
}

@BindingAdapter("hotelRating")
fun TextView.setHotelRating(item: HomeFragmentViewModel.DataSource){
    text = item.data[1]
}
*/

/*
// Popular Hotel Data
@BindingAdapter("hotelImage")
fun ImageView.setHotelImage(item: PopularHotelData){
    setImageResource(item.imageSrc)
}

@BindingAdapter("hotelName")
fun TextView.setHotelName(item: PopularHotelData){
    text = item.name
}

@BindingAdapter("hotelLocation")
fun TextView.setHotelLocation(item: PopularHotelData){
    text = item.location
}

@BindingAdapter("hotelRating")
fun TextView.setHotelRating(item: PopularHotelData){
    text = item.rating
}

@BindingAdapter("hotelPrice")
fun TextView.setHotelPrice(item: PopularHotelData){
    text = item.price
}

// Recommended Hotel Data
@BindingAdapter("recommendedImage")
fun ImageView.setRecommendedImage(item: RecommendedHotelData){
    setImageResource(item.imageSrc)
}

@BindingAdapter("recommendedName")
fun TextView.setRecommendedName(item: RecommendedHotelData){
    text = item.name
}

@BindingAdapter("recommendedLocation")
fun TextView.setRecommendedLocation(item: RecommendedHotelData){
    text = item.location
}

@BindingAdapter("recommendedPrice")
fun TextView.setRecommendedPrice(item: RecommendedHotelData){
    text = item.price
}
 */

@BindingAdapter("textData")
fun TextView.setTextData(item: String){
    text = item
}

@BindingAdapter("imageData")
fun ImageView.setImageData(item: Int){
    setImageResource(item)
}



