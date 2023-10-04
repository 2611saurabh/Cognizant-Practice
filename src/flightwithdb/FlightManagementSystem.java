package flightwithdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;

public class FlightManagementSystem {
    Scanner sc = new Scanner(System.in);

    public boolean addFlight(Flight flightobj) {

        try {
            Connection conn = DB.getConnection();

            String query = "insert into flight (flightId,source, destination,noofseats,flightFare) vlaues(?,?,?,?,?);";

            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, flightobj.getFlightId());
            preparedStatement.setString(2, flightobj.getSource());
            preparedStatement.setString(3, flightobj.getDestination());
            preparedStatement.setInt(4, flightobj.getNoOfSeats());
            preparedStatement.setDouble(5, flightobj.getFlightFare());

            preparedStatement.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

}
