package com.multithreading;

class Test implements Runnable
{
	public void run(){
		System.out.println("in runnable thread");
		
		}
	}


public class ThreadRunnable 
{
	public static void main(String[] args) 
	{
		System.out.println("Thread create using Runnable ");
		Test t = new Test();
 		Thread th = new Thread(t);
		try{
		for(int i=0;i<=20;i++){
			th.sleep(300);
			if(i%2==0)
			System.out.println(i);
		}
        th.start();
		}
		catch(Exception e){
			System.out.println();
		}
	}
}


