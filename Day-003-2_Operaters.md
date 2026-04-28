# Day 003 - Operators in Java

## Definition

An operator is a symbol that performs an operation on values or variables.

Example:

```java
int sum = 10 + 20;
```

Here:

```text
10 and 20 = operands
+ = operator
sum = result
```

## Real-Life Analogy

Operators are like calculator buttons.

```text
+ means add
- means subtract
* means multiply
/ means divide
% means remainder
```

Java uses operators to perform calculations, comparisons, assignments, and logical operations.

## Types of Operators in Java

Important beginner-level operators:

```text
1. Arithmetic operators
2. Assignment operators
3. Relational operators
4. Logical operators
5. Unary operators
6. Ternary operator
```

## 1. Arithmetic Operators

Arithmetic operators are used for mathematical operations.

| Operator | Meaning | Example |
|---|---|---|
| + | Addition | a + b |
| - | Subtraction | a - b |
| * | Multiplication | a * b |
| / | Division | a / b |
| % | Modulus/Remainder | a % b |

Example:

```java
int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

Output:

```text
13
7
30
3
1
```

Important:

```text
10 / 3 = 3
10 % 3 = 1
```

`/` gives the quotient.  
`%` gives the remainder.

## 2. Assignment Operators

Assignment operators are used to assign or update values.

| Operator | Meaning | Same As |
|---|---|---|
| = | Assign | x = 10 |
| += | Add and assign | x = x + 5 |
| -= | Subtract and assign | x = x - 5 |
| *= | Multiply and assign | x = x * 5 |
| /= | Divide and assign | x = x / 5 |
| %= | Remainder and assign | x = x % 5 |

Example:

```java
int x = 10;

x += 5;  // x = x + 5
x -= 2;  // x = x - 2
x *= 3;  // x = x * 3
x /= 2;  // x = x / 2
x %= 4;  // x = x % 4

System.out.println(x);
```

## 3. Relational Operators

Relational operators are used to compare values.

The result is always `true` or `false`.

| Operator | Meaning |
|---|---|
| > | Greater than |
| < | Less than |
| >= | Greater than or equal to |
| <= | Less than or equal to |
| == | Equal to |
| != | Not equal to |

Example:

```java
int a = 10;
int b = 20;

System.out.println(a > b);
System.out.println(a < b);
System.out.println(a == b);
System.out.println(a != b);
```

Output:

```text
false
true
false
true
```

## 4. Logical Operators

Logical operators are used to combine conditions.

| Operator | Meaning |
|---|---|
| && | Logical AND |
| || | Logical OR |
| ! | Logical NOT |

Meaning:

```text
&& = true only when both conditions are true
|| = true when at least one condition is true
! = reverses true/false
```

Example:

```java
int age = 20;
boolean hasId = true;

System.out.println(age >= 18 && hasId);
System.out.println(age >= 18 || hasId);
System.out.println(!hasId);
```

Output:

```text
true
true
false
```

## 5. Unary Operators

Unary operators work on one value.

| Operator | Meaning |
|---|---|
| ++ | Increase by 1 |
| -- | Decrease by 1 |
| + | Positive value |
| - | Negative value |
| ! | Logical NOT |

Example:

```java
int x = 5;

x++;
System.out.println(x);

x--;
System.out.println(x);
```

Output:

```text
6
5
```

## 6. Ternary Operator

The ternary operator is a short form of `if-else`.

Syntax:

```java
condition ? valueIfTrue : valueIfFalse;
```

Example:

```java
int a = 10;
int b = 20;

int max = (a > b) ? a : b;

System.out.println(max);
```

Output:

```text
20
```

## Full Java Example

```java
public class OperatorsExample {
    public static void main(String[] args) {
        // Store two integer values
        int a = 10;
        int b = 3;

        // Arithmetic operators
        System.out.println("Sum = " + (a + b));
        System.out.println("Difference = " + (a - b));
        System.out.println("Product = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Remainder = " + (a % b));

        // Relational operator
        System.out.println("Is a greater than b? " + (a > b));

        // Logical operator
        boolean result = (a > b) && (a > 0);
        System.out.println("Logical result = " + result);

        // Ternary operator
        int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);
    }
}
```

## Output

```text
Sum = 13
Difference = 7
Product = 30
Division = 3
Remainder = 1
Is a greater than b? true
Logical result = true
Maximum = 10
```

## Dry Run

```text
a = 10
b = 3

a + b = 13
a - b = 7
a * b = 30
a / b = 3
a % b = 1

a > b = 10 > 3 = true
a > 0 = 10 > 0 = true

(a > b) && (a > 0)
true && true = true

max = (a > b) ? a : b
max = true ? 10 : 3
max = 10
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

Only a fixed number of variables are used.

## Common Beginner Mistakes

### Mistake 1: Confusing `=` and `==`

Wrong for comparison:

```java
a = b;
```

Correct for comparison:

```java
a == b;
```

`=` assigns a value.  
`==` compares two values.

### Mistake 2: Confusing `/` and `%`

```text
/ gives quotient
% gives remainder
```

Example:

```text
10 / 3 = 3
10 % 3 = 1
```

### Mistake 3: Forgetting brackets in output

Wrong or confusing:

```java
System.out.println("Sum = " + a + b);
```

This may print:

```text
Sum = 103
```

Correct:

```java
System.out.println("Sum = " + (a + b));
```

This prints:

```text
Sum = 13
```

## Interview Questions

1. What is an operator?
2. What is an operand?
3. What is the difference between `/` and `%`?
4. What is the difference between `=` and `==`?
5. What are relational operators?
6. What are logical operators?
7. What is the use of `&&`?
8. What is the use of `||`?
9. What is the ternary operator?
10. What does `x++` do?

## Interview-Ready Answers

### 1. What is an operator?

An operator is a symbol that performs an operation on values or variables.

### 2. What is an operand?

An operand is the value or variable on which an operator works.

Example:

```java
int sum = a + b;
```

Here, `a` and `b` are operands, and `+` is the operator.

### 3. What is the difference between `/` and `%`?

`/` gives the quotient, while `%` gives the remainder.

Example:

```text
10 / 3 = 3
10 % 3 = 1
```

### 4. What is the difference between `=` and `==`?

`=` is an assignment operator used to assign a value.  
`==` is a relational operator used to compare two values.

### 5. What are relational operators?

Relational operators are used to compare two values. Their result is always `true` or `false`.

Examples:

```text
>, <, >=, <=, ==, !=
```

### 6. What are logical operators?

Logical operators are used to combine or reverse conditions.

Examples:

```text
&&, ||, !
```

### 7. What is the use of `&&`?

`&&` is logical AND. It returns true only when both conditions are true.

### 8. What is the use of `||`?

`||` is logical OR. It returns true when at least one condition is true.

### 9. What is the ternary operator?

The ternary operator is a short form of if-else.

Syntax:

```java
condition ? valueIfTrue : valueIfFalse;
```

### 10. What does `x++` do?

`x++` increases the value of `x` by 1.

## Final Revision Notes

```text
Operator = symbol that performs operation.
Operand = value/variable used by operator.

Arithmetic: +, -, *, /, %
Assignment: =, +=, -=, *=, /=, %=
Relational: >, <, >=, <=, ==, !=
Logical: &&, ||, !
Unary: ++, --, +, -, !
Ternary: condition ? trueValue : falseValue

/ gives quotient.
% gives remainder.
= assigns value.
== compares values.
&& means both conditions true.
|| means at least one condition true.
! reverses true/false.
x++ increases by 1.
x-- decreases by 1.
```

## Summary

Operators are used to perform calculations, comparisons, assignments, and logical operations in Java. They are essential for building expressions, conditions, loops, and problem-solving logic.
