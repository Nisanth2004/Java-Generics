# Java Generics Example

Generics in Java allow us to create classes, interfaces, and methods with type parameters, improving type safety and reducing the need for explicit casting. This example demonstrates the basics of using generics in Java to handle different data types in a type-safe way.

## Why Use Generics?

- **Avoid `ClassCastException`**: Prevents errors that occur when trying to cast incompatible types.
- **Type Safety**: Ensures that only the specified type can be used, catching type errors at compile-time.
- **No Explicit Casting Needed**: Removes the need to cast objects to specific types.

## Example: Generic Class `GenricsDemo<T>`

The `GenricsDemo` class is a generic class that can accept any data type (like `String`, `Integer`, etc.). It stores the object of type `T` and prints the class type of the object.

### Code

```java
// Generic class with type parameter <T>
public class GenricsDemo<T> {
    T t;

    // Constructor to initialize the generic type
    public GenricsDemo(T ob) {
        this.t = ob;
    }

    // Method to display the object's class type
    public void show() {
        System.out.println("Class of the Object is: " + t.getClass().getTypeName());
    }
}
