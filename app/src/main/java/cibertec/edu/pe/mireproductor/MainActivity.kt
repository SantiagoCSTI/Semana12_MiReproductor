package cibertec.edu.pe.mireproductor

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore

class MainActivity : AppCompatActivity() {

   lateinit var oReporductor: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Reproducir()
        //oReporductor= MediaPlayer()
    }

    public fun Reproducir()
    {
        oReporductor=MediaPlayer.create(this, R.raw.levels);
        oReporductor.start();
    }

    public fun pausar()
    {
        oReporductor.pause();
    }

    public fun Finalizar()
    {
        oReporductor.stop()
    }
}