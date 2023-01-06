package com.mukesh;

import java.util.Scanner;

public class Geomentry {
    //Area Of Triangle
//Perimeter Of Square
//Volume Of Pyramid
    public static void main(String[] args) {
//        int area = triangle();
//        System.out.println("Area of triangle: " + area);
//        int perimeter = square();
//        System.out.println("Perimeter of square: "+ perimeter);
        int volume = pyramid();
        System.out.println("Volume of pyramid: " + volume);
    }

    static int pyramid(){
//        volume = l * w * h
        int l = 10;
        int w = 20;
        int h = 30;
        int v = (l * w * h)/3;
        return v;
    }

    static int square() {
//        perimeter = 4a
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the area: ");
        int area = in.nextInt();
        int perimeter = 4 * area;
        return perimeter;
    }

    static int triangle() {
//        A=h*b/2
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of height: ");
        int h = in.nextInt();
        System.out.print("Enter the value of base: ");
        int b = in.nextInt();
        int area = (h * b)/2;
        return area;
    }

}