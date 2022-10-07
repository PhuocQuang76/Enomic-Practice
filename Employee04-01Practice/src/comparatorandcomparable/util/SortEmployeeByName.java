package comparatorandcomparable.util;

import comparatorandcomparable.entities.Employee;

import java.util.Comparator;

public class SortEmployeeByName implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }

}
