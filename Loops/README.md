# Java Iteration & Loop Constructs

A dedicated repository section tracking my daily practice in mastering Java's looping mechanisms. This collection focuses on implementing `for`, `while`, and `do-while` loops, handling iterative logic, generating mathematical sequences, and exploring algorithmic efficiency to build a strong foundation for algorithm development.

## 🚀 Overview
This module covers the practical application of repetitive control flow in Java. The programs demonstrate how to control execution cycles, process sequences of numbers, utilize jump statements (`break` and `continue`) to filter data, manipulate integers digit by digit, and implement time-complexity optimizations for mathematical validations.

## 🛠️ Tech Stack & Tools
* **Language:** Java
* **Core Concepts:** `for` Loops, `while` & `do-while` Loops, Jump Statements (`break`, `continue`), Modulo Arithmetic, Algorithmic Optimization (`Math.sqrt`), Digit Extraction, Standard I/O

## 📂 File Index & Structure

### Basic Iterations & Loop Types
* `BasicForLoop.java`: Demonstrates the fundamental syntax of a `for` loop by printing a string multiple times.
* `BasicWhileLoop.java`: Demonstrates an entry-controlled `while` loop to count sequentially.
* `BasicDoWhileLoop.java`: Demonstrates an exit-controlled `do-while` loop, ensuring the code block executes at least once.
* `PrintingNTimes.java`: Incorporates user input to dynamically control the number of loop iterations.
* `Print1To100.java`: Uses a basic loop counter to print a sequential range of numbers.
* `PrintNumberFromNTo1.java`: Explores bidirectional looping (incrementing from negative numbers up to 1, and decrementing from 1 down to a negative number).

### Loop Control & Filtering
* `EvenNumberBetween1To100UsingContiue.java`: Implements the `continue` keyword to skip odd numbers, passing control directly to the next loop iteration.
* `AllEvenNumbersBetween1To100.java`: Compares two approaches to filtering even numbers: using an `if` condition with modulo versus optimizing the loop's step increment.
* `AllOddNumberDivisibleBy3Between1To100.java`: Combines loop increments with logical conditions to filter out even numbers while finding multiples of 3.
* `TableOf17.java`: Hardcodes an iterative mathematical calculation to print the multiplication table of 17.
* `TableOfAnyNumber.java`: Makes the multiplication table dynamic by calculating the table for any user-provided integer.

### Mathematical Sequences & Operations
* `ArthemeticProgression2_5_8.java`: Translates a specific mathematical sequence (an AP with a common difference of 3) into an iterative loop.
* `AnyArthematicProgression.java`: A fully dynamic sequence generator that takes the first two terms from the user, calculates the common difference, and generates the progression up to the Nth term.
* `GeometricProgression.java`: Hardcodes initial values to generate and print a basic geometric progression with a common ratio.
* `AnyGeometricProgression.java`: A dynamic generator that takes the first two terms from the user, calculates the common ratio, and generates a GP up to the Nth term.
* `PrintSeries99_95_91TillTheLastPositiveNumber.java`: Demonstrates a decrementing loop that calculates a common difference dynamically and prints an arithmetic progression backwards strictly until the values are no longer positive.
* `SequencePrinting.java`: Implements dual-variable tracking (`i` and `n-i`) inside a single loop to print a unique alternating/converging mathematical sequence based on user input.
* `ARaisedToPowerToB.java`: Uses an iterative loop to calculate exponential values (A raised to the power of B) dynamically.
* `FactorialOfNumber.java`: Uses a `while` loop to decrement a multiplier and calculate the factorial of a user-provided number.

### Algorithmic Efficiency & Number Theory
* `FactorsOfNumber.java`: Optimizes factor finding by only iterating up to the square root of the number (`Math.sqrt(n)`), drastically reducing time complexity.
* `PrimeNumber.java`: Implements a `boolean` flag and the `break` statement to exit a loop early as soon as a divisor is found, efficiently checking for prime numbers.

### Digit Manipulation & `while` Loops
* `NumberOfDigit.java`: Uses a `while` loop and integer division to count the total number of digits in an integer.
* `SumOfDigits.java`: Implements a `while` loop with modulo arithmetic to extract and sum the individual digits of a number.
* `ReverseOfANumber.java`: Builds the reverse of a user-provided integer by extracting digits sequentially from the back to the front.
* `SumAndReverseOfNumber.java`: Combines digit counting, summing, and reversing into a single, optimized `while` loop execution.

### Character & ASCII Operations
* `AllAlphabetWithTheirASCIIValue.java`: Iterates through integers and uses explicit type casting to print the integer alongside its corresponding ASCII character.

## 💡 Key Learnings & Features
* **Algorithmic Optimization:** Transitioning from O(n) to O(√n) time complexity when checking for prime numbers and factors by leveraging `Math.sqrt(n)`.
* **Jump Statements:** Utilizing `break` to exit loops immediately upon fulfilling a condition (like finding a divisor), and `continue` to efficiently skip specific iterations without nested `if-else` blocks.
* **State-Based Iteration (`while` vs `do-while`):** Understanding when to use loops with known bounds (`for`), loops based on ongoing conditions (`while`), and loops that must execute at least once regardless of the initial condition (`do-while`).
* **Digit Extraction:** Mastering modulo (`% 10`) to isolate the last digit of a number and integer division (`/ 10`) to strip it away, enabling complex manipulations like reversing integers.

---
## 👨‍💻 Author

**MD Shahnawaz Noor**         
*Aspiring Data Scientist*                 
                     
GitHub: [https://github.com/shahnawaznoor2020](https://github.com/shahnawaznoor2020)
