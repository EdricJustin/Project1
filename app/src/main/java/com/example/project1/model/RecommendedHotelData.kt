package com.example.project1.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class RecommendedHotelData(
    var id: String,
    var name: String,
    var location: String,
    var imageSrc: Int,
    var price: String,
    var imageSrc2: List<String>
) : Parcelable{

}
