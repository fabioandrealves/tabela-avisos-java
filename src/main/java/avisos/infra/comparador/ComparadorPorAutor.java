/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avisos.infra.comparador;

import avisos.model.Aviso;
import java.util.Comparator;

/**
 *
 * @author ht300810x
 */
public class ComparadorPorAutor implements Comparator<Aviso> {

    @Override
    public int compare(Aviso a, Aviso b) {
        return a.getAutor().compareTo(b.getAutor());
    }
    
}
