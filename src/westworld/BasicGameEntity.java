/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package westworld;

/**
 * Basic game entity... tried to adapt this to java from a C++ tutorial.
 * @author Chris
 */
public class BasicGameEntity {

    private int m_id;
    private static int m_iNextValidId;
    
    private void SetId(int val) {
        if(val >= m_iNextValidId) {
            m_id = val;
            m_iNextValidId = val + 1;
        }
    }
    
    public BasicGameEntity(int id) {
        this.SetId(id);
    } 

    public void Update() {};
    
    public int ID() {
        return this.m_id;
    }
    
}
