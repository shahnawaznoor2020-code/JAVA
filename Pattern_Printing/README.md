# Java Pattern Printing & Nested Loops

A dedicated repository section tracking my daily practice in mastering Java's nested looping mechanisms. This collection focuses on implementing 2D iterative logic to generate visual patterns, mathematical shapes, and coordinate-based grids to build a strong foundation for matrix operations and algorithm development.

## 🚀 Overview
This module covers the practical application of nested `for` loops in Java. The programs demonstrate how to control outer execution cycles (rows) and inner execution cycles (columns) to process 2D grid systems. The logic progresses from static square dimensions to dynamic triangular boundaries, incorporating ASCII type-casting and conditional formatting.

## 🛠️ Tech Stack & Tools
* **Language:** Java
* **Core Concepts:** Nested `for` Loops, 2D Grid Logic, Dynamic Loop Boundaries, Conditional Logic (`if-else`), Standard I/O, Explicit Type Casting (ASCII)

## 📂 File Index & Structure

### Basic Shapes & Star Patterns
* `StarRectangle.java`: Uses nested loops to generate a customizable rectangle of stars based on separate row and column inputs from the user.
* `StarSquare.java`: Generates a symmetrical NxN square grid of stars, demonstrating equal boundary conditions for both loops.
* `StarTriangle.java`: Introduces dynamic boundary conditions by restricting the inner loop (`j <= i`) to generate a right-angled triangle pattern.

### Numerical & Coordinate Grids
* `NumberSquare.java`: Implements coordinate-based printing using the column index (`j`) to output a dynamic square grid of repeating sequential numbers.
* `StarSquare2.java`: Uses the row index (`i`) to print uniform numerical values across columns, demonstrating vertical state tracking. *(Note: Explores numerical output despite the class name).*

### Alphabetical Mapping & ASCII Logic
* `AlphabetSquare.java`: Utilizes explicit type casting `(char)(j+64)` to map column coordinates to their corresponding uppercase English alphabets.
* `AlphabetSquare2.java`: Casts the row index `(char)(i+64)` to output uniform uppercase characters horizontally.
* `SmallAlphabetSquare.java`: Adjusts the ASCII offset `(char)(j+96)` to generate lowercase alphabetical sequences based on columns.
* `SmallAlphabetSquare2.java`: Casts the row index to print uniform lowercase alphabetical rows.
* `AlphabetSquare3.java`: Combines coordinate logic with conditional `if-else` blocks (`i % 2 != 0`) to alternate between lowercase and uppercase characters depending on whether the row is odd or even.

## 💡 Key Learnings & Features
* **Row vs. Column State:** Understanding the critical difference between utilizing the outer loop variable (`i`) for vertical uniformity versus the inner loop variable (`j`) for horizontal sequential progression.
* **Dynamic Boundaries:** Transitioning from fixed NxN matrices (squares) to dynamic shapes (triangles) by binding the inner loop's termination condition to the current state of the outer loop.
* **ASCII Math & Conditional Formatting:** Manipulating integer offsets (`+64` for Uppercase, `+96` for Lowercase) and combining them with modulo arithmetic to create highly specific, alternating visual patterns purely through mathematical logic.

---
## 👨‍💻 Author

**MD Shahnawaz Noor**           
*Aspiring Data Scientist*        

GitHub: [https://github.com/shahnawaznoor2020](https://github.com/shahnawaznoor2020)
