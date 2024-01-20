/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avisos.infra.interfaces;

import avisos.infra.hibernate.AvisoDAOhibernate;

/**
 *
 * @author ht300810x
 */
public class IAvisoFactory {
    
    public static IAvisoDAO fabricar(){
        return new AvisoDAOhibernate();
    }
    
}
