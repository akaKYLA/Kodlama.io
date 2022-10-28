package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.CourseService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.CourseRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Course;

@Service
public class CourseManager implements CourseService {

	public CourseRepository courseRepository;

	public CourseManager(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	ArrayList<Course> courseNames = new ArrayList<>();

	@Override
	public List<Course> list() {

		return courseRepository.list();
	}

	@Override
	public void add(Course course) throws Exception {
		if (course.getLanguage().isBlank()) {
			throw new Exception("Programming language is can not be empty.");
		}

		for (Course course1 : courseNames) {
			if (course1.getName().equals(course.getName())) {
				throw new Exception("This course already exist.");
			}
		}

		courseNames.add(course);
		courseRepository.add(course);

	}

	@Override
	public void remove(int id) {
		courseRepository.remove(id);
	}

	@Override
	public void update(int id,Course course) {
		courseRepository.update(id,course);
	}

	@Override
	public Course getById(int id){
		return courseRepository.getById(id);
	}

}
