import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;

public class Login implements Implementable {

    @Override
    public void display() {
        System.out.println("*******************************************************************************************************");

    }
    private String UserName;
    private String Password;
    private boolean add;
    private boolean remove;
    private boolean modify;
    private boolean search;
    private boolean nurse=false;
    private boolean doctor=false;
    private boolean supervisor=false;


    //This is a polymorphic method which differentiates objects
    public void policy(Object object) {

        if(object instanceof Doctor) {
            setAdd(true);
            setRemove(true);
            setModify(true);
            setSearch(true);
        }
        else if (object instanceof Nurse) {
            setAdd(false);
            setRemove(false);
            setModify(true);
            setSearch(true);
        }
        else {
            setAdd(false);
            setRemove(false);
            setModify(false);
            setSearch(false);
        }

    }

    public void login (ArrayList<Doctor> doctors, ArrayList<Nurse> nurses) {
        Scanner input = new Scanner(System.in);
        boolean username = false;
        boolean password = false;
        Doctor doc = new Doctor();
        Nurse nur = new Nurse();
        display();
        System.out.println("Welcome to Hospital...");
        display();
        int giris_hakki = 3;

        while (true) {

            if (giris_hakki == 0) {
                display();
                System.err.println("Terminating...");
                exit(0);
            }
            System.out.print("User Name: ");
            String tempName = input.next();
            System.out.print("Password: ");
            String tempPswrd = input.next();

            for (int i = 0; i < doctors.size(); i++) {      //Check the username and password configuration for doctors
                setUserName(doctors.get(i).getName());
                setPassword(doctors.get(i).getID());
                if (tempName.equals(UserName) && tempPswrd.equals(Password)) {
                    username = true;
                    setDoctor(true);
                    password = true;
                    setDoctor(true);
                }


            }
            for (int i = 0; i < nurses.size(); i++) {      //Check the username and password configuration for nurses
                setUserName(nurses.get(i).getName());
                setPassword(nurses.get(i).getID());
                if (tempName.equals(UserName) && tempPswrd.equals(Password)) {
                    username = true;
                    setNurse(true);
                    password = true;
                    setNurse(true);
                }
            }

            if (tempName.equals("Ilker") && tempPswrd.equals("Korkmaz")) {      //Admin mode: ACTIVATED
                username=true;
                password=true;
                setAdd(true);
                setRemove(true);
                setModify(true);
                setSearch(true);
                setSupervisor(true);
                System.err.println("WARNING: You are logged in as supervisor.");
                System.err.println("Supervisor Username: " + tempName);
                break;
            }

            if (username == true && password == true) {
                System.out.println("Welcome " + tempName);
                if (isDoctor()) {
                    policy(doc);
                    System.out.println("User Group: Doctors" );
                }
                else if (isNurse()) {
                    policy(nur);
                    System.out.println("User Group: Nurses" );

                }
                break;
            }
            else if (username==false && password==true) {
                System.err.println("ERROR: User name or password incorrect.");
                giris_hakki--;
            } else if (username==true && password==false) {
                System.err.println("ERROR: User name or password incorrect. Please try again...");
                giris_hakki--;
            } else if (username==false && password==false) {
                System.err.println("ERROR: User name and password incorrect. Please try again...");
                giris_hakki--;
            }
            else {
                System.err.println("ERROR: UNKNOWN on LOGIN/Please contact with developers.");
                giris_hakki--;
            }
            System.out.println("Remaining login attempts: " + giris_hakki);



        }

    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public boolean isRemove() {
        return remove;
    }

    public void setRemove(boolean remove) {
        this.remove = remove;
    }

    public boolean isModify() {
        return modify;
    }

    public void setModify(boolean modify) {
        this.modify = modify;
    }

    public boolean isSearch() {
        return search;
    }

    public void setSearch(boolean search) {
        this.search = search;
    }
    public boolean isSupervisor() {
        return supervisor;
    }

    public void setSupervisor(boolean supervisor) {
        this.supervisor = supervisor;
    }

    public boolean isNurse() {
        return nurse;
    }

    public void setNurse(boolean nurse) {
        this.nurse = nurse;
    }

    public boolean isDoctor() {
        return doctor;
    }

    public void setDoctor(boolean doctor) {
        this.doctor = doctor;
    }
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
