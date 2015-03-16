/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package westworld;

/**
 *
 * @author SadMonk
 */
public class GoHomeAndSleepTillRested implements State<Miner> {

    private static GoHomeAndSleepTillRested instance;

    private GoHomeAndSleepTillRested() {
    }

    public static GoHomeAndSleepTillRested instance() {
        if(GoHomeAndSleepTillRested.instance == null) {
            GoHomeAndSleepTillRested.instance = new GoHomeAndSleepTillRested();
        }
        return GoHomeAndSleepTillRested.instance;
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
