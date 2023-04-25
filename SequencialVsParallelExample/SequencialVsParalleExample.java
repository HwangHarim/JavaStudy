//package SequencialVsParallelExample;
//
//import java.util.List;
//
//public class SequencialVsParalleExample {
//    public static void work(int value){
//        try{Thread.sleep(100);}catch(InterruptedException e){}
//    }
//
//    public static long testSequencial(List<Integer> list){
//        long start =System.nanoTime();
//        list.stream().forEach(a->work(a));
//        long end =System.nanoTime();
//        long runTime =end - start;
//        return runTime;
//    }
//
//    public
//}
