package com.davecon.kotlinlab

fun main() {

    /**
     * This is an example of a function
     * variable: none
     * type: Int from : Int
     * parameters: a, b
     * body: { return a + b }
     */

    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    println("Fun: " + sum(1, 2))

    /**
     * This is an example of a Lambda
     * variable: val addLambda
     * type: (Int, Int) -> Int
     * parameters: { a, b }
     * body: -> a + b
     */
    val addLambda: (Int, Int) -> Int = { a, b -> a + b }
    println("Lambda: " + addLambda(3, 4))

    val catAge: (Int) -> Int = { humanAge -> humanAge * 7 }
    println("Cat age lambda: " + catAge(3))
}