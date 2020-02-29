package observer;

class Subscriber implements ISubscriber{
    
    public String name;
    
    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String args) {

        System.out.println("Updated Object " + this.name + "args" + args);
    }

    
    
    
}
