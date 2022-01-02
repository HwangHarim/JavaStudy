package DaemonThread;

public class AutoSaveThread extends Thread {
    public void save(){
        System.out.println("작성 내용을 저장합니다");
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                break;
            }
            save();
        }
    }
}
