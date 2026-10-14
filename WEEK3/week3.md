Week 3: Java Input, Output & Decision Making
According to your 12-week Java Basics Roadmap, Week 3 focuses on four important topics:
1. Scanner class for user input
2. if, else if, and else statements
3. Nested if statements
4. switch statement
These topics are essential because they teach you how to build interactive Java programs that accept data from users and make decisions based on conditions. They are also important foundations for DSA (Data Structures and Algorithms), coding interviews, and real-world software development.
1. Scanner class for user input
1.1 Theory: What is input and output?
Input means data supplied to a program. For example, a user enters their name, age, or marks.
Output means information displayed by a program. In Java, we commonly use System.out.println() to display output.
Java provides the Scanner class to read input from sources such as the keyboard.
User enters data
Name, age, marks, etc.


Scanner reads the input
Java stores the value in a variable.


Program processes the data
Calculations and decisions


Output appears
The program displays the result.


1.2 Basic Scanner syntax
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Your age is: " + age);

        sc.close();
    }
}


Sample output
Enter your age: 20
Your age is: 20


1.3 Understanding each line
Code	Explanation
import java.util.Scanner;	Imports the Scanner class.
Scanner sc = new Scanner(System.in);	Creates a Scanner object that reads keyboard input.
System.out.print()	Displays a message without moving to a new line.
sc.nextInt()	Reads an integer.
System.out.println()	Displays output and moves to the next line.
sc.close()	Closes the Scanner and its underlying input stream.
In small standalone programs, closing the Scanner is fine. If you are reading System.in in a larger application, avoid closing it prematurely because that also closes standard input.
1.4 Important Scanner methods
Method	Data read
nextInt()	Integer, such as 25
nextDouble()	Decimal number, such as 85.5
nextFloat()	Float value, such as 12.5f
nextLong()	Long integer
next()	One whitespace-delimited word
nextLine()	An entire line of text
nextBoolean()	true or false
Example:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);

        sc.close();
    }
}


1.5 Common Scanner problem: nextLine() after nextInt()
Consider this code:
int age = sc.nextInt();
String name = sc.nextLine();


The nextInt() method reads the integer but usually leaves the line-ending newline in the input. The following nextLine() consumes that remaining newline, so name may become an empty string.
Correct solution:
int age = sc.nextInt();
sc.nextLine(); // Consume the remaining newline

System.out.print("Enter your full name: ");
String name = sc.nextLine();


Remember this rule whenever you mix token-reading methods such as nextInt() with nextLine().

2. Decision making using if, else if, and else
2.1 Theory: What is decision making?
Decision making allows a program to execute different blocks of code depending on whether a condition is true or false.
For example:
- If marks are at least 40, the student passes.
- Otherwise, the student fails.
- If a person's age is at least 18, they meet a basic age requirement for voting in India, subject to applicable eligibility rules.
Java uses conditional statements to implement this logic.
2.2 The if statement
The if statement executes a block of code only when its condition evaluates to true.
Syntax
if (condition) {
    // Code executes when the condition is true
}


Example: Check whether a person is eligible by age
public class Main {
    public static void main(String[] args) {
        int age = 20;

        if (age >= 18) {
            System.out.println("You meet the age requirement.");
        }
    }
}


Output:
You meet the age requirement.


Here, age >= 18 is a Boolean expression. Because 20 >= 18 is true, the message is printed.
If age were 16, the condition would be false and the message would not appear.
2.3 The if-else statement
Use if-else when you want to choose between two alternatives.
Syntax
if (condition) {
    // Executes if true
} else {
    // Executes if false
}


Example: Pass or fail
public class Main {
    public static void main(String[] args) {
        int marks = 35;

        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}


Output:
Fail


Explanation:
- marks is 35.
- The condition marks >= 40 is false.
- Therefore, the else block executes.
2.4 The else if ladder
When there are more than two possible outcomes, use an else if ladder.
Syntax
if (condition1) {
    // First condition
} else if (condition2) {
    // Second condition
} else if (condition3) {
    // Third condition
} else {
    // Default case
}


Java checks conditions from top to bottom. The first true branch executes, and the remaining branches are skipped.
Example: Student grading system
For this example, assume these grading rules: 90–100 = A, 75–89 = B, 60–74 = C, 40–59 = D, below 40 = Fail.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 40) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}


Sample output:
Enter marks (0-100): 82
Grade B


Notice that the first condition validates the input range. The later conditions only need lower bounds because the previous branches have already been ruled out.
2.5 Comparison and logical operators
These operators are used frequently inside conditions.
Operator	Meaning	Example
==	Equal to	a == b
!=	Not equal to	a != b
>	Greater than	a > b
<	Less than	a < b
>=	Greater than or equal to	a >= b
<=	Less than or equal to	a <= b
&&	Logical AND	age >= 18 && age <= 60
\|\|	Logical OR	day == 6 \|\| day == 7
!	Logical NOT	!isValid
For example:
int age = 22;
boolean hasId = true;

if (age >= 18 && hasId) {
    System.out.println("Both conditions are satisfied.");
}


Both conditions must be true for the && expression to be true.
Important: Do not confuse = with ==.
- = assigns a value.
- == compares values.
For primitive types, == compares values. For objects such as String, use .equals() when comparing text content.
String password = "java123";

if (password.equals("java123")) {
    System.out.println("Password matches");
}



3. Nested if statements
3.1 Theory
A nested if is an if statement placed inside another if or else block.
It is useful when a second decision should be made only after a first condition has been satisfied.
Syntax
if (condition1) {
    if (condition2) {
        // Both conditions are true
    } else {
        // First condition is true, second is false
    }
} else {
    // First condition is false
}


Example: Login eligibility
Suppose a program checks a username first and then checks the password.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "student";
        String correctPassword = "java123";

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.equals(correctUsername)) {
            if (password.equals(correctPassword)) {
                System.out.println("Login successful");
            } else {
                System.out.println("Incorrect password");
            }
        } else {
            System.out.println("Incorrect username");
        }

        sc.close();
    }
}


Sample output:
Enter username: student
Enter password: wrong123
Incorrect password


How does this program work?
1. The outer if checks whether the username matches.
2. If it does, Java enters the outer block.
3. The inner if checks whether the password matches.
4. If both match, the program prints Login successful.
5. If the username is wrong, the inner condition is never checked.
This example is for learning conditional logic only. Real authentication systems should not store passwords as plain text in source code.
Example: Find the largest of three numbers
This is a useful beginner coding problem.
public class Main {
    public static void main(String[] args) {
        int a = 25;
        int b = 40;
        int c = 15;

        if (a >= b) {
            if (a >= c) {
                System.out.println("Largest: " + a);
            } else {
                System.out.println("Largest: " + c);
            }
        } else {
            if (b >= c) {
                System.out.println("Largest: " + b);
            } else {
                System.out.println("Largest: " + c);
            }
        }
    }
}


Output:
Largest: 40


Using >= instead of > also handles equal values correctly.
When should you use nested if?
Use it when the second decision depends on the first. However, avoid deeply nested conditions because they can make code harder to understand. Sometimes an else if ladder or a combination of logical operators is clearer.

4. The switch statement
4.1 Theory
A switch statement selects one execution path from multiple alternatives based on the value of an expression.
It is especially useful when a single variable is compared against several fixed values, such as menu choices, days of the week, or calculator operations.
4.2 Traditional switch syntax
switch (expression) {
    case value1:
        // Code for value1
        break;

    case value2:
        // Code for value2
        break;

    default:
        // Code when no case matches
}


Important terms:
- switch: Evaluates the expression and selects a matching case.
- case: Specifies a value to match.
- break: Exits the traditional switch statement.
- default: Handles cases that do not match any listed value.
4.3 Example: Day of the week
public class Main {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}


Output:
Wednesday


Because day is 3, Java executes case 3. The break prevents execution from continuing into the next case.
4.4 Why is break important?
Consider this code:
int number = 2;

switch (number) {
    case 1:
        System.out.println("One");

    case 2:
        System.out.println("Two");

    case 3:
        System.out.println("Three");

    default:
        System.out.println("Other");
}


Output:
Two
Three
Other


This behavior is called fall-through. In a traditional switch statement, if a matching case has no break, execution can continue into subsequent case bodies.
The usual correction is to add break after each independent case.
4.5 Example: Simple calculator using switch
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;

            case '-':
                System.out.println("Result: " + (a - b));
                break;

            case '*':
                System.out.println("Result: " + (a * b));
                break;

            case '/':
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}


Sample output:
Enter first number: 20
Enter operator (+, -, *, /): *
Enter second number: 5
Result: 100.0


This program combines three Week 3 skills:
- Scanner to receive user input.
- switch to choose the operation.
- if-else to prevent division by zero.
4.6 Modern switch expressions
Java also supports switch expressions, introduced as a permanent feature in Java 14. They provide a concise way to produce a value.
int day = 3;

String dayName = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    case 4 -> "Thursday";
    case 5 -> "Friday";
    case 6 -> "Saturday";
    case 7 -> "Sunday";
    default -> "Invalid day";
};

System.out.println(dayName);


Output:
Wednesday


The arrow form does not have the traditional fall-through behavior, and the switch expression returns a value assigned to dayName.
For now, learn the traditional switch thoroughly, then practise the arrow form if your installed Java version supports it.

5. if-else vs switch
Feature	if-else	switch
Best use	Ranges and complex conditions	Matching discrete values
Example	marks >= 40	case 1:
Logical operators	Supports &&, \|\|, !	Usually matches individual case values
Range checking	Directly supported	Usually needs multiple cases or another approach
Readability	Good for conditions and ranges	Good for menus and fixed choices
Rule to remember: Use if-else for conditions and ranges. Use switch for selecting among fixed alternatives.

6. Week 3 practice programs
Try to solve these problems yourself before looking at solutions. They progress from beginner level to more challenging logic.
Your coding checklist
0 of 10 completed



[ ] 1. Even or odd
Take an integer as input and determine whether it is even or odd using the remainder operator `%`.


[ ] 2. Positive, negative, or zero
Read a number and print whether it is positive, negative, or zero.


[ ] 3. Eligible by age
Read a person's age and check whether it is at least 18.


[ ] 4. Largest of three numbers
Read three integers and find the largest, including cases where two or more values are equal.


[ ] 5. Grade calculator
Read marks from 0 to 100, validate them, and print a grade using an else-if ladder.


[ ] 6. Leap year checker
A year is a leap year if it is divisible by 400, or divisible by 4 but not by 100.


[ ] 7. Calculator
Use Scanner and switch to perform addition, subtraction, multiplication, and division.


[ ] 8. Simple login checker
Read a username and password and check both using nested if statements.


[ ] 9. Vowel or consonant
Read a single English letter and determine whether it is a vowel or consonant; reject non-letters.


[ ] 10. Electricity bill
Calculate a bill using tiered rates of your choice, using conditions and validating that units are non-negative.


  Copy practice checklist 
7. Daily study plan for Week 3
Since your roadmap allocates 3 hours per day, use this schedule:
45 min

Learn the theory
Study syntax, conditions, operators, and examples.



75 min

Write Java programs
Type the code yourself, run it, and test different inputs.



45 min

Solve problems
Attempt the practice programs without copying solutions.



15 min

Revise
Recall syntax, explain the logic, and note mistakes.



Suggested seven-day schedule
Day	Learning target
Day 1	Scanner, input methods, and output
Day 2	if, if-else, comparison operators
Day 3	else if, logical operators, grading system
Day 4	Nested if, largest of three numbers
Day 5	Traditional switch, calculator program
Day 6	Solve practice problems and debug errors
Day 7	Revision, mini-project, and self-test
8. Mini-project: Student result checker
Now combine the topics into one program. It reads a student's name and marks, validates the marks, determines the result, and prints a grade.

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else {
            System.out.println("Student: " + name);

            if (marks >= 40) {
                System.out.println("Result: Pass");

                if (marks >= 90) {
                    System.out.println("Grade: A");
                } else if (marks >= 75) {
                    System.out.println("Grade: B");
                } else if (marks >= 60) {
                    System.out.println("Grade: C");
                } else {
                    System.out.println("Grade: D");
                }
            } else {
                System.out.println("Result: Fail");
            }
        }

        sc.close();
    }
}



Sample output:
Enter student name: Rahul
Enter marks: 85
Student: Rahul
Result: Pass
Grade: B


This project uses Scanner, if-else, nested conditions, and an else if ladder. The grade boundaries here are illustrative; actual grading rules depend on the institution.