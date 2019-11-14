/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridlayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
/**
 *
 * @author User
 */
public class Gridlayout extends JFrame {
    JButton marcia = new JButton("marcia");
    JButton carol = new JButton("carol");
    JButton greg = new JButton("greg");
    JButton jan = new JButton("jan");
    JButton alice = new JButton("alice");
    JButton peter = new JButton("peter");
    JButton mike = new JButton("mike");
     JButton cindy = new JButton("cindy");
    JButton bobby = new JButton("bobby");

    public Gridlayout(){
    super("grid layout beraksi");
        setSize(260, 260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        Gridlayout family = new Gridlayout(3, 3, 10, 10);
        pane.setLayout(family);
        pane.add(marcia); pane.add(carol);
        pane.add(greg); pane.add(jan);
        pane.add(alice); pane.add(peter);
        pane.add(cindy); pane.add(mike);
        pane.add(bobby);
        add(pane);
        setVisible(true);
        
        
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gridlayout frame = new Gridlayout();
    }
    
}
