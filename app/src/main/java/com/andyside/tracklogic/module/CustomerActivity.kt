package com.andyside.tracklogic.module

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.DialogTitle
import com.andyside.tracklogic.R
import com.andyside.tracklogic.dialog.ConfirmOrderPopup

class CustomerActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var mStartPin: AppCompatEditText;
    lateinit var mDestPin: AppCompatEditText;
    lateinit var mCheck: AppCompatButton;

    var appCompatActivity: AppCompatActivity = this

    var pins: IntArray = intArrayOf(110092, 110091, 110090, 110089, 110088, 110087, 110086)

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
            if (mStartPin.text.isNullOrBlank()) {
                mStartPin.error = "Field cannot be null"
            } else if (mDestPin.text.isNullOrBlank()) {
                mDestPin.error = "Field cannot be null"
            } else {
                showConfirmOrderDialog(mStartPin.text.toString(), mDestPin.text.toString())
            }
        }
    }

    private fun showConfirmOrderDialog(startPin: String, destPin: String) {
        if (startPin.toInt() in pins && destPin.toInt() in pins) {
            //Toast.makeText(this, "Available for delivery", Toast.LENGTH_LONG).show()
            showDialog("Available for delivery", startPin, destPin)
        } else {
            Toast.makeText(this, "Sorry, Service not available", Toast.LENGTH_LONG).show()
        }
    }

    private fun showDialog(title: String, startPin: String, destPin: String) {
        val dialog = Dialog(appCompatActivity)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.confirm_order_popup)
        val mTitle = dialog.findViewById(R.id.dialog_title) as TextView
        mTitle.text = title
        val name = dialog.findViewById(R.id.name) as AppCompatEditText
        val email = dialog.findViewById(R.id.email) as AppCompatEditText
        val phnum = dialog.findViewById(R.id.ph_num) as AppCompatEditText
        val sPin = dialog.findViewById(R.id.s_pin) as AppCompatEditText
        sPin.setText(startPin)
        val dPin = dialog.findViewById(R.id.d_pin) as AppCompatEditText
        dPin.setText(destPin)
        val confirm = dialog.findViewById(R.id.confirmBtn) as Button
        val cancel = dialog.findViewById(R.id.cancelBtn) as Button
        confirm.setOnClickListener {
            if (!(name.text.isNullOrBlank() || email.text.isNullOrBlank() || phnum.text.isNullOrBlank() || sPin.text.isNullOrBlank() || dPin.text.isNullOrBlank())) {
                Toast.makeText(this, "Details saved successfully!", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            } else {
                Toast.makeText(this, "Fields cannot be empty!", Toast.LENGTH_SHORT).show()
            }
        }
        cancel.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

    companion object {
        private const val TAG = "CustomerActivity"
    }
}