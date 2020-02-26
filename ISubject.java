public interface ISubject {
    
    public abstract void register(Observer x) ;
    
    public abstract void unregister(Observer x);
    
    public abstract void notifyOb(Observer x);
    
}
