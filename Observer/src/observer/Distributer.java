package observer;

import java.util.ArrayList;

public class Distributer implements IDistributer {

    ArrayList<Subscriber> subscribers;
    
    public Distributer()
    {
        this.subscribers = new ArrayList<>();
    }
    
    public void addSubscriber(Subscriber s){
        this.subscribers.add(s);
    }
    
    public void cancelSubscriber(Subscriber s){
        this.subscribers.remove(s);
    }
    public void sendUpdate(String myUpdate){
        for (int i = 0; i < subscribers.size(); i++) {
            subscribers.get(i).update(myUpdate);
        }
    }

    @Override
    public void CancelSubscriber(Subscriber s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sendUpdate(Subscriber msg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
