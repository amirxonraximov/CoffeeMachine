class Complex {

    double real;
    double image;

    void add(Complex anotherNum) {
        real = real + anotherNum.real;
        this.image = this.image + anotherNum.image;
    }
    
    void subtract(Complex anotherNum) {
        real = real - anotherNum.real;
        this.image = this.image - anotherNum.image;
    }
}
