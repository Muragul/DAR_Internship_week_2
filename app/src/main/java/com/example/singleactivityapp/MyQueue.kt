package com.example.singleactivityapp

import java.util.*

class MyQueue {

    /** Initialize your data structure here. */
    private val firstStack = Stack<Int>()
    private val secondStack = Stack<Int>()

    /** Push element x to the back of queue. */
    fun push(x: Int) {
        firstStack.push(x)
    }

    /** Removes the element from in front of queue and returns that element. */
    fun pop(): Int {
        if (secondStack.empty())
            while (!firstStack.empty())
                secondStack.push(firstStack.pop())
        return secondStack.pop()
    }

    /** Get the front element. */
    fun peek(): Int {
        while (!firstStack.empty())
            secondStack.push(firstStack.pop())
        return secondStack.peek()
    }

    /** Returns whether the queue is empty. */
    fun empty(): Boolean {
        if (firstStack.empty() && secondStack.empty())
            return true
        return false
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */