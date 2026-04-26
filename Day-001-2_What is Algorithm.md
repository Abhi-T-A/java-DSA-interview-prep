# Day 001 - What is an Algorithm?

---

## Definition

An algorithm is a **finite step-by-step procedure** used to solve a specific problem.

In simple words, an algorithm is the **logic or plan** we create before writing code. It explains how to solve a problem clearly and in order.

---

## Real-Life Analogy

An algorithm is like a **recipe**.

For example, to make tea:

1. Take water
2. Boil the water
3. Add tea powder
4. Add milk
5. Add sugar
6. Stir well
7. Serve the tea

These steps are **clear**, **ordered**, and they **end** after the tea is prepared. That is why this can be called an algorithm.

---

## Example Algorithm

**Problem:** Add two numbers.

**Algorithm:**

```text
1. Start
2. Take two numbers: a and b
3. Add a and b
4. Store the result in sum
5. Print sum
6. Stop
```

---

## Java Program

```java
public class AddTwoNumbers {
    public static void main(String[] args) {
        // Store the first number
        int a = 10;

        // Store the second number
        int b = 20;

        // Add both numbers and store the result
        int sum = a + b;

        // Print the final result
        System.out.println(sum);
    }
}
```

---

## Output

```text
30
```

---

## Explanation of the Program

```text
int a = 10;
```
This stores the value `10` in variable `a`.

```text
int b = 20;
```
This stores the value `20` in variable `b`.

```text
int sum = a + b;
```
This adds `a` and `b`, then stores the result in `sum`.

```text
System.out.println(sum);
```
This prints the value of `sum` on the screen.

---

## Dry Run

```text
a   = 10
b   = 20
sum = a + b
sum = 10 + 20
sum = 30

Output → 30
```

---

## Algorithm vs Program

| Algorithm | Program |
|---|---|
| Step-by-step logic to solve a problem | Actual code written in a programming language |
| Written in simple language or pseudocode | Written in languages like Java, Python, C++ |
| Language independent | Language dependent |
| Created **before** coding | Created **while** coding |
| Focuses on **logic** | Focuses on **implementation** |

---

## Properties of a Good Algorithm

A good algorithm must have:

| Property | Meaning |
|---|---|
| **Input** | It may take some data to work on |
| **Output** | It must produce a result |
| **Definiteness** | Each step must be clear and unambiguous |
| **Finiteness** | It must end after a limited number of steps |
| **Correctness** | It must give the correct answer |
| **Efficiency** | It should use reasonable time and memory |

---

## Why Algorithms are Important

Algorithms help us:

- Build strong problem-solving skills
- Write better and cleaner code
- Solve problems efficiently
- Prepare for technical interviews
- Understand Data Structures and Algorithms deeply

---

## Time Complexity

```text
O(1)
```

The program performs a **fixed number of operations**, so the time taken does not increase with input size.

---

## Space Complexity

```text
O(1)
```

The program uses a **fixed number of variables**, so memory usage remains constant.

---

## Common Beginner Mistakes

- Thinking algorithm and program are the same
- Writing unclear or ambiguous steps
- Forgetting to mention input and output
- Writing steps that never end (infinite loop in logic)
- Not checking if the algorithm works for all cases
- Jumping directly to code without planning the logic first

---

## Interview Questions

1. What is an algorithm?
2. Why do we need algorithms?
3. What is the difference between an algorithm and a program?
4. What are the properties of a good algorithm?
5. What does **finite** mean in an algorithm?
6. What is **efficiency** in an algorithm?
7. Why are algorithms important for interviews?

---

## Interview-Ready Answers

### 1. What is an algorithm?
An algorithm is a finite step-by-step procedure used to solve a specific problem.

### 2. Why do we need algorithms?
We need algorithms to plan the logic of a solution before writing code. They help us solve problems correctly and efficiently.

### 3. What is the difference between an algorithm and a program?
An algorithm is the logic or step-by-step plan to solve a problem, while a program is the actual code written in a programming language to implement that algorithm.

### 4. What are the properties of a good algorithm?
A good algorithm should be clear, finite, correct, efficient, and should produce the expected output for every valid input.

### 5. What does finite mean in an algorithm?
Finite means the algorithm must stop after a limited number of steps. It should not run forever.

### 6. What is efficiency in an algorithm?
Efficiency means how well an algorithm uses time and memory while solving a problem.

### 7. Why are algorithms important for interviews?
Algorithms are important because interviewers test problem-solving ability, logical thinking, and the ability to write efficient code.

---

## Final Revision Notes

```text
Algorithm  = finite step-by-step procedure to solve a problem.
Program    = actual code written using a programming language.

Algorithm  → language independent.
Program    → language dependent.

A good algorithm must be: clear, finite, correct, and efficient.

Input      = data given to an algorithm.
Output     = result produced by an algorithm.
Efficiency = using less time and memory.

Time Complexity  → measures time taken.
Space Complexity → measures memory used.
```

---

## Summary

An algorithm is the **foundation of problem solving** in computer science. Before writing code, a good programmer first thinks about the algorithm. Strong algorithms lead to clean, correct, and efficient programs.
