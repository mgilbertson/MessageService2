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
public class MessageManager {
    private MessageInput input;
    private MessageOutput output;
    
    public MessageManager(){
        
    }
    
    public MessageManager(MessageInput input, MessageOutput output){
        this.input = input;
        this.output = output;
    }
	
    //Encapsulated method. Calls the the input method getMessage
    public void processMessage(){
        String message = input.getMessage();
        output.outputMessage(message);
    }

    public MessageInput getInput() {
        return input;
    }

    public void setInput(MessageInput input) {
        if (input == null){
            //notify user input is invalid
        }
        this.input = input;
    }

    public MessageOutput getOutput() {
        return output;
    }

    public void setOutput(MessageOutput output) {
        this.output = output;
    }

    
}
