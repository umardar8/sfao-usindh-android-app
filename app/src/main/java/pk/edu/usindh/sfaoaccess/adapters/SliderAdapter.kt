package pk.edu.usindh.sfaoaccess.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.makeramen.roundedimageview.RoundedImageView
import pk.edu.usindh.sfaoaccess.R


class SliderAdapter(
    private var sliderItems: List<SliderItems>,
    private val viewPager2: ViewPager2
) : RecyclerView.Adapter<SliderAdapter.SliderViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderViewHolder =
        SliderViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.slide_item_container, parent, false)
        )

    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        holder.setImage(sliderItems[position])
        if (position == sliderItems.size - 2) {
            viewPager2.post(runnable)
        }
    }

    override fun getItemCount(): Int = sliderItems.size

    inner class SliderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: RoundedImageView = itemView.findViewById(R.id.imageSlide)

        fun setImage(sliderItems: SliderItems) {
            imageView.setImageResource(sliderItems.image)
        }
    }

    private val runnable = Runnable {
        val newSliderItems = sliderItems.toMutableList()
        newSliderItems.addAll(sliderItems)
        sliderItems = newSliderItems
        notifyDataSetChanged()
    }

    data class SliderItems(val image: Int)
}