/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class conexioncliente {
    Connection con;
    public conexioncliente(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyect_login ","root","123456s78");
            
        }catch(Exception e){
            System.err.println("error:"+ e);
            
        }
    }
    public static void main(String[] args) {
        conexioncliente cl= new conexioncliente();
        Statement st;
        ResultSet rs;
        try{
            st=cl.con.createStatement();
            rs=st.executeQuery("select * from clientes");
            while(rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("nombre")+" "+rs.getString("apellido")+" "+rs.getString("direccion"));
              
            } 
            cl.con.close();
        }catch(Exception e){
            
        }
    }
    
}
