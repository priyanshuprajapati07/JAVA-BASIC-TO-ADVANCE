Java Roadmap — Week 2: Variables, Data Types & Operators
Week 2 is one of the most important parts of Java. Before learning loops, arrays, methods, and DSA, you should understand how Java stores data, how variables work, and how operators perform calculations.
We'll learn step by step with proper theory, syntax, complete Java programs, dry runs, common mistakes, and practice questions. The explanations will focus on building your logic, not just memorizing code.

Topic 1: Variables and data types
How Java stores and represents information



Topic 2: Type casting
Converting one data type into another



Topic 3: Operators
Arithmetic, relational, logical, and bitwise operators



Topic 4: Constants using final
Storing values that cannot be reassigned



We'll start with Topic 1 and build up to the others in order.

Topic 1: Variables in Java
1. What is a variable?
A variable is a named storage location used to hold a value that a program can use.
For example, suppose you want to write a program that stores a student's age, marks, and name.
int age = 19;
double marks = 81.80;
String name = "Priyanshu";


Here:
- age stores the integer value 19.
- marks stores the decimal value 81.80.
- name stores the text "Priyanshu".
Think of a variable as a labelled box in memory.
age
19
int

marks
81.80
double

name
Text
String


Conceptual illustration of variables. Each variable has a name, a data type, and a value.
2. Variable declaration and initialization
These two terms are important for theory questions and coding exams.
Declaration: Creating a variable by specifying its data type and name.
int age;


Initialization: Giving a variable its first value.
age = 19;


Declaration and initialization together:
int age = 19;


You can also update a variable later:
int age = 19;
age = 20;

System.out.println(age);


Output:
20


Why? The second assignment replaces the previous value stored in age.
Remember: = is the assignment operator. It assigns the value on the right to the variable on the left.
3. Rules for naming variables
Java has rules for valid variable names.
Valid	Invalid	Reason
age	2age	Cannot start with a digit
studentMarks	student marks	Spaces are not allowed
total_marks	class	class is a reserved keyword
_count	my-age	Hyphen is not allowed
number2	int	int is a keyword
Other important rules:
- Java is case-sensitive: age, Age, and AGE are different identifiers.
- Variable names can contain letters, digits, underscores, and dollar signs, subject to Java's identifier rules.
- Use meaningful names such as totalMarks instead of x when possible.
- The usual Java naming convention for variables is lower camel case, such as studentAge and totalPrice.

Topic 2: Data types in Java
1. What is a data type?
A data type specifies what kind of value a variable can store and what operations can be performed on it.
For example:
int age = 19;
char grade = 'A';
boolean passed = true;


Java knows that age stores an integer, grade stores one character, and passed stores a true-or-false value.
Java is a statically typed language. This means you must specify a variable's type when declaring it, and the compiler checks whether the values and operations are compatible with that type.
2. Primitive data types
Java has eight primitive data types.
Data type	Size	Example	Purpose
byte	8 bits	byte x = 100;	Small integers
short	16 bits	short x = 2000;	Small-to-medium integers
int	32 bits	int age = 19;	Common whole numbers
long	64 bits	long n = 900000L;	Large whole numbers
float	32 bits	float p = 5.5f;	Decimal values, lower precision
double	64 bits	double p = 5.5;	Decimal values, higher precision
char	16 bits	char c = 'A';	A single UTF-16 code unit
boolean	JVM-dependent representation	boolean b = true;	Logical true/false
The sizes above are the defined widths of the numeric and character primitive types. Java does not specify a fixed storage size for boolean.
Important exam points:
- int is the usual choice for integer calculations.
- double is the usual choice for decimal calculations.
- long literals may need the L suffix.
- float literals need the f or F suffix.
- char uses single quotes, while String uses double quotes.
- String is a reference type, not a primitive data type.
Examples:
int number = 25;
long population = 9000000L;

float price = 99.5f;
double percentage = 81.80;

char grade = 'A';
boolean isPassed = true;

String name = "Priyanshu";


3. Integer ranges
You should understand why different integer types exist.
Type	Minimum value	Maximum value
byte	-128	127
short	-32,768	32,767
int	-2,147,483,648	2,147,483,647
long	-9,223,372,036,854,775,808	9,223,372,036,854,775,807
For example:
byte age = 25;     // Valid
byte marks = 150;  // Compilation error


Why is the second statement invalid? Because 150 is outside the range of byte.
The compiler checks whether the assigned value can fit into the variable's type.
4. Difference between primitive and reference types
Primitive types	Reference types
Store primitive values directly	Store references to objects, or null
Examples: int, char, boolean	Examples: String, arrays, classes
Cannot be assigned null	Can be assigned null
Have predefined primitive types	Can represent objects with fields and methods
Example:
int age = 19;
String name = "Priyanshu";


Here, age is a primitive variable. name is a reference variable referring to a String object.

Topic 3: Literals in Java
1. What is a literal?
A literal is a fixed value written directly in the source code.
int age = 19;
double price = 99.50;
char grade = 'A';
boolean passed = true;
String name = "Java";


The literals here are 19, 99.50, 'A', true, and "Java".
2. Types of literals
Literal type	Examples
Integer	10, -25, 1000L
Floating-point	3.14, 2.5f
Character	'A', '7', '\n'
String	"Java", "Hello World"
Boolean	true, false
Null	null (for reference types)
Java also supports integer literals in decimal, binary, octal, and hexadecimal notation.
int decimal = 10;
int binary = 0b1010;
int octal = 012;
int hexadecimal = 0xA;


All four variables hold the value 10.
3. Character versus String
This is a common beginner mistake.
char letter = 'A';       // Correct
String word = "A";       // Correct

// char letter = "A";    // Incorrect
// String word = 'A';    // Incorrect


A char literal uses single quotes. A String literal uses double quotes.

Topic 4: Constant variables using final
1. What is a constant variable?
A constant variable is a variable that cannot be reassigned after it has been initialized. In Java, you commonly declare it using the final keyword.
final double PI = 3.14159;


You can read PI and use it in calculations, but you cannot assign a new value to it.
final int MAX_MARKS = 100;

System.out.println(MAX_MARKS);

// MAX_MARKS = 200; // Compilation error


2. Why do we use final?
- To prevent accidental changes to fixed values.
- To make programs easier to maintain.
- To give meaningful names to important values.
- To make the programmer's intention clear.
Examples include tax rates, maximum marks, conversion factors, and mathematical constants.
3. Declaration of a final variable
You may declare a final variable and initialize it later, provided you initialize it before using it and assign it only once.
final int PASS_MARKS;
PASS_MARKS = 40;

System.out.println(PASS_MARKS);


This is valid.
However, assigning it twice is invalid:
final int PASS_MARKS = 40;
// PASS_MARKS = 50; // Compilation error


Exam distinction: final prevents reassignment of the variable. If a final variable refers to a mutable object, the object's contents may still be changeable.
For example, a final array reference cannot point to a different array, but elements in the original array can still be modified.
4. Naming convention for constants
Java programmers commonly use uppercase letters with underscores.
final int MAX_SIZE = 100;
final double TAX_RATE = 0.18;
final int DAYS_IN_WEEK = 7;


This is a naming convention, not a compiler requirement.

Topic 5: Complete Java program
Let's combine variables, primitive data types, literals, and final in one program.

class Week2Basics {
    public static void main(String[] args) {

        // Variables and primitive data types
        int age = 19;
        double marks = 81.80;
        char grade = 'A';
        boolean passed = true;

        // Reference type
        String name = "Priyanshu";

        // Constant variable
        final int MAX_MARKS = 100;

        // Display the values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passed);
        System.out.println("Maximum Marks: " + MAX_MARKS);

        // Calculate percentage
        double percentage = (marks / MAX_MARKS) * 100;
        System.out.println("Percentage: " + percentage);
    }
}



Expected output:
Name: Priyanshu
Age: 19
Marks: 81.8
Grade: A
Passed: true
Maximum Marks: 100
Percentage: 81.8


Dry run: How does Java calculate percentage?
The expression is:
double percentage = (marks / MAX_MARKS) * 100;


Step	Calculation	Result
1	marks / MAX_MARKS	81.8 / 100 = 0.818
2	Multiply by 100	0.818 * 100 = 81.8
3	Store in percentage	81.8
The reason this works is that marks is a double, so the division produces a decimal result rather than integer division.

Topic 6: Type casting in Java
1. What is type casting?
Type casting is the process of converting a value from one data type to another.
For example, suppose you have:
int number = 10;
double result = number;


Java converts the integer value 10 to the double value 10.0.
There are two main categories of conversion.
2. Widening casting (automatic)
Widening means converting a value to a type that can represent a broader range of values or greater precision in the relevant numeric type hierarchy.
Java performs these primitive numeric conversions automatically.
Smaller numeric type
int number = 25;

Wider numeric type
double result = number;

Result: 25.0 — automatic conversion

Common widening conversions include:
- byte → short → int → long → float → double
- char → int → long → float → double
These arrows indicate common widening paths, not that every conversion preserves every possible value exactly. For example, long to float may lose precision.
Example:
class WideningExample {
    public static void main(String[] args) {
        int number = 25;
        double result = number;

        System.out.println(number);
        System.out.println(result);
    }
}


Output:
25
25.0


3. Narrowing casting (manual)
Narrowing converts a value to a type that has a smaller range or less precision. You generally need to write the target type explicitly.
Syntax:
targetType variable = (targetType) value;


Example:
double price = 99.99;
int wholePrice = (int) price;

System.out.println(wholePrice);


Output:
99


Why is the output 99 rather than 100? Casting a floating-point value to an integer discards the fractional part; it does not round to the nearest integer.
Another example:
int number = 130;
byte result = (byte) number;

System.out.println(result);


Output:
-126


The result may look surprising. A byte can represent only -128 through 127, so converting 130 to byte keeps the low eight bits, which represent -126 in Java's signed-byte representation.
Remember: Narrowing can lose information or produce a surprising result.
4. Type casting versus type conversion
Widening	Narrowing
Usually automatic	Usually requires explicit casting
Moves to a wider numeric type	Moves to a narrower numeric type
May still lose precision in some cases	May lose range or fractional information
Example: int to double	Example: double to int
5. Integer division — very important
Consider this code:
int a = 5;
int b = 2;

System.out.println(a / b);
System.out.println((double) a / b);


Output:
2
2.5


Why?
- 5 / 2 uses integer division, so the fractional part is discarded.
- (double) a / b converts a to double before division, so Java performs floating-point division.
If you want a decimal answer, make at least one operand floating-point before the division.

Topic 7: Operators in Java
1. What is an operator?
An operator is a symbol that performs an operation on one or more operands.
For example:
int sum = 10 + 5;


- 10 and 5 are operands.
- + is the operator.
- sum stores the result, 15.
Java's main operator categories include arithmetic, relational, logical, assignment, increment/decrement, and bitwise operators.
2. Arithmetic operators
These operators perform mathematical calculations.
Operator	Meaning	Example	Result
+	Addition	10 + 3	13
-	Subtraction	10 - 3	7
*	Multiplication	10 * 3	30
/	Division	10 / 3	3
%	Remainder	10 % 3	1
Understanding the modulus operator %
The modulus operator returns the remainder after division.
System.out.println(10 % 3);
System.out.println(15 % 5);
System.out.println(17 % 2);


Output:
1
0
1


This operator is extremely useful in DSA.
Example: Check even or odd
int n = 17;

if (n % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}


Output:
Odd


Logic:
- If n % 2 == 0, the number is even.
- Otherwise, the number is odd.
Example: Extract the last digit
int n = 527;
int lastDigit = n % 10;

System.out.println(lastDigit);


Output:
7


This is a foundational technique for number-based DSA problems.
Integer division and remainder together
For positive integers, the quotient and remainder satisfy:
\[
a = (a / b) \times b + (a \% b)
\]

For example, \(17 = 8 \times 2 + 1\).

3. Relational operators
Relational operators compare two values and produce a boolean result: true or false.
Operator	Meaning	Example	Result
==	Equal to	5 == 5	true
!=	Not equal to	5 != 3	true
>	Greater than	8 > 5	true
<	Less than	3 < 2	false
>=	Greater than or equal to	5 >= 5	true
<=	Less than or equal to	4 <= 6	true
Example:
int age = 19;

System.out.println(age >= 18);
System.out.println(age < 18);


Output:
true
false


These operators are commonly used in if statements and loops.
Difference between = and ==
This is one of the most important beginner concepts.
int a = 10;      // Assignment
System.out.println(a == 10);  // Comparison


- = assigns a value.
- == compares primitive values for equality.
For objects such as String, == compares references, not text content. Use .equals() when you want to compare string contents.

4. Logical operators
Logical operators combine or reverse boolean conditions.
| Operator | Meaning | Example |
|---|---|---|
| && | Logical AND | age >= 18 && age <= 60 |
| || | Logical OR | day == 6 || day == 7 |
| ! | Logical NOT | !(age >= 18) |
A. Logical AND (&&)
Both conditions must be true.
int age = 20;

System.out.println(age >= 18 && age <= 60);


Output:
true


If either condition is false, the result is false.
B. Logical OR (||)
At least one condition must be true.
int day = 7;

System.out.println(day == 6 || day == 7);


Output:
true


C. Logical NOT (!)
It reverses a boolean result.
boolean isRaining = false;

System.out.println(!isRaining);


Output:
true


Truth table
| A | B | A && B | A || B |
|---|---|---|---|
| true | true | true | true |
| true | false | false | true |
| false | true | false | true |
| false | false | false | false |
Short-circuit evaluation
Java's && and || operators use short-circuit evaluation.
For example:
int n = 0;

if (n != 0 && 10 / n > 1) {
    System.out.println("Condition is true");
}


The output is nothing. Java evaluates n != 0 first; it is false, so Java does not evaluate 10 / n. Therefore, division by zero is avoided.
This concept is useful when writing safe conditions.

5. Assignment operators
Assignment operators store or update values in variables.
Operator	Example	Equivalent operation
=	a = 10	Assign 10 to a
+=	a += 5	a = a + 5
-=	a -= 3	a = a - 3
*=	a *= 2	a = a * 2
/=	a /= 2	a = a / 2
%=	a %= 3	a = a % 3
Example:
class AssignmentExample {
    public static void main(String[] args) {
        int a = 10;

        a += 5;
        System.out.println(a);

        a *= 2;
        System.out.println(a);

        a %= 6;
        System.out.println(a);
    }
}


Output:
15
30
0


Dry run:
1. Initially, a = 10.
2. a += 5 makes a = 15.
3. a *= 2 makes a = 30.
4. a %= 6 makes a = 0, because 30 divided by 6 has remainder 0.
Notice that each operation updates the same variable.

6. Increment and decrement operators
These operators are especially important for Week 4 loops.
- ++ increases a variable by one.
- -- decreases a variable by one.
int a = 5;

a++;
System.out.println(a);

a--;
System.out.println(a);


Output:
6
5


Pre-increment versus post-increment
This is a common exam question.
Post-increment (a++) uses the current value in the expression first, then increments the variable.
Pre-increment (++a) increments the variable first, then uses its new value in the expression.
class IncrementExample {
    public static void main(String[] args) {
        int a = 5;

        System.out.println(a++);
        System.out.println(a);

        int b = 5;

        System.out.println(++b);
        System.out.println(b);
    }
}


Output:
5
6
6
6


Statement	Printed value	Value afterward
a++ when a = 5	5	6
++b when b = 5	6	6
When a++ or ++a is used alone as a statement, both increase a by one. The difference matters when the value is also being used in an expression.

7. Bitwise operators
Bitwise operators work on the individual bits of integral values such as int, long, short, byte, and char.
The key operators are:
Operator	Meaning
&	Bitwise AND
\|	Bitwise OR
^	Bitwise XOR
~	Bitwise complement
<<	Left shift
>>	Signed right shift
>>>	Unsigned right shift
Example: AND, OR, and XOR
Let's use 5 and 3.
In binary:
- 5 = 0101
- 3 = 0011
Bitwise AND (&)
  0101  (5)
& 0011  (3)
  ----
  0001  (1)

Bitwise OR (|)
  0101  (5)
| 0011  (3)
  ----
  0111  (7)

Bitwise XOR (^)
  0101  (5)
^ 0011  (3)
  ----
  0110  (6)

The rules are:
- AND: the result bit is 1 only when both bits are 1.
- OR: the result bit is 1 when at least one bit is 1.
- XOR: the result bit is 1 when the bits differ.
Complete program:
class BitwiseExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(5 << 1);
        System.out.println(5 >> 1);
    }
}


Output:
1
7
6
10
2


For these positive values, shifting 5 left by one bit gives 10, and shifting right by one gives 2.
Important distinction: && and || are logical operators for boolean expressions. & and | are bitwise operators for integral values, though they can also operate on booleans without short-circuiting.
For now, focus on understanding the binary examples. You can practise advanced bit manipulation later in DSA.

8. Operator precedence
Operator precedence determines which operation is evaluated first.
int result = 10 + 5 * 2;
System.out.println(result);


Output:
20


Multiplication is performed before addition.
Compare:
int a = 10 + 5 * 2;
int b = (10 + 5) * 2;

System.out.println(a);
System.out.println(b);


Output:
20
30


The parentheses change the order of evaluation.
Useful general order:
1. Parentheses: ()
2. Unary operators: ++, --, !, unary -
3. Multiplication, division, remainder: *, /, %
4. Addition and subtraction: +, -
5. Comparisons: <, >, <=, >=
6. Equality: ==, !=
7. Logical AND: &&
8. Logical OR: ||
9. Assignment: =, +=, -=, and others
This is a simplified list; Java has more precedence levels. When uncertain, use parentheses to make the intended calculation clear.

Week 2: Practice problems
Try these yourself before checking the answers. The goal is to predict what Java will do and explain why.
Week 2 self-test
0 of 8 answered

1. What is the output?
int a = 10;
a += 5;
System.out.println(a);


10

15

5

Compilation error



2. What is the output?
System.out.println(17 % 5);


2

3

3.4

0



3. What is the output?
int a = 7;
System.out.println(a / 2);


3

3.5

4

Compilation error



4. What is the output?
double x = 7 / 2;
System.out.println(x);


3.5

3.0

4.0

7.0



5. What is the output?
int a = 5;
System.out.println(a++);
System.out.println(a);


6 then 6

5 then 6

5 then 5

6 then 5



6. What is the output?
System.out.println(5 > 3 && 2 > 4);


true

false

0

Compilation error



7. Which declaration is invalid?
Choose the invalid declaration.


int age = 19;

char grade = 'A';

float price = 10.5;

boolean passed = true;



8. What is the output?
int a = 5;
System.out.println(++a);


5

6

7

Compilation error


Reset quizReview my answers

Your coding assignment
Write a complete Java program named Week2Practice.java that:
1. Declares variables for a student's name, age, marks, and grade.
2. Declares a constant named MAX_MARKS using final.
3. Calculates the student's percentage.
4. Prints whether the student passed, assuming passing marks are 40 out of 100.
5. Prints the last digit of the student's age using %.
6. Demonstrates one widening conversion and one explicit narrowing conversion.
Use Scanner only if you want to take input from the user; it is not required for this assignment.
Suggested study plan: Spend Day 1 on variables, primitive types, literals, and final; Day 2 on type casting and integer division; Day 3 on arithmetic and relational operators; Day 4 on logical and assignment operators; Day 5 on increment/decrement and bitwise operators; and Day 6 on the quiz and coding assignment.