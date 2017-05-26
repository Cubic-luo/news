package ThinkingInJave;

/**
 * 基类
 * Created by Administrator on 2017/5/26.
 */
public class Base {
    private String name="马克思";
    private String gender;
    private int age=18;
    public int show(){
        return 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
