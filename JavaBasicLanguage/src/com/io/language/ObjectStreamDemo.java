package com.io.language;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 这个类主要讲了对象流的用法
 *  	对象流的作用是方便读写java中的对象
 * 
 * 对象输出流：
 * 		可以将给定的对象转换为一组字节后写出
 * 对象输入流：
 * 		
 * 
 * @author Gupan
 *
 */

// 对于一个对象，如果想要使用对象流，存储对象实例，需要实现Serializable接口，这是一个抽象接口，没有任何接口方法，
// 但是编译器在编译时，会识别哪些类实现了这个接口，并做一些底层的事情，类似Serializable的接口也叫做签名接口
/*
 * 
 *
 * 实现Serializable接口后，需要加上一个版本号serialVersionUID，不然会有警告。如果不写serialVersionUID，系统默认会更具类的接口生成一个版本号
 * （这个版本号会随类的结构变化而变化，但是在类结构变化的情况下，由于序列化和反序列化的版本号不同，反序列化就会报错，自定义版本号可以避免上述情况，
 * 在版本号一致，但是类的结构改变的情况下，改变的属性移除消失，新增的属性取默认值）
 * */
public class ObjectStreamDemo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	
	// 当一个类使用了Serializable接口以后，就可以实现一个关键字transient
	// 当一个类的实例在进行序列化的时候，加了transient关键字的属性在序列化时就不会序列化，这样做的意义是存储对象的瘦身
	private List <String> otherInfo;
	
	public ObjectStreamDemo() {
	}
	
	public ObjectStreamDemo(String name, int age, String gender,List <String> otherInfo) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + "," + this.age + "," + this.gender + "," + this.otherInfo;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(List<String> otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectStreamDemo p = new ObjectStreamDemo();
		p.setName("圆滚滚");
		p.setAge(18);
		p.setGender("男");
		List <String> otherInfo = new ArrayList<String> ();
		otherInfo.add("是一个学生");
		otherInfo.add("2018年毕业");
		p.setOtherInfo(otherInfo);
		
		// *************************************************对象序列化*************************************************
		FileOutputStream fos = new FileOutputStream("info.txt");
		
		// 使用对象流
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// 进行对象持久化
		oos.writeObject(p);
		
		oos.flush();
		oos.close();
		
		// *************************************************对象反序列化*************************************************
		FileInputStream fiStream = new FileInputStream("info.txt");
		ObjectInputStream ois = new ObjectInputStream(fiStream);
		ObjectStreamDemo pRe = (ObjectStreamDemo) ois.readObject();
		System.out.println(pRe);
		ois.close();
		
	}
}
