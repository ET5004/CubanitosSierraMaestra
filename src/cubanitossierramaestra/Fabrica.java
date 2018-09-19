/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubanitossierramaestra;

import java.util.ArrayList;

/**
 *
 * @author developer
 */
public class Fabrica {
    private ArrayList<Cubanito> cubanitos;
    
    
    public Fabrica(){
        cubanitos = new ArrayList<>();
    }
    
    public Cubanito[] hacerPedido(int cantidad, FiltroCubanito filtro) throws StockException{
        Cubanito[] pedido = new Cubanito[cantidad];
        
        for(int i = 0; i < cantidad; i++){
            int cubanitoASacar = -1;
            
            for(int j = 0; j < cubanitos.size(); j++){
                if(filtro.cumple(cubanitos.get(j)) ){
                    cubanitoASacar = j;
                }
            }
            
            if(cubanitoASacar < 0){
                // reponer stock sacado
                cargarStock(pedido);
                throw new StockException("Sin stock");
            }
            
            pedido[i] = cubanitos.get(cubanitoASacar);
            cubanitos.remove(cubanitoASacar);
        }
        
        return pedido;
    }

    private void cargarStock(Cubanito[] pedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
