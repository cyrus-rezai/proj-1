package com.teratech.scala

import scala.reflect.ClassTag

class ParametricClass [T: ClassTag] {
    val a = new Array[T](10)
  
}