/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubanitossierramaestra;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author developer
 */
public class CubanitosSierraMaestra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fabrica fabrica = new Fabrica();
        Cubanito[] pedido = null;
        int cantidad = 10;
        boolean noTengoPedido= true;
        while(noTengoPedido){            
            try {
                pedido = fabrica.hacerPedido(cantidad, new FiltroCubanitoCeliaco());
                noTengoPedido = false;
            } catch (StockException ex) {
                cantidad = cantidad - 1;
                //System.out.println("No se pudo realizar el pedido");
            }
        }
        
        System.out.println("El pedido tiene:");
        for(int i = 0; i < pedido.length; i++){
            System.out.println(pedido[i]);
        }
    }
    
}
