package org; /**Приложение для использования возможностей Apache-servicemix*/


import java.util.Scanner;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;



public class Main {
    public static void main(String args[]) throws Exception {

        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new RouteBuilder() {
            public void configure() {
                from("file:/home/alex/mnt/apache-servicemix-6.1.3/camel/outbox/?noop=true").to("file:/home/alex/mnt/apache-servicemix-6.1.3/camel/inbox/" + "");
            }
        });
        context.start();
        System.out.println("По нажатию клавиши enter произойдет формирование XML-файла и отправка " +'\n'+
                "в директорию ../apache-servicemix-6.1.3/camel/outbox, " + '\n'+
                "далее средствами приложения отправится в ../apache-servicemix-6.1.3/camel/inbox" + '\n'+
                "При запущенном сервере apache-servicemix-6.1.3 c установленным Apache Сamel " + '\n'+
                "содержимое переместится в папку ../apache-servicemix-6.1.3/camel/outbox");
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
        System.out.println("Таким образом, осуществлена простейшая интеграция с сервисом Apache Service Mix ");
        context.stop();
    }
}