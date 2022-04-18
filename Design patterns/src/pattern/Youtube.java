package pattern;

public class Youtube {

	public static void main(String args[])
	{
		Subject Ixigo  = new Channel();
		Subscriber s1  = new Subscriber("Divya");
		Subscriber s2  = new Subscriber("Rajat");
		Subscriber s3  = new Subscriber("Maya");
		Subscriber s4  = new Subscriber("Dhani");
		Subscriber s5  = new Subscriber("Nitin");
		Subscriber s6  = new Subscriber("Anant");
		
		Ixigo.Subscribe(s1);
		Ixigo.Subscribe(s2);
		Ixigo.Subscribe(s3);
		Ixigo.Subscribe(s4);
		Ixigo.Subscribe(s5);
		Ixigo.Subscribe(s6);
		
		
		s1.subscribeChannel(Ixigo);
		s2.subscribeChannel(Ixigo);	
		s3.subscribeChannel(Ixigo);
		s4.subscribeChannel(Ixigo);
		s5.subscribeChannel(Ixigo);
		s6.subscribeChannel(Ixigo);
		
		Ixigo.upload("How to do Programming");
		
		
		
		
	}
}
