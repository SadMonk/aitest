/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package westworld;

/**
 * Basic game entity... tried to adapt this to java from a C++ tutorial.
 * @author SadMonk
 */
public class BasicGameEntity {

    private int id;
    private static int nextValidId;

    public BasicGameEntity(int id) {
        this.setId(id);
    }

    private void setId(int val) {
        if(val >= nextValidId) {
            id = val;
            nextValidId = val + 1;
        }
    }

    public void update() {}
    
    public int getId() {
        return this.id;
    }
    
}
