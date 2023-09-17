package com.davecon.kotlinlab

fun main() {
    //region Lambdas
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

    /**
     * This lambda returns a Unit which is the equivalent to void in Java
     * For this, we remove the type reference and just use "it" for a scope reference
     */
    val name: (String) -> Unit = { println("Name lambda: $it") }
    name("Dave")

    /**
     * If the LAST parameter of a function IS a function, we can use a trailing lambda
     * This allows for a cleaner syntax. We see this when we invoke enhancedMessage
     */
    fun enhancedMessage(message: String, funAsParameter: () -> Int) {
        println("Trailing Lambda: $message ${funAsParameter()}")
    }
    enhancedMessage("funAsParameter") { addLambda(1, 2) }

    //region Collections: List Methods, Sets, Maps, Empty, Filters


    //region OOP Concepts: Primary Constructors, Inits, Inheritance, Interface, Extensions, Data Class


    //region Advanced Concepts: Generics, Enums, State, Sealed Classes,
}