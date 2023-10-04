package flightwithdb;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class DB {

    private static Connection conn = null;

    private static Properties properties = new Properties();

    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        try{
            FileInputStream fileInputStream =  new FileInputStream("database.properties");
            properties.load(fileInputStream);

            Class.forName(properties.getProperty("DB_DRIVER_CLASS"));
            conn = DriverManager.getConnection(properties.getProperty("DB_URL"),
                properties.getProperty("DB_USERNAME"),properties.getProperty("DB_PASSWORD"));


        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    return conn;

}
