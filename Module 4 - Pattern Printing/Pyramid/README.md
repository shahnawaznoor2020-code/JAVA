## Java Practice Question – Star Pyramid Pattern

This folder contains a Java program that solves a **pattern-printing practice question** demonstrating how to print a symmetrical centered pyramid pattern using nested `for` loops.

It is intended for beginners to strengthen their understanding of **core Java fundamentals**, specifically coordinating leading spaces and odd-numbered star counts (`2 * i - 1`) across rows to build centered geometric shapes in the console.

## 📌 Program Overview

The program in this folder covers the following practice concepts:

* Reading the number of rows (`n`) from the user using the `Scanner` class.

* Using an outer `for` loop (`i` from `1` to `n`) to iterate through each row of the pyramid.

* Using a first inner `for` loop (`j` from `1` to `n - i`) to print leading spaces that center-align each row.

* Using a second inner `for` loop (`k` from `1` to `2 * i - 1`) to print the corresponding stars (`*`) for each row.

* Using `System.out.print()` for inline formatting and `System.out.println()` to move to the next line after each row.

## 🧪 Code Functionality

The program demonstrates:

### Nested Loops & Symmetrical Alignment Logic

* **User Input**: Prompts the user to enter an integer `n` representing the height (number of rows) of the pyramid.

* **Pattern Generation**: For each row `i`, prints `n - i` leading spaces followed by `2 * i - 1` stars (`*`), creating a balanced, centered pyramid structure.

The program is written in a **simple and readable format**, making it ideal for beginners learning multi-loop coordination and spatial alignment in Java.

## 🖥️ Output

The program prompts the user for the number of rows `n` and prints the centered pyramid pattern in the console.

The complete console output for this practice question is shown below:

![Output](Output.png)

## 📂 File Information

* `Pyramid.java` — Contains the practice question program

* `Output.png` — Screenshot of console output

* `README.md` — Folder documentation

## 👨‍💻 Author

**MD Shahnawaz Noor**

*Aspiring Data Scientist*

GitHub: <https://github.com/shahnawaznoor2020-code>

Email: shahnawaznoor2020@gmail.com

## ⭐ Note

These practice programs help build a strong foundation in Java.

Practicing centered patterns like pyramids reinforces how combining space-padding loops with symbol-printing loops controls symmetry in console output.