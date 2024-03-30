package pk.edu.usindh.sfaoaccess.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import pk.edu.usindh.sfaoaccess.R
import pk.edu.usindh.sfaoaccess.databinding.FragmentScholarshipsBinding
import pk.edu.usindh.sfaoaccess.dialogs.InfoDialog

class ScholarshipsFragment : Fragment() {

    private lateinit var binding: FragmentScholarshipsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentScholarshipsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.scholarship1.logoImage.setImageResource(R.drawable.sc_one)
        binding.scholarship1.title.setText(R.string.title_one)
        binding.scholarship1.lastDateValue.setText(R.string.last_date_one)
        binding.scholarship1.applyButton.setOnClickListener {
            InfoDialog(
                R.string.title_one,
                R.string.about_one,
                R.string.reqs,
                R.string.last_date_one,
                activity
            ).show()
        }

        binding.scholarship2.logoImage.setImageResource(R.drawable.sc_two_thirteen)
        binding.scholarship2.title.setText(R.string.title_two)
        binding.scholarship2.lastDateValue.setText(R.string.last_date_two)
        binding.scholarship2.applyButton.setOnClickListener {
            InfoDialog(
                R.string.title_two,
                R.string.about_two,
                R.string.reqs,
                R.string.last_date_two,
                activity
            ).show()
        }

        binding.scholarship3.logoImage.setImageResource(R.drawable.sc_three_fourteen)
        binding.scholarship3.title.setText(R.string.title_three)
        binding.scholarship3.lastDateValue.setText(R.string.last_date_three)
        binding.scholarship3.applyButton.setOnClickListener {
            InfoDialog(
                R.string.title_three,
                R.string.about_three,
                R.string.reqs,
                R.string.last_date_three,
                activity
            ).show()
        }

        binding.scholarship4.logoImage.setImageResource(R.drawable.sc_four)
        binding.scholarship4.title.setText(R.string.title_four)
        binding.scholarship4.lastDateValue.setText(R.string.last_date_four)
        binding.scholarship4.applyButton.setOnClickListener {
            InfoDialog(
                R.string.title_four,
                R.string.about_four,
                R.string.reqs,
                R.string.last_date_four,
                activity
            ).show()
        }

        binding.scholarship5.logoImage.setImageResource(R.drawable.sc_five)
        binding.scholarship5.title.setText(R.string.title_five)
        binding.scholarship5.lastDateValue.setText(R.string.last_date_five)
        binding.scholarship5.applyButton.setOnClickListener {
            InfoDialog(
                R.string.title_one,
                R.string.about_five,
                R.string.reqs,
                R.string.last_date_five,
                activity
            ).show()
        }

        binding.scholarship6.logoImage.setImageResource(R.drawable.sc_six_twelve)
        binding.scholarship6.title.setText(R.string.title_six)
        binding.scholarship6.lastDateValue.setText(R.string.last_date_six)
        binding.scholarship6.applyButton.setOnClickListener {
            InfoDialog(
                R.string.title_six,
                R.string.about_six,
                R.string.reqs,
                R.string.last_date_six,
                activity
            ).show()
        }

        binding.scholarship7.logoImage.setImageResource(R.drawable.sc_seven)
        binding.scholarship7.title.setText(R.string.title_seven)
        binding.scholarship7.lastDateValue.setText(R.string.last_date_seven)
        binding.scholarship7.applyButton.setOnClickListener {
            InfoDialog(
                R.string.title_seven,
                R.string.about_seven,
                R.string.reqs,
                R.string.last_date_seven,
                activity
            ).show()
        }

        binding.scholarship8.logoImage.setImageResource(R.drawable.sc_eight)
        binding.scholarship8.title.setText(R.string.title_eight)
        binding.scholarship8.lastDateValue.setText(R.string.last_date_eight)
        binding.scholarship8.applyButton.setOnClickListener {
            InfoDialog(
                R.string.title_eight,
                R.string.about_eight,
                R.string.reqs,
                R.string.last_date_eight,
                activity
            ).show()
        }

        binding.scholarship9.logoImage.setImageResource(R.drawable.sc_nine)
        binding.scholarship9.title.setText(R.string.title_nine)
        binding.scholarship9.lastDateValue.setText(R.string.last_date_nine)
        binding.scholarship9.applyButton.setOnClickListener {
            InfoDialog(
                R.string.title_nine,
                R.string.about_nine,
                R.string.reqs,
                R.string.last_date_nine,
                activity
            ).show()
        }

        binding.scholarship10.logoImage.setImageResource(R.drawable.sc_ten)
        binding.scholarship10.title.setText(R.string.title_ten)
        binding.scholarship10.lastDateValue.setText(R.string.last_date_ten)
        binding.scholarship10.applyButton.setOnClickListener {
            InfoDialog(
                R.string.title_ten,
                R.string.about_ten,
                R.string.reqs,
                R.string.last_date_ten,
                activity
            ).show()
        }

        binding.scholarship11.logoImage.setImageResource(R.drawable.sc_eleven)
        binding.scholarship11.title.setText(R.string.title_eleven)
        binding.scholarship11.lastDateValue.setText(R.string.last_date_eleven)
        binding.scholarship11.applyButton.setOnClickListener {
            InfoDialog(
                R.string.title_eleven,
                R.string.about_eleven,
                R.string.reqs,
                R.string.last_date_eleven,
                activity
            ).show()
        }

        binding.scholarship12.logoImage.setImageResource(R.drawable.sc_six_twelve)
        binding.scholarship12.title.setText(R.string.title_twelve)
        binding.scholarship12.lastDateValue.setText(R.string.last_date_twelve)
        binding.scholarship12.applyButton.setOnClickListener {
            InfoDialog(
                R.string.title_twelve,
                R.string.about_twelve,
                R.string.reqs,
                R.string.last_date_twelve,
                activity
            ).show()
        }

        binding.scholarship13.logoImage.setImageResource(R.drawable.sc_two_thirteen)
        binding.scholarship13.title.setText(R.string.title_thirteen)
        binding.scholarship13.lastDateValue.setText(R.string.last_date_thirteen)
        binding.scholarship13.applyButton.setOnClickListener {
            InfoDialog(
                R.string.title_thirteen,
                R.string.about_thirteen,
                R.string.reqs,
                R.string.last_date_thirteen,
                activity
            ).show()
        }

        binding.scholarship14.logoImage.setImageResource(R.drawable.sc_three_fourteen)
        binding.scholarship14.title.setText(R.string.title_fourteen)
        binding.scholarship14.lastDateValue.setText(R.string.last_date_fourteen)
        binding.scholarship14.applyButton.setOnClickListener {
            InfoDialog(
                R.string.title_fourteen,
                R.string.about_fourteen,
                R.string.reqs,
                R.string.last_date_fourteen,
                activity
            ).show()
        }

    }
}