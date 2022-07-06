package com.example.project1.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.project1.R
import com.example.project1.model.PopularHotelData
import com.example.project1.model.RecommendedHotelData


class HomeFragmentViewModel() : ViewModel(){

    /*
    cara yang menggunakan live data dapat dilihat dari module
     */

    /* cara yang tidak menggunakan live data
    var navigateToSelectedProperty:RecommendedHotelData?=null //or var navigateToSelectedProperty = RecommendedDataHotel()
    get() = navigateToSelectedProperty

    fun displayProperty(recommendedHotelData: RecommendedHotelData){
        navigateToSelectedProperty = recommendedHotelData
    }
    */

    /*
    data class DataSource(
        val data: List<String>
    )

    val data_source: MutableList<DataSource> = mutableListOf(
        DataSource(data = listOf("1", "4.8", "Karma Kandara", "Ungasan, Bali")),
        DataSource(data = listOf("2", "4.7", "The Edge Bali", "Uluwatu, Bali")),
        DataSource(data = listOf("3", "4.9", "Ulu Segara", "Nusa Dua, Bali")),
        DataSource(data = listOf("4", "4.6", "Alila Ubud Hotel", "Ubud, Bali")),
        DataSource(data = listOf("5", "4.5", "Amnaya Resort Kuta", "Kuta, Bali"))
    )
     */

    // Popular Hotel Data
    fun generateData() : List<PopularHotelData>{
        var list : MutableList<PopularHotelData> = arrayListOf()
        list.add(PopularHotelData("1", "4.8", "Karma Kandara", "Unggasan, Bali",
            R.drawable.popular_hotel_1, "$250"
        ))
        list.add(PopularHotelData("2", "4.7", "The Edge Bali", "Uluwatu, Bali",
            R.drawable.popular_hotel_2, "$270"
        ))
        list.add(PopularHotelData("3", "4.9", "Ulu Segara", "Nusa Dua, Bali",
            R.drawable.popular_hotel_3, "$290"
        ))
        list.add(PopularHotelData("4", "4.6", "Alila Ubud Hotel", "Ubud, Bali",
            R.drawable.popular_hotel_4, "$260"
        ))
        list.add(PopularHotelData("5", "4.5", "Amnaya Resort Kuta", "Kuta, Bali",
            R.drawable.popular_hotel_5, "$300"
        ))
        return list
    }

    // Recommended Hotel Data
    fun generateListPadma(): List<String>{
        return arrayListOf(
            "https://www.inspiraloka.com/wp-content/uploads/2016/12/Padma-Hotel-Bandung-min.jpg",
            "https://pix10.agoda.net/hotelImages/62292/-1/5012a1663f62e0f1cbafc26fe3fe0cea.jpg?ca=22&ce=0&s=1024x768",
            "https://cdn.webhotelier.net/photos/w=1920/bandung/L101871.jpg",
            "https://images.trvl-media.com/hotels/1000000/50000/45600/45586/a1aff796.jpg?impolicy=resizecrop&rw=670&ra=fit"
        )
    }

    fun generateListTrans(): List<String>{
        return arrayListOf(
            "https://www.inspiraloka.com/wp-content/uploads/2016/12/Trans-Hotel-Bandung-min.jpg",
            "https://cdns.klimg.com/newshub.id/news/2016/11/14/106278/750x500-trans-hotel-masuk-lima-besar-world-halal-tourism-award-2016-161114l.jpg",
            "https://img.beritasatu.com/cache/beritasatu/910x580-2/1479097083.jpg",
            "https://akcdn.detik.net.id/visual/2016/03/01/2366693e-45df-4d47-9456-35dc7449d4fd_169.jpg?w=650"
        )
    }

    fun generateListJayakarta(): List<String>{
        return arrayListOf(
            "https://www.inspiraloka.com/wp-content/uploads/2016/12/Hotel-Jayakarta-Bandung-min.jpg",
            "https://pix10.agoda.net/hotelImages/5171/-1/f9534dfdb1fae9bc98b40abe38d9ea46.jpg?ca=13&ce=1&s=1024x768",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/107262904.jpg?k=6cba80d07a62f6b00fd007dd199c08cef7c3240f99753d90fa1ef9848520c9b8&o=&hp=1",
            "https://cdn.1001malam.com/uploads/hotels/thejayakartasuitesbandung_interior_1267382.jpg"
        )
    }

    fun generateListPapandayan(): List<String>{
        return arrayListOf(
            "https://www.inspiraloka.com/wp-content/uploads/2016/12/Hotel-Papandayan-Bandung-min.jpg",
            "https://imgcy.trivago.com/c_lfill,d_dummy.jpeg,e_sharpen:60,f_auto,h_450,q_auto,w_450/itemimages/51/20/512031_v3.jpeg",
            "https://i0.wp.com/www.tempatwisatamu.com/wp-content/uploads/2015/03/Papandayan-Hotel-Bandung.jpg?resize=400%2C278",
            "https://cf.bstatic.com/xdata/images/hotel/max1280x900/153876065.jpg?k=b7743e1c5c9b39dff979febf99a17003ba15e8b7b5084b89fa12825320b421e1&o=&hp=1"
        )
    }

    fun generateListGH(): List<String>{
        return arrayListOf(
            "https://www.inspiraloka.com/wp-content/uploads/2016/12/GH-Universal-Hotel-Bandung-min.jpg",
            "https://q-xx.bstatic.com/xdata/images/hotel/max500/216925997.jpg?k=949022c86f395135a41f2fed02ef44f0fb830ad1933df4df3f62c1d70ffc1b90&o=",
            "https://www.kayak.co.id/rimg/himg/6f/ce/0d/hotelsdotcom-164874964-4a785a14_w-440347.jpg?width=720&height=576&crop=true",
            "https://exp.cdn-hotels.com/hotels/5000000/4400000/4395300/4395256/c020880e_z.jpg?impolicy=fcrop&w=773&h=530&q=high"
        )
    }

    fun generateListSukajadi() : List<String>{
        return arrayListOf(
            "https://www.inspiraloka.com/wp-content/uploads/2016/12/Hotel-Sukajadi-Bandung-min.jpg",
            "https://www.sukajadihotel.com/wp-content/uploads/2016/06/sukajadi-hotel-executive-triple-bed.jpg",
            "https://cf.bstatic.com/xdata/images/hotel/max1280x900/269877544.jpg?k=6e1aec493bd7a80e3c483a51b211d2dffc170f356a893529e96f55938f482245&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1280x900/350877415.jpg?k=8c16324dbdfd825eef74e2b1b253b5ccdd77b0bc0a38105293130c310a0fc667&o=&hp=1"
        )
    }

    fun generateRecommendedData() : List<RecommendedHotelData>{
        var recommended_list : MutableList<RecommendedHotelData> = arrayListOf()
        recommended_list.add(RecommendedHotelData("1", "Padma Hotel", "Bandung", R.drawable.recommended_hotel_1, "$310", generateListPadma()))
        recommended_list.add(RecommendedHotelData("2", "Trans Hotel", "Bandung", R.drawable.recommended_hotel_2, "$330", generateListTrans()))
        recommended_list.add(RecommendedHotelData("3", "Hotel Jayakarta", "Bandung", R.drawable.recommended_hotel_3, "$350", generateListJayakarta()))
        recommended_list.add(RecommendedHotelData("4", "Hotel Papandayan", "Bandung", R.drawable.recommended_hotel_4, "$320", generateListPapandayan()))
        recommended_list.add(RecommendedHotelData("5", "GH Universal Hotel", "Bandung", R.drawable.recommended_hotel_5, "$340", generateListGH()))
        recommended_list.add(RecommendedHotelData("6", "Hotel Sukajadi", "Bandung", R.drawable.recommended_hotel_6, "$300", generateListSukajadi()))
        return recommended_list
    }
}