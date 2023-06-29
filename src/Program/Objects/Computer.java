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
public class Computer extends Asset{
    
    private String CPU;
    private String RAM;
    private String Hard;
    private String Graphic;
    
    public Computer (String model, String BDate, String[] location, String state,
            String cpu, String ram, String hard, String graphic){
        
        // set asset values
        setID();
        setType();
        setBDate(BDate);
        setModel(model);        
        setLocation(location);
        setState(state);
        
        // set Computer values
        setCPU(cpu);
        setRAM(ram);
        setHard(hard);
        setGraphic(graphic);
        
    }

    private void setID(){
        ID = 2000 + Main.computers.size();
    }
    public final void setCPU(String s){
        CPU = s;
    }
    public String getCPU(){
        return CPU;
    }
    public final void setRAM(String s){
        RAM = s;
    }
    public String getRAM(){
        return RAM;
    }
    public final void setHard(String s){
        Hard = s;
    }
    public String getHard(){
        return Hard;
    }
    public final void setGraphic(String s){
        Graphic = s;
    }
    public String getGraphic(){
        return Graphic;
    }
    private void setType() {
        Type = 0;
    }
}
