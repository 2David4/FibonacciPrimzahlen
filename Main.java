package ch.competec;

public class Main {
  public static void main(String[] args) {
    int limit = 10000;
    int n = 15;
    Fibonacci fibonacci = new Fibonacci(limit);
    fibonacci.findeFibonacciPrimzahlen(n);
  }
}