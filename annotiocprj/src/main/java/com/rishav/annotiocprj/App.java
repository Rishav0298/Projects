package com.rishav.annotiocprj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyMessageConfig.class,AnotherBean.class);
        
        //ctx.register(MyMessageConfig.class);
        
        MyMessage message1 = ctx.getBean(MyMessage.class);
        
        message1.setMessage("Hi from annotation based bean");
        message1.getMessage();
        
        MyMessage byqMessage = ctx.getBean(MyMessage.class);
        
        byqMessage.setMessage("Bye from annotation based bean");
        byqMessage.getMessage();
    }
}
