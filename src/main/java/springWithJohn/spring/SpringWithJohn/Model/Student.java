package springWithJohn.spring.SpringWithJohn.Model;

public class Student {

    private Integer roolno;

    private String name;

    private String address;

    private String mentorName; // y y y

    public Integer getRoolno() {
        return roolno;
    }

    public void setRoolno(Integer voterId) {
        this.roolno = voterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public Student(Integer rollno, String name, String address, String mentorName) {
        this.roolno = rollno;
        this.name = name;
        this.address = address;
        this.mentorName = mentorName;
    }
}
