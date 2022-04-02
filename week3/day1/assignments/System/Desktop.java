package week3.day1.assignments.System;

public class Desktop extends Computer {

	public void desktopSize ()
	{
		System.out.println("Desktop size");
	}
	
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.computerModel();
		desktop.desktopSize();
	}
}
