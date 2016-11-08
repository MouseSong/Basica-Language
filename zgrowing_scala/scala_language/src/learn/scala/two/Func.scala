package learn.scala.two


/**
 * 函数.
 * @author zhangdong
 * @createtime 2016-11-08
 * @location peking
 * */
object Func extends App{
   /**
    * def 函数名（参数）：返回值类型 = { 函数体 }
    * */
  def fac(n: Int): Int = {
    var r = 1;
    for(i <- 1 to 10)
      r = r * i
    r  //返回值
  }
  
  //返回值可省略， 单递归函数必须制定返回值
  
  
  //还可以给函数参数指定具体名称 和 指定默认值
  def decorate(str: String, left: String = "[", right: String = "]") = 
      left + str + right
      
  val s1 = decorate("Hello", right="}")  //[Hello}   
  
  println(s1)
  
  
  //参数可为变长参数，类似Java中的变长参数   ，其是Seq类型
  def sum(args: Int*) = {
    println(args.getClass.getName)
    var result = 0
    for(arg <- args)
      result = result + arg
    result
  }
  
  val r1 = sum(1, 2,3 ,4,5)
  println(r1)
  
  
  //在递归函数中应用 Range 转 Seq
  
  def recursiveSum(args: Int*): Int = {
    if(args.length == 0) 
      0
    else
      //args.tail:_* 
      recursiveSum(args.tail:_*) + args.head
  }
  
  val r2 = recursiveSum(1, 2,3,4,5,6)
  println(r2)
  
  
  //过程， 没有返回值的函数   , 没有= ，Unit
  def box(s: String) {
     var border = "-" * s.length + "---\n"
     println(border + "|" + s)
  }
  
  box("hello")
  
  //Scala没有受检查异常   ， 异常处理使用模式匹配
  try{
    
  }catch{
    case e: Exception => print(e)
  }
}