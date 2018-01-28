package com.teratech.scala.shapes

class Rectangle (var _length:Double, var _width:Double) {
  
  def length = _length
  def width = _width
  def length_= (len:Double) =  _length = len
  def width_= (w:Double):Unit = _width = w
  def print():Unit = println(s"Length is: ${length}, and Width is: ${width}") 
  
}

object Rectangle 
{
    def main(args: Array[String]): Unit = 
    {
        val rect = new Rectangle(10,8)
        rect.print()
        println("====================")
        rect.length= 12
        rect.print()
    }
    
    def apply (_length:Double, _width:Double):Rectangle = new Rectangle (_length, _width )
  
}