# Part 01 – Introduction to Java

This part introduces the basics of Java programming. The goal is to become familiar with the Java syntax, input/output, and basic control flow.

## 💡 Topics Covered

- Printing text using `System.out.println`
- Writing simple Java programs inside the `main` method
- Using variables and assigning values
- Reading user input with `Scanner`
- Working with different data types: `String`, `int`, `double`, `boolean`
- Basic conditional logic with `if` statements
- Using the `%` operator to check even/odd numbers
- String comparisons with `.equals()`

## 🧪 Example Exercises

- Print a custom message (e.g., "Ada Lovelace")
- Ask for the user's name and greet them
- Repeat a message multiple times
- Check whether a number is even or odd
- Determine whether a year is a leap year
- Validate age inputs and calculate taxes

## 📁 Structure

Each Java file in this folder is a small independent exercise.  
The files are named according to the task (e.g., `EvenOrOdd.java`, `LeapYear.java`).

## ✅ Goal
Build a strong foundation in writing and understanding simple Java programs before moving on to loops, methods, and more complex logic.

---
# Part 02 – Methods, Loops, and Modular Programming
This part dives deeper into Java programming by introducing methods, loops, and parameterized programming. You’ll learn how to organize code into reusable units and use iteration for repeated actions.

## 💡 Topics Covered
Writing and calling methods

Parameters and return values

Using while and for loops

Loop control: break, continue

Method reusability and modularization

Printing shapes and patterns using loops

Using Math methods (e.g., Math.sqrt)

Nested method calls and method chaining

## 🧪 Example Exercises
Write and reuse a method that prints a line of text

Print numbers in increasing or decreasing order using loops

Calculate a sum or factorial using a method

Determine the smallest or greatest number using parameters

Use one method inside another (e.g., sum() inside average())

Print star patterns like squares, rectangles, triangles, and a Christmas tree

Divide two numbers and return a floating-point result

Print only numbers divisible by 3 in a given range

## 🔁 Emphasis on Loops and Repetition
This part builds fluency with repetition and modular thinking:

Looping over ranges with conditions

Printing structured output (like triangles and trees)

Avoiding repetition by calling methods multiple times

Using helper methods to simplify logic

## 📁 Structure
Each .java file represents a focused task or concept.

Exercises are grouped by themes (e.g., loops, methods, conditionals).

Filenames reflect the content: e.g., Greatest.java, PrintTriangle.java, DivisibleByThree.java.

## ✅ Goal
To strengthen your understanding of methods and loops, and to encourage modular code design. By the end of Part 2, you should be comfortable writing programs with reusable methods, input/output, and structured logic using loops.

---
# Part 03 – Lists and Arrays
This part introduces collections of data in Java — specifically ArrayList and arrays. You'll learn to store multiple values, access and manipulate them, and write logic based on the contents of these structures.

## 💡 Topics Covered
Creating and using ArrayLists

Adding elements to a list with .add()

Getting values with .get(index)

Finding the size of a list with .size()

Using for and for-each loops to iterate over lists

Reading values from the user and storing them in a list

Using arrays (int[], String[]) and fixed-size structures

Finding the greatest/smallest number in a list or array

Working with indices: searching, swapping, and accessing

Printing elements based on range, pattern, or condition

## 🧪 Example Exercises
Add strings to a list and print the 3rd or last element

Sum or average numbers from a list

Print only the numbers in a specific index range

Search for a number or string and return its index

Remove the last element from a list

Swap elements in an array using indices

Print stars based on values in an array (visual patterns)

Format array output with commas and no trailing symbols

Find the index/indices of the smallest number in a list

## 🔁 Emphasis on List/Array Operations
This part builds fluency in working with multiple values:

Dynamically adding and accessing elements

Understanding index-based data structures

Searching and filtering values

Developing logic that handles user input of unknown size

Writing methods that process list or array parameters

## 📁 Structure
Each .java file represents an exercise focused on one key operation.

Files are organized by theme (e.g., SumOfList.java, IndexOfNumber.java, PrintStars.java)

Folder names may reflect logical groupings (e.g., Part3_1/, Part3_2/)

Each class has a descriptive name related to its task

## ✅ Goal
To gain confidence in using lists and arrays for storing and processing data. After this part, you’ll be comfortable:

Working with dynamic and fixed-size data collections

Implementing search, sum, average, and filter logic

Building small programs using list/array operations

You are now ready to explore object-oriented programming and build larger Java applications.

---
# Part 04 – Object-Oriented Programming
This part introduces Object-Oriented Programming (OOP) in Java. You'll learn how to define your own classes, create objects from those classes, and organize logic using methods and instance variables.

## 💡 Topics Covered

Writing custom classes with class keyword

Defining constructors and initializing object state

Creating and using instance variables

Implementing methods inside classes

Access modifiers: private vs. public

Calling object methods using dot notation

Understanding toString() and how it replaces print()

Object lists: ArrayList<Object> and class collections

File reading with Scanner and Paths.get()

Using multiple classes and real-world modeling

## 🧪 Example Exercises

Create a Product class and print product info with toString()

Build a Gauge that increases/decreases only within a range

Implement a DecreasingCounter that stops at zero

Create a Debt class that grows with interest each year

Model a Film with age restrictions and compare to user age

Build a PaymentCard class with balance, restrictions, and transactions

Manage a list of Items that store creation timestamp

Use Scanner to read and process input from a file

Implement a guest list application that reads names from a file

## 🔁 Emphasis on Object Behavior
This part teaches how to encapsulate data and behavior:

Objects remember their internal state

Methods modify or expose object state

You can create many objects with the same class blueprint

OOP helps organize complex logic into reusable, modular parts

## 📁 Structure

Each Java file represents a class (e.g., Book.java, Debt.java)

Main programs create objects and call their methods

Files may be grouped by packages (e.g., Part4_2/, Part4_3/)

Common naming convention: ClassName.java + MainProgram.java

## 📅 Real-World Modeling
Many exercises simulate real-world items:

Book with title, pages, and year

Song with duration

TelevisionProgram with name and runtime

Item with creation timestamp

PersonalInformation with name and ID

## 📄 File Handling
You will also begin reading external .txt files:

Use Paths.get("filename") inside a try-with-resources block

Read lines using Scanner

Handle IOException gracefully

Process user-selected files dynamically

## ✅ Goal
By the end of Part 4, you will be able to:

Design and implement Java classes with encapsulated behavior

Build programs that use multiple objects together

Read from files and create interactive programs

Apply OOP to organize and scale your Java applications

This foundation prepares you for building full applications, managing more complex data, and leveraging Java's full object-oriented power.

