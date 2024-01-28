Method overloading in Java allows you to define multiple methods with the same name in the same class, but with different parameter lists. The key aspect is that the method signature must be different, meaning the number or types of parameters should vary. The return type alone is not sufficient to differentiate overloaded methods.

Here's an example to illustrate method overloading:

```java
public class Example {
    
    // Overloaded method with two int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method with a String parameter
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        Example example = new Example();

        // Call the first overloaded method
        int sum1 = example.add(5, 10);
        System.out.println("Sum 1: " + sum1);

        // Call the second overloaded method
        int sum2 = example.add(5, 10, 15);
        System.out.println("Sum 2: " + sum2);

        // Call the third overloaded method
        double sum3 = example.add(3.5, 2.5);
        System.out.println("Sum 3: " + sum3);

        // Call the overloaded method with String parameters
        String result = example.concatenate("Hello, ", "World!");
        System.out.println("Concatenation: " + result);
    }
}
```

In this example, the `Example` class has several overloaded `add` methods. The first two methods differ in the number of parameters, and the third method has a different parameter type (`double`). Additionally, there is a `concatenate` method with a different parameter type (`String`). When calling these methods, Java will determine the appropriate method to invoke based on the number and types of arguments provided.