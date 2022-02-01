package com.informatika.nadyadeswita_19100022_menghitungluaslingkaran;

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var s: EditText? = null
    private var hitung: Button? = null
    var hasil: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rms_luas_lingkaran)
        s = findViewById<View>(R.id.sisi) as EditText
        hitung = findViewById<View>(R.id.button) as Button
        hasil = findViewById<View>(R.id.txt_hasil) as TextView
        hitung.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                //notifikasi jika lebar tidak diisi
                if (s!!.length() == 0) {
                    Toast.makeText(application, "Sisi tidak boleh kosong", Toast.LENGTH_LONG).show()
                } else {
                    val isisisi = s!!.text.toString()
                    val s = isisisi.toDouble()
                    val hs = LuasLingkaran(s)
                    val output = hs.toString()
                    hasil!!.text = output
                }
            }
        }

    fun LuasLingkaran(s: Double): Double { return 3,14 * Jari-jari2
    }
}

private fun Button.setOnClickListener(any: Any, function: (Double) -> Double) {

}
