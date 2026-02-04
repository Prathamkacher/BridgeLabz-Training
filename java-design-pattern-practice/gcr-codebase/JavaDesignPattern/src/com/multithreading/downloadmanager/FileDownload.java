package com.multithreading.downloadmanager;

public class FileDownload extends Thread {
	private String fileName;
	
	public FileDownload(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void run() {
		for(int i = 0; i <= 100; i++) {
			System.out.println("[" + getName() + "] Downloading " + fileName + ": " + i + "%");
			try {
				Thread.sleep((long) Math.random() * 300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
