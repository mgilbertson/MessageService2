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
public class GuiMessageInput implements MessageInput{

    @Override
    public String getMessage() {
        String message = JOptionPane.showInputDialog("Enter your message");
        return message;
    }
    
}
