import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListTest {

    private List<EmployeeList> employees;
    private EmployeeList emp1, emp2, emp3;

    @Test
    public void testOne() {
        employees = new ArrayList<EmployeeList>();


        emp1 = new EmployeeList();
        emp1.setName("Mbali The Ranger");
        emp1.setField("Doctor");

        emp2 = new EmployeeList();
        emp2.setName("Miriam Daniels");
        emp2.setField("Teacher");

        emp3 = new EmployeeList();
        emp3.setName("Peter Hain");
        emp3.setField("Policeman");

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        Assert.assertNotNull(employees);
        Assert.assertEquals(employees.size(), 3);
    }

}