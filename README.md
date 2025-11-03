# Airline Management System (Java Swing & MySQL)
This project is a desktop-based Airline Management System developed using Java Swing for the graphical user interface and MySQL for database management. It provides a simple, functional interface for managing flight and passenger information, booking tickets, viewing flight details, and canceling reservations.

# Features

* User Authentication: Secure login for system access.
* Customer Management: Add new passenger details (Name, Nationality, Aadhar, Address, Gender, Phone).
* Flight Information: View a list of all available flights (assuming data is pre-populated in the `flight` table).
* Flight Booking: Book a flight by fetching existing customer details, selecting source/destination, and viewing available flights.
* Journey Details: Search and display reservation details using the PNR (Passenger Name Record) number.
* Boarding Pass Generation: Generate a basic boarding pass by entering the PNR.
* Ticket Cancellation: Cancel a reserved ticket using the PNR, which generates a cancellation record and deletes the reservation.

# Technologies Used

* Frontend: Java Swing
* Backend/Logic: Java (JDBC)
* Database: MySQL
