package ex96.type2;

public class App {
    public static void main(String[] args) {
        User teacher = User.createTeacher();
        User student = User.createStudent();

        Rectangle smallR = Rectangle.from("small");
        Rectangle mediumR = Rectangle.from("medium");
        Rectangle largeR = Rectangle.from("large");

        Rectangle mySizeR = Rectangle.of(500, 500);
    }
}