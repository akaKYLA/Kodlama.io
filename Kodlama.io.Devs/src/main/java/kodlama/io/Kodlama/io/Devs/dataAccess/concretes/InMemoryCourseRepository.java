package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.CourseRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Course;

@Repository
public class InMemoryCourseRepository implements CourseRepository {

	List<Course> courses;

	@Override
	public List<Course> list() {
		courses = new ArrayList<Course>();
		courses.add(new Course(1, "Java Bootcamp", "Java", "Engin Demirog", "Programming"));
		courses.add(new Course(2, "C# .Net Bootcamp", "C#", "Engin Demirog", "Programming"));
		courses.add(new Course(3, "Python Bootcamp", "Python", "Engin Demirog", "Programming"));
		return courses;
	}

	@Override
	public void add(Course course) {
		courses.add(course);
	}

	@Override
	public void remove(int id) {
		for (Course course1 : courses) {
			if (id == course1.getId()) {
				courses.remove(course1);
			}
		}
	}

	@Override
	public void update(int id,Course course) {
		for (Course course1 : courses) {
			if (id == course1.getId()) {
				course1.setId(course.getId());
				course1.setName(course.getName());
				course1.setLanguage(course.getLanguage());
				course1.setInstructor(course.getInstructor());
				course1.setCategory(course.getCategory());
			}
		}
	}

	@Override
	public Course getById(int id){
		for (Course course : courses) {
			if (course.getId() == id) {
				return course;
			}
		}
		return null;
	}

}
