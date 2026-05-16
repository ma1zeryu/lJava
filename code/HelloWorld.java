package code;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world!");

        Add add = new Add();
        int result = add.add(3, 5);
        System.out.println("3 + 5 = " + result);
    }
}