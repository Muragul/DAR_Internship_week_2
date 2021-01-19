package com.example.singleactivityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myQueueFunction()
        myStackFunction()
    }

    private fun myQueueFunction() {
        var queue = MyQueue()
        queue.push(1)
        queue.push(2)
        Log.e("pop", queue.pop().toString())
        Log.e("peek", queue.peek().toString())
        Log.e("empty", queue.empty().toString())
    }

    private fun myStackFunction() {

    }
}