/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program.Objects;

import Program.Main;

/**
 *
 * @author moham
 */
public class Switch extends Asset{
    
    private int PortNumber;
    private boolean Manageable;
    
    public Switch (String model, String BDate, String[] location, String state,
            int pn, boolean m){
        
        // set asset values
        this.setID();
        this.setType();
        this.setBDate(BDate);
        this.setModel(model);
        this.setLocation(location);
        this.setState(state);
        
        // set switch values
        this.setPortNumber(pn);
        this.setManageable(m);
    }
    
    private void setID(){
        super.ID = 3000 + Main.switches.size();
    }
    public int getID(){
        return super.ID;
    }

    public final void setPortNumber(int pn) {
        PortNumber = pn;
    }
    public int getPortNumber(){
        return PortNumber;
    }

    public final void setManageable(boolean m) {
        Manageable = m;
    }
    public boolean getManageable(){
        return Manageable;
    }

    private void setType() {
        Type = 1;
    }
    
}
