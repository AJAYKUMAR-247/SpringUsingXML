package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        // We have created a project using maven, it is not a spring or java project.

        // We know that spring requires a container, so we'll create a container
        // To create that container we need a context, to add that we need to add a dependency(Spring context) in a pom.xml file

        // There are so many ways to create a context now we're using ClassPathXmlApplicationContext to create a context.
        // We have to pass the file, in which the xml config beans are there.
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // While creating and passing the file only, objects for all the beans in that file will be created.

        // We're going to create a obj using spring
        // But how spring knows which and all class, it's going to take care of
        // That we can say in three ways, 1. Using XML file, 2. java Configurations, 3. using Annotations
        // Now we're going to use XML file.

        Alien obj = (Alien) context.getBean("alien");// We have to do typeCasting here because, this getBean'll return a obj, but we need Alien obj.
        obj.setAge(21);
        obj.code();

        // When you try to create a obj for already created object, it will not create, because in spring scopes matter
        // In Spring there are only two scopes, which are singleton and prototype.
        // By default spring will follow singleton, that's why no matter how many times you're calling the getBean for a same class, it is creating a same class.
        Alien obj1 = (Alien) context.getBean("alien");
        System.out.println(obj1.getAge());

        // The prototype scope will create a new obj, whenever the getBean is called
        Laptop lap1 = (Laptop) context.getBean("lap");
        lap1.setLapPrice(30000);
        System.out.println(lap1.LapPrice);

        Laptop lap2 = (Laptop) context.getBean("lap");
        System.out.println(lap2.LapPrice);


        // Setter Injection
        Laptop lap3 = (Laptop) context.getBean("lap1");
        System.out.println(lap3.LapPrice);


        // Constructor Injection
        Student stu = (Student) context.getBean("student");
        System.out.println(stu.getLap());

        Desktop desktop = (Desktop) context.getBean("Des");

        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee.getCom());

        MacBook macBook = (MacBook) context.getBean("com");
        System.out.println(macBook);

        Employee employee1 = (Employee) context.getBean("employee1");
        System.out.println(employee1.getCom());

        // If you saw above we're using the method getBean(), which will return a obj
        // There is a another class which will return a object of type in which class object we want
        Employee employee2 = context.getBean("employee1", Employee.class);
        // This will return the Employee object directly

        // There is one more method, which will take only one parameter as type of object we want
        // But in the xml file if same type of beans available more than one, then we have to make any one a primary=true, so that it will create obj of that
        Employee employee3 = context.getBean(Employee.class);
    }
}
