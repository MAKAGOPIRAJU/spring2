package springWithJohn.spring.SpringWithJohn.ControllLayer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springWithJohn.spring.SpringWithJohn.Model.Student;
import springWithJohn.spring.SpringWithJohn.ServiceLayer.StudentServiceLayer;

@RestController
@RequestMapping("/student")
public class StudentController {

    // add a student to the db
   StudentServiceLayer studentServiceLayer = new StudentServiceLayer();

  @PostMapping("/addStudent")
  public String addStudent(@RequestBody Student student) throws Exception{

      try{
          String res = studentServiceLayer.addStudent(student);
          return  res;
      }catch (Exception e){
          return e.getMessage();
      }
  }

  @GetMapping("/findStudent")
    public ResponseEntity findStudent(@RequestParam("id") Integer id) throws Exception{
      try
      {
          Student res = studentServiceLayer.findStudent(id);
          return new ResponseEntity(res , HttpStatus.OK);
      }catch (Exception e){
          return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
      }
  }




}
