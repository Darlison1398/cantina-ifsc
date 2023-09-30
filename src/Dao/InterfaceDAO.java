
package Dao;

//import java.awt.List;

import java.util.List;

public interface InterfaceDAO<T> {
    
    public abstract void create(T objeto);
    public abstract List<T> retrieve(); 
    //public abstract List<T> Retrieve(); 
    public abstract T retrieve(int parPK);
    public abstract List<T> retrieve (String pasString);
    public abstract void update (T objeto);
    public abstract void delete(T objeto);  
    
}
