/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package avisos.infra.interfaces;

import avisos.model.Aviso;
import java.util.List;

/**
 *
 * @author ht300810x
 */
public interface IAvisoDAO {
    public abstract void inserir(Aviso aviso);
    public abstract List<Aviso> recuperarTodos();
    
}
