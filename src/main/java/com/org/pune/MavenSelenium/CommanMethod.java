package com.org.pune.MavenSelenium;

public class CommanMethod {

	public void waitmethod(int x) {
		 try {
				Thread.sleep(x);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
