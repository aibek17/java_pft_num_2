package ru.srqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("World");
    hello("qwerty");
    hello("asdf");

    double k = 5;
    System.out.println("area of object is " + area(k));

    double a = 4;
    double b = 6;
    System.out.println("square is " + area(a, b));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }
}