package creational.singleTon;

import java.util.LinkedList;
import java.util.Queue;

public class PrintsPooler implements Cloneable{
    private static PrintsPooler printsPooler;
    private final Queue<String> jobQueue;

    private PrintsPooler(){
        jobQueue = new LinkedList<>();
    }

    public static PrintsPooler getInstance(){
        // Handled concurrency also
        if(printsPooler == null){
            synchronized (PrintsPooler.class){
                printsPooler = new PrintsPooler();
            }
        }
        return printsPooler;
    }

    public PrintsPooler clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Clone not supported");
    }


    public void addPrintJob(String job){
        jobQueue.add(job);
    }

    public String processNextJob(){
        if(!jobQueue.isEmpty()){
            return jobQueue.poll();
        }
        return null;
    }
}
