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
    /**
     * Collections are immutable by default, they are the term given for:
     * lists, sets, and maps
     * Methods:
     * .add() - add element
     * .addAll() - add all elements
     * .remove() - remove element
     * .removeAt() - remove element at index
     * .removeAll() - remove all elements
     * .clear() - remove all elements
     * .contains() - return true if collection contains element
     * .size() - return size of collection
     * .indexOf() - return index of element
     * .replace() - replace element at index
     * .replaceAll() - replace all elements
     * .put() - add element to a map
     * .values() - return a collection of values from a map
     * "mutable" keyword to make them mutable
     * "listOf" keyword to create a list
     * "setOf" keyword to create a set
     * "mapOf" keyword to create a map
     * "emptyList" keyword to create an empty list
     * "emptySet" keyword to create an empty set
     * "emptyMap" keyword to create an empty map
     * "filter" keyword to filter a list
     * "filterNot" keyword to filter a list
     * "filterNotNull" keyword to filter a list
     * "filterIndexed" keyword to filter a list
     * "filterIndexedTo" keyword to filter a list
     * "filterIsInstance" keyword to filter a list
     * "filterNotTo" keyword to filter a list
     * "filterNotNullTo" keyword to filter a list
     * "filterTo" keyword to filter a list by a predicate
     *
     * Instantiate collections without data:
     * val emptyList = emptyList<Type>()
     * val emptySet = emptySet<Type>()
     * val emptyMap = emptyMap<Type, Type>()
     */
    val listOfNames = listOf("Dave", "John", "Jane", "Rachel", "Rafael")
    val startsWithREndsWithL = listOfNames.filter { it.startsWith("R") && it.endsWith("l") }
    println(startsWithREndsWithL)

    //region OOP Concepts: Primary Constructors, Inits, Inheritance, Interface, Extensions, Data Class
    /**
     * Objects are the fundmental building blocks of OOP. They can live on their own but they can also
     * be used to create classes. Classes are the blueprint for objects. They can be used to create
     * instances of objects.
     * Classes can inherit from other classes.
     * Classes can implement interfaces.
     * Classes can be extended.
     * Classes can be data classes.
     *
     * If a car is a collection of systems then the car is the object and the systems are the classes.
     */

    val myCar = Car(color = "Blue", make = "Toyota")
    println("Car color: ${myCar.color} make: ${myCar.make}")


    //region Advanced Concepts: Generics, Enums, State, Sealed Classes,
}

// Parameters for a class are called properties of the primary constructor
class Car(var color: String = "Red", var make: String = "Ford") {
    // By making the properties var or val, they become properties of the class
    //var color = color
    //var make = make
    /**
     * The init block is called when the class is instantiated, this means that the init block
     * is called before the constructor. So passing in other properties to the constructor will
     * not work because they have not been instantiated yet.
     */
    init {
        // We can also use flow control here to set the properties conditionally

        color = "Purple"
        make = "Tesla"
    }
    fun drive() {
        println("Driving... vroom vroom!")
    }
}