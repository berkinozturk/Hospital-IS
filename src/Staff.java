public class Staff extends Member implements Implementable {  //Subclass

    private String department;

    public Staff() {
        this.department=null;
    }

    public Staff(String ID, String name, String salary, String mail, String phone, String department) {     //Constructor
        super(ID, name, salary, mail, phone);
        this.department = department;
    }
    @Override
    public void display () {
        super.display();
        System.out.println("Department: " + getDepartment());

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }



}
