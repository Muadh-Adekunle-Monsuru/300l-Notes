
---

# Control Flow Statements in Java

## Types of Control Structure:

1. **Sequential Control:**
   - Interprets the code line by line from top to bottom.

2. **Selection or Branching:**
   - **if statement:**
     ```java
     if (condition) {
         // Code block to be executed if the condition is true
     }
     ```
     Explanation:
     - `condition`: Logical expression with operators and variables.

   - **if ... else:**
     ```java
     if (condition) {
         // Code block to be executed if the condition is true
     } else {
         // Code block to be executed if the condition is false
     }
     ```

   - **else if:**
     ```java
     if (condition1) {
         // Code to be executed if condition1 is true
     } else if (condition2) {
         // Code to be executed if condition2 is true
     } else if (condition3) {
         // Code to be executed if condition3 is true
     } else {
         // Code to be executed if none of the conditions are true
     }
     ```
     Example:
     ```java
     public class ElseIfExample {
         public static void main(String[] args) {
             int num = 0;

             if (num > 0) {
                 System.out.println("The number is positive.");
             } else if (num < 0) {
                 System.out.println("The number is negative.");
             } else {
                 System.out.println("The number is zero.");
             }
         }
     }
     ```

   - **switch:**
     - Used for making decisions based on the value of a variable.

3. **Repetition or Looping:**
   - **`for` loop:**
     ```java
     for (int i = 0; i < 5; i++) {
         System.out.println("Iteration: " + i);
     }
     ```
     Explanation:
     - Initialization, Condition, Update.

   - **`while` loop:**
     ```java
     int count = 0;
     while (count < 5) {
         System.out.println("Iteration: " + count);
         count++;
     }
     ```
     Explanation:
     - Initialization, Condition, Update.

   - **`do-while` loop:**
     ```java
     int num = 0;
     do {
         System.out.println("Number: " + num);
         num++;
     } while (num < 5);
     ```
     Explanation:
     - Body, Condition, Update.

4. **Usage of Control Flow Statements:**
   - Conditional execution of statements.
   - Repetitive execution of a block of statements.
   - Altering the normal sequential flow.

---

## `switch` Statement in Java:

The `switch` statement is used to make decisions based on the value of a variable. It provides a concise way to handle multiple possible conditions.

Basic structure:
```java
switch (expression) {
    case value1:
        // Code to be executed if expression equals value1
        break;
    case value2:
        // Code to be executed if expression equals value2
        break;
    // Add more cases as needed
    default:
        // Code to be executed if none of the cases match
}
```

Example:
```java
public class SwitchExample {
    public static void main(String[] args) {
        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            // Add more cases as needed
            default:
                System.out.println("Invalid day");
        }
    }
}
```
