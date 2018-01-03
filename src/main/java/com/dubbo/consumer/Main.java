package com.dubbo.consumer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.service.DemoService;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) throws Exception
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String []{"applicationContext.xml"});
    	context.start();
    	DemoService demo = (DemoService) context.getBean("demoService");
    	String str = demo.sayHello("tom");
    	System.out.println(str);
    	System.in.read();//为保证服务一直开着，利用输入流的阻塞来模拟
    	
    	
    }
}
