package ar.com.agus.introduccionjdbc;

import java.sql.*;

public class TestMySqlJDBC {

    public static void main(String[] args) throws SQLException {

        var url = "jdbc:mysql://localhost:3306/test?SSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrival=true";
        //Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexion = DriverManager.getConnection(url, "root", ""); // conexion a la base de datos 
        Statement instruccion = conexion.createStatement(); // par apoder executar la orden/ consulta o accion
        var sql = "SELECT id_persona, nombre, apellido, email, telefono from persona";
        var sql2 = "insert into persona(nombre,apellido,email,telefono)values('Jose','Urgelio', \"jose@gmail.com\",'1123456789');";
        ResultSet resultado = instruccion.executeQuery(sql);
        while (resultado.next()) {
            System.out.println("id persona: " + resultado.getInt("id_persona")
                    + ", el Nombre es: " + resultado.getString("nombre")
                    + ", el Apellido es: " + resultado.getString("apellido")
                    + ", el email es: " + resultado.getString("email")
                    + ", el telefono es: " + resultado.getString("telefono"));
        }
        resultado.close();
        instruccion.close();
        conexion.close();
        System.out.println(resultado);
    }
}
