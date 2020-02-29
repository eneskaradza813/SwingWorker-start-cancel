package observer;

public interface IDistributer {

    void addSubscriber(Subscriber s);
    void CancelSubscriber(Subscriber s);
    void sendUpdate(Subscriber msg);
    
    
    
    
    
    
    
}
