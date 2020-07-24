package com.threads.producercomsumer;

import java.util.List;

public class Consumer implements Runnable {
    private final List<Integer> taskQueue;

    public Consumer(List<Integer> taskQueue){
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        while(true){
            try{
                consume();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private void consume() throws InterruptedException{
        synchronized (taskQueue) {
            while(taskQueue.isEmpty()) {
                System.out.println("Thread: " + Thread.currentThread().getName() + " is waiting for producer"); //is this an example of anonymous something or reflection
                taskQueue.wait();
            }

            Thread.sleep(1000);
            int i = (Integer) taskQueue.remove(0);
            System.out.println("Consumed " + i);
            taskQueue.notifyAll();
        }
    }
}
