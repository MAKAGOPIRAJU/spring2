package springWithJohn.spring.SpringWithJohn.ServiceLayer;

import springWithJohn.spring.SpringWithJohn.Model.Teacher;
import springWithJohn.spring.SpringWithJohn.Respository.TeacherRepository;

import java.util.HashMap;

public class TeacherService {

//    TeacherRepository teacherRepository = new TeacherRepository();

    HashMap<Integer , Teacher> db = TeacherRepository.teacherHashMap;

    public String addTeacher(Teacher teacher) throws Exception{

        int staffId = teacher.getStaffId();

        for(Integer id : db.keySet()){

            if( id == staffId) {
                throw new Exception("Teacher is already registered");
            }
        }

        db.put(staffId , teacher);

        return "teacher added successfully to the db!";


    }

    public Teacher findTeacher(Integer id) throws Exception{

        for(int staffId : db.keySet()){

            if( staffId == id){
                return db.get(staffId);
            }
        }

        throw new Exception("Enter the valid staff Id");
    }
}
