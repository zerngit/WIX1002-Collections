package T08.T8Q1;

public class Student {
    private String contactNum;

    public Student() {
        this.contactNum = null;
    }

    public Student(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public void displayContactNum() {
        System.out.println("Contact Number : " + contactNum);
    }
}
