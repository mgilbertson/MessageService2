/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice2;
import java.util.Scanner;
/**
 *
 * @author Mitch
 */
public class ConsoleMessageInput implements MessageInput{

    @Override
    public Message getMessage() {
        Scanner keyboardScanner = new Scanner(System.in);
        return keyboardScanner.nextLine();
    }
    
}
