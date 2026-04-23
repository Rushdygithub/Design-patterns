package FunctionalInterface;

import java.util.logging.Filter;

public class Main {
    public static void main(String[] args) {
        Employee employee = new  Employee() {
            @Override
            public String getEmployeeName(String name) {
                return name;
            }
        };


        Employee employee1 = (name) -> {
            return name + " works in the IT department.";
        };

        System.out.println(employee.getEmployeeName("John Doe"));
        System.out.println(employee1.getEmployeeName("John Doe"));


    }
}
