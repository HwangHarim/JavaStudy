package ThreadGroupInterruptedExample;

public class ThreadGroupExample {
    public static void main(String[] args){
        ThreadGroup myGroup = new ThreadGroup("myGroup");
        WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
        WorkThread workThreadB = new WorkThread(myGroup,"workThreadB");

        workThreadA.start();
        workThreadB.start();

        System.out.println("[main 스레드 그룹의 list() 메소들 출력 내용]");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();

        try{Thread.sleep(1000);}catch (InterruptedException e){}

        System.out.println("[myGroup 스레드 그룹의 .interrupt() 메소드 호출]");
        myGroup.interrupt();
    }
}
