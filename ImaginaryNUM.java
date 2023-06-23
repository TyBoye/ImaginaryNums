/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.practice.imaginarynums;

/**
 *
 * @author Tyler
 */
import java.util.Scanner;
class Complex {
    private double r;
    private double i;
    public Complex() {
        this.r = 0;
        this.i = 0;
    }
    public Complex(double r) {
        this.r = r;
        this.i = 0;
    } 
    public Complex(double r, double i) {
        this.r = r;
        this.i = i;
    }   
    public double getRealnum() {
        return r;
    }  
    public double getImaginarynum() {
        return i;
    }   
    public Complex add(Complex other) {
        double newR = this.r + other.r;
        double newI = this.i + other.i;
        return new Complex(newR, newI);
    }   
    public Complex subtract(Complex other) {
        double newR = this.r - other.r;
        double newI = this.i - other.i;
        return new Complex(newR, newI);
    }   
    public Complex multiply(Complex other) {
        double newR = this.r * other.r - this.i * other.i;
        double newI = this.r * other.i + this.i * other.r;
        return new Complex(newR, newI);
    }  
    public Complex divide(Complex other) {
        double denominator = other.r * other.r + other.i * other.i;
        double newR = (this.r * other.r + this.i * other.i) / denominator;
        double newI = (this.i * other.r - this.r * other.i) / denominator;
        return new Complex(newR, newI);
    }  
    public double abs() {
        return Math.sqrt(this.r * this.r + this.i * this.i);
    }   
    @Override
    public String toString() {
        if (this.i == 0) {
            return Double.toString(this.r);
        } else if (this.r == 0) {
            return Double.toString(this.i) + "i";
        } else {
            return Double.toString(this.r) + (this.i > 0 ? "+" : "-") + Double.toString(Math.abs(this.i)) + "i";
        }
    }
    @Override
public Complex clone() {
    return new Complex(this.r, this.i);
}
}
public class ImaginaryNUMS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        Complex c1 = new Complex(a, b);
        System.out.print("Enter the second complex number: ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        Complex c2 = new Complex(c, d);
        System.out.println("(" + c1 + ")" + " + " + "(" + c2 + ")" + " = " + c1.add(c2));
        System.out.println("(" + c1 + ")" + " - " + "(" + c2 + ")" + " = " + c1.subtract(c2));
        System.out.println("(" + c1 + ")" + " * " + "(" + c2 + ")" + " = " + c1.multiply(c2));
        System.out.println("(" + c1 + ")" + " / " + "(" + c2 + ")" + " = " + c1.divide(c2));
        System.out.println("|" + c1 + "| = " + c1.abs());
        Complex c3 = (Complex)c1.clone();
        System.out.println(c1 == c3);
        System.out.println(c3.getRealnum());
        System.out.println(c3.getImaginarynum());
    }
}

