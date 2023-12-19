package springWithJohn.spring.SpringWithJohn.ServiceLayer;


import springWithJohn.spring.SpringWithJohn.Model.Student;
import springWithJohn.spring.SpringWithJohn.Respository.StudentRepository;

import java.util.HashMap;

public class StudentServiceLayer {

    private HashMap<Integer ,Student> db = StudentRepository.studentDatabase; // rollNo and student obj

    public String addStudent(Student student) throws Exception{



        int rollNo = student.getRoolno();

        for(Integer no : db.keySet()) {

            if(no == rollNo) {
                throw new Exception("student is already registered!");
            }
        }

        db.put(rollNo , student);

        return "student added succesfully to the db";
    }

    public Student findStudent(Integer id) throws Exception{

        for(Integer rollNo : db.keySet()){

            if(id == rollNo) {

                return db.get(rollNo);
            }
        }

        throw new Exception("Enter the valid address");

    }
}
