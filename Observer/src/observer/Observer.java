package observer;

public class Observer {

    public static void main(String[] args) {

        
        Distributer d = new Distributer();
        Subscriber s1 = new Subscriber("subscriber 1");
        Subscriber s2 = new Subscriber("Subscriber 2");
        Subscriber s3 = new Subscriber("Subscriber 3");
        d.addSubscriber(s1);
        d.addSubscriber(s2);
        d.addSubscriber(s3);
        d.sendUpdate("new update");
        d.cancelSubscriber(s2);
        d.cancelSubscriber(s1);
        d.sendUpdate("nep update1");
        
        
        
        
        
    }

}
