# Day 002 - Java Hello World Styles

## Topic

Java Hello World program and meaning of each word in the classic Java syntax.

## Classic Java Hello World

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

This is the most commonly used Java program structure. It works in college labs, online compilers, coding platforms, and DSA practice.

## Latest Short Java Style

```java
void main() {
    System.out.println("Hello, World!");
}
```

This is a newer Java style. It is shorter, but it may not work on all platforms.

For DSA practice and interviews, I will use the classic Java style.

## Meaning of Each Word

## public

`public` means accessible from anywhere.

In this program, Java needs to access the `main` method to start execution.

```text
public = accessible
```

## class

`class` is used to create a class in Java.

Java programs are written inside classes.

```text
class = blueprint/container for Java code
```

## Main

`Main` is the name of the class.

If the file name is `Main.java`, the public class name should also be `Main`.

```text
Main = class name
```

## static

`static` means the method belongs to the class and can run without creating an object.

Java can directly call the `main` method because it is static.

```text
static = no object needed
```

## void

`void` means the method does not return any value.

The `main` method starts the program but does not return anything.

```text
void = returns nothing
```

## main

`main` is the name of the method where program execution starts.

```text
main = starting point of a Java program
```

## String[] args

`String[] args` is used to store command-line arguments.

- `String` means text
- `[]` means array
- `args` is the variable name

```text
String[] args = array of text values
```

Example:

```text
java Main hello dsa
```

Here, `hello` and `dsa` can be stored inside `args`.

## System.out.println()

`System.out.println()` is used to print output on the screen.

## System

`System` is a built-in Java class.

## out

`out` represents the output stream, usually the console/screen.

## println

`println` means print line.

It prints the output and moves the cursor to the next line.

```text
println = print + new line
```

## Double Quotes

Text in Java is written inside double quotes.

Example:

```java
"Hello, World!"
```

## Semicolon

A semicolon is used to end most Java statements.

Example:

```java
System.out.println("Hello, World!");
```

## Line-by-Line Explanation

```java
public class Main {
```

This creates a public class named `Main`.

```java
public static void main(String[] args) {
```

This is the main method. Java program execution starts from here.

```java
System.out.println("Hello, World!");
```

This prints `Hello, World!` on the screen.

```java
}
```

This closes the main method.

```java
}
```

This closes the class.

## Output

```text
Hello, World!
```

## Dry Run

```text
1. Java finds the Main class.
2. Java looks for the main method.
3. Execution starts from main.
4. System.out.println() runs.
5. Hello, World! is printed.
6. Program ends.
```

## Classic vs Latest Style

| Classic Style | Latest Short Style |
|---|---|
| Works on almost all Java platforms | Works only on newer Java versions |
| Best for DSA and interviews | Good for learning modern Java |
| Uses class and main method | Can be written without class |
| More common in coding platforms | Less common in online judges |

## Which Style Should I Use?

For DSA practice, coding platforms, college work, and interviews, I should use:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## Time Complexity

```text
O(1)
```

The program performs a fixed number of operations.

## Space Complexity

```text
O(1)
```

The program uses fixed memory.

## Common Beginner Mistakes

- Writing `system.out.println` instead of `System.out.println`
- Forgetting semicolon
- Forgetting curly braces
- Writing `main` incorrectly
- Forgetting `static`
- Class name and file name mismatch
- Using latest short style on platforms that do not support it

## Interview Questions

1. What is the starting point of a Java program?
2. What is the use of `public`?
3. Why is the `main` method static?
4. What does `void` mean?
5. What is `String[] args`?
6. What is the use of `System.out.println()`?
7. Which Java style is best for DSA practice?

## Interview-Ready Answers

### 1. What is the starting point of a Java program?

The starting point of a classic Java program is the `main` method.

### 2. What is the use of `public`?

`public` makes the class or method accessible from outside.

### 3. Why is the `main` method static?

The `main` method is static so Java can call it without creating an object of the class.

### 4. What does `void` mean?

`void` means the method does not return any value.

### 5. What is `String[] args`?

`String[] args` is an array of strings used to store command-line arguments.

### 6. What is the use of `System.out.println()`?

`System.out.println()` is used to print output on the screen and move to the next line.

### 7. Which Java style is best for DSA practice?

The classic Java style with `public class Main` and `public static void main(String[] args)` is best for DSA practice.

## Practice Task

Write a Java program to print:

```text
I am learning Java DSA
```

Expected code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("I am learning Java DSA");
    }
}
```

## Final Revision Notes

```text
Classic Java style is best for DSA.
Java execution starts from main method.
public = accessible.
class = container for Java code.
Main = class name.
static = no object needed.
void = returns nothing.
main = starting point.
String[] args = command-line arguments.
System.out.println() = prints output.
println = print line.
Semicolon ends a statement.
Curly braces define code blocks.
```

## Summary

The classic Java Hello World program is the foundation of Java programming. Understanding each word helps build strong basics before moving into input, variables, conditions, loops, arrays, and DSA.
