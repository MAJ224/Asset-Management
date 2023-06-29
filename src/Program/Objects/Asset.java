/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program.Objects;

import Program.Enums.State;

/**
 *
 * @author moham
 */
public abstract class Asset {

    protected int ID;
    protected int Type;
    private String BDate;
    private String Model;
    private String[] Location;
    private State state;

    public void setModel(String S) {
        Model = S;
    }
    public String getModel() {
        return Model;
    }
    protected void setBDate(String Bdate) {
        BDate = Bdate;
    }
    public String getBDate() {
        return BDate;
    }
    public void setLocation(String[] s) {
        Location = s;
    }
    public String[] getLocation() {
        return Location;
    }
    public void setState(String S) {
        if (S.equals("Working_Fine")){
            state = State.Working_Fine;
        } else if (S.equals("Working_Broken")){
            state = State.Working_Broken;
        } else {
            state = State.Retired;
        }
        
    }
    public State getState() {
        return state;
    }
    public int getType(){
        return Type;
    }
    @Override
    public String toString(){
        return Integer.toString(ID);
    }
}
