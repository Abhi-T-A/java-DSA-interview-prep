# Day 001 - What is Programming?

## Definition

Programming is the process of writing step-by-step instructions that a computer can understand and execute to solve a specific problem.

A computer does not think on its own. It follows instructions exactly as they are written. Programming helps us communicate with computers using programming languages such as Java, Python, C++, or JavaScript.

## Real-Life Analogy

Programming is like giving directions to someone who does not know the route.

For example, instead of saying "Go to the shop", we give clear steps:

1. Walk straight for 100 meters
2. Turn left
3. Cross the road
4. Enter the shop

Similarly, in programming, we break a big problem into small, clear steps so that the computer can execute them correctly.

## Simple Java Example

```java
public class WhatIsProgramming {
    public static void main(String[] args) {
        // Prints a simple definition of programming
        System.out.println("Programming means giving step-by-step instructions to a computer.");
    }
}
```

## Explanation of the Java Program

```text
public class WhatIsProgramming
```

This line defines a class named `WhatIsProgramming`. In Java, every program is written inside a class.

```text
public static void main(String[] args)
```

This is the main method. Java program execution starts from the `main` method.

```text
System.out.println()
```

This is used to print output on the screen.

```text
// Prints a simple definition of programming
```

This is a comment. Comments are ignored by Java and are used to explain code.

## Output

```text
Programming means giving step-by-step instructions to a computer.
```

## Dry Run

A dry run means manually checking the program step by step before or after running it.

Step-by-step dry run:

1. Java starts execution from the `main` method.
2. The comment line is ignored by Java.
3. The `System.out.println()` statement is executed.
4. The message is printed on the screen.
5. The program ends.

## Why Programming is Important

Programming is important because it helps us:

- Solve real-world problems using computers
- Build applications, websites, games, and software systems
- Automate repetitive tasks
- Process large amounts of data
- Develop logical thinking and problem-solving skills

## Time Complexity

```text
O(1)
```

The program performs a fixed number of operations, so the time taken does not depend on input size.

## Space Complexity

```text
O(1)
```

The program does not use extra memory that grows with input size.

## Key Terms

| Term | Meaning |
|---|---|
| Programming | Writing instructions for a computer |
| Program | A set of instructions |
| Programming Language | A language used to write programs |
| Java | A popular object-oriented programming language |
| Syntax | Rules of writing code |
| Dry Run | Manual step-by-step checking of code |
| Output | Result produced by a program |
| Comment | Text written to explain code, ignored by compiler |

## Interview Questions

1. What is programming?
2. Why do we need programming languages?
3. What is the difference between a program and programming?
4. From where does Java program execution start?
5. What is a dry run?
6. What is the use of `System.out.println()` in Java?
7. What is a comment in Java?

## Interview-Ready Answers

### 1. What is programming?

Programming is the process of writing step-by-step instructions using a programming language to make a computer solve a specific problem.

### 2. Why do we need programming languages?

We need programming languages to communicate with computers and give them instructions in a structured format that they can understand and execute.

### 3. What is the difference between a program and programming?

A program is a set of instructions written to perform a task, while programming is the process of creating those instructions.

### 4. From where does Java program execution start?

Java program execution starts from the `main` method.

### 5. What is a dry run?

A dry run is the process of manually checking a program step by step to understand how it works and what output it produces.

### 6. What is the use of `System.out.println()` in Java?

`System.out.println()` is used to print output on the screen and move to the next line.

### 7. What is a comment in Java?

A comment is a line written to explain code. It is ignored by the compiler and does not affect program execution.

## Common Beginner Mistakes

- Forgetting semicolons
- Writing `system.out.println` instead of `System.out.println`
- Forgetting curly braces
- Not understanding the role of the `main` method
- Memorizing code without understanding the logic
- Not doing dry runs

## Practice Task

Write a Java program that prints:

```text
Hello DSA
I am learning Java for interviews
```

Expected code:

```java
public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello DSA");
        System.out.println("I am learning Java for interviews");
    }
}
```

## Final Revision Notes

```text
Programming = process of writing instructions for a computer.
Program = set of instructions.
Programming language = language used to write programs.
Java execution starts from main method.
System.out.println() prints output.
Comments explain code and are ignored by Java.
Dry run means manually checking code step by step.
Time complexity tells how much time code takes.
Space complexity tells how much memory code uses.
```

## Summary

Programming is the foundation of computer science. It is not only about writing code, but also about developing logical thinking, breaking problems into smaller steps, and building solutions that computers can execute efficiently.
