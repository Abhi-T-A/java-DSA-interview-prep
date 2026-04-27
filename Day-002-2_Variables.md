# Day 002 - Variables in Java

## Definition

A variable is a named memory location used to store data.

In simple words, a variable is like a container that holds a value.

## Syntax

```java
dataType variableName = value;
```

Example:

```java
int age = 20;
```

Meaning:

```text
int = data type
age = variable name
20 = value stored in the variable
```

## Real-Life Analogy

A variable is like a labelled box.

Example:

```text
Box label: age
Value inside box: 20
```

If the value changes:

```java
age = 21;
```

The same variable now stores `21`.

## Java Example

```java
public class Main {
    public static void main(String[] args) {
        // Stores a whole number
        int age = 20;

        // Stores a decimal number
        double marks = 85.5;

        // Stores a single character
        char grade = 'A';

        // Stores true or false
        boolean isPassed = true;

        // Stores text
        String name = "Abhi";

        // Print all variable values
        System.out.println(age);
        System.out.println(marks);
        System.out.println(grade);
        System.out.println(isPassed);
        System.out.println(name);
    }
}
```

## Output

```text
20
85.5
A
true
Abhi
```

## Dry Run

```text
age = 20
marks = 85.5
grade = A
isPassed = true
name = Abhi

Print age -> 20
Print marks -> 85.5
Print grade -> A
Print isPassed -> true
Print name -> Abhi
```

## Variable Naming Rules in Java

1. Java is case-sensitive.

```java
int age = 20;
int AGE = 30;
```

Here, `age` and `AGE` are different variables.

2. A variable name can start with a letter, underscore `_`, or dollar sign `$`.

Valid examples:

```java
int age = 20;
int _marks = 90;
int $salary = 5000;
```

3. A variable name cannot start with a number.

Wrong:

```java
int 1age = 20;
```

Correct:

```java
int age1 = 20;
```

4. A variable name cannot contain spaces.

Wrong:

```java
int student age = 20;
```

Correct:

```java
int studentAge = 20;
```

5. Reserved keywords cannot be used as variable names.

Wrong:

```java
int class = 10;
```

Correct:

```java
int classNumber = 10;
```

6. Variable names should be meaningful.

Bad:

```java
int x = 90;
```

Better:

```java
int marks = 90;
```

7. Use camelCase for variable names.

Examples:

```java
int studentAge = 20;
int totalMarks = 450;
int firstNumber = 10;
```

## Reserved Keywords

Reserved keywords are words that already have special meaning in Java.

```text
abstract    assert      boolean     break       byte
case        catch       char        class       const
continue    default     do          double      else
enum        extends     final       finally     float
for         goto        if          implements  import
instanceof  int         interface   long        native
new         package     private     protected   public
return      short       static      strictfp    super
switch      synchronized this       throw       throws
transient   try         void        volatile    while
_

```

These words cannot be used as variable names.

## Types of Variables Used Here

| Data Type | Example | Meaning |
|---|---|---|
| int | 20 | Whole number |
| double | 85.5 | Decimal number |
| char | 'A' | Single character |
| boolean | true | True or false value |
| String | "Abhi" | Text |

## Time Complexity

```text
O(1)
```

Creating and printing a fixed number of variables takes constant time.

## Space Complexity

```text
O(1)
```

Only a fixed number of variables are used.

## Common Beginner Mistakes

- Starting variable name with a number
- Using spaces in variable names
- Using reserved keywords as variable names
- Forgetting semicolon
- Confusing `age` and `AGE`
- Using unclear variable names like `x`, `y`, `z`
- Writing string values without double quotes
- Writing char values without single quotes

## Interview Questions

1. What is a variable?
2. Why do we use variables?
3. Is Java case-sensitive?
4. Can a variable name start with a number?
5. Can we use reserved keywords as variable names?
6. What is camelCase?
7. What is the difference between `char` and `String`?

## Interview-Ready Answers

### 1. What is a variable?

A variable is a named memory location used to store data.

### 2. Why do we use variables?

We use variables to store data so that it can be used and changed during program execution.

### 3. Is Java case-sensitive?

Yes, Java is case-sensitive. For example, `age` and `AGE` are treated as different variables.

### 4. Can a variable name start with a number?

No, a variable name cannot start with a number.

### 5. Can we use reserved keywords as variable names?

No, reserved keywords cannot be used as variable names because they already have special meaning in Java.

### 6. What is camelCase?

camelCase is a naming style where the first word starts with a lowercase letter and the next words start with uppercase letters.

Example:

```java
studentAge
totalMarks
firstNumber
```

### 7. What is the difference between `char` and `String`?

`char` stores a single character, while `String` stores a sequence of characters or text.

Example:

```java
char grade = 'A';
String name = "Abhi";
```
## Final Revision Notes

```text
Variable = named memory location used to store data.
Syntax = dataType variableName = value;

Java is case-sensitive.
age and AGE are different.

Variable names:
Can start with letter, _, or $
Cannot start with number
Cannot contain spaces
Cannot be reserved keywords
Should be meaningful
Should follow camelCase

int = whole number
double = decimal number
char = single character
boolean = true/false
String = text
```

## Summary

Variables are one of the most important basics in programming. They allow us to store, use, and update data in a program. Strong understanding of variables is necessary before learning input, operators, conditions, loops, arrays, and DSA.
