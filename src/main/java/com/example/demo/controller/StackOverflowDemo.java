package com.example.demo.controller;
/**
 * 栈层级不足
 * @author jingyangTan
 * @version $Id$
 * @since 2020/1/9
 */
public class StackOverflowDemo {

	private int i;

	public void plus(){
		i++;
		plus();
	}

	public static void main(String[] args){

		StackOverflowDemo stackOverflowDemo = new StackOverflowDemo();
		try {
			stackOverflowDemo.plus();
		} catch (Exception e) {
			System.out.println("Error.stack length:"+stackOverflowDemo);
			e.printStackTrace();
		}
	}
	}
