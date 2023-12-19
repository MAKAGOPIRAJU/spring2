package springWithJohn.spring.SpringWithJohn.ControllLayer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springWithJohn.spring.SpringWithJohn.Model.Teacher;
import springWithJohn.spring.SpringWithJohn.ServiceLayer.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    TeacherService teacherService = new TeacherService();

    @PostMapping("/addteacher")
    public String addTeacher(@RequestBody Teacher teacher) throws Exception{
        try {
            String res = teacherService.addTeacher(teacher);
            return  res;
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @GetMapping("/getTeacher")
    public ResponseEntity getTeacher(@RequestParam("staffId") Integer staffId) throws Exception{
        try{
            Teacher teacher = teacherService.findTeacher(staffId);
            return new ResponseEntity(teacher , HttpStatus.OK);
        }

        catch (Exception e){
            return new ResponseEntity(e.getMessage() , HttpStatus.BAD_REQUEST);
        }
    }

}
