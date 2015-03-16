/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package westworld;

/**
 *
 * @author SadMonk
 */
public class EnterMineAndDigForNugget implements State<Miner> {

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
            System.out.println(miner.getId() + ": Walkin' to the Gold Mine");
            miner.changeLocation("goldmine");
        }
    }

    /**
     * Dig until maxNuggets are carried or thirst overtakes,
     * which leads the miner to the saloon
     * @param miner The miner
     */
    @Override
    public void execute(Miner miner) {
        miner.increaseFatigue();
        System.out.println(miner.getId() + ": Pickin' up a nugget.");
        if(miner.pocketsFull()) {
            miner.changeState(VisitBankAndDepositGold.instance());
        }

        if(miner.isThirsty()) {
            miner.changeState(QuenchThirst.instance());
        }
    }

    @Override
    public void exit(Miner miner) {
        System.out.println(miner.getId() + ": Leavin' the mine");
    }
    
}
