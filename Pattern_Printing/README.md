# Java Pattern Printing & Nested Loops

A dedicated repository section tracking my daily practice in mastering Java's nested looping mechanisms. This comprehensive collection focuses on implementing 2D iterative logic to generate visual patterns, mathematical shapes, and coordinate-based grids to build a strong foundation for matrix operations and advanced algorithm development.

## 🚀 Overview
This module covers the complete progression of nested `for` loops in Java. The programs demonstrate how to control outer execution cycles (rows) and inner execution cycles (columns) to process 2D grid systems. The logic progresses from static square dimensions to dynamic triangular boundaries, incorporating ASCII type-casting, inverse iterations, space-padding logic, independent state counters, and complex coordinate filtering to build symmetrical pyramids and rhombi.

## 🛠️ Tech Stack & Tools
* **Language:** Java
* **Core Concepts:** Nested `for` Loops, Sequential Inner Loops (Space Padding), 2D Grid Logic, Dynamic Loop Boundaries, Matrix Coordinate Filtering (`i==j`, `(i+j)>n`), State Preservation, Inverse Iteration (`n + 1 - i`), Standard I/O, Explicit Type Casting (ASCII Math)

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

### Inverse Logic (Horizontally Flipped Triangles)
* `StarTriangleHorzontallyFlipped.java`: Reverses the inner loop condition (`j = n; j >= i`) to generate an inverted right-angled star triangle.
* `NumberTriangleHorzontallyFlipped.java`: Uses a decrementing inner loop to print descending numerical coordinates in an inverted triangular shape.
* `NumberTriangleHorzontallyFlipped2.java`: Achieves the flipped visual structure utilizing a forward-counting inner loop bounded by an inverse mathematical formula `(n + 1 - i)`.
* `SmallAlphabetrTriangleHorzontallyFlipped.java`: Generates a descending lowercase alphabet inverted triangle using a decrementing loop.
* `SmallAlphabetTriangleHorizontallyFlipped2.java`: Generates an ascending lowercase alphabet inverted triangle utilizing the `(n + 1 - i)` algebraic boundary formula.
* `AlphabetTriangle3.java`: Casts the row index to print uniform uppercase alphabets in an inverted triangular structure.

### Space-Padded Logic (Vertically Flipped & Right-Aligned)
* `StarTriangleVerticallyFlippedMethod1.java`: Uses mathematical coordinate boundary filtering `(i+j)>n` to selectively print stars, creating a right-aligned triangle.
* `StarTriangleVerticallyFlippedMethod2.java`: Generates the exact same right-aligned shape by executing two sequential inner loops per row: the first prints padding spaces `(n-i)`, and the second prints stars.
* `NumberTriangleVerticallyFlipped.java`: Combines space-padding loops with numeric column indexing to create a right-aligned number triangle.
* `AlphabetTriangleVerticallyFlipped.java`: Uses space-padding loops alongside ASCII-cast row indices to build a right-aligned alphabet triangle.
* `StarTriangleDiagonallyFlipped.java`: Prints an inverted, right-aligned triangle by padding the left side with increasing spaces (`j<i`) while printing decreasing stars `(n-i)`.

### Advanced Geometric Shapes
* `Rhombus.java`: Shifts a standard square grid horizontally across rows using decreasing space padding `(n-i)` to form a leaning parallelogram/rhombus.
* `Pyramid.java`: Generates a centered, symmetrical 2D pyramid by combining dynamic space padding `(n-i)` with an arithmetic odd-number sequence generator `(2*i-1)` to control the star density per row.

### Coordinate Filtering & Matrix Shapes
* `HollowStarRectangle.java`: Implements grid boundary checking (`i==1 || j==1 || i==r || j==c`) to carve out a hollow box in a 2D matrix.
* `StarPlus.java`: Uses midpoint coordinate calculations to print intersecting vertical and horizontal lines, forming a plus (`+`) sign.
* `StarCross.java`: Utilizes diagonal matrix properties (the main diagonal `i==j` and anti-diagonal `j==(n-i+1)`) to print an X-shaped cross.

## 💡 Key Learnings & Features
* **Sequential Inner Loops (Space Padding):** Advancing beyond single inner loops by placing multiple loops sequentially inside the outer row loop. This allows one loop to handle invisible formatting (like space padding) and the next to handle the visible characters, which is crucial for building right-aligned shapes and centered pyramids.
* **Algorithmic Duality (Method 1 vs Method 2):** Proving that a single visual pattern can be achieved through vastly different logical approaches—such as using Cartesian coordinate algebra `(i+j)>n` versus using sequential space-padding loops `(n-i)`.
* **Matrix Coordinate Filtering:** Learning to view nested loops as an (X, Y) Cartesian plane, allowing the extraction of specific shapes like hollow borders, crosses (`X`), and pluses (`+`) by checking specific coordinate equalities (`i==j`).
* **State Preservation (Floyd's Triangle):** Understanding the scope of variables by placing a continuous counter outside the inner loop to maintain its state across multiple row iterations.
* **Checkerboard Logic:** Leveraging the sum of row and column indices `(i+j)%2` to create perfectly alternating binary or checkerboard patterns.

---
## 👨‍💻 Author

**MD Shahnawaz Noor**                 
*Aspiring Data Scientist*         

GitHub: [https://github.com/shahnawaznoor2020](https://github.com/shahnawaznoor2020)
