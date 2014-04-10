package com.mycompany.mypackage;

public class MyMainClass { // main class, comment
  public static void main(String[] args) {
    try {
      final int a = Integer.parseInt(args[0]);
      final int b = Integer.parseInt(args[1]);

      final Calculator calculator = new Calculator();

      System.out.println(calculator.sum(a, b));
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
