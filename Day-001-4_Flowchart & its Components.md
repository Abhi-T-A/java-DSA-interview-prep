# Day 001 - Flowcharts and Components

---

## Definition

A **flowchart** is a diagram that shows the step-by-step flow of an algorithm or program using standard symbols.

It helps us understand the logic of a program **visually** before writing code.

---

## Flowchart vs Algorithm vs Program

| Term | Meaning |
|---|---|
| Algorithm | Step-by-step logic written in simple language |
| Flowchart | Diagrammatic representation of an algorithm |
| Program | Actual code written using a programming language |

---

## Real-Life Analogy

A flowchart is like a **map**.

A map shows the path from one place to another. Similarly, a flowchart shows the **path of logic** from start to end.

Example:

```text
Start → Take input → Check condition → Print output → Stop
```

---

## Important Flowchart Components

| Symbol Name | Shape | Use |
|---|---|---|
| **Terminal** | Oval | Start or Stop |
| **Flowline** | Arrow | Shows direction of flow |
| **Process** | Rectangle | Calculation or action |
| **Decision** | Diamond | Condition — Yes/No or True/False |
| **Input/Output** | Parallelogram | Taking input or displaying output |

---

## 1. Terminal Symbol

The terminal symbol is represented by an **oval**.

It is used to show the **beginning or ending** of a flowchart.

```text
Start
Stop
```

---

## 2. Flowline

A flowline is represented by an **arrow**.

It shows the **direction** in which the flowchart moves.

```text
Start → Input → Process → Output → Stop
```

---

## 3. Process Symbol

The process symbol is represented by a **rectangle**.

It is used for **calculations, assignments, or processing** steps.

```text
sum = a + b
count = count + 1
```

---

## 4. Decision Symbol

The decision symbol is represented by a **diamond**.

It is used when a **condition must be checked**.

```text
n % 2 == 0 ?
a > b ?
marks >= 35 ?
```

A decision always has two paths:

```text
Yes / No
True / False
```

---

## 5. Input/Output Symbol

The input/output symbol is represented by a **parallelogram**.

It is used to **take input or display output**.

```text
Input n
Print sum
Display result
```

---

## Example — Check Whether a Number is Even or Odd

### Algorithm

```text
1. Start
2. Input number n
3. Check if n % 2 == 0
4. If true, print Even
5. Otherwise, print Odd
6. Stop
```

### Flowchart in Text Form

```text
        Start
          |
       Input n
          |
    n % 2 == 0?
      /       \
   Yes         No
   /             \
Print Even    Print Odd
    \             /
          Stop
```

### Java Program

```java
public class EvenOdd {
    public static void main(String[] args) {
        // Store a number
        int n = 10;

        // Check if the number is divisible by 2
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

### Output

```text
Even
```

---

## Dry Run

```text
n = 10

Check : n % 2 == 0
Check : 10 % 2 == 0
Check : 0 == 0

Condition is true.

Output → Even
```

---

## Time Complexity

```text
O(1)
```

Only one condition is checked. The time taken does not depend on input size.

---

## Space Complexity

```text
O(1)
```

Only one variable is used. Memory usage remains constant.

---

## Common Beginner Mistakes

- Forgetting **Start** and **Stop** symbols
- Using rectangle instead of diamond for conditions
- Not using arrows to show direction
- Making the flow unclear or messy
- Writing too much text inside symbols
- Confusing algorithm with flowchart

---

## Interview Questions

1. What is a flowchart?
2. Why do we use flowcharts?
3. Which symbol is used for Start and Stop?
4. Which symbol is used for decision making?
5. Which symbol is used for input and output?
6. What is the difference between an algorithm and a flowchart?

---

## Interview-Ready Answers

### 1. What is a flowchart?
A flowchart is a diagram that shows the step-by-step flow of an algorithm or program using standard symbols.

### 2. Why do we use flowcharts?
We use flowcharts to visually understand and plan the logic of a program before writing code.

### 3. Which symbol is used for Start and Stop?
The **oval** symbol, also called the terminal symbol, is used for Start and Stop.

### 4. Which symbol is used for decision making?
The **diamond** symbol is used for decision making or conditions.

### 5. Which symbol is used for input and output?
The **parallelogram** symbol is used for input and output.

### 6. What is the difference between an algorithm and a flowchart?
An algorithm is written step-by-step logic, while a flowchart is the **diagrammatic representation** of that logic.

---
## Final Revision Notes

```text
Flowchart    = diagram showing program logic visually.
Algorithm    = written step-by-step logic.
Program      = actual code.

Important symbols:
Oval          → Start / Stop
Arrow         → Flow direction
Rectangle     → Process / calculation
Diamond       → Decision / condition
Parallelogram → Input / Output

Decision symbol always has Yes/No or True/False paths.
Flowcharts help us plan logic before coding.
```

---

## Summary

Flowcharts help programmers **visualize logic clearly** before writing code. For beginners, flowcharts are useful because they improve problem-solving, dry run ability, and logical thinking. Mastering flowcharts builds a strong foundation for understanding Data Structures and Algorithms.


<img width="1166" height="884" alt="Screenshot 2026-04-26 233325" src="https://github.com/user-attachments/assets/90099df9-acc5-4bac-a3df-0f7bf685a418" />

