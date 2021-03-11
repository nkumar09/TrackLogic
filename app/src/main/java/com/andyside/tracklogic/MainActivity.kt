package com.andyside.tracklogic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.andyside.tracklogic.module.AdminActivity
import com.andyside.tracklogic.module.CustomerActivity
import com.andyside.tracklogic.module.DriverActivity
import java.sql.Driver

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var selectText: TextView;
    private lateinit var customer: Button;
    private lateinit var admin: Button;
    private lateinit var driver: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        selectText = findViewById(R.id.textView)
        customer = findViewById(R.id.customer)
        admin = findViewById(R.id.admin)
        driver = findViewById(R.id.driver)

        customer.setOnClickListener(this)
        admin.setOnClickListener(this)
        driver.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.customer -> {
                val intent = Intent(this, CustomerActivity::class.java)
                startActivity(intent)
            }
            R.id.admin -> {
                val intent = Intent(this, AdminActivity::class.java)
                startActivity(intent)
            }
            R.id.driver -> {
                val intent = Intent(this, DriverActivity::class.java)
                startActivity(intent)
            }

        }
    }
}