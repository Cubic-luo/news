package ThinkingInJave;

/**
 * Created by Administrator on 2017/5/26.
 */
public class Test {
    public static void main(String[] args){
        Child child=new Child();
        child.setAge(20);
        int age=child.getAge();
        int show=child.show();
        System.out.println(age);
        System.out.println(show);
    }
}
