package com.teratech.scala

abstract class Vector2D (var x:Double, var y:Double) {
     override def  toString: String = x + ": " + y
     def myMethod() = println("myMethod() in Vector2D is being called")
     //val a:Int
     def aMethod(): Unit
}

object Vector2D
{
      
    def main(args:Array[String]):Unit = 
    	{
          val v = new Vector3D(3,3);
           v.myMethod()
    	}
    
    
}


