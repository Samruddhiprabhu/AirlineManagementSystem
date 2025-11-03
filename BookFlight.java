
package airlinemanagementsystem;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import static javax.swing.UIManager.getString;

public class BookFlight extends JFrame implements ActionListener{
     JLabel lbldest,tfname,tfnationality, tfaddressr,lblgender,lblflightC,lblflightname;
     JTextField tfadhar;
     JButton fetchButton,flight,Bookflight;
     Choice source,destination;
     JDateChooser dcdate;
     
    public BookFlight(){
        getContentPane().setBackground(Color.BLACK);
       setLayout(null);
      
       JLabel heading=new JLabel("Book Flight");
       heading.setBounds(220,30,300,30);
       heading.setForeground(Color.WHITE);
       heading.setFont(new Font("Arial", Font.BOLD, 22)); 
       add(heading);
       
       
       JLabel Cadhar=new JLabel("Aadhar:");
       Cadhar.setBounds(30,80,200,20);
       Cadhar.setForeground(Color.WHITE);
       Cadhar.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(Cadhar);
       
       tfadhar=new JTextField();
       tfadhar.setBounds(160,80,200,20);
       add(tfadhar);
       
       fetchButton=new JButton("FETCH USER");
       fetchButton.setBounds(380,80,160,20);
       fetchButton.setForeground(Color.BLACK);
       fetchButton.setBackground(Color.WHITE);
       fetchButton.setFont(new Font("Arial", Font.BOLD, 15)); 
       fetchButton.addActionListener(this);
       add(fetchButton);
       
       
        JLabel CName=new JLabel("Name:");
      CName.setBounds(30,120,100,20);
       CName.setForeground(Color.WHITE);
       CName.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(CName);
       
         tfname=new JLabel();
          tfname.setForeground(Color.WHITE);
       tfname.setBounds(160,120,240,20);
       tfname.setFont(new Font("Arial", Font.BOLD, 18));
       add(tfname);
       
         JLabel CNationality=new JLabel("Nationality:");
      CNationality.setBounds(30,160,200,20);
       CNationality.setForeground(Color.WHITE);
       CNationality.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(CNationality);
       
       tfnationality=new JLabel();
        tfnationality.setForeground(Color.WHITE);
       tfnationality.setBounds(160,160,240,20);
       tfnationality.setFont(new Font("Arial", Font.BOLD, 18));
       add(tfnationality);
       
       
         JLabel Caddress=new JLabel("Address:");
     Caddress.setBounds(30,200,200,20);
       Caddress.setForeground(Color.WHITE);
       Caddress.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(Caddress);
       
       tfaddressr=new JLabel();
       tfaddressr.setBounds(160,200,240,20);
        tfaddressr.setForeground(Color.WHITE);
        tfaddressr.setFont(new Font("Arial", Font.BOLD, 18));
       add(tfaddressr);
       
      JLabel lbelgender=new JLabel("Gender:");
     lbelgender.setBounds(30,240,200,20);
       lbelgender.setForeground(Color.WHITE);
       lbelgender.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(lbelgender);
       
       lblgender=new JLabel();
       lblgender.setBounds(160,240,240,20);
       lblgender.setForeground(Color.WHITE);
       lblgender.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(lblgender);
      
        JLabel lblsource=new JLabel("Source:");
     lblsource.setBounds(30,280,100,20);
       lblsource.setForeground(Color.WHITE);
       lblsource.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(lblsource);
       
       source=new Choice();
       source.setBounds(160,280,200,20);
       add(source);
       
        lbldest=new JLabel("Destination:");
     lbldest.setBounds(30,320,130,20);
       lbldest.setForeground(Color.WHITE);
       lbldest.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(lbldest);
       
       destination=new Choice();
       destination.setBounds(160,320,200,20);
       add(destination);
       
       try{
           connection c=new connection();
           String query="select * from flight";
           ResultSet rs=c.s.executeQuery(query);
           while(rs.next()){
               source.add(rs.getString("source"));
               destination.add(rs.getString("destination"));
           }
           
       }
       catch(Exception e){
           e.printStackTrace();
           
       }
       
       
        flight=new JButton("Fetch Flights");
       flight.setBounds(380,320,150,20);
       flight.setForeground(Color.BLACK);
       flight.setBackground(Color.WHITE);
       flight.setFont(new Font("Arial", Font.BOLD, 15)); 
       flight.addActionListener(this);
       add(flight);
       
       
        JLabel lblfgtname=new JLabel("Flight Name");
       lblfgtname.setBounds(30,360,200,20);
       lblfgtname.setForeground(Color.WHITE);
       lblfgtname.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(lblfgtname);
       
       lblflightname=new JLabel();
       lblflightname.setBounds(160,360,240,20);
       lblflightname.setBounds(160,360,240,20);
       lblflightname.setForeground(Color.WHITE);
       lblflightname.setFont(new Font("Arial", Font.BOLD, 18));
       add(lblflightname);
       
       JLabel lblfgtC=new JLabel("Flight Code");
       lblfgtC.setBounds(30,400,200,20);
       lblfgtC.setForeground(Color.WHITE);
       lblfgtC.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(lblfgtC);
       
       lblflightC=new JLabel();
       lblflightC.setBounds(160,400,240,20);
       lblflightC.setBounds(160,400,240,20);
       lblflightC.setForeground(Color.WHITE);
       lblflightC.setFont(new Font("Arial", Font.BOLD, 18));
       add(lblflightC);
       
       JLabel lbldate=new JLabel("Date of Travel");
       lbldate.setBounds(30,440,200,20);
       lbldate.setForeground(Color.WHITE);
       lbldate.setFont(new Font("Arial", Font.BOLD, 18)); 
       add(lbldate);
       
        dcdate=new JDateChooser();
       dcdate.setBounds(160,440,240,20);
       add(dcdate);
       
       Bookflight=new JButton("Book Flight");
       Bookflight.setBounds(180,490,150,30);
       Bookflight.setForeground(Color.BLACK);
       Bookflight.setBackground(Color.WHITE);
       Bookflight.setFont(new Font("Arial", Font.BOLD, 15)); 
       Bookflight.addActionListener(this);
       add(Bookflight);
       
        setVisible(true);
        setSize(600,600);
        setLocation(400,130);
    }
    
      @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==fetchButton)
        {
            
        String aadhar=tfadhar.getText();
       
        
        try{
            connection c = new connection();
            
             String query = "select * from passenger where aadhar='"+aadhar+"'";
             ResultSet rs=c.s.executeQuery(query);
             
             
             if(rs.next()){
                 tfname.setText(rs.getString("name"));
                 tfnationality.setText(rs.getString("nationality"));
                 tfaddressr.setText(rs.getString("address"));
                 lblgender.setText(rs.getString("gender"));
             }else{
                  JOptionPane.showMessageDialog(null, "Please enter correct aadhar");
             }
           
        }catch(Exception e){
            e.printStackTrace();
        }
        }else  if(ae.getSource()==flight)
        {
            
        String src=source.getSelectedItem();
        String dest=destination.getSelectedItem();
       
        
        try{
            connection c = new connection();
            
             String query = "select * from flight where source='"+src+"'and destination='"+dest+"'";
             ResultSet rs=c.s.executeQuery(query);
             
             
             if(rs.next()){
                 lblflightname.setText(rs.getString("f_name"));
                 lblflightC.setText(rs.getString("f_code"));
                
             }else{
                  JOptionPane.showMessageDialog(null, "NO flight found");
             }
           
        }catch(Exception e){
            e.printStackTrace();
        }
            
        }else{
             Random random = new Random();
             String aadhar=tfadhar.getText();
             String name=tfname.getText();
             String nationality=tfnationality.getText();
             
             String flightname=lblflightname.getText();
             String flightcode=lblflightC.getText();
             String src=source.getSelectedItem();
             String des=destination.getSelectedItem();
             String ddate=((JTextField)dcdate.getDateEditor().getUiComponent()).getText();
              try{
              connection conn = new connection();

            String query = "insert into reservation values('PNR-"+random.nextInt(1000000)+"', 'TIC-"+random.nextInt(10000)+"', '"+aadhar+"', '"+name+"', '"+nationality+"', '"+flightname+"', '"+flightcode+"', '"+src+"', '"+des+"', '"+ddate+"')";

            conn.s.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "Ticket Booked Successfully");

            setVisible(false);
             

           
        }catch(Exception e){
            e.printStackTrace();
        }
        
             
        }
    }

    public static void main(String args[]){
        new BookFlight();
    }

  
   
}
