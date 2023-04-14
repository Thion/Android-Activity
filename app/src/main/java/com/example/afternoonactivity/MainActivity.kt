package com.example.afternoonactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnCalculator:Button
    lateinit var btnWebsite:Button
    lateinit var btnContacts:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalculator = findViewById(R.id.mBtnCalc)
        btnWebsite = findViewById(R.id.mBtnWebsite)
        btnContacts = findViewById(R.id.mBtnContacts)

        btnWebsite.setOnClickListener {
            val mtandao = Intent(this@MainActivity,WebsiteActivity::class.java)
            startActivity(mtandao)
        }
        btnCalculator.setOnClickListener {
            val kikokotoo = Intent(this@MainActivity,CalculatorActivity::class.java)
            startActivity(kikokotoo)
        }
        btnContacts.setOnClickListener {
            val maconta = Intent(this@MainActivity,ContactsActivity::class.java)
            startActivity(maconta)
        }
    }
}