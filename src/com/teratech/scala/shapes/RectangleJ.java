package com.teratech.scala.shapes;

public class RectangleJ extends ShapeJ {
	public int y = 0;
	public RectangleJ(int x, int y)
	{
		super(x * y);
	}
	@Override
	public String toString() {
		return "X: " + x;
	}
	

}
