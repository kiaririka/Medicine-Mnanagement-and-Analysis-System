/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 91943
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MMA?useSSL=false","root","12345");
        return con;
        }
        catch(Exception e){
            System.out.print(e);
            return null;
        }
    }
    
}
