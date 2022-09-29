import java.lang.*;
import java.util.*;
class Employee{
    int age;
    double salary;
    String name;
    public Employee(int Age, double Salary, String Name) {
        age = Age;
        salary = Salary;
        name = Name;
    }

}
class Sortbysalary implements Comparator<Employee> {

    // Method
    // Sorting in ascending order of name
    public int compare(Employee a, Employee b)
    {
        return (int)(a.salary - b.salary);
    }
}

class Sortbyname implements Comparator<Employee> {

    // Method
    // Sorting in ascending order of name
    public int compare(Employee a, Employee b)
    {
        return a.name.compareTo(b.name);
    }
}

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Employee> ar = new ArrayList<Employee>();
        ar.add(new Employee(50, 150000.0, "Rohan"));
        ar.add(new Employee(43, 402000.5, "Mohan"));
        ar.add(new Employee(29, 133000.8, "Sohan"));
        Collections.sort(ar, new Sortbysalary());
        System.out.println("sorted according to salary");
        for (int i = 0; i < ar.size(); i++){
            System.out.print(ar.get(i).name + " ");
            System.out.print(ar.get(i).salary+ " ");
            System.out.println(ar.get(i).age);
        }
        Collections.sort(ar, new Sortbyname());
        System.out.println("sorted according to name");
        for (int i = 0; i < ar.size(); i++){
            System.out.print(ar.get(i).name + " ");
            System.out.print(ar.get(i).salary+ " ");
            System.out.println(ar.get(i).age);
        }
    }
}