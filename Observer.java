package dz.univ.bechar;
public class Observer {

    void update() {
        System.out.println("Changed");
    }
     
  
    public static void main (String args []) {
        Observer ob = new Observer ();
        subject sub = new subject ();
        sub.register(ob);
        sub.setFlag(1);
    }
  
}
