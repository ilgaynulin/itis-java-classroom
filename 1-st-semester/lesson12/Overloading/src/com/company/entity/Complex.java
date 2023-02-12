package com.company.entity;

public class Complex {
    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(Complex complex) {
        this.real = complex.real;
        this.imaginary = complex.imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }


    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }

    public Complex sum(Complex c) {
        Complex sumResult = new Complex(this.real + c.real,
                this.imaginary + c.imaginary);
        return sumResult;
    }

    public boolean equals(Object object) {
        if(this == object) {
            return true;
        }

        if(this.getClass() != object.getClass()) {
            return false;
        }

        if(this.real == ((Complex) object).real && this.imaginary == ((Complex) object).imaginary) {
            return true;
        } else {
            return false;
        }
    }

    // minus
    public Complex minus(Complex c) {
        return new Complex(this.real - c.real, this.imaginary - c.imaginary);
    }

    // multiply

    public Complex multiply(Complex c) {
        return new Complex(this.real * c.real - this.imaginary * c.imaginary, this.real * c.imaginary + this.imaginary * c.real);
    }
}
