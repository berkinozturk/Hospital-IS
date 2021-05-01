
public class Menu  {
    public static void mainmenu() {
        System.out.println("1-->HELP");
        System.out.println("2-->SEARCH ENTRY");
        System.out.println("3-->NEW ENTRY");
        System.out.println("4-->DELETE ENTRY");
        System.out.println("5-->MODIFY ENTRY");
        System.out.println("6-->HOSPITAL STATUS");
        System.out.println("7-->EXIT");
    }

    public static void newentery() {
        System.out.println("1-->NEW DOCTOR");
        System.out.println("2-->NEW STAFF");
        System.out.println("3-->NEW NURSE");
        System.out.println("4-->NEW PATIENT");
    }

    public static void delentery() {
        System.out.println("1-->DELETE DOCTOR");
        System.out.println("2-->DELETE STAFF");
        System.out.println("3-->DELETE NURSE");
        System.out.println("4-->DELETE PATIENT");
    }

    public static void modentry() {
        System.out.println("1-->MODIFY DOCTOR");
        System.out.println("2-->MODIFY NURSE");
        System.out.println("3-->MODIFY STAFF");
        System.out.println("4-->MODIFY PATIENT");
    }

    public static void srcentery() {
        System.out.println("1-->SEARCH DOCTOR");
        System.out.println("2-->SEARCH STAFF");
        System.out.println("3-->SEARCH NURSE");
        System.out.println("4-->SEARCH PATIENT");
    }

    public static void srccrit() {
        System.out.println("1-->SEARCH BY ID");
        System.out.println("2-->SEARCH BY NAME");
    }

    public static void doctormod() {
        System.out.println("1-->MODIFY ID");
        System.out.println("2-->MODIFY NAME");
        System.out.println("3-->MODIFY SALARY");
        System.out.println("4-->MODIFY MAIL");
        System.out.println("5-->MODIFY PHONE");
        System.out.println("6-->MODIFY BRANCH");
        System.out.println("7-->MODIFY DIPLOMA NUMBER");
        System.out.println("8-->CONTINUE");
    }

    public static void nursemod() {
        System.out.println("1-->MODIFY ID");
        System.out.println("2-->MODIFY NAME");
        System.out.println("3-->MODIFY SALARY");
        System.out.println("4-->MODIFY MAIL");
        System.out.println("5-->MODIFY PHONE");
        System.out.println("6-->MODIFY ARM");
        System.out.println("7-->CONTINUE");
    }

    public static void staffmod() {
        System.out.println("1-->MODIFY ID");
        System.out.println("2-->MODIFY NAME");
        System.out.println("3-->MODIFY SALARY");
        System.out.println("4-->MODIFY MAIL");
        System.out.println("5-->MODIFY PHONE");
        System.out.println("6-->MODIFY DEPARTMENT");
        System.out.println("7-->CONTINUE");
    }

    public static void patientmod() {
        System.out.println("1-->MODIFY NAME");
        System.out.println("2-->MODIFY AGE");
        System.out.println("3-->MODIFY DISEASE");
        System.out.println("4-->CONTINUE");
    }

    public static void deleteays() {
        System.out.println("1-->DELETE ENTRY");
        System.out.println("2-->ABORT");
    }

    public static void supermenu() {
        System.out.println("1-->LIST ALL DOCTORS");
        System.out.println("2-->LIST ALL NURSES");
        System.out.println("3-->LIST ALL STAFF");
        System.out.println("4-->LIST ALL PATIENTS");
        System.out.println("5-->CONTINUE TO MAIN MENU");

    }
    public static void helptext() {
        System.out.println("Please select your option by pressing numbers between 1 and 7 for main menu.");
        System.out.println("This is a hospital program which provides adding, editing, removing, and listing members.");
        System.out.println("If you want to create a back up of your data, you can just copy all the .txt files on the installation directory.");
        System.out.println("All of the data created or deleted data will be saved on permanent storage.");
        System.out.println("This means that when the program terminated you can still see all of the data on the hard drive.");
        System.out.println("This program was developed by Arman Çelik, Sarp Ali Saygı, Berkin Öztürk by using eclipse and Intellij IDEA.");
    }


}
