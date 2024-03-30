package pk.edu.usindh.sfaoaccess.dialogs

import android.app.Activity
import android.app.Dialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.Window
import pk.edu.usindh.sfaoaccess.databinding.ContactDialogBinding

class ContactDialog(activity: Activity?) : Dialog(activity!!), View.OnClickListener {

    private lateinit var binding: ContactDialogBinding

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        binding = ContactDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.address.setOnClickListener {
            openGoogleMaps()
        }

        binding.tel.setOnClickListener {
            openDialPad()
        }
    }

    override fun onClick(v: View) {
        dismiss()
    }

    private fun openGoogleMaps() {
        val intent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://maps.app.goo.gl/JeyoDX8tLzZhjmL19")
        )
        context.startActivity(intent)
    }

    private fun openDialPad() {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:92-22-9213-181")
        }
        context.startActivity(intent)
    }
}