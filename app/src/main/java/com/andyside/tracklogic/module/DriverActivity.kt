package com.andyside.tracklogic.module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.appcompat.widget.AppCompatTextView
import com.andyside.tracklogic.R

class DriverActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var mCurrentLoc: AppCompatTextView

    lateinit var mCheckBox1: AppCompatCheckBox
    lateinit var mCheckBox2: AppCompatCheckBox
    lateinit var mCheckBox3: AppCompatCheckBox
    lateinit var mCheckBox4: AppCompatCheckBox
    lateinit var mCheckBox5: AppCompatCheckBox
    lateinit var mCheckBox6: AppCompatCheckBox

    lateinit var mConfirmBtn: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver)

        initUI()
    }

    private fun initUI() {
        mCurrentLoc = findViewById(R.id.currentLocPIN)
        mCheckBox1 = findViewById(R.id.check1)
        mCheckBox2 = findViewById(R.id.check2)
        mCheckBox3 = findViewById(R.id.check3)
        mCheckBox4 = findViewById(R.id.check4)
        mCheckBox5 = findViewById(R.id.check5)
        mCheckBox6 = findViewById(R.id.check6)

        mConfirmBtn = findViewById(R.id.confirmBtn)
        mConfirmBtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.confirmBtn) {
            Toast.makeText(this, "Data saved successfully!", Toast.LENGTH_SHORT).show()
        }
    }
}