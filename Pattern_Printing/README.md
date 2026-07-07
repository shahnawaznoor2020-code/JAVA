# Java Pattern Printing & Nested Loops

A dedicated repository section tracking my daily practice in mastering Java's nested looping mechanisms. This comprehensive collection focuses on implementing 2D iterative logic to generate visual patterns, mathematical shapes, and coordinate-based grids to build a strong foundation for matrix operations and advanced algorithm development.

## 🚀 Overview
This module covers the complete progression of nested `for` loops in Java. The programs demonstrate how to control outer execution cycles (rows) and inner execution cycles (columns) to process 2D grid systems. The logic progresses from static square dimensions to dynamic triangular boundaries, incorporating ASCII type-casting, inverse iterations, independent state counters, and complex coordinate filtering.

## 🛠️ Tech Stack & Tools
* **Language:** Java
* **Core Concepts:** Nested `for` Loops, 2D Grid Logic, Dynamic Loop Boundaries, Matrix Coordinate Filtering (`i==j`), State Preservation, Inverse Iteration (`n + 1 - i`), Standard I/O, Explicit Type Casting (ASCII Math)

## 📂 File Index & Structure

### Grid Foundations: Stars & Numbers
* `StarRectangle.java`: Uses nested loops to generate a customizable rectangle of stars based on separate row and column inputs.
* `StarSquare.java`: Generates a symmetrical NxN square grid of stars, demonstrating equal boundary conditions for both loops.
* `NumberSquare.java`: Implements coordinate-based printing using the column index (`j`) to output a dynamic square grid of repeating sequential numbers.
* `StarSquare2.java`: Uses the row index (`i`) to print uniform numerical values across columns, demonstrating vertical state tracking.

### Alphabetical Mapping (Squares)
* `AlphabetSquare.java`: Utilizes explicit type casting `(char)(j+64)` to map column coordinates to uppercase English alphabets sequentially.
* `AlphabetSquare2.java`: Casts the row index `(char)(i+64)` to output uniform uppercase characters horizontally.
* `SmallAlphabetSquare.java`: Adjusts the ASCII offset `(char)(j+96)` to generate lowercase alphabetical sequences based on columns.
* `SmallAlphabetSquare2.java`: Casts the row index to print uniform lowercase alphabetical rows.
* `AlphabetSquare3.java`: Combines coordinate logic with conditional `if-else` blocks (`i % 2 != 0`) to alternate between lowercase and uppercase characters based on row parity.

### Dynamic Boundaries & Advanced Triangles
* `StarTriangle.java`: Introduces dynamic boundary conditions by restricting the inner loop (`j <= i`) to generate a right-angled star triangle.
* `NumberTriangle.java`: Uses the column index bound by the row index to print a classic right-angled triangle of sequential numbers.
* `OddNumberTriangle.java`: Modifies internal loop state with a custom step counter to print sequential odd numbers within triangular boundaries.
* `FloydsTriangle.java`: Demonstrates state preservation across loop iterations using a globally scoped counter to print consecutive numbers seamlessly.
* `BinaryTriangle.java`: Applies modulo arithmetic to coordinate sums `(i+j)%2` to generate an alternating 1/0 checkerboard triangle pattern.
* `AlphabetTriangle.java`: Maps column coordinates to uppercase alphabets in a triangular shape.
* `AlphabetTriangle2.java`: Outputs uniform uppercase characters across each horizontal level of the triangle.
* `SmallAlphabetTriangle.java`: Generates a lowercase alphabetical triangle based on column progression.
* `AlphanumericTriangle.java`: Implements modulo arithmetic inside the nested loop to dynamically alternate between numerical coordinates and uppercase alphabets on alternating rows.

### Inverse Logic (Flipped Triangles)
* `StarTriangleHorzontallyFlipped.java`: Reverses the inner loop condition (`j = n; j >= i`) to generate an inverted right-angled star triangle.
* `NumberTriangleHorzontallyFlipped.java`: Uses a decrementing inner loop to print descending numerical coordinates in an inverted triangular shape.
* `NumberTriangleHorzontallyFlipped2.java`: Achieves the flipped visual structure utilizing a forward-counting inner loop bounded by an inverse mathematical formula `(n + 1 - i)`.
* `SmallAlphabetrTriangleHorzontallyFlipped.java`: Generates a descending lowercase alphabet inverted triangle using a decrementing loop.
* `SmallAlphabetTriangleHorizontallyFlipped2.java`: Generates an ascending lowercase alphabet inverted triangle utilizing the `(n + 1 - i)` algebraic boundary formula.
* `AlphabetTriangle3.java`: Casts the row index to print uniform uppercase alphabets in an inverted triangular structure using the `(n + 1 - i)` boundary formula.

### Coordinate Filtering & Matrix Shapes
* `HollowStarRectangle.java`: Implements grid boundary checking (`i==1 || j==1 || i==r || j==c`) to carve out a hollow box in a 2D matrix.
* `StarPlus.java`: Uses midpoint coordinate calculations to print intersecting vertical and horizontal lines, forming a plus (`+`) sign.
* `StarCross.java`: Utilizes diagonal matrix properties (the main diagonal `i==j` and anti-diagonal `j==(n-i+1)`) to print an X-shaped cross.

## 💡 Key Learnings & Features
* **Matrix Coordinate Filtering:** Learning to view nested loops as an (X, Y) Cartesian plane, allowing the extraction of specific shapes like hollow borders, crosses (`X`), and pluses (`+`) by checking specific coordinate equalities (`i==j`).
* **State Preservation (Floyd's Triangle):** Understanding the scope of variables by placing a continuous counter outside the inner loop to maintain its state across multiple row iterations.
* **Checkerboard Logic:** Leveraging the sum of row and column indices `(i+j)%2` to create perfectly alternating binary or checkerboard patterns.
* **Row vs. Column State:** Recognizing the critical difference between utilizing the outer loop variable (`i`) for vertical uniformity versus the inner loop variable (`j`) for horizontal sequential progression.
* **Dynamic Loop Boundaries:** Transitioning from fixed NxN matrices (squares) to dynamic shapes (triangles) by binding the inner loop's termination condition to the current state of the outer loop (`j <= i`).

---
## 👨‍💻 Author

**MD Shahnawaz Noor**            
*Aspiring Data Scientist* 

GitHub: [https://github.com/shahnawaznoor2020](https://github.com/shahnawaznoor2020)
