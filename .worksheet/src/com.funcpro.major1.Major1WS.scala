package com.funcpro.major1

object Major1WS {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 
  println("Welcome to the Scala worksheet");$skip(20); 
  
  val x = 1 + 2;System.out.println("""x  : Int = """ + $show(x ));$skip(32); ;
  
  def square(x:Int) = x * x;System.out.println("""square: (x: Int)Int""");$skip(17); ;
  
  println(x);}
  
  
}
