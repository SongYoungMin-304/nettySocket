package com.example.demo;

public class TESTRunnable implements Runnable{

	 String thread;
	    public TESTRunnable(String thread){
	        this.thread = thread;
	    }

	    @Override
	    public void run() {
	        for(int i=0; i<10; i++){
	            System.out.println("implements 쓰레드 : " + thread);
	            try{
	                Thread.sleep(100);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    public static void main(String[] args) {
	    	TESTRunnable tr1 = new TESTRunnable("확장 1번");
	    	TESTRunnable tr2 = new TESTRunnable("확장 2번");

	        Thread t1 = new Thread(tr1);
	        Thread t2 = new Thread(tr2);

	        t1.start();
	        t2.start();
	        System.out.println("finish");
	    }
}
