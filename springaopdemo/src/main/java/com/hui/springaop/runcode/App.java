package com.hui.springaop.runcode;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: sssd
 * Date: 2017/11/13 17:00
 * Version: V1.0
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class App {

    public static void main(String[] args) throws Exception{
        System.out.println("Hello Spring AOP!");
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        TextManager textManager = (TextManager) factory.getBean("customerManager");
        TextManager textManager2 = (TextManager) factory.getBean("customerManager2");
        textManager.showText("E:\\Work\\bigdatademo\\sparkrdd\\src\\main\\resources\\spark.txt");
        textManager2.showText("E:\\Work\\bigdatademo\\sparkrdd\\src\\main\\resources\\spark1.txt");
    }

}
