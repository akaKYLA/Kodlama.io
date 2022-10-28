package kodlama.io.Kodlama.io.Devs.entities.concretes;

public class Course {

	int id;
	String name;
	String language;
	String instructor;
	String category;

	public Course() {
		super();
	}

	public Course(int id, String name, String language, String instructor, String category) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.instructor = instructor;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
