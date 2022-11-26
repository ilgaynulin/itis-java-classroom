package com.company;

public class Complex {
    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
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

    // minus

    // multiply
}
