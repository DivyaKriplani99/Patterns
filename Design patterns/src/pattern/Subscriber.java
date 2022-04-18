package pattern;

public class Subscriber implements Observer{
	String name;
	Subject channels = new Channel();
	
	public Subscriber(String name)
	{
		this.name = name;
	}
	
	@Override
	public void update()
	{
		System.out.println("Hey "+ name + " , New Video Uploaded");
	}
     @Override
	public void subscribeChannel(Subject ch)
     {
    	 channels  = ch;
     }
}
