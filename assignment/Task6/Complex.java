package com.assignment.Task6;

//
import java.util.*;
class Complex {

    double real, imag;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter real and imaginary part of first complex number:");
        double real1 = sc.nextDouble();
        double imag1 = sc.nextDouble();
        Complex c1 = new Complex(real1, imag1);

        System.out.println("Enter real and imaginary part of second complex number:");
        double real2 = sc.nextDouble();
        double imag2 = sc.nextDouble();
        Complex c2 = new Complex(real2, imag2);

        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);

        System.out.print("Sum: ");
        sum.display();

        System.out.print("Difference: ");
        difference.display();

        System.out.print("Product: ");
        product.display();
    }

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    Complex multiply(Complex other) {
        double realPart = (this.real * other.real) - (this.imag * other.imag);
        double imagPart = (this.real * other.imag) + (this.imag * other.real);
        return new Complex(realPart, imagPart);
    }

    void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }
}