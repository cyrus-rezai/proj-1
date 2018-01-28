package com.teratech.scala

class Vector3D (x:Double, var color:Int) extends Vector2D(x, x) with MyColor {
    final val a = 0
    
    override def myMethod() = 
    {
        super.myMethod()
        println("myMethod() in Vector3D is being called") 
    }

  def aMethod(): Unit = {
      println(Nil)
    }
}