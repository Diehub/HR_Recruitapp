/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HR_Management;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class Java_CRUD extends Thread{

    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/hrd";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // TODO code application logic here
        Screen sc=new Screen();
        sc.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                
                Thread.sleep(40);
                sc.numb.setText(Integer.toString(i)+"%");
                Home hm=new Home();
                
                if(i==100){
                    sc.dispose();
                    hm.show();
                }
            }
        } catch (InterruptedException e) {
        }
        
        /*
        try {
            // register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);
            
            // buat koneksi ke database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            // buat objek statement
            stmt = conn.createStatement();
            
            // buat query ke database
            String sql = "SELECT * FROM buku";
            
            // eksekusi query dan simpan hasilnya di obj ResultSet
            rs = stmt.executeQuery(sql);
            
            // tampilkan hasil query
            while(rs.next()){
                System.out.println("ID Karyawan: " + rs.getInt("id_karyawan"));
                System.out.println("Nama: " + rs.getString("karyawan"));
                System.out.println("jabatan: " + rs.getString("jabatan"));
            }
            
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }    
}