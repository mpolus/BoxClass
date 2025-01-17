public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(100);
        integerBox.printValue();  // Output: The value in the box is: 100
        integerBox.setValue(200);
        integerBox.printValue();  // Output: The value in the box is: 200

        Box<String> stringBox = new Box<>("Hello, Generics!");
        stringBox.printValue();  // Output: The value in the box is: Hello, Generics!
        stringBox.setValue("Java is awesome!");
        stringBox.printValue();  // Output: The value in the box is: Java is awesome!

        Box<Double> doubleBox = new Box<>(3.14159);
        doubleBox.printValue();  // Output: The value in the box is: 3.14159
        doubleBox.setValue(2.71828);
        doubleBox.printValue();  // Output: The value in the box is: 2.71828
        //   }
    }
}