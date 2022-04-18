package pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	
	
	private List<Subscriber> subs = new ArrayList<Subscriber>();
	private String title;
	
	@Override
	public void Subscribe(Subscriber sub)
	{
		subs.add(sub);
		
	}
	@Override
	public void Unsubscribe(Observer sub)
	{
		subs.remove(sub);
	}
	@Override
	public void notifySubscribers()
	{
		for(Observer sub : subs)
		{
			sub.update();
		}
	}
	@Override
	public void upload(String title)
	{
	   this.title = title;
	    notifySubscribers(); 
	}

}
