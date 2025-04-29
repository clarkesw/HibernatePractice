
package com.coupon.test;


public class Employee {
    private int id;
    private String name;
    private int age;
    private int salary;
    private EmployeeType type;
    private Department dept;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee(int id, String name, Department dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public Employee(String name, int age, EmployeeType type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public Employee(String name, int age, Department dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public EmployeeType getType() {
        return type;
    }

    @Override
    public String toString() {
        if(this.age == 0){
            return "Employee{" + "name=" + name + '\t' + ", id=" + id + ", dept=" + dept + '}';
        }
        return "Employee{" + "name=" + name + ", age=" + age + '}';
    }
}

enum EmployeeType{
    GOOD, OK, BAD;
}

enum Department{
    IT, BUS, FIN;
}

//        List<Employee> employees = Arrays.asList(
//                new Employee("Mason", 25, EmployeeType.GOOD),
//                new Employee("Olivia", 35, EmployeeType.OK),
//                new Employee("Liam", 28, EmployeeType.BAD),
//                new Employee("Sophia", 42, EmployeeType.GOOD),
//                new Employee("Noah", 22, EmployeeType.OK),
//                new Employee("Isabella", 30, EmployeeType.GOOD)
//        );


//        Map<BlogPostType, List<BlogPost>> postsPerType = posts.stream()
//                .collect(Collectors.groupingBy(BlogPost::getType));
//        List<Employee> employees = Arrays.asList(
//                new Employee("Mason", 25, Department.BUS),
//                new Employee("Liam", 28, Department.IT),
//                new Employee("Sophia", 42, Department.FIN),
//                new Employee("Olivia", 35, Department.FIN),
//                new Employee("Noah", 22, Department.IT),
//                new Employee("Isabella", 30, Department.BUS)
//        );
//
//        Map<Department, List<Employee>> collect = employees.stream()
//                        .collect(Collectors.groupingBy(Employee::getDept));
//        
//        for (Department et : Department.values()) {
//             List<Employee> end = collect.get(et).stream()
//                     .sorted(Comparator.comparing(Employee:: getAge))
//                     .toList();
//            System.out.println(et.toString() + " " + end); 
//        }   