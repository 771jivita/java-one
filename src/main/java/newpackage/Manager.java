package newpackage;


class Manager extends Members {
    private String department;
    public String getDepartment(){
return department;
}
public void setDepartment(String department){
this.department=department;
}
public static void main(String args[]){
Manager manager=new Manager();
Employee employee=new Employee();
employee.setSpecialization("Abchjhd");
System.out.println(employee.getSpecialization());
manager.setName("Abcd");
System.out.println(manager.getName());
manager.setAddress("Abcder");
System.out.println(manager.getAddress());
manager.setAge(20);
System.out.println(manager.getAge());
manager.setSalary(50000);
System.out.println(manager.getSalary());
manager.setPhoneNo(9814930737.0);
System.out.println(manager.getName());
}}

