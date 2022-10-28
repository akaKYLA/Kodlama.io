package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import kodlama.io.Kodlama.io.Devs.business.abstracts.CourseService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Course;

@RestController
@RequestMapping("api/courses")
public class CourseController {
	
	CourseService courseService;

	@Autowired
	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}
	
	@GetMapping("/listall")
	public List<Course> listAll(){
		return courseService.list();
	}
	
	@GetMapping("id/{id}")
	public Course getById(@PathVariable int id){
		return courseService.getById(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Course course) throws Exception {
		courseService.add(course);
	}
	
	@DeleteMapping("/remove/{id}")
	public void remove(@PathVariable int id){
		courseService.remove(id);
	}
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable int id, @RequestBody Course course) {
		courseService.update(id,course);
	}
	
	

	
}
