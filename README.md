# 
## Overview
This project demonstrates the implementation of **searching algorithms** in Java, showcasing both **linear search** and **binary search** techniques. The current focus is on teaching the fundamental concepts of these searching methods, with examples provided for 1D arrays, 2D arrays, and sorted arrays (both ascending and descending).
The project also demonstrates how to handle edge cases, such as invalid ranges and elements not found in arrays, while adhering to best practices for clean code and meaningful messages to the user.
## Features
### 1. **Linear Search**
- Works with both **1D arrays** and **2D arrays**.
- Supports **simple linear search** and **ranged linear search**.
- **Custom messages** are provided when an element is or isn’t found.
- Methods:
    - `linearSearch1D(value)` — Searches for a value in a 1D array.
    - `rangedLinearSearch(value, start, end)` — Searches for a value within a specified range of a 1D array.
    - `linearSearch2D(value)` — Searches for a value in a 2D array and returns its position as `[row, column]`.

#### Example
**Input:**
``` java
   int[] arr = {1, 23, 24, 15, 16, 98, 64};
   int[][] arr2D = {{1, 23, 24, 15}, {16, 98, 64}};
   LinearSearch linearSearch = new LinearSearch(arr);
```
**Usage:**
- Position in 1D: `linearSearch.linearSearch1D(15);`
- Position with range: `linearSearch.rangedLinearSearch(1, 0, 5);`
- Position in 2D: `linearSearch2D.linearSearch2D(24);`

#### Output:
- "Value is found in array at position 3"
- "2D Array Linear Search: Value is found in array at position `[0, 2]`"

### 2. **Binary Search**
- Designed specifically for **sorted arrays**.
- Supports both **ascending** and **descending order arrays**.
- Provides **error handling** (e.g., when the value is not found in the array).
- Methods:
    - `binarySearch(value)` — Finds a value using the binary search algorithm and returns its index.

- Utilizes **encapsulation** by having separate instances for ascending and descending arrays.

#### Example
**Input:**
``` java
   int[] ascArr = {2, 34, 40, 56, 67, 897, 1233, 1235, 12144, 34556};
   int[] descArr = {100, 98, 77, 54, 34, 10, 5, 1};
   BinarySearch binarySearchAsc = new BinarySearch(ascArr);
   BinarySearch binarySearchDesc = new BinarySearch(descArr);
```
**Usage:**
- Ascending array: `binarySearchAsc.binarySearch(67);`
- Descending array: `binarySearchDesc.binarySearch(5);`

#### Output:
- "Ascending: Value is found in array at position 4"
- "Descending: Value is found in array at position 6"

### Message Handling
The helper methods `getMessage(int position)` and `get2DMessage(int[] position)` enhance usability by providing clear feedback to the user:
- `"Value is found in array at position X"`
- `"Value not found in the array"`

## How to Run
1. Clone the repository.
2. Open the project in an IDE like IntelliJ IDEA.
3. Run the `Main` class.
4. Outputs for the implemented search techniques will be displayed in the console.

## Project Structure
- **`Main` **: Demonstrates usage of the linear and binary search classes.
- **`LinearSearch` class**: Implements linear search in 1D and 2D arrays, with optional ranged search.
- **`BinarySearch` class**: Implements binary search in sorted arrays (ascending and descending).

## Future Enhancements
- Add support for more searching algorithms (e.g., Jump Search, Interpolation Search).
- Integrate a graphical user interface (GUI) for better visualization of these algorithms.
- Optimize binary search for extremely large datasets.

## Requirements
- **Java Development Kit (JDK)**: Version 8 or higher.
- Any IDE capable of running Java programs (e.g., IntelliJ IDEA, Eclipse).

## Contribution
Contributions to this project are welcome! Feel free to open issues or submit pull requests to enhance the implementation or add new features.
## License
This project is licensed under the MIT License. Feel free to use and modify the code as needed.
Let me know if you'd like to include additional details or further refine the README!
