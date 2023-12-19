package springWithJohn.spring.SpringWithJohn.Model;
import java.util.*;

public class Teacher {

    private Integer staffId;

    private String name;

    private String subject;


    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }



    public Teacher(Integer staffId, String name, String subject) {
        this.staffId = staffId;
        this.name = name;
        this.subject = subject;
    }
}
