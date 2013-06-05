/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package westworld;

/**
 *
 * @author Chris
 */
public class Miner extends BasicGameEntity {
    
    private State m_pCurrentState;
    
    private String m_Location;
    
    private int m_iGoldCarried;
    
    private int m_iMoneyInBank;
    
    private int m_iThirst;
    
    private int m_iFatigue;

    /**
     * Constructor
     * @param id The ID
     */
    public Miner(int id) {
        super(id);    
    }
    
    @Override
    public void Update() {
        m_iThirst++;
        
        if (m_pCurrentState != null) {
            m_pCurrentState.Execute(this);
        }
    }
    
    /**
     * Changes the state to a new state by executing the old state's
     * Exit-method, switching states and executing the new state's Enter-method.
     * @param State pNewState The new State
     */
    public void ChangeState(State pNewState) {
        //call exit method of existing state
        m_pCurrentState.Exit(this);
        
        //change state to new state
        m_pCurrentState = pNewState;
        
        //call entry method of the new state
        m_pCurrentState.Enter(this);
    }
    
}
