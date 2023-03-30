package com.example.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit_Nama: EditText = findViewById(R.id.namabar)
        val edit_Nomor: EditText = findViewById(R.id.nomorbar)
        val simpan: Button = findViewById(R.id.simpan)
        val nomorbtn: Button = findViewById(R.id.nomorbtn)
        simpan.setOnClickListener {
            val intent = Intent(this, explisit::class.java)
            intent.putExtra("nama", edit_Nama.text.toString())
            intent.putExtra("nomor", edit_Nomor.text.toString())
            startActivity(intent)
        }
        nomorbtn.setOnClickListener {
            val phoneNumber = edit_Nomor.text.toString()
            val message = "Halo, ini pesan dari aplikasi saya!"
            val sendIntent = Intent(Intent.ACTION_VIEW)
                .setData(Uri.parse("https://api.whatsapp.com/send?phone=$phoneNumber&text=$message"))
            startActivity(sendIntent)
        }
        }
    }
