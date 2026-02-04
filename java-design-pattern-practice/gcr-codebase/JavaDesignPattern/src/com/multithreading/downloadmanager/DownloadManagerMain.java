package com.multithreading.downloadmanager;

public class DownloadManagerMain {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new FileDownload("Document.pdf"));
		Thread t2 = new Thread(new FileDownload("Movie.mp4"));
		Thread t3 = new Thread(new FileDownload("Image.jpg"));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("All download completed!");
	}
}
