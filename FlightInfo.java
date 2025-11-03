package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class FlightInfo extends JFrame {
    public FlightInfo() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JTable table = new JTable();
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 0, 800, 500);
        add(jsp);

        try {
            // Assuming you have a custom class named 'connection' that creates DB connection
            connection c = new connection();  // Make sure this is defined correctly

            ResultSet rs = c.s.executeQuery("SELECT * FROM flight");

            // Set the ResultSet as the model for JTable
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ae) {
            ae.printStackTrace();
        }

        setSize(800, 500);
        setLocation(400, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlightInfo();
    }
}
