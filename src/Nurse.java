public class Nurse extends Member implements Implementable {

    private String arm;

    public String getArm() {
        return arm;
    }

    public void setArm(String arm) {
        this.arm = arm;
    }


    public Nurse(String ID, String name, String salary, String mail,String phone, String arm) {
        super(ID, name, salary, mail, phone);
        this.arm = arm;
    }

    public Nurse() {
        this.arm = null;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Arm: " + arm);
    }

}
