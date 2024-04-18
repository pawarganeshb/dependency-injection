package com.amazon;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.amazon.order.Order;

public class SpringApp {

	public static void main(String[] args) {

		BeanFactory factory = new FileSystemXmlApplicationContext(
				"D:\\workspaces\\naresit\\dependecy-injection\\beans.xml");

		
		System.out.println("*&********Order Details ****");
		Order order = (Order) factory.getBean("orderOne");
		
		//JDBC code ti inject into DB
		
		System.out.println(order.getOrderId());
		System.out.println(order.getOrderValue());
		System.out.println(order.getProduct());
		System.out.println(order.getProduct().getProductName());
		System.out.println(order.getProduct().getProductPrices());
		
		order.setOrderValue(150000);
		System.out.println(order.getOrderValue());
		
	
	}

}
