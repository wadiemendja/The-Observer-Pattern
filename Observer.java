package observer;

public class Observer {

    void update() {
        System.out.println("successfully notified");
    }
     
  
    public static void main (String args []) {
        
        Observer ob = new Observer ();
        subject sub = new subject ();
        
        sub.register(ob);
        sub.setFlag(1);
        
    }
  
}
