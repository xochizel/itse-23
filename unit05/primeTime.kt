fun isNumberDivisible(number: Int, divisor: Int): Boolean
// use this to determine if one number is divisible by another. should return true when number is divisible by divisor. 
// Hint: use modulo (%) operator to help
// Next, the main function:
fun isPrime(number: Int): Boolean
// This should return true if number is prime, false otherwise. should loop through the numbers from 1 to the number and find the number’s divisors.
// If any divisors other than 1 and itself, number isn’t prime. use the isNumberDivisible() function you wrote earlier.
// Use this function to check the following cases:
// isPrime(6) // false
// isPrime(13) // true
// isPrime(8893) // true
// Hint 1: Numbers < 0 not considered prime. Check for this at start of function, return early if number < 0.
// Hint 2: for loop to find divisors. start at 2 and end before the number itself, then if divisor found, can return false.
// Hint 3 ; loop from 2 until you reach the square root of number, rather than going all the way up to number itself. 
// figure out why. think of the number 16, square root is 4. divisors of 16 are 1, 2, 4, 8 and 16.
