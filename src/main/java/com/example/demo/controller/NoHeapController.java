package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author jingyangTan
 * @version $Id$
 * @since 2020/1/9
 */
@RestController
public class NoHeapController {

	@RequestMapping("/noheap")
	public void noheapTest(){


	}
}
