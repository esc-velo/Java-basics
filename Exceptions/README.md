### **What is an Exception?**

An exception is an event that disrupts the normal flow of a program's execution. It's an **object** that is **thrown at runtime**.

>Java has a robust exception-handling mechanism using `try`, `catch`, `finally`, and `throw`.


- In Java, exceptions follow a hierarchy: 
Throwable is the superclass, followed by **Exception**, then **RuntimeException**, and specific exceptions like **IOException, NullPointerException, etc.

Throwable [superclass]
Error       (serious problems, not handled by code)
Exception    (can be handled in code)
      Checked Exceptions (compile-time)
      Unchecked Exceptions (runtime)


#### Checked Exceptions:

- Detected at **compile time**
- Must be either handled or declared using `throws`
- Examples:
    - `IOException`
    - `SQLException`

#### ⚠️ Unchecked Exceptions:
- Detected at **runtime**
- Handling is optional
- Subclass of `RuntimeException`
- Examples:
    - `NullPointerException`
    - `ArrayIndexOutOfBoundsException`
    - `ArithmeticException`

#### ❌ Errors (not exceptions):

- Irrecoverable issues, like memory leaks
- Not meant to be caught or handled
- Examples:
    - `OutOfMemoryError`
    - `StackOverflowError`


```java
try {
    // Code that might throw an exception
} catch (ExceptionType e) {
    // Code to handle the exception
} finally {
    // Code that always executes
}
```

- You can have **multiple catch blocks**.
- `finally` always runs (even if exception is not thrown or caught), unless the JVM exits (e.g., `System.exit(0)`).


## Important keywords


<center><h3>Throw keyword</h3></center>

The `throw` keyword is used to create a custom error.

The `throw` statement is used together with an **exception type**. There are many exception types available in Java: `ArithmeticException`, `ClassNotFoundException`, `ArrayIndexOutOfBoundsException`, `SecurityException`, etc.

```java
public class Main {

  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
    
  }

  public static void main(String[] args) {
    checkAge(15); // Set age to 15 (which is below 18...)
  }
}
```


<center><h3>Throws keyword</h3></center>

Declares that a method might throw an exception at the method signature itself.

```java
public class Main {
  static void checkAge(int age) throws ArithmeticException {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    checkAge(15); // Set age to 15 (which is below 18...)
  }
}
```


<center><h3>Custom Exceptions</h3></center>

```java
class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}
```

then in main do this : 

```java
throw new MyException("Something went wrong!");
```
check CustomException.java file to learn more.
