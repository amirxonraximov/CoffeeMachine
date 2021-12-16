public class Main {
    public static void main(String[] args) {
        Box innerBox = new Box();

        System.out.println(innerBox.length);
        System.out.println(innerBox.height);
        System.out.println(innerBox.width);
    }
}

class Box {
    double length;
    double height;
    double width;
    Box innerBox;
}