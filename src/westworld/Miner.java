/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package westworld;

/**
 *
 * @author SadMonk
 */
public class Miner extends BasicGameEntity {
    
    private State currentState;
    
    private String location;
    
    private int goldCarried;
    
    private int moneyInBank;
    
    private int thirst;
    
    private int fatigue;

    /**
     * Constructor
     * @param id The ID
     */
    public Miner(int id) {
        super(id);    
    }
    
    @Override
    public void update() {
        thirst++;
        
        if (currentState != null) {
            currentState.execute(this);
        }
    }
    
    /**
     * Changes the state to a new state by executing the old state's
     * exit-method, switching states and executing the new state's enter-method.
     * @param State newState The new State
     */
    public void changeState(State newState) {
        //call exit method of existing state
        currentState.exit(this);
        
        //change state to new state
        currentState = newState;
        
        //call entry method of the new state
        currentState.enter(this);
    }

    public String getLocation() {
        return location;
    }

    public void changeLocation(String location) {
        this.location = location;
    }
}
