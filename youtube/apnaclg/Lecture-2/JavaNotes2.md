To make the content look like the provided example on GitHub, you can format it as follows:

```markdown
# Java - Introduction to Programming
## Lecture 2

### Variables & Data Types

1. **Variables**
   - A variable is a container (storage area) used to hold data.
   - Each variable should be given a unique name (identifier).

```java
public class Main {
    public static void main(String[] args) {
        // Variables
        String name = "Aman";
        int age = 30;

        String neighbour = "Akku";
        String friend = neighbour;
    }
}
```

2. **Data Types**
   - Data types are declarations for variables. This determines the type and size of data associated with variables which is essential to know since different data types occupy different sizes of memory.
   - There are 2 types of Data Types:
     * Primitive Data types: to store simple values
     * Non-Primitive Data types: to store complex values

   - **Primitive Data Types**

     | Data Type | Meaning              | Size (in Bytes) | Range                              |
     |-----------|----------------------|-----------------|------------------------------------|
     | byte      | 2’s complement integer | 1              | -128 to 127                        |
     | short     | 2’s complement integer | 2              | -32K to 32K                        |
     | int       | Integer numbers       | 4              | -2B to 2B                          |
     | long      | 2’s complement integer (larger values) | 8 | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
     | float     | Floating-point        | 4              | Up to 7 decimal digits             |
     | double    | Double Floating-point | 8              | Up to 16 decimal digits            |
     | char      | Character             | 2              | a, b, c .. A, B, C .. @, #, $ ..  |
     | bool      | Boolean               | 1              | True, false                        |

   - **Non-Primitive Data Types**
     - These are of variable size & are usually declared with a ‘new’ keyword.
     - Eg: String, Arrays

```java
String name = new String("Aman");
int[] marks = new int[3];
marks[0] = 97;
marks[1] = 98;
marks[2] = 95;
```

3. **Constants**
   - A constant is a variable in Java which has a fixed value i.e. it cannot be assigned a different value once assigned.

```java
public class Main {
    public static void main(String[] args) {
        // Constants
        final float PI = 3.14F;
    }
}
```

### Homework Problems
1. Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or float) not byte.
2. Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
3. Make a program that prints the table of a number that is input by the user.
   (HINT - You will have to write 10 lines for this but as we proceed in the course you will be studying about ‘LOOPS’ that will simplify your work A LOT!)

**KEEP LEARNING & KEEP PRACTICING :)**
*Apna College*
```