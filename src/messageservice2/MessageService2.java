/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice2;

/**
 *
 * @author Mitch
 */
public class MessageService2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Liskov's substitution method in place here. 
         * MessageInput/output stays the same. 
         * Can change ConsoleMessageInput to GuiMessageInput without any other changes. (line 22)
        */
        MessageInput input = new ConsoleMessageInput();
        MessageOutput output = new GuiMessageOutput();
        
        //Line 26 instantiates a MessageManager through the constructor we created in MessageManager
        MessageManager service = new MessageManager(input, output);
        //Lines 28/29 instantiates a messageManager through the default constructor. They both work in the same way.
        service.setInput(input);
        service.setOutput(output);
        service.processMessage();
    }
    
}
