package com.teratech.scala.shapes;

public class ShapeJ 
{
	public int x = 0;
	public ShapeJ(int x)
	{
		this.x = x;
	}

	public static void main(String[] args)
	{
		ShapeJ rect = new RectangleJ(10, 20);
		System.out.println(rect.toString());
		
	}
}
