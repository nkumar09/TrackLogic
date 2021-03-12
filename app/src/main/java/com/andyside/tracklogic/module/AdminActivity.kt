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
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.DialogFragment
import com.andyside.tracklogic.R
import kotlinx.android.synthetic.main.activity_admin.*

class AdminActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var mTaskComplete: AppCompatButton;
    lateinit var mTaskPending: AppCompatButton;

    var appCompatActivity: AppCompatActivity = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        initUI()
    }

    private fun initUI() {
        mTaskComplete = findViewById(R.id.taskComp)
        mTaskPending = findViewById(R.id.taskPend)

        mTaskComplete.setOnClickListener(this)
        mTaskPending.setOnClickListener(this)
    }

    companion object {
        private const val TAG = "AdminActivity"
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.taskComp -> {
                showDialog(taskComp.text.toString())
            }
            R.id.taskPend -> {
                showDialog(taskPend.text.toString())
            }
        }
    }

    private fun showDialog(title: String) {
        val dialog = Dialog(appCompatActivity)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.task_popup)
        val mTitle = dialog.findViewById(R.id.task_title) as AppCompatTextView
        mTitle.text = title
        val task1 = dialog.findViewById(R.id.task_1) as AppCompatTextView
        val task2 = dialog.findViewById(R.id.task_2) as AppCompatTextView
        val task3 = dialog.findViewById(R.id.task_3) as AppCompatTextView
        val close = dialog.findViewById(R.id.closeBtn) as AppCompatButton

        close.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }
}