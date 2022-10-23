



package gestionparcmoto;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connexion {

    private Connection con = null;
    private Statement stmt = null;

    /**
     * Creates a new instance of Connexion
     */
    public connexion() {
        String username = "root";
        String password = "";

        String url;
        url = "jdbc:mysql://localhost:3306/gestion_parc_scooter";
          try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }
        
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("OK connexion réussie...");
            stmt = con.createStatement();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Statement getStmt() {
        return stmt;
    }

    public Connection getCon() {
        return con;
    }

    public void close() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
