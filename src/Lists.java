
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lists {


    static File doctorID = new File("doctor_ID.txt");
    static File doctorName = new File("doctor_name.txt");
    static File doctorSalary = new File("doctor_salary.txt");
    static File doctorMail = new File("doctor_mail.txt");
    static File doctorPhone = new File("doctor_phone.txt");
    static File doctorBranch = new File("doctor_branch.txt");
    static File doctorDnumber = new File("doctor_dnumber.txt");
    static File staffID = new File("staff_ID.txt");
    static File staffName = new File("staff_name.txt");
    static File staffSalary = new File("staff_salary.txt");
    static File staffMail = new File("staff_mail.txt");
    static File staffPhone = new File("staff_phone.txt");
    static File staffDepartment = new File("staff_department.txt");
    static File patientName = new File("patient_name.txt");
    static File patientAge = new File("patient_age.txt");
    static File patientTOP = new File("patient_top.txt");
    static File nurseID = new File("nurse_ID.txt");
    static File nurseName = new File("nurse_name.txt");
    static File nursesalary = new File("nurse_salary.txt");
    static File nurseMail = new File("nurse_mail.txt");
    static File nursePhone = new File("nurse_phone.txt");
    static File nursearm = new File("nurse_arm.txt");

    public void fillDoctorList (ArrayList<Doctor> doctors) throws IOException {

        if (!doctorID.exists()) {
            doctorID.createNewFile();
        }
        if (!doctorName.exists()) {
            doctorName.createNewFile();
        }
        if (!doctorSalary.exists()) {
            doctorSalary.createNewFile();
        }
        if (!doctorMail.exists()) {
            doctorMail.createNewFile();
        }
        if (!doctorPhone.exists()) {
            doctorPhone.createNewFile();
        }
        if (!doctorBranch.exists()) {
            doctorBranch.createNewFile();
        }
        if (!doctorDnumber.exists()) {
            doctorDnumber.createNewFile();
        }
        FileReader fileReader = new FileReader(doctorID);
        BufferedReader br = new BufferedReader(fileReader);

        String line;
        while ((line = br.readLine()) != null) {
            for (int i = 0; i <doctors.size(); i++) {
                line = br.readLine();
                if (doctors.get(i).getID()==null) doctors.get(i).setID(line);
            }
        }

        FileReader fr2 = new FileReader(doctorName);
        BufferedReader br2 = new BufferedReader(fr2);
        while ((line = br2.readLine()) != null) {
            for (int i = 0; i <doctors.size(); i++) {
                line = br2.readLine();
                if (doctors.get(i).getName()==null) doctors.get(i).setName(line);
            }
        }


        FileReader fr3 = new FileReader(doctorSalary);
        BufferedReader br3 = new BufferedReader(fr3);
        while ((line = br3.readLine()) != null) {
            for (int i = 0; i <doctors.size(); i++) {
                line = br3.readLine();
                if (doctors.get(i).getSalary()==null) doctors.get(i).setSalary(line);
            }
        }


        FileReader fr4 = new FileReader(doctorMail);
        BufferedReader br4 = new BufferedReader(fr4);
        while ((line = br4.readLine()) != null) {
            for (int i = 0; i <doctors.size(); i++) {
                line = br4.readLine();
                if (doctors.get(i).getMail()==null) doctors.get(i).setMail(line);
            }
        }



        FileReader fr5 = new FileReader(doctorPhone);
        BufferedReader br5 = new BufferedReader(fr5);
        while ((line = br5.readLine()) != null) {
            for (int i = 0; i <doctors.size(); i++) {
                line = br5.readLine();
                if (doctors.get(i).getPhone()==null) doctors.get(i).setPhone(line);
            }
        }



        FileReader fr6 = new FileReader(doctorBranch);
        BufferedReader br6 = new BufferedReader(fr6);
        while ((line = br6.readLine()) != null) {
            for (int i = 0; i <doctors.size(); i++) {
                line = br6.readLine();
                if (doctors.get(i).getBranch()==null) doctors.get(i).setBranch(line);
            }
        }


        FileReader fr7 = new FileReader(doctorDnumber);
        BufferedReader br7 = new BufferedReader(fr7);
        while ((line = br7.readLine()) != null) {
            for (int i = 0; i <doctors.size(); i++) {
                line = br7.readLine();
                if (doctors.get(i).getDiplomaNumber()==null) doctors.get(i).setDiplomaNumber(line);
            }
        }
        br.close();
        br2.close();
        br3.close();
        br4.close();
        br5.close();
        br6.close();
        br7.close();




    }
    public void fillStuffList (ArrayList<Staff> staff) throws IOException {

        if (!staffID.exists()) {
            staffID.createNewFile();
        }
        if (!staffName.exists()) {
            staffName.createNewFile();
        }
        if (!staffSalary.exists()) {
            staffSalary.createNewFile();
        }
        if (!staffMail.exists()) {
            staffMail.createNewFile();
        }
        if (!staffPhone.exists()) {
            staffPhone.createNewFile();
        }
        if (!staffDepartment.exists()) {
            staffDepartment.createNewFile();
        }
        String line;
        FileReader fr8 = new FileReader(staffID);
        BufferedReader br8 = new BufferedReader(fr8);
        while ((line = br8.readLine()) != null) {
            for (int i = 0; i < staff.size(); i++) {
                line = br8.readLine();
                if (staff.get(i).getID()==null) staff.get(i).setID(line);
            }
        }
        FileReader fr9 = new FileReader(staffName);
        BufferedReader br9 = new BufferedReader(fr9);
        while ((line = br9.readLine()) != null) {
            for (int i = 0; i < staff.size(); i++) {
                line = br9.readLine();
                if (staff.get(i).getName()==null) staff.get(i).setName(line);
            }
        }
        FileReader fr10 = new FileReader(staffSalary);
        BufferedReader br10 = new BufferedReader(fr10);
        while ((line = br10.readLine()) != null) {
            for (int i = 0; i < staff.size(); i++) {
                line = br10.readLine();
                if (staff.get(i).getSalary()==null) staff.get(i).setSalary(line);
            }
        }
        FileReader fr11 = new FileReader(staffMail);
        BufferedReader br11 = new BufferedReader(fr11);
        while ((line = br11.readLine()) != null) {
            for (int i = 0; i < staff.size(); i++) {
                line = br11.readLine();
                if (staff.get(i).getMail()==null) staff.get(i).setMail(line);
            }
        }
        FileReader fr12 = new FileReader(staffPhone);
        BufferedReader br12 = new BufferedReader(fr12);
        while ((line = br12.readLine()) != null) {
            for (int i = 0; i < staff.size(); i++) {
                line = br12.readLine();
                if (staff.get(i).getPhone()==null) staff.get(i).setPhone(line);
            }
        }

        FileReader fr13 = new FileReader(staffDepartment);
        BufferedReader br13 = new BufferedReader(fr13);
        while ((line = br13.readLine()) != null) {
            for (int i = 0; i < staff.size(); i++) {
                line = br13.readLine();
                if (staff.get(i).getDepartment()==null) staff.get(i).setDepartment(line);
            }
        }
        br8.close();
        br9.close();
        br10.close();
        br11.close();
        br12.close();
        br13.close();

    }
    public void fillPatientList (ArrayList<Patient> patients) throws IOException {

        if (!patientName.exists()) {
            patientName.createNewFile();
        }
        if (!patientAge.exists()) {
            patientAge.createNewFile();
        }
        if (!patientTOP.exists()) {
            patientTOP.createNewFile();
        }
        String line;
        FileReader fr14 = new FileReader(patientName);
        BufferedReader br14 = new BufferedReader(fr14);
        while ((line = br14.readLine()) != null) {
            for (int i = 0; i <patients.size(); i++) {
                line = br14.readLine();
                if (patients.get(i).getName()==null) patients.get(i).setName(line);
            }
        }

        FileReader fr15 = new FileReader(patientAge);
        BufferedReader br15 = new BufferedReader(fr15);
        while ((line = br15.readLine()) != null) {
            for (int i = 0; i <patients.size(); i++) {
                line = br15.readLine();
                if (patients.get(i).getAge()==null) patients.get(i).setAge(line);
            }
        }

        FileReader fr16 = new FileReader(patientTOP);
        BufferedReader br16 = new BufferedReader(fr16);
        while ((line = br16.readLine()) != null) {
            for (int i = 0; i <patients.size(); i++) {
                line = br16.readLine();
                if (patients.get(i).getTypeOfDisease()==null) patients.get(i).setTypeOfDisease(line);
            }
        }
        br14.close();
        br15.close();
        br16.close();

    }
    public void fillNurseList ( ArrayList<Nurse> nurses ) throws IOException {

        if (!nurseID.exists()) {
            nurseID.createNewFile();
        }
        if (!nurseName.exists()) {
            nurseName.createNewFile();
        }
        if (!nursesalary.exists()) {
            nursesalary.createNewFile();
        }
        if (!nurseMail.exists()) {
            nurseMail.createNewFile();
        }
        if (!nursePhone.exists()) {
            nursePhone.createNewFile();
        }
        if (!nursearm.exists()) {
            nursearm.createNewFile();
        }
        String line;
        FileReader fr17 = new FileReader(nurseName);
        BufferedReader br17 = new BufferedReader(fr17);
        while ((line = br17.readLine()) != null) {
            for (int i = 0; i <nurses.size(); i++) {
                line = br17.readLine();
                if (nurses.get(i).getName()==null) nurses.get(i).setName(line);
            }
        }

        FileReader fr18 = new FileReader(nurseID);
        BufferedReader br18 = new BufferedReader(fr18);
        while ((line = br18.readLine()) != null) {
            for (int i = 0; i <nurses.size(); i++) {
                line = br18.readLine();
                if (nurses.get(i).getID()==null) nurses.get(i).setID(line);
            }
        }

        FileReader fr19 = new FileReader(nursesalary);
        BufferedReader br19 = new BufferedReader(fr19);
        while ((line = br19.readLine()) != null) {
            for (int i = 0; i <nurses.size(); i++) {
                line = br19.readLine();
                if (nurses.get(i).getSalary()==null) nurses.get(i).setSalary(line);
            }
        }

        FileReader fr20 = new FileReader(nurseMail);
        BufferedReader br20 = new BufferedReader(fr20);
        while ((line = br20.readLine()) != null) {
            for (int i = 0; i <nurses.size(); i++) {
                line = br20.readLine();
                if (nurses.get(i).getMail()==null) nurses.get(i).setMail(line);
            }
        }

        FileReader fr21 = new FileReader(nursePhone);
        BufferedReader br21 = new BufferedReader(fr21);
        while ((line = br21.readLine()) != null) {
            for (int i = 0; i <nurses.size(); i++) {
                line = br21.readLine();
                if (nurses.get(i).getPhone()==null) nurses.get(i).setPhone(line);
            }
        }

        FileReader fr22 = new FileReader(nursearm);
        BufferedReader br22 = new BufferedReader(fr22);
        while ((line = br22.readLine()) != null) {
            for (int i = 0; i <nurses.size(); i++) {
                line = br22.readLine();
                if (nurses.get(i).getArm()==null) nurses.get(i).setArm(line);
            }
        }

        br17.close();
        br18.close();
        br19.close();
        br20.close();
        br21.close();
        br22.close();

    }


}


