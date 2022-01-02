package DaemonThread;

public class DaemonExample {
    public static void main(String[] args){
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){}

        System.out.println("프로그램 종료");
    }
}
