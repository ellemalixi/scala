package com.funcpro.major1

object Major1WS {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 
  println("Welcome to the Scala worksheet");$skip(207); 
  
  /**
		1.)
  */
  
  def fib(x:Int):Int = {
  	val ans=0;
	 	
	 	if (x <= 1) {
	 		return 1;
	 	} else if (ans < x) {
	 			val ans = fib((x-1) + (x-2));
	 			println ((x) + " ");
	 	}
	 	return ans;
 	};System.out.println("""fib: (x: Int)Int""");$skip(13); val res$0 = 
 	
 	fib(6);System.out.println("""res0: Int = """ + $show(res$0));$skip(371); ;
 	
 
 /**
 	2.)
 */
 
 	def fizzString(word:String):Unit = {
 		val first = word.startsWith("f");
 		val second = word.endsWith("b");
 		val both =  word.startsWith("f") && word.endsWith("b");
 		
 		if (both) {
 			println("FizzBuzz");
 		} else if (first) {
 			println("Fizz");
 		} else if (second) {
 			println("Buzz");
 		} else {
 			println(word + "");
 		}
 	};System.out.println("""fizzString: (word: String)Unit""");$skip(24); 
 	
 	fizzString("fig");$skip(21); ;
 	fizzString("dib");$skip(21); ;
 	fizzString("fib");$skip(192); ;
 	
 
 /**
 	3.)
 */
 def factorial(n:Int):Unit = {
 	val num = (n * (n+1));
 	
 	if (n != 0) {
 		if (num == 0) {
 			println(0);
 		} else {
 			factorial(n+1);
 			println(num);
 		}
 	}
};System.out.println("""factorial: (n: Int)Unit""");$skip(17); 
	
 factorial(1);$skip(149); ;

 
 /**
 	4.)
 */
 
 def sum (x:Int):Unit = {
 	val last = x%10;
 	val first = x/10;
 	val ans = first + last;
 	
 		sum(x+ans);
 		println(ans);
 };System.out.println("""sum: (x: Int)Unit""");$skip(12); 
 
 sum(23);}
}
