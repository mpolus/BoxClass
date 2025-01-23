public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();

        stringBox.setItem("Hi");
        System.out.println(stringBox.getItem());

        Box<Integer> integerBox = new Box<>();

        integerBox.setItem(99);
        System.out.println(integerBox.getItem());

        Box<Double> doubleBox = new Box<>();

        doubleBox.setItem(1.999);
        System.out.println(doubleBox.getItem());



    }
}