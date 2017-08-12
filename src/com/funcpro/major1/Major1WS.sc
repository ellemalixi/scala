package com.funcpro.major1

object Major1WS {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
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
 	}                                         //> fib: (x: Int)Int
 	
 	fib(6);                                   //> 1610612739 
                                                  //| 805306371 
                                                  //| 402653187 
                                                  //| 201326595 
                                                  //| 100663299 
                                                  //| 50331651 
                                                  //| 25165827 
                                                  //| 12582915 
                                                  //| 6291459 
                                                  //| 3145731 
                                                  //| 1572867 
                                                  //| 786435 
                                                  //| 393219 
                                                  //| 196611 
                                                  //| 98307 
                                                  //| 49155 
                                                  //| 24579 
                                                  //| 12291 
                                                  //| 6147 
                                                  //| 3075 
                                                  //| 1539 
                                                  //| 771 
                                                  //| 387 
                                                  //| 195 
                                                  //| 99 
                                                  //| 51 
                                                  //| 27 
                                                  //| 15 
                                                  //| 9 
                                                  //| 6 
                                                  //| res0: Int = 0
 	
 
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
 	}                                         //> fizzString: (word: String)Unit
 	
 	fizzString("fig");                        //> Fizz
 	fizzString("dib");                        //> Buzz
 	fizzString("fib");                        //> FizzBuzz
 	
 
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
}                                                 //> factorial: (n: Int)Unit
	
 factorial(1);                                    //> java.lang.StackOverflowError
                                                  //| 	at com.funcpro.major1.Major1WS$.factorial$1(com.funcpro.major1.Major1WS.
                                                  //| scala:60)
                                                  //| 	at com.funcpro.major1.Major1WS$.factorial$1(com.funcpro.major1.Major1WS.
                                                  //| scala:60)
                                                  //| 	at com.funcpro.major1.Major1WS$.factorial$1(com.funcpro.major1.Major1WS.
                                                  //| scala:60)
                                                  //| 	at com.funcpro.major1.Major1WS$.factorial$1(com.funcpro.major1.Major1WS.
                                                  //| scala:60)
                                                  //| 	at com.funcpro.major1.Major1WS$.factorial$1(com.funcpro.major1.Major1WS.
                                                  //| scala:60)
                                                  //| 	at com.funcpro.major1.Major1WS$.factorial$1(com.funcpro.major1.Major1WS.
                                                  //| scala:60)
                                                  //| 	at com.funcpro.major1.Major1WS$.factorial$1(com.funcpro.major1.Major1WS.
                                                  //| scala:60)
                                                  //| 	at com.funcpro.major1.Major1WS$.factorial$1(com.funcpro.major1.Major1WS.
                                                  //| scala:60)
                                                  //| 	at com.funcpro.major1.Major1WS$.factorial$1(com.funcpro.major1.Major1WS.
                                                  //| scala:60)
                                                  //| 	at com.funcpro.major1.Major1WS$.factorial$1(com.funcpro.major1.Major1WS.
                                                  //| scala:60)
                                                  //| 	at com.funcpro.major1.Major1WS$
                                                  //| Output exceeds cutoff limit.

 
 /**
 	4.)
 */
 
 def sum (x:Int):Unit = {
 	val last = x%10;
 	val first = x/10;
 	val ans = first + last;
 	
 		sum(ans);
 		println(ans);
 }
 
 
}