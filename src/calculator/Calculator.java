/*
 * Main file that creates GUI frame. 
 * @author Victor Riveros
 */
package calculator;
import javax.swing.JFrame;

public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new CalculatorGUI();
        frame.setTitle ("GUI.Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
