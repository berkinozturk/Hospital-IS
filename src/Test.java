
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Test extends Lists implements Implementable {

    @Override
    public void display() {
        System.out.println("***************************************************************************************************************************************");

    }
    //Create ask method with try/cache in order to except error: InputMismatch
    public static int ask() {
        boolean badInput = true;
        do {
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("YOUR CHOICE :");
                int next = input .nextInt();
                if (next >= Integer.MIN_VALUE) {
                    badInput = false;
                    return next;
                } else badInput = true;
            }
            catch (InputMismatchException e) {
                System.err.println("ERROR:" + e);
            }
            input.nextLine();
        } while (badInput);
        badInput = true;
        return 404;
    }
    public static void main(String[] args) throws IOException {
        //Check the number of people in hospital.
        File dcapacity = new File("doctor_capacity.txt");
        File ncapacity = new File("nurse_capacity.txt");
        File scapacity = new File("staff_capacity.txt");
        File pcapacity = new File("pat_capacity.txt");
        if (!dcapacity.exists()) {
            dcapacity.createNewFile();
            FileWriter fr27 = new FileWriter(dcapacity, false);
            BufferedWriter bw27 = new BufferedWriter(fr27);
            bw27.write(String.valueOf(0));
            bw27.close();
        }
        if (!ncapacity.exists()) {
            ncapacity.createNewFile();
            FileWriter fr28 = new FileWriter(ncapacity, false);
            BufferedWriter bw28 = new BufferedWriter(fr28);
            bw28.write(String.valueOf(0));
            bw28.close();
        }
        if (!scapacity.exists()) {
            scapacity.createNewFile();
            FileWriter fr29 = new FileWriter(scapacity, false);
            BufferedWriter bw29 = new BufferedWriter(fr29);
            bw29.write(String.valueOf(0));
            bw29.close();
        }
        if (!pcapacity.exists()) {
            pcapacity.createNewFile();
            FileWriter fr30 = new FileWriter(pcapacity, false);
            BufferedWriter bw30 = new BufferedWriter(fr30);
            bw30.write(String.valueOf(0));
            bw30.close();
        }

        FileReader fileReader = new FileReader(dcapacity);
        BufferedReader br = new BufferedReader(fileReader);

        String dcapa = br.readLine();
        int dcap=Integer.parseInt(dcapa);
        br.close();

        FileReader fileReader2 = new FileReader(ncapacity);
        BufferedReader br2 = new BufferedReader(fileReader2);

        String ncapa = br2.readLine();
        int ncap=Integer.parseInt(ncapa);
        br2.close();

        FileReader fileReader3 = new FileReader(scapacity);
        BufferedReader br3 = new BufferedReader(fileReader3);

        String scapa = br3.readLine();
        int scap=Integer.parseInt(scapa);
        br3.close();

        FileReader fileReader4 = new FileReader(pcapacity);
        BufferedReader br4 = new BufferedReader(fileReader4);

        String pcapa = br4.readLine();
        int pcap=Integer.parseInt(pcapa);
        br4.close();

        //Initialize objects and methods.
        Scanner scn = new Scanner(System.in);
        Test t = new Test();
        Lists list = new Lists();
        Login l = new Login();

        //Initialize temporary objects and data members.
        int option;
        int tempindex = 0;
        boolean found = false;
        String tempid, tempname, tempmail, tempsalary, tempphone, tempbranch, tempdnumber, tempage, temparm, tempdepartment, temptop;
        boolean modid = false;
        boolean modname = false;
        boolean modsalary = false;
        boolean modmail = false;
        boolean modphone = false;
        boolean modbranch = false;
        boolean moddnumber = false;
        boolean modarm = false;
        boolean modage = false;
        boolean moddepartment = false;
        boolean modtop = false;
        boolean modify = false;
        Doctor tempdoctor = new Doctor();
        Nurse tempnurse = new Nurse();
        Staff tempstaff = new Staff();
        Patient temppatient = new Patient();

        //Initialize array lists.
        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Staff>  staff = new ArrayList<>();
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Nurse> nurses = new ArrayList<>();
        for (int i = 0; i < dcap; i++) {
            doctors.add(new Doctor(null,null,null,null,null, null,null));
        }
        for (int i = 0; i < ncap; i++) {
            nurses.add(new Nurse (null,null,null,null,null,null));
        }
        for (int i = 0; i < pcap; i++) {
            patients.add(new Patient(null,null,null));
        }
        for (int i = 0; i < scap; i++) {
            staff.add(new Staff(null,null,null,null,null,null));
        }

        //Fill array lists.
        list.fillDoctorList(doctors);
        list.fillStuffList(staff);
        list.fillPatientList(patients);
        list.fillNurseList(nurses);

        //Warn user if there are not any doctor info on system.
        if(dcap==0) {
            System.err.println("WARNING: No doctor.");
            System.err.println("Please login by using supervisor username and passord.");
            System.err.println("Then please create a doctor for using the program with admin rights.");
        }
        //Check the username and password.
        l.login(doctors,nurses);

        //Start main loop.
        while (true) {
            t.display();
            Menu.mainmenu();
            if (l.isSupervisor()) System.err.println("8-->SUPERVISOR MENU");
            option=ask();
            if (option==1) {
                t.display();
                Menu.helptext();
                t.display();
            }
            else if (option==2 && l.isSearch() ) {
                t.display();
                Menu.srcentery();
                option=ask();
                if (option==1) {
                    t.display();
                    Menu.srccrit();
                    option=ask();
                    if (option==1) {
                        System.out.println("Please enter doctor ID:");
                        tempid = scn.next();
                        for (int i=0; i<doctors.size();i++) {
                            if (doctors.get(i).getID().equals(tempid) ) {
                                doctors.get(i).display();
                                found=true;
                            }
                        }
                        if (found==false) {
                            System.err.println("ERROR: Doctor not found.");
                            System.out.println();
                        }
                    }

                    else if (option==2) {
                        System.out.println("Please enter doctor name:");
                        tempname = scn.next();
                        for (int i=0; i<doctors.size();i++) {
                            if (doctors.get(i).getName().equals(tempname)) {
                                doctors.get(i).display();
                                found=true;
                            }
                        }
                        if (found==false) {
                            System.err.println("ERROR: Doctor not found.");
                            System.out.println();
                        }
                    }
                }

                else if (option==2) {
                    t.display();
                    Menu.srccrit();
                    option=ask();
                    if (option==1) {
                        System.out.println("Please enter staff ID:");
                        tempid = scn.next();
                        for (int i=0; i<staff.size();i++) {
                            if (staff.get(i).getID().equals(tempid)) {
                                staff.get(i).display();
                                found=true;
                            }
                        }
                        if (found==false) {
                            System.err.println("ERROR: Staff not found.");
                            System.out.println();
                        }
                    }

                    else if (option==2) {
                        System.out.println("Please enter staff name:");
                        tempname = scn.next();
                        for (int i=0; i<staff.size();i++) {
                            if (staff.get(i).getName().equals(tempname)) {
                                staff.get(i).display();
                                found=true;
                            }
                        }
                        if (found==false) {
                            System.err.println("ERROR: Staff not found.");
                            System.out.println();
                        }
                    }
                }

                else if (option==3) {
                    t.display();
                    Menu.srccrit();
                    option=ask();
                    if (option==1) {
                        System.out.println("Please enter nurse ID:");
                        tempid = scn.next();
                        for (int i=0; i<nurses.size();i++) {
                            if (nurses.get(i).getID().equals(tempid)) {
                                nurses.get(i).display();
                                found=true;
                            }
                        }
                        if (found==false) {
                            System.err.println("ERROR: Nurse not found.");
                            System.out.println();
                        }
                    }

                    else if (option==2) {
                        System.out.println("Please enter nurse name:");
                        tempname = scn.next();
                        for (int i=0; i<nurses.size();i++) {
                            if (nurses.get(i).getName().equals(tempname)) {
                                nurses.get(i).display();
                                found=true;
                            }
                        }
                        if (found==false) {
                            System.err.println("ERROR: Nurse not found.");
                            System.out.println();
                        }
                    }

                }

                else if (option==4) {
                    System.out.println("Please enter patient name:");
                    tempname = scn.next();
                    for (int i=0; i<patients.size();i++) {
                        if (patients.get(i).getName().equals(tempname)) {
                            patients.get(i).display();
                            found=true;
                        }
                    }
                    if (found==false) {
                        System.err.println("ERROR: Patient not found.");
                        System.out.println();
                    }
                }

            }
            else if (option==3 && l.isAdd()) {
                t.display();
                Menu.newentery();
                option=ask();
                if (option==1) {
                    System.out.println("Please enter doctor ID");
                    tempid=scn.next();
                    System.out.println("Please enter doctor name");
                    tempname=scn.next();
                    System.out.println("Please enter doctor e-mail");
                    tempmail=scn.next();
                    System.out.println("Please enter doctor salary");
                    tempsalary=scn.next();
                    System.out.println("Please enter doctor phone");
                    tempphone=scn.next();
                    System.out.println("Please enter doctor branch");
                    tempbranch=scn.next();
                    System.out.println("Please enter doctor diploma number");
                    tempdnumber=scn.next();
                    dcap++;
                    doctors.add(new Doctor(tempid,tempname,tempsalary,tempmail,tempphone,tempbranch,tempdnumber));
                    System.out.println("Doctor " + tempname + " added successfully.");
                }

                else if (option==2) {
                    System.out.println("Please enter staff ID");
                    tempid=scn.next();
                    System.out.println("Please enter staff name");
                    tempname=scn.next();
                    System.out.println("Please enter staff e-mail");
                    tempmail=scn.next();
                    System.out.println("Please enter staff salary");
                    tempsalary=scn.next();
                    System.out.println("Please enter staff phone");
                    tempphone=scn.next();
                    System.out.println("Please enter staff department");
                    tempdepartment=scn.next();
                    scap++;
                    staff.add(new Staff(tempid,tempname,tempsalary,tempmail,tempphone,tempdepartment));
                    System.out.println("Staff " + tempname + " added successfully.");
                }

                else if (option==3) {
                    System.out.println("Please enter nurse ID");
                    tempid=scn.next();
                    System.out.println("Please enter nurse name");
                    tempname=scn.next();
                    System.out.println("Please enter nurse e-mail");
                    tempmail=scn.next();
                    System.out.println("Please enter nurse salary");
                    tempsalary=scn.next();
                    System.out.println("Please enter nurse phone");
                    tempphone=scn.next();
                    System.out.println("Please enter nurse arm");
                    temparm=scn.next();
                    ncap++;
                    nurses.add(new Nurse(tempid,tempname,tempsalary,tempmail,tempphone,temparm));
                    System.out.println("Nurse " + tempname + " added successfully.");
                }

                else if (option==4) {
                    System.out.println("Please enter patient name");
                    tempname=scn.next();
                    System.out.println("Please enter patient age");
                    tempage=scn.next();
                    System.out.println("Please enter patient' disease");
                    temptop=scn.next();
                    pcap++;
                    patients.add(new Patient(tempname,tempage,temptop));
                    System.out.println("Patient " + tempname + " added successfully.");
                }

            }
            else if (option==4 && l.isRemove()) {
                Menu.delentery();
                option=ask();
                if (option==1) {
                    System.out.println("Please enter doctor ID:");
                    tempid = scn.next();
                    for (int i=0; i<doctors.size();i++) {
                        if (doctors.get(i).getID().equals(tempid) ) {
                            doctors.get(i).display();
                            tempname=doctors.get(i).getName();
                            tempindex=i;
                            found=true;
                            Menu.deleteays();
                            option=ask();
                            if(option==1) {
                                dcap--;
                                doctors.remove(tempindex);
                                System.out.println("Doctor " + tempname + " deleted successfully.");
                            }

                            else if (option==2) {
                                System.out.println("Aborted by user. No changes have been made.");
                            }
                        }
                    }
                    if (found==false) {
                        System.err.println("ERROR: Doctor not found.");
                        System.out.println();
                    }
                }
                else if (option==2) {
                    System.out.println("Please enter staff ID:");
                    tempid = scn.next();
                    for (int i=0; i<staff.size();i++) {
                        if (staff.get(i).getID().equals(tempid) ) {
                            staff.get(i).display();
                            tempname=staff.get(i).getName();
                            tempindex=i;
                            found=true;
                            Menu.deleteays();
                            option=ask();
                            if(option==1) {
                                scap--;
                                staff.remove(tempindex);
                                System.out.println("Staff " + tempname + " deleted successfully.");
                            }

                            else if (option==2) {
                                System.out.println("Aborted by user. No changes have been made.");
                            }
                        }
                    }
                    if (found==false) {
                        System.err.println("ERROR: Staff not found.");
                        System.out.println();
                    }
                }
                else if (option==3) {
                    System.out.println("Please enter nurse ID:");
                    tempid = scn.next();
                    for (int i=0; i<nurses.size();i++) {
                        if (nurses.get(i).getID().equals(tempid) ) {
                            nurses.get(i).display();
                            tempname=nurses.get(i).getName();
                            tempindex=i;
                            found=true;
                            Menu.deleteays();
                            option=ask();
                            if(option==1) {
                                ncap--;
                                nurses.remove(tempindex);
                                System.out.println("Nurse " + tempname + " deleted successfully.");
                            }

                            else if (option==2) {
                                System.out.println("Aborted by user. No changes have been made.");
                            }
                        }
                    }
                    if (found==false) {
                        System.err.println("ERROR: Nurse not found.");
                        System.out.println();
                    }
                }
                else if (option==4) {
                    System.out.println("Please enter patient name:");
                    tempname = scn.next();
                    for (int i=0; i<patients.size();i++) {
                        if (patients.get(i).getName().equals(tempname) ) {
                            patients.get(i).display();
                            tempname=patients.get(i).getName();
                            tempindex=i;
                            found=true;
                            Menu.deleteays();
                            option=ask();
                            if(option==1) {
                                pcap--;
                                patients.remove(tempindex);
                                System.out.println("Patient " + tempname + " deleted successfully.");
                            }

                            else if (option==2) {
                                System.out.println("Aborted by user. No changes have been made.");
                            }
                        }
                    }
                    if (found==false) {
                        System.err.println("ERROR: Patient not found.");
                        System.out.println();
                    }
                }
            }
            else if (option==5 && l.isModify()) {
                t.display();
                Menu.modentry();
                option=ask();
                if (option==1) {
                    System.out.println("Please enter doctor's ID");
                    tempid=scn.next();
                    for (int i=0; i<doctors.size();i++) {
                        if (doctors.get(i).getID().equals(tempid) ) {
                            doctors.get(i).display();
                            tempdoctor=doctors.get(i);
                            tempindex = i;
                            found=true;
                            modify=true;
                        }
                    }
                    if (found==false) {
                        System.err.println("ERROR: Doctor not found.");
                        System.out.println();
                    }
                    while(modify) {
                        Menu.doctormod();
                        option=ask();
                        System.out.println("Add criteria or continue");
                        if (option==1) modid = true;
                        if (option==2) modname = true;
                        if (option==3) modsalary = true;
                        if (option==4) modmail = true;
                        if (option==5) modphone = true;
                        if (option==6) modbranch = true;
                        if (option==7) moddnumber = true;
                        if (option==8) break;
                    }
                    if (modid) {
                        System.out.println("Please enter new ID");
                        tempid=scn.next();
                        tempdoctor.setID(tempid);
                    }
                    if (modname) {
                        System.out.println("Please enter new name");
                        tempname=scn.next();
                        tempdoctor.setName(tempname);
                    }
                    if (modsalary) {
                        System.out.println("Please enter new salary");
                        tempsalary=scn.next();
                        tempdoctor.setSalary(tempsalary);
                    }
                    if (modmail) {
                        System.out.println("Please enter new name");
                        tempmail=scn.next();
                        tempdoctor.setMail(tempmail);
                    }
                    if (modphone) {
                        System.out.println("Please enter new phone");
                        tempphone=scn.next();
                        tempdoctor.setPhone(tempphone);
                    }
                    if (modbranch) {
                        System.out.println("Please enter new branch");
                        tempbranch=scn.next();
                        tempdoctor.setBranch(tempbranch);
                    }
                    if (moddnumber) {
                        System.out.println("Please enter new diploma number");
                        tempdnumber=scn.next();
                        tempdoctor.setDiplomaNumber(tempdnumber);
                    }
                    doctors.set(tempindex, tempdoctor);
                    System.out.println(" Doctor with ID " + tempid + " modified successfully.");

                }
                else if (option==2) {
                    System.out.println("Please enter nurse's ID");
                    tempid=scn.next();
                    for (int i=0; i<nurses.size();i++) {
                        if (nurses.get(i).getID().equals(tempid) ) {
                            nurses.get(i).display();
                            tempnurse=nurses.get(i);
                            tempindex = i;
                            found=true;
                            modify=true;
                        }
                    }
                    if (found==false) {
                        System.err.println("ERROR: Nurse not found.");
                        System.out.println();
                    }
                    while(modify) {
                        Menu.nursemod();
                        option=ask();
                        System.out.println("Add criteria or continue");
                        if (option==1) modid = true;
                        if (option==2) modname = true;
                        if (option==3) modsalary = true;
                        if (option==4) modmail = true;
                        if (option==5) modphone = true;
                        if (option==6) modarm = true;
                        if (option==7) break;

                    }
                    if (modid) {
                        System.out.println("Please enter new ID");
                        tempid=scn.next();
                        tempnurse.setID(tempid);
                    }
                    if (modname) {
                        System.out.println("Please enter new name");
                        tempname=scn.next();
                        tempnurse.setName(tempname);
                    }
                    if (modsalary) {
                        System.out.println("Please enter new salary");
                        tempsalary=scn.next();
                        tempnurse.setSalary(tempsalary);
                    }
                    if (modmail) {
                        System.out.println("Please enter new name");
                        tempmail=scn.next();
                        tempnurse.setMail(tempmail);
                    }
                    if (modphone) {
                        System.out.println("Please enter new phone");
                        tempphone=scn.next();
                        tempnurse.setPhone(tempphone);
                    }
                    if (modarm) {
                        System.out.println("Please enter new arm");
                        temparm=scn.next();
                        tempnurse.setArm(temparm);
                    }

                    nurses.set(tempindex, tempnurse);
                    System.out.println(" Nurse with ID  " + tempid + " modified successfully.");

                }
                else if (option==3) {
                    System.out.println("Please enter staff's ID");
                    tempid=scn.next();
                    for (int i=0; i<staff.size();i++) {
                        if (staff.get(i).getID().equals(tempid) ) {
                            staff.get(i).display();
                            tempstaff=staff.get(i);
                            tempindex = i;
                            found=true;
                            modify=true;
                        }
                    }
                    if (found==false) {
                        System.err.println("ERROR: Staff not found.");
                        System.out.println();
                    }
                    while(modify) {
                        Menu.staffmod();
                        option=ask();
                        System.out.println("Add criteria or continue");
                        if (option==1) modid = true;
                        if (option==2) modname = true;
                        if (option==3) modsalary = true;
                        if (option==4) modmail = true;
                        if (option==5) modphone = true;
                        if (option==6) moddepartment = true;
                        if (option==7) break;

                    }
                    if (modid) {
                        System.out.println("Please enter new ID");
                        tempid=scn.next();
                        tempstaff.setID(tempid);
                    }
                    if (modname) {
                        System.out.println("Please enter new name");
                        tempname=scn.next();
                        tempstaff.setName(tempname);
                    }
                    if (modsalary) {
                        System.out.println("Please enter new salary");
                        tempsalary=scn.next();
                        tempstaff.setSalary(tempsalary);
                    }
                    if (modmail) {
                        System.out.println("Please enter new name");
                        tempmail=scn.next();
                        tempstaff.setMail(tempmail);
                    }
                    if (modphone) {
                        System.out.println("Please enter new phone");
                        tempphone=scn.next();
                        tempstaff.setPhone(tempphone);
                    }
                    if (modarm) {
                        System.out.println("Please enter new arm");
                        tempdepartment=scn.next();
                        tempstaff.setDepartment(tempdepartment);
                    }

                    staff.set(tempindex, tempstaff);
                    System.out.println(" Staff with ID  " + tempid + " modified successfully.");

                }

                else if (option==4) {
                    System.out.println("Please enter patient's name");
                    tempname=scn.next();
                    for (int i=0; i<patients.size();i++) {
                        if (patients.get(i).getName().equals(tempname) ) {
                            patients.get(i).display();
                            temppatient=patients.get(i);
                            tempindex = i;
                            found=true;
                            modify=true;
                        }
                    }
                    if (found==false) {
                        System.err.println("ERROR: Patient not found.");
                        System.out.println();
                    }
                    while(modify) {
                        Menu.patientmod();
                        option=ask();
                        System.out.println("Add criteria or continue");
                        if (option==1) modname = true;
                        if (option==2) modage = true;
                        if (option==3) modtop = true;
                        if (option==4) break;

                    }

                    if (modname) {
                        System.out.println("Please enter new name");
                        tempname=scn.next();
                        temppatient.setName(tempname);
                    }
                    if (modage) {
                        System.out.println("Please enter new age");
                        tempage=scn.next();
                        temppatient.setAge(tempage);
                    }
                    if (modtop) {
                        System.out.println("Please enter new type of disease");
                        temptop=scn.next();
                        temppatient.setTypeOfDisease(temptop);
                    }

                    patients.set(tempindex, temppatient);
                    System.out.println(" Patient with name  " + tempname + " modified successfully.");

                }

            }
            else if (option==6) {
                t.display();
                System.out.println("Doctors: " + dcap);
                System.out.println("Nurses: " + ncap);
                System.out.println("Staff : " + scap);
                System.out.println("Patients: " + pcap);
                t.display();

            }
            else if (option==7) {
                t.display();
                System.out.println("Saving data...");
                break;
            }

            else if(option==8 && l.isSupervisor()) {
                while(true) {
                    Menu.supermenu();
                    option=ask();
                    if (option==1) 	for (int i=0; i<doctors.size(); i++) doctors.get(i).display();

                    else if (option==2) for (int i=0; i<nurses.size(); i++) nurses.get(i).display();

                    else if(option==3) for (int i=0; i<staff.size(); i++) staff.get(i).display();

                    else if(option==4) for (int i=0; i<patients.size(); i++) patients.get(i).display();

                    else if (option==5) break;
                }
            }
            else System.err.println("ERROR: Access denied.");

            //Reset parameters.
            found=false;
            modid = false;
            modname = false;
            modsalary = false;
            modmail = false;
            modphone = false;
            modbranch = false;
            moddnumber = false;
            modarm = false;
            modage = false;
            moddepartment = false;
            modtop = false;
            modify = false;
        }


        //Save the data.
        FileWriter fr = new FileWriter(doctorID, false);
        BufferedWriter bw = new BufferedWriter(fr);
        for (int i = 0; i < doctors.size(); i++) {
            bw.write("\n" + doctors.get(i).getID());
        }
        bw.close();

        FileWriter fr2 = new FileWriter(doctorName, false);
        BufferedWriter bw2 = new BufferedWriter(fr2);
        for (int i = 0; i < doctors.size(); i++) {
            bw2.write("\n" + doctors.get(i).getName());
        }
        bw2.close();

        FileWriter fr3 = new FileWriter(doctorSalary, false);
        BufferedWriter bw3 = new BufferedWriter(fr3);
        for (int i = 0; i < doctors.size(); i++) {
            bw3.write("\n" + doctors.get(i).getSalary());
        }
        bw3.close();

        FileWriter fr4 = new FileWriter(doctorMail, false);
        BufferedWriter bw4 = new BufferedWriter(fr4);
        for (int i = 0; i < doctors.size(); i++) {
            bw4.write("\n" + doctors.get(i).getMail());
        }
        bw4.close();

        FileWriter fr5 = new FileWriter(doctorPhone, false);
        BufferedWriter bw5 = new BufferedWriter(fr5);
        for (int i = 0; i < doctors.size(); i++) {
            bw5.write("\n" + doctors.get(i).getPhone());
        }
        bw5.close();

        FileWriter fr6 = new FileWriter(doctorBranch, false);
        BufferedWriter bw6 = new BufferedWriter(fr6);
        for (int i = 0; i < doctors.size(); i++) {
            bw6.write("\n" + doctors.get(i).getBranch());
        }
        bw6.close();

        FileWriter fr7 = new FileWriter(doctorDnumber, false);
        BufferedWriter bw7 = new BufferedWriter(fr7);
        for (int i = 0; i < doctors.size(); i++) {
            bw7.write("\n" + doctors.get(i).getDiplomaNumber());
        }
        bw7.close();

        FileWriter fr8 = new FileWriter(staffID, false);
        BufferedWriter bw8 = new BufferedWriter(fr8);
        for (int i = 0; i < staff.size(); i++) {
            bw8.write("\n" + staff.get(i).getID());
        }
        bw8.close();

        FileWriter fr9 = new FileWriter(staffName, false);
        BufferedWriter bw9 = new BufferedWriter(fr9);
        for (int i = 0; i < staff.size(); i++) {
            bw9.write("\n" + staff.get(i).getName());
        }
        bw8.close();

        FileWriter fr10 = new FileWriter(staffSalary, false);
        BufferedWriter bw10 = new BufferedWriter(fr10);
        for (int i = 0; i < staff.size(); i++) {
            bw10.write("\n" + staff.get(i).getSalary());
        }
        bw10.close();

        FileWriter fr11 = new FileWriter(staffMail, false);
        BufferedWriter bw11 = new BufferedWriter(fr11);
        for (int i = 0; i < staff.size(); i++) {
            bw11.write("\n" + staff.get(i).getMail());
        }
        bw11.close();

        FileWriter fr12 = new FileWriter(staffPhone, false);
        BufferedWriter bw12 = new BufferedWriter(fr12);
        for (int i = 0; i < staff.size(); i++) {
            bw12.write("\n" + staff.get(i).getPhone());
        }
        bw12.close();

        FileWriter fr13 = new FileWriter(staffDepartment, false);
        BufferedWriter bw13 = new BufferedWriter(fr13);
        for (int i = 0; i < staff.size(); i++) {
            bw13.write("\n" + staff.get(i).getDepartment());
        }
        bw13.close();

        FileWriter fr14 = new FileWriter(patientName, false);
        BufferedWriter bw14 = new BufferedWriter(fr14);
        for (int i = 0; i < patients.size(); i++) {
            bw14.write("\n" + patients.get(i).getName());
        }
        bw14.close();

        FileWriter fr15 = new FileWriter(patientAge, false);
        BufferedWriter bw15 = new BufferedWriter(fr15);
        for (int i = 0; i < patients.size(); i++) {
            bw15.write("\n" + patients.get(i).getAge());
        }
        bw15.close();

        FileWriter fr16 = new FileWriter(patientTOP, false);
        BufferedWriter bw16 = new BufferedWriter(fr16);
        for (int i = 0; i < patients.size(); i++) {
            bw16.write("\n" + patients.get(i).getTypeOfDisease());
        }
        bw16.close();

        FileWriter fr17 = new FileWriter(nurseID, false);
        BufferedWriter bw17 = new BufferedWriter(fr17);
        for (int i = 0; i < nurses.size(); i++) {
            bw17.write("\n" + nurses.get(i).getID());
        }
        bw17.close();

        FileWriter fr18 = new FileWriter(nurseName, false);
        BufferedWriter bw18 = new BufferedWriter(fr18);
        for (int i = 0; i < nurses.size(); i++) {
            bw18.write("\n" + nurses.get(i).getName());
        }
        bw18.close();

        FileWriter fr19 = new FileWriter(nursesalary, false);
        BufferedWriter bw19 = new BufferedWriter(fr19);
        for (int i = 0; i < nurses.size(); i++) {
            bw19.write("\n" + nurses.get(i).getSalary());
        }
        bw19.close();

        FileWriter fr20 = new FileWriter(nurseMail, false);
        BufferedWriter bw20 = new BufferedWriter(fr20);
        for (int i = 0; i < nurses.size(); i++) {
            bw20.write("\n" + nurses.get(i).getMail());
        }
        bw20.close();

        FileWriter fr21 = new FileWriter(nursePhone, false);
        BufferedWriter bw21 = new BufferedWriter(fr21);
        for (int i = 0; i < nurses.size(); i++) {
            bw21.write("\n" + nurses.get(i).getPhone());
        }
        bw21.close();

        FileWriter fr22 = new FileWriter(nursearm, false);
        BufferedWriter bw22 = new BufferedWriter(fr22);
        for (int i = 0; i < nurses.size(); i++) {
            bw22.write("\n" + nurses.get(i).getArm());
        }
        bw22.close();

        FileWriter fr23 = new FileWriter(dcapacity, false);
        BufferedWriter bw23 = new BufferedWriter(fr23);
        bw23.write(String.valueOf(dcap));
        bw23.close();

        FileWriter fr24 = new FileWriter(ncapacity, false);
        BufferedWriter bw24 = new BufferedWriter(fr24);
        bw24.write(String.valueOf(ncap));
        bw24.close();

        FileWriter fr25 = new FileWriter(scapacity, false);
        BufferedWriter bw25 = new BufferedWriter(fr25);
        bw25.write(String.valueOf(scap));
        bw25.close();

        FileWriter fr26 = new FileWriter(pcapacity, false);
        BufferedWriter bw26 = new BufferedWriter(fr26);
        bw26.write(String.valueOf(pcap));
        bw26.close();

        //Say goodbye and exit.
        System.out.println("Exiting...");
        System.out.println();
        t.display();
        System.out.println("Thanks for using our program.");
    }

}
