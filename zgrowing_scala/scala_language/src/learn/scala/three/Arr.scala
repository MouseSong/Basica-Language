package learn.scala.three

/**
 * Scala 数组, Array, ArrayBuffer.
 * @author zhangdong
 * @createtime 2016-11-08
 * @location peking
 * */
object Arr extends App{
  
  /* 定长数组的定义.*/
  
  //空数组
  val arr1 = new Array[Int](10)
  val arr2 = new Array[String](3)
  
  val arr3 = Array("a", "b")
  
  //获取定长数组中的元素
  println(arr3(1))  //b
  
  
}