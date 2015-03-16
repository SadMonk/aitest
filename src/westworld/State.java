/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package westworld;

/**
 *
 * @author SadMonk
 */
public interface State<entityType> {
    
    public void enter(entityType entity);
    
    public void execute(entityType entity);
    
    public void exit(entityType entity);
        
}
