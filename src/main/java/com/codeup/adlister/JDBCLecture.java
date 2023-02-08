package com.codeup.adlister;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;
import dao.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCLecture {
    public static void main(String[] args) {

        try {
            DriverManager.registerDriver(new Driver());
            Config config = new Config();
            Connection connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );

            Statement stmt = connection.createStatement();
            //ResultSet rs = stmt.executeQuery("SELECT * FROM albums");
            stmt.executeUpdate("INSERT INTO albums (artist_name, album_name, release_date, sales, genre) VALUES('Nelly Furtado', 'Loose', 2006, 12.5, 'Dance-pop, hip hop, R&B')" , Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                System.out.println("Inserted a new record! New id: " + rs.getLong(1));
            }


            List<Album> albums = new ArrayList<>();

            while (rs.next()) {
                albums.add(
                        new Album(
                                rs.getLong("id"),
                                rs.getString("artist"),
                                rs.getString("name"),
                                rs.getInt("release_date"),
                                rs.getDouble("sales"),
                                rs.getString("genre")
                        ));
            }

            for(int i = 0; i < albums.size(); i++){
                System.out.println(albums.toString());
            }

        }
        catch (SQLException e) {
            throw new RuntimeException("Error connecting to database.", e);
        }
    }
}
