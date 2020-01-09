package com.example.demo.controller;
/**
 * 
 * @author jingyangTan
 * @version $Id$
 * @since 2020/1/9
 */
public class JVMStackOOM {

	private static void dontStop()
	{
		while (true){

		}
	}


	public static void main(String[] args){

		while (true){
			new Thread(new Runnable() {
				@Override
				public void run() {
					dontStop();
				}
			}).start();
		}
	}




}

