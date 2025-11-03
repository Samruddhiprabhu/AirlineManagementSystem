package airlinemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class home extends JFrame implements ActionListener{
    
   public home(){
      
       setLayout(null);
       ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/front.jpg"));
       JLabel image=new JLabel(im);
       image.setBounds(0, 0, 1600, 800);
       add(image);
       
       JLabel heading=new JLabel("AIR INDIA WELCOMES YOU");
       heading.setBounds(500, 40, 600, 40);
       heading.setFont(new Font("Arial", Font.BOLD, 38)); 
       heading.setForeground(Color.BLACK);
       image.add(heading);
   
       JMenuBar mb =new JMenuBar();
       setJMenuBar(mb);
       
       JMenu details=new JMenu("Details");
       mb.add(details);
       
       JMenuItem FlightDetails=new JMenuItem("Flight Details");
       FlightDetails.addActionListener(this);
       details.add(FlightDetails);
       
      JMenuItem customerDetails=new JMenuItem("Customer Details");
      customerDetails.addActionListener(this);
       details.add(customerDetails);
       
         JMenuItem bookflight=new JMenuItem("Book Flight");
         bookflight.addActionListener(this);
       details.add(bookflight);
       
         JMenuItem journeydetails=new JMenuItem("Journey Details");
         journeydetails.addActionListener(this);
       details.add(journeydetails);
       
       JMenuItem ticketcancellation=new JMenuItem("Cancel Tickets");
       ticketcancellation.addActionListener(this);
       details.add(ticketcancellation);
       
       JMenu tickets=new JMenu("Tickets");
       tickets.addActionListener(this);
       mb.add(tickets);
       
       JMenuItem BoardingPass=new JMenuItem("Boarding Pass");
       BoardingPass.addActionListener(this);
        tickets.add(BoardingPass);
       
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        


   }    
        public void actionPerformed(ActionEvent ae) {
            String text=ae.getActionCommand();
            if(text.equals("Customer Details")){
                new AddCustomer();
            }else  if(text.equals("Flight Details")){
                new FlightInfo();
            }else if(text.equals("Book Flight")){
                new BookFlight();
            }else if(text.equals("Journey Details")){
                new JourneyDetails();
            }else if(text.equals("Cancel Tickets")){
                new Cancel();
            }else if(text.equals("Book Flight")){
                new BookFlight();
            }else if(text.equals("Boarding Pass")){
                new BoardingPass();
            }
            
   
}

    

    public static void main(String args[]){
        new home();
    }
}

