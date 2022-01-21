package StreamFinalMethod.CustomCollection;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
    private List<Student> list;

    public MaleStudent(){
        list = new ArrayList<Student>();
        System.out.println("["+Thread.currentThread().getName()+"] MaleStudent");
    }

    public void accumulate(Student student){
        list.add(student);
        System.out.println("["+Thread.currentThread().getName()+"] accumulate");
    }

    public void combine(MaleStudent other){
        list.add((Student) other.getList());
        System.out.println("["+Thread.currentThread().getName()+"] combine");
    }

    public List<Student> getList() {
        return list;
    }
}
