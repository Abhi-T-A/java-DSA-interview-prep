# Day 001 - Pseudocode

## Definition

Pseudocode is a way of writing program logic in simple English-like steps before writing actual code.

It is not a real programming language. It does not follow strict Java syntax. It is used to plan and explain logic clearly.

## Simple Meaning

```text
Pseudocode = logic written in simple code-like English
```

## Flow of Problem Solving

```text
Algorithm -> Pseudocode -> Program
```

| Step | Meaning |
|---|---|
| Algorithm | Step-by-step logic |
| Pseudocode | Logic written in simple English-like code |
| Program | Actual code written in a programming language |

## Real-Life Analogy

Pseudocode is like writing rough points before writing a final exam answer.

The rough points are not the final answer, but they help organize thoughts clearly.

Similarly, pseudocode helps organize program logic before writing actual Java code.

## Why We Use Pseudocode

We use pseudocode to:

- Plan logic before coding
- Avoid syntax confusion
- Explain solutions clearly in interviews
- Reduce mistakes while coding
- Convert logic into Java code easily
- Focus on problem-solving instead of language rules

## Example 1: Add Two Numbers

## Algorithm

```text
1. Start
2. Take two numbers a and b
3. Add a and b
4. Store result in sum
5. Print sum
6. Stop
```

## Pseudocode

```text
BEGIN
    READ a, b
    sum = a + b
    PRINT sum
END
```

## Java Program

```java
public class AddTwoNumbers {
    public static void main(String[] args) {
        // Store first number
        int a = 10;

        // Store second number
        int b = 20;

        // Add both numbers
        int sum = a + b;

        // Print the result
        System.out.println(sum);
    }
}
```

## Output

```text
30
```

## Dry Run

```text
a = 10
b = 20

sum = a + b
sum = 10 + 20
sum = 30

Output = 30
```

## Example 2: Check Even or Odd

## Pseudocode

```text
BEGIN
    READ n

    IF n % 2 == 0 THEN
        PRINT "Even"
    ELSE
        PRINT "Odd"
    ENDIF
END
```

## Java Program

```java
public class EvenOdd {
    public static void main(String[] args) {
        // Store a number
        int n = 7;

        // Check whether n is divisible by 2
        if (n % 2 == 0) {
            // If remainder is 0, number is even
            System.out.println("Even");
        } else {
            // Otherwise, number is odd
            System.out.println("Odd");
        }
    }
}
```

## Output

```text
Odd
```

## Dry Run

```text
n = 7

Check: n % 2 == 0
Check: 7 % 2 == 0
Check: 1 == 0

Condition is false.

Output = Odd
```

## Pseudocode vs Algorithm vs Program

| Algorithm | Pseudocode | Program |
|---|---|---|
| Written steps | Code-like English steps | Actual code |
| Language independent | Mostly language independent | Language dependent |
| Focuses on logic | Focuses on logic structure | Focuses on implementation |
| Example: Add two numbers | READ a, b; PRINT sum | Java/C++/Python code |

## Time Complexity

For both examples:

```text
O(1)
```

Only a fixed number of operations are performed.

## Space Complexity

For both examples:

```text
O(1)
```

Only a fixed number of variables are used.

## Common Beginner Mistakes

- Thinking pseudocode is actual Java code
- Worrying too much about syntax
- Not using indentation
- Writing unclear steps
- Skipping input and output
- Writing too much unnecessary English
- Directly coding without planning

## Interview Questions

1. What is pseudocode?
2. Why do we use pseudocode?
3. Is pseudocode a programming language?
4. Is pseudocode language-dependent?
5. Can pseudocode be directly compiled?
6. What is the difference between algorithm and pseudocode?
7. Why is pseudocode useful in interviews?

## Interview-Ready Answers

### 1. What is pseudocode?

Pseudocode is program logic written in simple English-like code before writing actual programming code.

### 2. Why do we use pseudocode?

We use pseudocode to plan the logic clearly, avoid syntax confusion, reduce mistakes, and make coding easier.

### 3. Is pseudocode a programming language?

No, pseudocode is not a programming language. It is only a way to represent logic.

### 4. Is pseudocode language-dependent?

No, pseudocode is mostly language independent because it focuses on logic, not syntax.

### 5. Can pseudocode be directly compiled?

No, pseudocode cannot be compiled or executed directly because it is not actual code.

### 6. What is the difference between algorithm and pseudocode?

An algorithm is a step-by-step method to solve a problem, while pseudocode is a code-like way of writing that logic.

### 7. Why is pseudocode useful in interviews?

Pseudocode helps explain logic clearly before writing actual code, which shows structured thinking to the interviewer.

## Practice Problems

### Easy

Write pseudocode to add two numbers.

### Medium

Write pseudocode to find the largest of two numbers.

### Hard for Beginner

Write pseudocode to check whether a number is positive, negative, or zero.

## Final Revision Notes

```text
Pseudocode = program logic written in simple English-like code.
It is not actual Java code.
It cannot be compiled.
It is mostly language independent.
It helps plan logic before coding.
It reduces syntax confusion.
It is useful for interviews.

Algorithm -> Pseudocode -> Program
```

## Summary

Pseudocode is an important beginner-friendly tool for planning program logic. It helps programmers think clearly before writing code and makes it easier to explain solutions during interviews.
