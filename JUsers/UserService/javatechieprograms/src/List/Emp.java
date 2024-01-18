package List;

public class Emp {

	private String dept;
	private String name;
	private int id;
	private int age;
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Emp(String dept, String name, int id, int age) {
		super();
		this.dept = dept;
		this.name = name;
		this.id = id;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [dept=" + dept + ", name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
}
