/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package westworld;

/**
 *
 * @author SadMonk
 */
public class EnterMineAndDigForNugget implements State {

    private static EnterMineAndDigForNugget instance;

    private EnterMineAndDigForNugget() {
    }

    public static EnterMineAndDigForNugget instance() {
        if(EnterMineAndDigForNugget.instance == null) {
            EnterMineAndDigForNugget.instance = new EnterMineAndDigForNugget();
        }
        return EnterMineAndDigForNugget.instance;
    }

    @Override
    public void enter(Miner miner) {
        if(miner.getLocation() != "goldmine") {
            System.out.println(miner.getId() + ": Going digging :)");
            miner.changeLocation("goldmine");
        }
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
