package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SimpleCustomerLogger logger = context.getBean(SimpleCustomerLogger.class);
        logger.log();
    }
}