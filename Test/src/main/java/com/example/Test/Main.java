package com.example.Test;

//import com.example.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initialize the Spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class.getPackage().getName());

        // Retrieve the EmployeeBean object
        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);

        // Print employee and department details
        System.out.println("Employee Name: " + employeeBean.getEmployeeName());
        System.out.println("Department Name: " + employeeBean.getDepartmentName());
    }
}
