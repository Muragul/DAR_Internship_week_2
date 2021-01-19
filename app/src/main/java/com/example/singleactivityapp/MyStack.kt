package com.example.singleactivityapp

import java.util.*

class MyStack {

    /** Initialize your data structure here. */
    private val firstQueue = LinkedList<Int>()
    private val secondQueue = LinkedList<Int>()

    /** Push element x onto stack. */
    fun push(x: Int) {
        while (!firstQueue.isEmpty())
            secondQueue.add(firstQueue.pop())
        firstQueue.push(x)
        while (!secondQueue.isEmpty())
            firstQueue.add(secondQueue.pop())
    }

    /** Removes the element on top of the stack and returns that element. */
    fun pop(): Int {
        return firstQueue.pop()
    }

    /** Get the top element. */
    fun top(): Int {
        return firstQueue.peek() ?: -1
    }

    /** Returns whether the stack is empty. */
    fun empty(): Boolean {
        if (firstQueue.isEmpty() && secondQueue.isEmpty())
            return true
        return false
    }

}

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */