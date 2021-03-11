package com.andyside.tracklogic.module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.andyside.tracklogic.R

class AdminActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var mTaskComplete: Button;
    lateinit var mTaskPending: Button;

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

            }
            R.id.taskPend -> {

            }
        }
    }
}