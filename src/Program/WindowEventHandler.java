/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author moham
 */
class WindowEventHandler extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent evt) {
        Main.SaveAllData();
    }
}
