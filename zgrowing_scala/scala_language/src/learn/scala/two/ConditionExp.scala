package learn.scala.two


/**
 * 表达式：
 * 1.scala中的表达式有返回值
 * 2.if else 的返回值与最后一条语句的值
 * 3.块表达式的返回值是最后一条语句的值
 * 4.赋值语句的返回值是  Unit/()
 * 6.输入 readLine,readInt... 
 * 7.输出 print println printf
 * */
object ConditionExp extends App{
  
      //表达式有返回值 ， 返回值会 表达式最后一句的值
      val condition = 10
      val s = if(condition > 7) true else -1
      
      println(s)  //true
      
      //表达式   无值 = Unit/()
      
      val s2 = if(condition < 9) true 
      val s3 = if(condition < 9) true else ()
      
      println(s2)  //()
      println(s3)  //()
      
      
      //块表达式也有返回值， 返回值为 最后一句的值
      val s4 = { val dx = 10; val dy = 8; Math.sqrt(dx * dx + dy * dy)}
      
      println(s4) //12.806248474865697
      
      
      //赋值语句的返回值是  Unit/()
      val s5 = {var r = 5; r -= 1}
      println(s5)  //()
      
      
      //输入输出  
      val name = readLine("Your name:")
      println("Your age:")
      val age = readInt()
      
      printf("Hello, %s! Next Year, you will be %d.\n", name, age)
      
      /**
       * println  / print
       * printf : c风格的输出
       * */
      
}