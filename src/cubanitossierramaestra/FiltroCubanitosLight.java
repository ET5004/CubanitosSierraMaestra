/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubanitossierramaestra;

/**
 *
 * @author developer
 */
public class FiltroCubanitosLight extends FiltroCubanito {
    private static final int caloriasMaximas = 2000;
    
    @Override
    public boolean cumple(Cubanito c) {
        if(c.getCalorias() < caloriasMaximas){
            return true;
        }else{
            return false;
        }
    }
    
}
