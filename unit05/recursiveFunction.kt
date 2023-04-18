// what happens when a function calls itself, recursion. 
// write a function that computes a value from the Fibonacci sequence. 
// Any value in the sequence is the sum of the previous two values. The sequence is defined such that the first two values equal 1. 
// That is, fibonacci(1) = 1 and fibonacci(2) = 1.
// Write your function using the following declaration:
fun fibonacci(number: Int): Int
// Then, verify you’ve written the function correctly by executing it with the following numbers:
fibonacci(1)  // = 1
fibonacci(2)  // = 1
fibonacci(3)  // = 2
fibonacci(4)  // = 3
fibonacci(5)  // = 5
fibonacci(6)  // = 8
fibonacci(7)  // = 13
fibonacci(10) // = 55
// values of number less than 0, should return 0.
// start the sequence, hard-code a return value of 1 when number equals 1 or 2.
// any other value, you’ll need to return the sum of calling fibonacci with number - 1 and number - 2.
// This way of calculating Fibonacci numbers is not efficient.
// to improve the performance is called memoization, which stores the results of previous calculations and reuses when possible.
