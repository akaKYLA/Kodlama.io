package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Course;

public interface CourseRepository {
	public List<Course> list();
	public void add(Course course);
	public void remove(int id);
	public void update(int id, Course course);
	public Course getById(int id);
}
