
package Dao;

//import java.awt.List;

import java.util.List;

public interface InterfaceDAO<T> {
    
    public abstract void Create(T objeto);
    public abstract List<T> Retrieve(); 
    //public abstract List<T> Retrieve(); 
    public abstract T Retrieve(int parPK);
    public abstract T Retrieve (String pasString);
    public abstract void Update (T objeto);
    public abstract void Delete(T objeto);  
    
}
