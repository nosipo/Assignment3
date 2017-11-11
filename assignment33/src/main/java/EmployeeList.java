public class EmployeeList {

    String name;
    String field;

    public EmployeeList ()
    {

    }

    public EmployeeList (String nm, String fld)
    {
        name = nm;
        field = fld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString()
    {
        return "Employee Name: " + name + "\n" + "Field Name: " + field;
    }


}
