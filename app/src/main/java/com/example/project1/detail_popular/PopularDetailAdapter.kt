import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.project1.databinding.ListPopularDetailBinding
import com.example.project1.model.PopularHotelData

class PopularDetailAdapter :
    ListAdapter<PopularHotelData, PopularDetailAdapter.ViewHolder>(
        PopularHotelDiffCallback()
    ) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    class ViewHolder private constructor(val binding: ListPopularDetailBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: PopularHotelData) {
            binding.popular = item
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ListPopularDetailBinding.inflate(layoutInflater, parent, false)
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