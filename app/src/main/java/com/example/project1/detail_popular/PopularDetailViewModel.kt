package com.example.project1.detail_popular

import androidx.lifecycle.ViewModel
import com.example.project1.R
import com.example.project1.model.PopularHotelData

class PopularDetailViewModel : ViewModel() {
    fun generateData() : List<PopularHotelData>{
        var list : MutableList<PopularHotelData> = arrayListOf()
        list.add(
            PopularHotelData("1", "4.8", "Karma Kandara", "Unggasan, Bali",
            R.drawable.popular_hotel_1, "$250"
        )
        )
        list.add(
            PopularHotelData("2", "4.7", "The Edge Bali", "Uluwatu, Bali",
            R.drawable.popular_hotel_2, "$270"
        )
        )
        list.add(
            PopularHotelData("3", "4.9", "Ulu Segara", "Nusa Dua, Bali",
            R.drawable.popular_hotel_3, "$290"
        )
        )
        list.add(
            PopularHotelData("4", "4.6", "Alila Ubud Hotel", "Ubud, Bali",
            R.drawable.popular_hotel_4, "$260"
        )
        )
        list.add(
            PopularHotelData("5", "4.5", "Amnaya Resort Kuta", "Kuta, Bali",
            R.drawable.popular_hotel_5, "$300"
        )
        )
        list.add(
            PopularHotelData("6", "4.8", "Karma Kandara", "Unggasan, Bali",
                R.drawable.popular_hotel_1, "$250"
            )
        )
        list.add(
            PopularHotelData("7", "4.7", "The Edge Bali", "Uluwatu, Bali",
                R.drawable.popular_hotel_2, "$270"
            )
        )
        list.add(
            PopularHotelData("8", "4.9", "Ulu Segara", "Nusa Dua, Bali",
                R.drawable.popular_hotel_3, "$290"
            )
        )
        list.add(
            PopularHotelData("9", "4.6", "Alila Ubud Hotel", "Ubud, Bali",
                R.drawable.popular_hotel_4, "$260"
            )
        )
        list.add(
            PopularHotelData("10", "4.5", "Amnaya Resort Kuta", "Kuta, Bali",
                R.drawable.popular_hotel_5, "$300"
            )
        )
        list.add(
            PopularHotelData("11", "4.8", "Karma Kandara", "Unggasan, Bali",
                R.drawable.popular_hotel_1, "$250"
            )
        )
        list.add(
            PopularHotelData("12", "4.7", "The Edge Bali", "Uluwatu, Bali",
                R.drawable.popular_hotel_2, "$270"
            )
        )
        list.add(
            PopularHotelData("13", "4.9", "Ulu Segara", "Nusa Dua, Bali",
                R.drawable.popular_hotel_3, "$290"
            )
        )
        list.add(
            PopularHotelData("14", "4.6", "Alila Ubud Hotel", "Ubud, Bali",
                R.drawable.popular_hotel_4, "$260"
            )
        )
        list.add(
            PopularHotelData("15", "4.5", "Amnaya Resort Kuta", "Kuta, Bali",
                R.drawable.popular_hotel_5, "$300"
            )
        )
        return list
    }
}