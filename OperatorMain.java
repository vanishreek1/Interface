package com.githubauto.excercise7;

public class OperatorMain {
  static int a =3;
  static int b =6;

  public static void main(String[] args) {
    Operator add = new AddOperator();
    Operator sub = new SubtractOperator();
    Operator mult = new MultiplyOperator();
    Operator div = new DivideOperator();
    
    
    System.out.println("addition: " + a +""+ add.toString()+ b +"=" + add.execute(3, 6));
    System.out.println("Subtraction: "+ + a +""+ sub.toString()+ b +"=" + sub.execute(3, 6));
    System.out.println("Multiplication "+ a +""+ add.toString()+ b +"=" + mult.execute(3, 6));
    System.out.println("Division " + a +""+ add.toString()+ b +"=" + div.execute(3, 6));
  }
  
  

}
