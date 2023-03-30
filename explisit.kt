package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class explisit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explisit)

        val t_Nama: TextView = findViewById(R.id.tampil_nama)
        val t_Nomor: TextView = findViewById(R.id.tampil_nomor)

        t_Nama.setText(intent.getStringExtra("nama"))
        t_Nomor.setText(intent.getStringExtra("nomor"))
    }

}