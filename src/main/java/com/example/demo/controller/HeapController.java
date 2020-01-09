package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 堆泄露
 * @author jingyangTan
 * @version $Id$
 * @since 2020/1/9
 */
@RestController
public class HeapController {

	@RequestMapping("/heap")
	public void heapTest(){


	}
}
