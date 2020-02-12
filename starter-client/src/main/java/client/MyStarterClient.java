package client;

import library.MyLibraryClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyStarterClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MyStarterClient.class, args);

        MyLibraryClass myLibraryClassByClass = applicationContext.getBean(MyLibraryClass.class);
        myLibraryClassByClass.printInfo();

        //library.MyLibraryClass myLibraryClass = (library.MyLibraryClass) applicationContext.getBean("myLibraryClass");
        //myLibraryClass.printInfo();
    }
}
