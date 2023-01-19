
package test;

import datos.Conexion;
import datos.UsuarioDAO;
import domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestManejoUsuarios {
    public static void main(String[] args) {
//        var usuarioDao = new UsuarioDAO();
        

        // insertar nuevas personas
//        var usuario = new Usuario("LuisMaria", "mluis1975");
//        usuarioDao.insertar(usuario);
        //actulaizar registro
//        var usuarioActulizado = new Usuario(2, "JoseLuis", "blablabla");
//        usuarioDao.actualizarRegitro(usuarioActulizado);
        
        // eliminar registro
//        var usuarioEliminar = new Usuario(2);
//        usuarioDao.eliminarRegistro(usuarioEliminar);
        

        Connection conexion = null;
        
        try {
            conexion = Conexion.getConexion();
            
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            
            var usuarioDao = new UsuarioDAO(conexion);
            
            var usuarioNuevo = new Usuario( "MartinaOLa", "123456");
            usuarioDao.insertar(usuarioNuevo);
            
            
            usuarioNuevo = new Usuario( "JuanHola", "456789");
            usuarioDao.insertar(usuarioNuevo);
            
            usuarioNuevo = new Usuario( "MIliPili", "123456");
            usuarioDao.insertar(usuarioNuevo);
            
            
            var usuarioActulizado = new Usuario(3, "LuisMaria", "lmaria1234");
            usuarioDao.actualizarRegitro(usuarioActulizado);
            
            
            
            
            
            // listar objetos en consola 
            List<Usuario> usuarios = usuarioDao.seleccionar();
            usuarios.forEach((usuarioPrint) -> {
                System.out.println("Usuario = " + usuarioPrint);
                
            });
            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion Exitosamente!!");
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        
    }
}

