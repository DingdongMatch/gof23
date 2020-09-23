package com.match.flyweight;

/**
 * 棋子的抽象享元类
 * @author Match
 *
 */
public interface ChessFlyWeight
{
	void setColor(String c);
	String getColor();
	void display(Coordinate c);
}
