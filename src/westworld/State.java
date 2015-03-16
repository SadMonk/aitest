/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package westworld;

/**
 *
 * @author SadMonk
 */
public interface State {
    
    public void enter(Miner miner);
    
    public void execute(Miner miner);
    
    public void exit(Miner miner);
        
}
