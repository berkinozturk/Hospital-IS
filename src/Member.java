public class Member implements Implementable {  // Superclass

    private String ID;
    private String name;
    private String salary;
    private String mail;
    private String phone;

    public Member(String ID, String name, String salary, String mail, String phone) {  //Constructor
        this.setID(ID);
        this.setName(name);
        this.setSalary(salary);
        this.setMail(mail);
        this.setPhone(phone);
    }
    public Member(String ID, String name, String salary, String mail) {    //Overriding the Member Constructor
        this.setID(ID);
        this.setName(name);
        this.setSalary(salary);
        this.setMail(mail);
        this.setPhone(null);
    }
    public Member()  {      //Default Constructor
        this.setID(null);
        this.setName(null);
        this.setSalary(null);
        this.setMail(null);
        this.setPhone(null);
    }
    @Override
    public void display () {        //This is the method which displays member's info
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Mail: " + getMail());
        System.out.println("Phone: " + getPhone());
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
