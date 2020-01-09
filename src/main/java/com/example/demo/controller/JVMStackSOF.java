package com.example.demo.controller;
/**
 * @author jingyangTan
 * @version $Id$
 * @since 2020/1/9
 */
public class JVMStackSOF {

	private int stackLength =1; //记录栈深度

	//递归方法造成栈溢出
	public void stackPush()
	{
		stackLength++;
		stackPush();
	}


	//堆栈溢出错误
	public static void main(String[] args) throws Throwable {
		JVMStackSOF stackSOF = new JVMStackSOF();
		stackSOF.stackPush();

	}
}
