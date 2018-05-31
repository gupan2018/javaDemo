package src.classLearn.language;

/*
 * 重写类的toString方法后，System.out.println(className)不再是内存地址，而是改写toString方法后返回的字符串
 * */

public class ToString {
	
	private String name;
	private int age;
	private String gender;
	
	public static void main(String [] args) {
		ToString student = new ToString();
		student.setName("滚滚");
		student.setAge(100);
		student.setGender("男");
		
		System.out.println(student);
	}
	
	public String toString() {
		return "学生姓名：" + this.getName() + '\n' + 
				"学生性别：" + this.getGender() + '\n' + 
				"学生年龄：" + this.getAge() + '\n';
	}
	
	public void setName(String name) {
		this.name = name;		
	}
	
	public void setAge(int age) {
		this.age = age;		
	}
	
	public void setGender(String gender) {
		this.gender = gender;		
	}
	
	public String getName() {
		return this.name;		
	}
	
	public int getAge() {
		return this.age;		
	}
	
	public String getGender() {
		return this.gender;		
	}
}
