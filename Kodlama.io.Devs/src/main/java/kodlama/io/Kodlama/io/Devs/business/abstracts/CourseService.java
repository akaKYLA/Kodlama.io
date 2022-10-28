package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Course;

public interface CourseService {
	public List<Course> list();
	public void add(Course course) throws Exception;
	public void remove(int id);
	public void update(int id,Course course);
	public Course getById(int id);
}
