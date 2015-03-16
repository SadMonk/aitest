/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package westworld;

/**
 *
 * @author SadMonk
 */
public class QuenchThirst implements State<Miner> {

    private static QuenchThirst instance;

    private QuenchThirst() {
    }

    public static QuenchThirst instance() {
        if(QuenchThirst.instance == null) {
            QuenchThirst.instance = new QuenchThirst();
        }
        return QuenchThirst.instance;
    }

    @Override
    public void enter(Miner miner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void execute(Miner miner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exit(Miner miner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
