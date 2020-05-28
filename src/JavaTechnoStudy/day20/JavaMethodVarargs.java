package JavaTechnoStudy.day20;

public class JavaMethodVarargs {
    public static void main(String[] args) {
        methodWithVarargs(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //1.way passing array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        methodWithVarargs(array);
        //2.way to pass the array to method
        methodWithVarargs(3, 4, 5, 6, 7);
    }

    public static void methodWithVarargs(int... numbers) {// int[] numbers
        int argumentsSize = numbers.length;

        System.out.println("Number of arguments: " + argumentsSize);
    }
}

/*Java Varargs
 In this article, you’ll learn about varargs in Java with the help of examples.
 You will also learn when to use varargs and when not to use them.

 What is varargs in Java?
 Let’s suppose you are creating a Java method. However,
 you are not sure how many arguments your method is going to accept.
 To address this problem, Java 1.5 introduced varargs.

 Varargs is a short name for variable arguments.
 In Java, an argument of a method can accept arbitrary number of values.
 This argument that can accept variable number of values is called varargs.
 */