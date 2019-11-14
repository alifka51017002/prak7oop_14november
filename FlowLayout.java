/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowlayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
/**
 *
 * @author User
 */
public class FlowLayout extends JFrame{

    /**
     * @param args the command line arguments
     */
    
    public FlowLayout() {
        // membuat objek layout manager
        FlowLayout FlowLayout = new FlowLayout (FlowLayout.CENTER, 5 ,10);
        
        // memperoleh konten pane dari frame
        Container container = getContentPane();
        // mengatur layout manager dari konten pane
        container.add(new JButton ("tombol 1"));
        container.add(new JButton ("tombol 2"));
        container.add(new JButton ("tombol 3"));
        container.add(new JButton ("tombol 4"));
        container.add(new JButton ("tombol 5"));
        
    }
    public static void main(String[] args) {
        // TODO code application logic her
        Flowlayout jendela = new Flowlayout();
        jendela.setTitle("Kelas demoflowlayout");
        jendela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
