public class Doctor extends Member implements Implementable { //Subclass

    private String branch;
    private String diplomaNumber ;

    public Doctor(String ID, String name, String salary, String mail, String phone,String branch, String diplomaNumber) {   //Here we use inheritance for Doctor
        super(ID,name,salary,mail,phone);
        this.setBranch(branch);
        this.setDiplomaNumber(diplomaNumber);
    }

    public Doctor() {
        this.branch = null;
        this.diplomaNumber= null;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Branch: " + branch);
        System.out.println("Diploma Number: " + diplomaNumber);
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDiplomaNumber() {
        return diplomaNumber;
    }

    public void setDiplomaNumber(String diplomaNumber) {
        this.diplomaNumber = diplomaNumber;
    }

}
