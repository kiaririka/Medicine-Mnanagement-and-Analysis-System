/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author 91943
 */
public class Tables {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
st.executeUpdate("CREATE TABLE medicine (medicine_pk INT AUTO_INCREMENT, uniqueId VARCHAR(20),name VARCHAR(50) NOT NULL,companyName VARCHAR(50) NOT NULL,quantity INT NOT NULL,price DECIMAL(10,2) NOT NULL,PRIMARY KEY (medicine_pk, uniqueId))");

st.executeUpdate("CREATE TABLE bill (bill_pk INT AUTO_INCREMENT,bill_id BIGINT NOT NULL,billdate DATE NOT NULL, totalpaid DECIMAL(10,2) NOT NULL,quantity INT NOT NULL,PRIMARY KEY (bill_pk, bill_id))");

st.executeUpdate("CREATE TABLE datesales (bill_id BIGINT NOT NULL,uniqueId VARCHAR(20) NOT NULL,quantity INT NOT NULL,price DECIMAL(10,2) NOT NULL,PRIMARY KEY (bill_id, uniqueId),FOREIGN KEY (bill_id) REFERENCES bill(bill_id),FOREIGN KEY (uniqueId) REFERENCES medicine(uniqueId))");
//st.executeUpdate("CREATE TABLE datesales (date DATE NOT NULL, uniqueId VARCHAR(20) NOT NULL, name VARCHAR(50) NOT NULL, companyname VARCHAR(50) NOT NULL, price DECIMAL(10,2) NOT NULL, unit INT NOT NULL, subtotal DECIMAL(10,2) NOT NULL, bill_pk INT NOT NULL, bill_id INT NOT NULL, PRIMARY KEY (uniqueId, bill_pk, bill_id), FOREIGN KEY (uniqueId) REFERENCES medicine(uniqueId), FOREIGN KEY (bill_pk, bill_id) REFERENCES bill(bill_pk, bill_id))");

//st.executeUpdate("CREATE TABLE bill (bill_pk INT AUTO_INCREMENT PRIMARY KEY, bill_id INT NOT NULL, billdate DATE NOT NULL, totalpaid DECIMAL(10,2) NOT NULL, quantity INT NOT NULL, UNIQUE KEY (bill_id))");

//st.executeUpdate("CREATE TABLE datesales (date DATE NOT NULL, uniqueId VARCHAR(20) NOT NULL, name VARCHAR(50) NOT NULL, companyname VARCHAR(50) NOT NULL, price DECIMAL(10,2) NOT NULL, unit INT NOT NULL, subtotal DECIMAL(10,2) NOT NULL, bill_pk INT NOT NULL, bill_id INT NOT NULL, PRIMARY KEY (uniqueId, bill_pk, bill_id), FOREIGN KEY (uniqueId) REFERENCES medicine(uniqueId), FOREIGN KEY (bill_pk, bill_id) REFERENCES bill(bill_pk, bill_id))");


//            st.executeUpdate(
//                    "create table datesales(date varchar(200),medId int, name varchar(200), companyName varchar(50), price bigint, unit bigint, subTotal bigint)");

//            st.executeUpdate(
//                    "create table datesales(medId int,name varchar(200),companyName varchar(50),price bigint,unit bigint,subTotal bitint");
//            st.executeUpdate(
//                    "create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200),dob varchar(50),mobileNumber varchar(50),email varchar(200),username varchar(200),password varchar(50),address varchar(200))");
//            st.executeUpdate("create table medicine(medicine_pk int AUTO_INCREMENT primary key,uniqueId varchar(200),name varchar(200),companyName varchar(200),quantity bigint,price bigint)");
//            st.executeUpdate("create table bill (bill_pk int AUTO_INCREMENT primary key,billId varchar(200),billDate varchar(50),totalPaid bigint,generatedBy varchar(50))");
//            st.executeUpdate("insert into bill (bill_pk,billId,billDate,totalPaid,generatedBy) values('3','BillId:1098292132132','24-04-2024','900')");

//            st.executeUpdate("insert into appuser (userRole,name,dob,mobileNumber,email,username,password,address) values('Admin','Admin','26-08-2001','0908070605','admin@email.com','admin','12345','India')");
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
