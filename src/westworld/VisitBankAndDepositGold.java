/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package westworld;

/**
 *
 * @author SadMonk
 */
public class VisitBankAndDepositGold implements State<Miner> {

    private static VisitBankAndDepositGold instance;

    private VisitBankAndDepositGold() {
    }

    public static VisitBankAndDepositGold instance() {
        if(VisitBankAndDepositGold.instance == null) {
            VisitBankAndDepositGold.instance = new VisitBankAndDepositGold();
        }
        return VisitBankAndDepositGold.instance;
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
