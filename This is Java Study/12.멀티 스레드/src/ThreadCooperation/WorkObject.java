package ThreadCooperation;

public class WorkObject {
    public synchronized void methodA(){
        System.out.println("ThreadA의 methodA()의 각 작업 실행");
        notify(); //wait를 풀어주는 함수
        try{
            wait();//synchronized 의 스레드를 잠그는 역할
        }catch (InterruptedException e){}
    }

    public synchronized void methodB(){
        System.out.println("ThreadB의 methodB()의 각 작업 실행");
        notify();
        try{
            wait();
        }catch (InterruptedException e){}
    }
}
