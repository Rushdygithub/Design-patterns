package FunctionalInterface;

@FunctionalInterface
public interface Employee {
    public String getEmployeeName(String name);
    public default String getEmployeeDepartment(String department) {
        return department;
    }
    //public String getEmployeeId(String id);
}
