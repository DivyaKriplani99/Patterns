package pattern;

public interface Subject {

	void Subscribe(Subscriber sub);

	void Unsubscribe(Observer sub);

	void notifySubscribers();

	void upload(String title);

}