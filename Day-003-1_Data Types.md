# Day 003 - Data Types in Java

## Definition

A data type tells Java what kind of value a variable can store.

Example:

```java
int age = 20;
String name = "Abhi";
```

Here, `int` tells Java that `age` stores a whole number, and `String` tells Java that `name` stores text.

## Real-Life Analogy

A school record stores different types of data:

```text
Name    -> text
Age     -> whole number
Marks   -> decimal number
Grade   -> single character
Passed  -> true/false
```

Similarly, Java uses different data types for different kinds of values.

## Types of Data Types in Java

Java data types are mainly divided into two types:

```text
1. Primitive data types
2. Non-primitive data types
```

## Primitive Data Types

Primitive data types are the basic built-in data types in Java.

Java has 8 primitive data types:

```text
byte
short
int
long
float
double
char
boolean
```

## Primitive Data Types Table

| Data Type | Size | Default Value | Use |
|---|---:|---|---|
| byte | 1 byte | 0 | Very small whole numbers |
| short | 2 bytes | 0 | Small whole numbers |
| int | 4 bytes | 0 | Common whole numbers |
| long | 8 bytes | 0L | Very large whole numbers |
| float | 4 bytes | 0.0f | Decimal numbers with less precision |
| double | 8 bytes | 0.0d | Decimal numbers with more precision |
| char | 2 bytes | '\u0000' | Single character |
| boolean | JVM dependent | false | true or false |

## 1. byte

`byte` is used to store very small whole numbers.

```java
byte age = 20;
```

Range:

```text
-128 to 127
```

## 2. short

`short` is used to store small whole numbers.

```java
short marks = 30000;
```

Range:

```text
-32,768 to 32,767
```

## 3. int

`int` is the most commonly used data type for whole numbers.

```java
int salary = 50000;
```

Range:

```text
-2,147,483,648 to 2,147,483,647
```

## 4. long

`long` is used to store very large whole numbers.

```java
long population = 1400000000L;
```

For large long values, use `L` at the end.

## 5. float

`float` is used to store decimal numbers with less precision.

```java
float percentage = 85.5f;
```

In Java, float values should end with `f`.

## 6. double

`double` is used to store decimal numbers with more precision.

```java
double price = 99.99;
```

In Java, decimal numbers are treated as `double` by default.

## 7. char

`char` is used to store a single character.

```java
char grade = 'A';
```

A `char` value is written inside single quotes.

## 8. boolean

`boolean` is used to store only two values:

```text
true
false
```

Example:

```java
boolean isPassed = true;
```

## Non-Primitive Data Types

Non-primitive data types are used to store complex data.

Examples:

```text
String
Array
Class
Object
Interface
```

For now, the most important non-primitive data type is `String`.

## String

`String` is used to store text.

```java
String name = "Abhi";
```

A `String` value is written inside double quotes.

## Java Example

```java
public class DataTypesExample {
    public static void main(String[] args) {
        // Stores a very small whole number
        byte age = 20;

        // Stores a small whole number
        short year = 2026;

        // Stores a normal whole number
        int marks = 450;

        // Stores a very large whole number
        long population = 1400000000L;

        // Stores a decimal number with f at the end
        float percentage = 85.5f;

        // Stores a decimal number with more precision
        double price = 99.99;

        // Stores a single character
        char grade = 'A';

        // Stores true or false
        boolean isPassed = true;

        // Stores text
        String name = "Abhi";

        // Print all values
        System.out.println(age);
        System.out.println(year);
        System.out.println(marks);
        System.out.println(population);
        System.out.println(percentage);
        System.out.println(price);
        System.out.println(grade);
        System.out.println(isPassed);
        System.out.println(name);
    }
}
```

## Output

```text
20
2026
450
1400000000
85.5
99.99
A
true
Abhi
```

## Dry Run

```text
age = 20
year = 2026
marks = 450
population = 1400000000
percentage = 85.5
price = 99.99
grade = A
isPassed = true
name = Abhi

Each value is printed one by one.
```

## char vs String

| char | String |
|---|---|
| Stores one character | Stores text or multiple characters |
| Uses single quotes | Uses double quotes |
| Primitive data type | Non-primitive data type |

Example:

```java
char grade = 'A';
String name = "Abhi";
```

## float vs double

| float | double |
|---|---|
| 4 bytes | 8 bytes |
| Less precision | More precision |
| Needs `f` at the end | Default decimal type |
| Example: `85.5f` | Example: `85.5` |

## Primitive vs Non-Primitive

| Primitive | Non-Primitive |
|---|---|
| Basic built-in types | Created using classes |
| Stores simple values | Stores complex data |
| Example: int, char, boolean | Example: String, Array, Object |
| Fixed size | Size can vary |

## Important Syntax Rules

```java
char grade = 'A';       // correct
String name = "Abhi";   // correct
float marks = 85.5f;    // correct
long number = 9999999999L; // correct
```

Wrong examples:

```java
char grade = "A";       // wrong
String name = 'Abhi';   // wrong
float marks = 85.5;     // wrong
long number = 9999999999; // wrong
```

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

- Using double quotes for `char`
- Using single quotes for `String`
- Forgetting `f` after float values
- Forgetting `L` after large long values
- Confusing `int` and `double`
- Thinking `boolean` stores 0 and 1 in Java
- Forgetting that Java is case-sensitive
- Using wrong data type for large values

## Interview Questions

1. What is a data type?
2. How many primitive data types are there in Java?
3. Name all 8 primitive data types.
4. What is the difference between primitive and non-primitive data types?
5. What is the difference between `float` and `double`?
6. What is the difference between `char` and `String`?
7. Which data type is used for true or false values?
8. Why do we use `f` with float values?
9. Why do we use `L` with long values?
10. Is `String` a primitive data type?

## Interview-Ready Answers

### 1. What is a data type?

A data type tells Java what kind of value a variable can store.

### 2. How many primitive data types are there in Java?

There are 8 primitive data types in Java.

### 3. Name all 8 primitive data types.

The 8 primitive data types are `byte`, `short`, `int`, `long`, `float`, `double`, `char`, and `boolean`.

### 4. What is the difference between primitive and non-primitive data types?

Primitive data types are basic built-in types that store simple values. Non-primitive data types are created using classes and can store complex data.

### 5. What is the difference between `float` and `double`?

`float` uses 4 bytes and has less precision, while `double` uses 8 bytes and has more precision. In Java, decimal numbers are `double` by default.

### 6. What is the difference between `char` and `String`?

`char` stores a single character and uses single quotes. `String` stores text and uses double quotes.

### 7. Which data type is used for true or false values?

The `boolean` data type is used for true or false values.

### 8. Why do we use `f` with float values?

We use `f` because decimal values are treated as `double` by default in Java. The `f` tells Java that the value is a float.

### 9. Why do we use `L` with long values?

We use `L` to tell Java that a large integer value should be treated as a long.

### 10. Is `String` a primitive data type?

No, `String` is a non-primitive data type in Java.

## Practice Problems

### Easy

Create variables for your name, age, grade, marks, and pass status. Print them.

### Medium

Create variables for two numbers and print their sum, difference, product, and division.

### Hard for Beginner

Store principal, rate, and time using suitable data types and calculate simple interest.

## Final Revision Notes

```text
Data type = tells what kind of value a variable stores.

Java data types:
1. Primitive
2. Non-primitive

8 primitive data types:
byte, short, int, long, float, double, char, boolean

int = whole number
long = very large whole number
float = decimal, needs f
double = decimal, default
char = single character, single quotes
boolean = true/false
String = text, double quotes

char grade = 'A';
String name = "Abhi";
float marks = 85.5f;
long number = 9999999999L;
```

## Summary

Data types are a core concept in Java. They help Java understand what kind of data is being stored in a variable. Choosing the correct data type makes programs more accurate, memory-efficient, and easier to understand.
