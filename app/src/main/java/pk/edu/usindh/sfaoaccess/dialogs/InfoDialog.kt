package pk.edu.usindh.sfaoaccess.dialogs

import android.app.Activity
import android.app.Dialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import pk.edu.usindh.sfaoaccess.databinding.ContactDialogBinding
import pk.edu.usindh.sfaoaccess.databinding.ScInformationDialogBinding

class InfoDialog(
    private val titleText: Int,
    private val aboutText: Int,
    private val reqsText: Int,
    private val lastDate: Int,
    activity: Activity?
) : Dialog(activity!!), View.OnClickListener {

    private lateinit var binding: ScInformationDialogBinding

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        binding = ScInformationDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.titleText.setText(titleText)
        binding.aboutText.setText(aboutText)
        binding.reqsText.setText(reqsText)
        binding.lastDate.setText(lastDate)

    }

    override fun onClick(v: View) {
        dismiss()
    }

}