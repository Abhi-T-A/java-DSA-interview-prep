# Day 001 - How to Approach a Problem?

## Definition

Approaching a problem means understanding the problem clearly, planning the logic, writing the algorithm, coding the solution, testing it, and analyzing its efficiency.

In interviews, solving a problem is not only about writing code. Interviewers also check how clearly we think and explain.

## Steps to Approach Any Problem

```text
1. Understand the problem
2. Identify input and output
3. Take small examples
4. Think of a simple solution
5. Write the algorithm
6. Dry run the logic
7. Write code
8. Test edge cases
9. Analyze time and space complexity
```

## Real-Life Analogy

If we want to reach a new place, we do not start walking randomly.

We first understand the destination, check the route, choose the best path, travel, and confirm that we reached correctly.

Similarly, in programming, we should not directly jump into code. We should first understand and plan.

## Example Problem

Find the largest of two numbers.

## Input and Output

```text
Input:
a = 10
b = 20

Output:
20
```

## Algorithm

```text
1. Start
2. Take two numbers a and b
3. If a is greater than b, print a
4. Otherwise, print b
5. Stop
```

## Java Program

```java
public class LargestOfTwo {
    public static void main(String[] args) {
        // Store the first number
        int a = 10;

        // Store the second number
        int b = 20;

        // Check whether a is greater than b
        if (a > b) {
            // If a is greater, print a
            System.out.println(a);
        } else {
            // Otherwise, print b
            System.out.println(b);
        }
    }
}
```

## Dry Run

```text
a = 10
b = 20

Check: a > b
Check: 10 > 20

Condition is false.

So, else block executes.

Output = 20
```

## Edge Cases

Edge cases are special inputs where code may fail.

Examples:

```text
a = 10, b = 20   Output = 20
a = 30, b = 10   Output = 30
a = 5, b = 5     Output = 5
a = -2, b = -8   Output = -2
```

## Time Complexity

```text
O(1)
```

Only one comparison is performed.

## Space Complexity

```text
O(1)
```

Only fixed variables are used.

## Common Beginner Mistakes

- Directly jumping into code
- Not reading the problem properly
- Not identifying input and output
- Not taking examples
- Not doing a dry run
- Not testing edge cases
- Ignoring time and space complexity

## Interview Questions

1. How do you approach a coding problem?
2. Why should we identify input and output?
3. What is a dry run?
4. What are edge cases?
5. Why is time complexity important?

## Interview-Ready Answers

### 1. How do you approach a coding problem?

I first understand the problem, identify input and output, take examples, think of a simple solution, write the algorithm, dry run it, code it, test edge cases, and analyze time and space complexity.

### 2. What is a dry run?

A dry run is the process of manually checking the logic step by step to understand how the program works.

### 3. What are edge cases?

Edge cases are special inputs where a program may fail, such as zero, negative numbers, equal values, empty input, or very large values.

### 4. Why should we not directly jump into code?

Because coding without understanding the problem can lead to wrong logic, errors, and wasted time.

## Final Revision Notes

```text
Understand first, code later.

Problem-solving flow:
Understand problem
Identify input and output
Take examples
Think simple solution
Write algorithm
Dry run
Code
Test edge cases
Analyze complexity

Dry run = manual step-by-step checking.
Edge cases = special inputs where code may fail.
Time complexity = time taken by solution.
Space complexity = memory used by solution.
```

## Summary

A strong programmer does not only write code. A strong programmer understands the problem, explains the logic, tests properly, and writes efficient solutions. This habit is very important for technical interviews.
