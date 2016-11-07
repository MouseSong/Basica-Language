package learn.scala.two

/**
 * 循环：
 * 1.while  do.while  for
 * 2. to , until   Range
 * 3.对字符串应用for
 * 4.for中定义多个生成器
 * 5.for中定义守卫
 * */
object Loop extends App{
     
      //to 左闭右闭区间      until 左闭右开区间
      for(i <- 1 to 10){
          print(i + ",") //1 - 10
      }
      println()
      
      val array1 = Array(1,2,3,4,5,6,7)
      for(i <- 0 until array1.length){
          print(array1(i) + ",")
      }
      println()
      
      var str1 = "zhangsan"
      for(str <- str1){
          print(str + "-")  //z-h-a-n-g-s-a-n
      }
      
       println()
      //多个生成器
      for(i <- 1 to 3;j <- 1 to 3) 
           print(10 * i + j + "  ")   //11  12  13  21  22  23  31  32  33 
        
      println()     
      for(i <- 1 to 10 if i%3 == 0)
           print(i + " ")   //3 6 9
           
      
      
      
}