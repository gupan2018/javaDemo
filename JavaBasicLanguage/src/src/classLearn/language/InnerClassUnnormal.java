package src.classLearn.language;

public class InnerClassUnnormal {
    private int a;
    void show(){
        B obj = new B();
    }
    
    class B{
        void test(){
            System.out.println(a);
            // 上面这句话就相当于下面这句话，在内部类中有个隐式的引用指向外部类的成员和方法
            System.out.println(InnerClassUnnormal.this.a);
            //下面这句话编译错误
            // System.out.printlb(this.a);
        }
    }
}
