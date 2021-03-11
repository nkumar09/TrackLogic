package com.andyside.tracklogic.module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.andyside.tracklogic.R

class CustomerActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var mStartPin: EditText;
    lateinit var mDestPin: EditText;
    lateinit var mCheck: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer)

        initUI()
    }

    private fun initUI() {
        mStartPin = findViewById(R.id.eTStartPin)
        mDestPin = findViewById(R.id.eTDestPin)
        mCheck = findViewById(R.id.checkBtn)

        mCheck.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.checkBtn) {

        }
    }

    companion object {
        private const val TAG = "CustomerActivity"
    }
}