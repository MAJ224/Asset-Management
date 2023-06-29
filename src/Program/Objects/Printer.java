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
public class Printer extends Asset{
    
    private boolean ColorPrint;
    
    public Printer (String model, String BDate, String[] location, String state,
            boolean cp){
        
       // set asset values
        this.setID();
        this.setType();
        this.setBDate(BDate);
        this.setModel(model);
        this.setLocation(location);
        this.setState(state); 
        
        // set printer values
        this.setColorPrint(cp);
    }
    
    private void setID(){
        super.ID = 4000 + Main.printers.size();
    }
    public int getID(){
        return super.ID;
    }

    public final void setColorPrint(boolean cp) {
        ColorPrint = cp;
    }
    public boolean getColorPrint(){
        return ColorPrint;
    }

    private void setType() {
        Type = 2;
    }
    
    
    
}
