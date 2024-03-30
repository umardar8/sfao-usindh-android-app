package pk.edu.usindh.sfaoaccess

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity


class WelcomeActivity : AppCompatActivity() {
    lateinit var splash: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome)

        splash = MediaPlayer.create(this, R.raw.splash)

        splash.start()

        val background: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep((3 * 1000).toLong())
                    val i = Intent(baseContext, MainActivity::class.java)
                    startActivity(i)
                    //Remove activity
                    finish()
                } catch (_: Exception) {
                }
            }
        }

        // start thread
        background.start()
    }

    override fun onPause() {
        super.onPause()
        splash.release()
        finish()
    }
}