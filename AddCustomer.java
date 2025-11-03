
package airlinemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AddCustomer extends JFrame implements ActionListener{
     JTextField tfname,tfnationality,tfadhar, tfaddressr,tfphone;
    JRadioButton rbmale,rbfemale;
    public AddCustomer(){
        getContentPane().setBackground(Color.BLACK);
       setLayout(null);
      
       JLabel heading=new JLabel("Add Customer Details");
       heading.setBounds(190,20,300,20);
       heading.setForeground(Color.WHITE);
       heading.setFont(new Font("Arial", Font.BOLD, 22)); 
       add(heading);
       
        JLabel CName=new JLabel("Name:");
      CName.setBounds(30,80,100,20);
       CName.setForeground(Color.WHITE);
       CName.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(CName);
       
         tfname=new JTextField();
       tfname.setBounds(160,80,240,20);
       add(tfname);
       
         JLabel CNationality=new JLabel("Nationality:");
      CNationality.setBounds(30,120,200,20);
       CNationality.setForeground(Color.WHITE);
       CNationality.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(CNationality);
       
       tfnationality=new JTextField();
       tfnationality.setBounds(160,120,240,20);
       add(tfnationality);
       
         JLabel Cadhar=new JLabel("Aadhar:");
     Cadhar.setBounds(30,160,200,20);
       Cadhar.setForeground(Color.WHITE);
       Cadhar.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(Cadhar);
       
       tfadhar=new JTextField();
       tfadhar.setBounds(160,160,240,20);
       add(tfadhar);
       
         JLabel Caddress=new JLabel("Address:");
     Caddress.setBounds(30,200,200,20);
       Caddress.setForeground(Color.WHITE);
       Caddress.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(Caddress);
       
       tfaddressr=new JTextField();
       tfaddressr.setBounds(160,200,240,20);
       add(tfaddressr);
       
       JLabel Cgender=new JLabel("Gender:");
     Cgender.setBounds(30,240,200,20);
       Cgender.setForeground(Color.WHITE);
       Cgender.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(Cgender);
       
       ButtonGroup bg=new ButtonGroup();
        rbmale=new JRadioButton("Male");
        rbmale.setBounds(160,240,70,20);
        rbmale.setBackground(Color.BLACK);
        rbmale.setForeground(Color.WHITE);
       add(rbmale);
         
        rbfemale=new JRadioButton("Female");
        rbfemale.setBounds(250,240,70,20);
        rbfemale.setBackground(Color.BLACK);
         rbfemale.setForeground(Color.WHITE);
       add(rbfemale);
       
       bg.add(rbmale);
       bg.add(rbfemale);
       
        JLabel Cphone=new JLabel("Phone:");
     Cphone.setBounds(30,280,200,20);
       Cphone.setForeground(Color.WHITE);
       Cphone.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(Cphone);
       
        tfphone=new JTextField();
       tfphone.setBounds(160,280,240,20);
       add(tfphone);
       
       JButton save=new JButton("SAVE");
       save.setBounds(230,340,100,30);
       save.setForeground(Color.BLACK);
       save.setBackground(Color.WHITE);
       save.setFont(new Font("Arial", Font.BOLD, 15)); 
       save.addActionListener(this);
       add(save);
       
        setVisible(true);
        setSize(600,500);
        setLocation(400,150);
    }
    
      @Override
    public void actionPerformed(ActionEvent ae) {
        String name=tfname.getText();
        String nationality=tfnationality.getText();
        String phone=tfphone.getText();
        String address= tfaddressr.getText();
        String aadhar=tfadhar.getText();
        String gender=null;
        if(rbmale.isSelected()){
            gender="Male";
        }
        else{
            gender="Female";
        }
        try{
            connection c = new connection();
            
             String query = "insert into passenger values('"+name+"','"+nationality+"','"+phone+"','"+gender+"','"+aadhar+"','"+gender+"')";
             c.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Customer Details added Successfully");
             setVisible(false);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        new AddCustomer();
    }

  
   
}
