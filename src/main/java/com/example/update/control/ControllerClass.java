package com.example.update.control;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.update.data.Student;
import com.example.update.repostory.Repo;
import com.example.update.rto.RequestStudent;

@RestController
@RequestMapping("/control")
public class ControllerClass {
	
	@Autowired
	Repo repo;
	
//	@PostMapping("/addData")
//	public ResponseEntity<Student> addData(@RequestBody String data) throws JsonMappingException, JsonProcessingException {
//		ObjectMapper mapper=new ObjectMapper();
//		RequestStudent stu=mapper.readValue(data, RequestStudent.class);
//		Student s=new Student(stu.getId(),stu.getName());
//		repo.save(s);
//		return new ResponseEntity<>(s, HttpStatus.CREATED);
//	}
	
	@PostMapping("/addData")
	public ResponseEntity<Student> addData(@RequestBody RequestStudent data){
	Student s=new Student(data.getId(),data.getName());
	repo.save(s);
	return new ResponseEntity<>(s,HttpStatus.CREATED);
	}
	
	@GetMapping("/getData")
	public List<Student> getData() {
		List<Student> list=repo.findAll();
		return list;
	}

	@PutMapping("/updateData/{id}/{name}")
	public ResponseEntity<Student> updateData(@PathVariable int id,@PathVariable String name) {
		Student s=repo.getById(id);
		s.setName(name);
		repo.save(s);
		return new ResponseEntity<>(s,HttpStatus.CREATED);
	}
		
	@DeleteMapping("/deleteData")
	public ResponseEntity<String> deleteData() {
		repo.deleteAll();
		return ResponseEntity.ok("data deleted");
	}
}
