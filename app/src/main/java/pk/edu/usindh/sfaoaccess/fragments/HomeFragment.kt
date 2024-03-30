package pk.edu.usindh.sfaoaccess.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import pk.edu.usindh.sfaoaccess.dialogs.ContactDialog
import pk.edu.usindh.sfaoaccess.R
import pk.edu.usindh.sfaoaccess.adapters.SliderAdapter
import pk.edu.usindh.sfaoaccess.databinding.FragmentHomeBinding
import kotlin.math.abs

class HomeFragment : Fragment() {
    // declare variables
    private lateinit var binding: FragmentHomeBinding
    private lateinit var scholarshipPager: ViewPager2
    private lateinit var activitiesPager: ViewPager2
    private lateinit var sliderHandler: Handler
    private lateinit var donateButton: Button
    private lateinit var testAd: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // initialize variables
        scholarshipPager = binding.viewPagerImageSlider
        activitiesPager = binding.viewPagerImageSlider2
        sliderHandler = Handler()
        donateButton = binding.donateButton
        testAd = binding.adView

        // load the test ad
        context?.let { MobileAds.initialize(it.applicationContext) {} }
        val adRequest = AdRequest.Builder().build()
        testAd.loadAd(adRequest)

        // initialize and add scholarship images to first slider
        val scholarshipImages = ArrayList<SliderAdapter.SliderItems>()
        scholarshipImages.add(SliderAdapter.SliderItems(R.drawable.sc_one))
        scholarshipImages.add(SliderAdapter.SliderItems(R.drawable.sc_two_thirteen))
        scholarshipImages.add(SliderAdapter.SliderItems(R.drawable.sc_three_fourteen))
        scholarshipImages.add(SliderAdapter.SliderItems(R.drawable.sc_four))
        scholarshipImages.add(SliderAdapter.SliderItems(R.drawable.sc_five))

        // initialize and add SFAO's activities images to second slider
        val activitiesImages = ArrayList<SliderAdapter.SliderItems>()
        activitiesImages.add(SliderAdapter.SliderItems(R.drawable.distribution1))
        activitiesImages.add(SliderAdapter.SliderItems(R.drawable.distribution2))
        activitiesImages.add(SliderAdapter.SliderItems(R.drawable.distribution3))
        activitiesImages.add(SliderAdapter.SliderItems(R.drawable.distribution4))
        activitiesImages.add(SliderAdapter.SliderItems(R.drawable.distribution5))
        activitiesImages.add(SliderAdapter.SliderItems(R.drawable.distribution6))

        // set Adapter to the first slider
        scholarshipPager.adapter =
            SliderAdapter(
                scholarshipImages,
                scholarshipPager
            )
        scholarshipPager.clipToPadding = false
        scholarshipPager.clipChildren = false
        scholarshipPager.offscreenPageLimit = 3
        scholarshipPager.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER

        // set Adapter to the second slider
        activitiesPager.adapter =
            SliderAdapter(
                activitiesImages,
                activitiesPager
            )
        activitiesPager.clipToPadding = false
        activitiesPager.clipChildren = false
        activitiesPager.offscreenPageLimit = 3
        activitiesPager.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER

        val compositePageTransformer = CompositePageTransformer()
        compositePageTransformer.addTransformer(MarginPageTransformer(40))
        compositePageTransformer.addTransformer { page, position ->
            val r = 1 - abs(position)
            page.scaleY = 0.85f + r * 0.15f
        }

        scholarshipPager.setPageTransformer(compositePageTransformer)
        activitiesPager.setPageTransformer(compositePageTransformer)

        scholarshipPager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                sliderHandler.removeCallbacks(sliderRunnable)
                sliderHandler.postDelayed(sliderRunnable,5000) // slide duration 5 seconds
            }
        })

        donateButton.setOnClickListener {
            val dialog = ContactDialog(activity)
            dialog.show()
        }

    }

    private fun openWebPage(url: String) {
        val webpage: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)
        if (context?.let { intent.resolveActivity(it.packageManager) } != null) {
            startActivity(intent)
        }
    }

    private val sliderRunnable = Runnable {
        run {
            scholarshipPager.currentItem = scholarshipPager.currentItem + 1
            activitiesPager.currentItem = activitiesPager.currentItem + 1
        }
    }

    override fun onPause() {
        super.onPause()
        sliderHandler.removeCallbacks(sliderRunnable)
    }

    override fun onResume() {
        super.onResume()
        sliderHandler.postDelayed(sliderRunnable, 8000)
    }

    private fun openGoogleMaps() {
        val intent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://maps.app.goo.gl/JeyoDX8tLzZhjmL19")
        )
        startActivity(intent)
    }

}