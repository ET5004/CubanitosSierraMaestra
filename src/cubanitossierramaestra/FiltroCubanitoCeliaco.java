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
public class FiltroCubanitoCeliaco extends FiltroCubanito{

    @Override
    public boolean cumple(Cubanito c) {
        if(c instanceof CubanitoCeliaco){
            return true;
        }else{
            return false;
        }           
    }
    
    
}
