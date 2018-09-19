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
public class ChocoCubanito  extends Cubanito {
    private final static int caloriasBaño = 100;

    public ChocoCubanito(int calorias) {
        super(calorias);
    }
   
    @Override
    public int getCalorias(){
        return super.getCalorias() + caloriasBaño;
    }
    
}
