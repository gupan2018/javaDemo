package src.classCallEachOther.language;

import src.classLearn.language.ToString;

/**
 * 这个类讲了导包的语句以及注意事项
 */

/*
前提：有两个类，分别是类A和类B，类A中要使用到类B

1）类A和类B在同一个项目下，并且在同一个Package下
	此种情况不要使用import语句即可在类A中使用到类B；

2）类A和类B在同一个项目下，但是类A和类B不在同一个Package下
	此种情况可直接使用import语句导入类B；

3）类A和类B不在同一个项目下
	需要将类B所在的项目以jar包的形式导出，然后作为类A所在项目的一个依赖包引入，之后再import类B。
*/

public class ExternalJarCall {
	public static void main(String [] args) {
		ToString student = new ToString();
		student.setName("又一个滚滚");
		student.setAge(100);
		student.setGender("男");
		
		System.out.println(student);
	}
}
