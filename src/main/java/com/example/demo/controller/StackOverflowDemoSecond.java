package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.OneObject;
/**
 * 递归Constructer
 * @author jingyangTan
 * @version $Id$
 * @since 2020/1/9
 */
@RestController
public class StackOverflowDemoSecond {

	public OneObject OneObject()
	{
		OneObject oneObject = new OneObject();

		return oneObject;
	}


	public static void main(String [] args){
		try {
			StackOverflowDemoSecond stackOverflowDemoSecond = new StackOverflowDemoSecond();
			stackOverflowDemoSecond.OneObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
