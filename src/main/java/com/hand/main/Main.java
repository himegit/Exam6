package com.hand.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.hand.dao.DaoImp;

public class Main {

	private static String filmTitle = null;

	private static String filmDescription = null;

	private static int filmLanguage_id;

	public static void main(String[] args) {
		String conf = "applicationContext.xml";
		ApplicationContext ac = new FileSystemXmlApplicationContext(conf);
		System.out.println("Context Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入电影名称：");
		filmTitle = sc.next();
		System.out.println("请输入电影描述");
		filmDescription = sc.next();
		System.out.println("请输入语言ID");
		filmLanguage_id = sc.nextInt();
		DaoImp daoImp = (DaoImp) ac.getBean("daoImp");
		String result = daoImp.insert(filmTitle, filmDescription, filmLanguage_id);
		System.out.println(result);
		System.out.println("Context Stop");
	}

}
