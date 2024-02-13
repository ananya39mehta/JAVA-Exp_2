package Assignment_2;

public class Student {
    private String sName;
    private int Prn;
    private int Dob;

    private int marks;

    public Student(String sName, int prn, int dob, int marks) {
        this.sName = sName;
        Prn = prn;
        Dob = dob;
        this.marks = marks;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getPrn() {
        return Prn;
    }

    public void setPrn(int prn) {
        Prn = prn;
    }

    public int getDob() {
        return Dob;
    }

    public void setDob(int dob) {
        Dob = dob;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
