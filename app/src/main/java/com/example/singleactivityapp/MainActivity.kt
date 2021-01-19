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
        val queue = MyQueue()
        queue.push(1)
        queue.push(2)
        Log.e("pop (1)", queue.pop().toString())
        Log.e("peek (2)", queue.peek().toString())
        Log.e("empty (false)", queue.empty().toString())
    }

    private fun myStackFunction() {
        val stack = MyStack()
        stack.push(1)
        stack.push(2)
        Log.e("pop (2)", stack.pop().toString())
        Log.e("top (1)", stack.pop().toString())
        Log.e("empty (false)", stack.empty().toString())

    }
}