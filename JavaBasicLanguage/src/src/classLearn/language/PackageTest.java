package src.classLearn.language;

/*
 * 这里调用了Package类，以案例的方式讲解了封装的好处
 * */

public class PackageTest {
	public static void main(String [] args){
		Package p1 = new Package();
		Package p2 = new Package();
		Package p3 = new Package();

		p1.age = 23;
		p1.age = 12;
		p1.age = 80;
		
		/*
		 * 在Tester中，直接对属性操作修改age的值，但是若Student中age的数据类型发生变化，
		 * 由int变为String，之后的Tester类需要做大量的变动，但是若调用Set和Get方法，则只
		 * 需要对代码进行少量的修改。如下所示，这就是封装的好处。
		 * */
		
		PackageAdv adv1 = new PackageAdv();
		PackageAdv adv2 = new PackageAdv();
		PackageAdv adv3 = new PackageAdv();

		adv1.setAge(23);
		adv2.setAge(12);
		adv3.setAge(80);
	}
}
