## Java Practice Question – Vertically Flipped Number Triangle Pattern

This folder contains a Java program that solves a **pattern-printing practice question** demonstrating how to print a right-aligned (vertically flipped) right-angled triangle filled with numbers using nested `for` loops.

It is intended for beginners to strengthen their understanding of **core Java fundamentals**, specifically coordinating leading spaces with increasing numerical columns per row to right-align triangular patterns in the console.

## 📌 Program Overview

The program in this folder covers the following practice concepts:

* Reading the number of rows (`n`) from the user using the `Scanner` class.

* Using an outer `for` loop (`i` from `1` to `n`) to iterate through each row of the triangle.

* Using a first inner `for` loop (`j` from `1` to `n - i`) to print leading spaces that push the numbers to the right side of the console.

* Using a second inner `for` loop (`j` from `1` to `i`) to print ascending numbers on each row.

* Using `System.out.print()` for inline formatting and `System.out.println()` to move to the next line after each row.

## 🧪 Code Functionality

The program demonstrates:

### Nested Loops & Right-Aligned Numerical Pattern Generation

* **User Input**: Prompts the user to enter an integer `n` representing the height (number of rows) of the triangle.

* **Pattern Generation**: For each row `i`, first prints `n - i` spaces followed by numbers from `1` to `i` separated by spaces, creating a vertically flipped (right-aligned) number triangle.

The program is written in a **simple and readable format**, making it ideal for beginners learning how to combine space loops with numerical loops in Java.

## 🖥️ Output

The program prompts the user for the number of rows `n` and prints the vertically flipped number triangle pattern in the console.

The complete console output for this practice question is shown below:

![Output](Output.png)

## 📂 File Information

* `NumberTriangleVerticallyFlipped.java` — Contains the practice question program

* `Output.png` — Screenshot of console output

* `README.md` — Folder documentation

## 👨‍💻 Author

**MD Shahnawaz Noor**

*Aspiring Data Scientist*

GitHub: <https://github.com/shahnawaznoor2020-code>

Email: shahnawaznoor2020@gmail.com

## ⭐ Note

These practice programs help build a strong foundation in Java.

Practicing vertically flipped patterns reinforces how managing leading whitespace alongside inner value loops controls horizontal alignment in console outputs.