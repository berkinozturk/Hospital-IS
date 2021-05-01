public class Patient implements Implementable {

    private String name;
    private String age;
    private String typeOfDisease;

    public Patient() {
        this.name=null;
        this.age= null;
        this.typeOfDisease=null;
    }

    public Patient(String name, String age, String typeOfDisease) {
        this.name = name;
        this.age = age;
        this.typeOfDisease = typeOfDisease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTypeOfDisease() {
        return typeOfDisease;
    }

    public void setTypeOfDisease(String typeOfDisease) {
        this.typeOfDisease = typeOfDisease;
    }
    public void display() {
        System.out.println("Name:" + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Disease: " + getTypeOfDisease());
    }
}
