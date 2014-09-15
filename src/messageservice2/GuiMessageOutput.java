/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice2;
import javax.swing.JOptionPane;

/**
 *
 * @author Mitch
 */
public class GuiMessageOutput implements MessageOutput{

    @Override
    public void outputMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
}
