package ThreadLocal.ex;

public class UserInfo {
    String name;
    int age;
    public UserInfo(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public UserInfo getUserInfo(){
        return this;
    }
}
