package data;

public class Student {
	private String fulName;
	private int age;
	private Float mark;

	public Student(String fulName, int age, Float mark) {
//		super();
		this.fulName = fulName;
		this.age = age;
		this.mark = mark;
	}
	public String getFulName() {
		return fulName;
	}
	public void setFulName(String fulName) {
		this.fulName = fulName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Float getMark() {
		return mark;
	}
	public void setMark(Float mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [fulName=" + fulName + ", age=" + age + ", mark=" + mark + "]";
	}

}
