## Java Practice Question – Horizontally Flipped Number Triangle Pattern

This folder contains a Java program that solves a **pattern-printing practice question** demonstrating how to generate an inverted (horizontally flipped) right-angled triangle filled with sequential numbers using nested `for` loops.

It is intended for beginners to strengthen their understanding of **core Java fundamentals**, specifically controlling decreasing column iterations per row and printing numerical sequences in inverted triangular structures.

## 📌 Program Overview

The program in this folder covers the following practice concepts:

* Reading the number of rows (`n`) from the user using the `Scanner` class.

* Using an outer `for` loop (`i` from `1` to `n`) to iterate through each row of the inverted triangle.

* Using an inner `for` loop (`j` from `1` to `n + 1 - i`) to print decreasing counts of sequential numbers on each subsequent row.

* Using `System.out.print()` for inline number formatting and `System.out.println()` to move to the next line after each row.

## 🧪 Code Functionality

The program demonstrates:

### Nested Loops & Inverted Numerical Formatting

* **User Input**: Prompts the user to enter an integer `n` representing the height (number of rows) of the triangle.

* **Pattern Generation**: Iterates through `n` rows and prints sequential numbers starting from `1` up to `n + 1 - i` separated by spaces, creating a horizontally flipped number triangle where the widest row is at the top.

The program is written in a **simple and readable format**, making it ideal for beginners learning how to invert loop boundaries in Java.

## 🖥️ Output

The program prompts the user for the number of rows `n` and prints the horizontally flipped number triangle pattern in the console.

The complete console output for this practice question is shown below:

![Output](Output.png)

## 📂 File Information

* `NumberTriangleHorzontallyFlipped.java` — Contains the practice question program

* `Output.png` — Screenshot of console output

* `README.md` — Folder documentation

## 👨‍💻 Author

**MD Shahnawaz Noor**

*Aspiring Data Scientist*

GitHub: <https://github.com/shahnawaznoor2020-code>

Email: shahnawaznoor2020@gmail.com

## ⭐ Note

These practice programs help build a strong foundation in Java.

Practicing flipped number triangle patterns reinforces how inverse loop bounds control shrinking row lengths in console outputs.