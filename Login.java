package airlinemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton reset,submit,close;
    JTextField tfusername;
    JPasswordField tfpassword;
    
   public Login(){
       getContentPane().setBackground(Color.BLACK);
       setLayout(null);
       
       JLabel lblusername=new JLabel("Username:");
       lblusername.setBounds(120,120,100,20);
       lblusername.setForeground(Color.WHITE);
       lblusername.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(lblusername);
       
       tfusername=new JTextField();
       tfusername.setBounds(220,120,240,20);
       add(tfusername);
       
       JLabel lblpassword=new JLabel("Password:");
       lblpassword.setBounds(120,180,100,20);
       lblpassword.setForeground(Color.WHITE);
       lblpassword.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(lblpassword);
       
       tfpassword=new JPasswordField();
       tfpassword.setBounds(220,180,240,20);
       add(tfpassword);
       
       reset=new JButton("RESET");
       reset.setBounds(120, 250, 150, 30);
       reset.addActionListener(this);
       add(reset);
       
       submit=new JButton("SUBMIT");
       submit.setBounds(310, 250, 150, 30);
       submit.addActionListener(this);
       add(submit);
       
       close=new JButton("CLOSE");
       close.setBounds(210, 310, 150, 30);
       close.addActionListener(this);
       add(close);
       
        setVisible(true);
        setSize(600,500);
        setLocation(400,150);


   }    
        public void actionPerformed(ActionEvent e) {
    if (e.getSource() == submit) {
        String username = tfusername.getText();
        String password = new String(tfpassword.getPassword()); // safer than getText()

        try {
            connection c = new connection();
            
            String query = "SELECT * FROM login WHERE username=? AND `password`=?";
            PreparedStatement pst = c.c.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                new home();
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                setVisible(false);
            }

        } catch (Exception ae) {
            ae.printStackTrace();
        }
    } else if (e.getSource() == close) {
        setVisible(false);
    } else if (e.getSource() == reset) {
        tfusername.setText("");
        tfpassword.setText("");
    }
}

    

    public static void main(String args[]){
        new Login();
    }
}

