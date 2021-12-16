import static java.lang.Math.*;

class Circle {

    double radius;

    double getLength() {
        return 2 * PI * radius;
    }

    double getArea() {
        return PI * pow(radius, 2);
    }
}