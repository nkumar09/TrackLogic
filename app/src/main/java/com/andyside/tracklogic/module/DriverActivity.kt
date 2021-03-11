package com.andyside.tracklogic.module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.appcompat.widget.AppCompatTextView
import com.andyside.tracklogic.R

class DriverActivity : AppCompatActivity() {

    lateinit var mCurrentLoc: AppCompatTextView

    lateinit var mCheckBox1: AppCompatCheckBox
    lateinit var mCheckBox2: AppCompatCheckBox
    lateinit var mCheckBox3: AppCompatCheckBox
    lateinit var mCheckBox4: AppCompatCheckBox
    lateinit var mCheckBox5: AppCompatCheckBox

    lateinit var mConfirmBtn: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver)

        initUI()
    }

    private fun initUI() {
        mCurrentLoc = findViewById(R.id.currentLocPIN)
        mCheckBox1 = findViewById(R.id.check1)

    }
}