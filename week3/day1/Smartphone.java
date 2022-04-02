package week3.day1;

public class Smartphone extends AndroidPhone
{

	public void connectWhatsApp()
	{
		System.out.println("Connect whatsapp");
	}
	
	public void takeVideo (String str) 
	{
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		Smartphone smartphone = new Smartphone();
		smartphone.sendMsg();
		smartphone.makeCall();
		smartphone.saveContact();
		smartphone.takeVideo();
		smartphone.connectWhatsApp();
		
		smartphone.takeVideo("Take video from smartphone");
		
	}
}
