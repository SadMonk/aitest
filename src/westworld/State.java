/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package westworld;

/**
 *
 * @author Chris
 */
public interface State {
    
    public void Enter(Miner miner);
    
    public void Execute(Miner miner);
    
    public void Exit(Miner miner);
        
}
