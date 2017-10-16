import javax.swing.*;
import java.awt.*;



public class Testing extends JFrame {


    /**
     * This is the default constructor
     */

  public void buttomActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        
        
        System.out.println("buttom pressed");
    } 






    public static void main(String[] args) throws Exception{
    
        JFrame frame = new JFrame();        
        frame.setSize(300,300);
        

        JPanel panel = new JPanel();
        //panel.setBounds(61, 11, 81, 140);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

     

        JButton buttom = new JButton();
        buttom.setText("hide");
        buttom.addActionListener(
            new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomActionPerformed(evt);
            }
        });

        
        JLabel label = new JLabel("Hide me please!");

        panel.add(label);
        panel.add(buttom);



        //label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        frame.add(panel);

        

        frame.setVisible(true);

    }
}



