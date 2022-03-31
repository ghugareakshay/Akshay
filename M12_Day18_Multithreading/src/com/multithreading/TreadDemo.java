package com.multithreading;

class Video extends Thread
{
	public void run(){
		System.out.println("Video play");
	}
}
class Music extends Thread
{
	public void run(){
		System.out.println("Music play");
	}
}
class Play extends Thread
{
	public void run(){
		System.out.println("Video play button");
	}
}

class TreadDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("VLC Mediea player");
		Video v = new Video();
		v.start();
		
		Music m = new Music();
		m.start();

		Play p = new Play();
		p.start();

	}
}



