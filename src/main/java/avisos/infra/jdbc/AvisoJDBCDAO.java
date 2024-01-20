/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avisos.infra.jdbc;

import avisos.infra.interfaces.IAvisoDAO;
import avisos.model.Aviso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class AvisoJDBCDAO implements IAvisoDAO {

    @Override
    public void inserir(Aviso aviso) {
       try {
            Connection conn =  ConnectionFactory.getConnection();
            
            PreparedStatement stam = conn.prepareStatement(
                "INSERT INTO aviso "
                        + "(titulo, autor, texto) "
                        + "VALUES (?, ?, ?);");

            stam.setString(1,aviso.getTitulo());
            stam.setString(2, aviso.getAutor());
            stam.setString(3, aviso.getTexto());
            
            stam.executeUpdate();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Aviso> recuperarTodos() {
               List<Aviso> avisos = new ArrayList<Aviso>();
        try {
            Connection conn =  ConnectionFactory.getConnection();
            PreparedStatement stam = conn.prepareStatement(
                    "SELECT * FROM aviso;");
            
            ResultSet rs = stam.executeQuery();
            while(rs.next()) {
                Aviso aviso = new Aviso();
                aviso.setCodigo(rs.getInt("codigo"));
                aviso.setTitulo(rs.getString("titulo"));
                aviso.setAutor(rs.getString("autor"));
                aviso.setTexto(rs.getString("texto"));
                
                avisos.add(aviso);
            }
      } catch(Exception e) {
            e.printStackTrace();
        }
        
        return avisos;
    }

}
    