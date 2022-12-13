/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ws.Wsoperaciones_Service;
import ws.Wsoperaciones;

public class TestWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Wsoperaciones_Service service=new Wsoperaciones_Service();
       Wsoperaciones cliente=service.getWsoperacionesPort();
       
       if(cliente.loggin("paver", "123")){
           System.out.println("credenciales correctas");
       }else{
           System.out.println("credenciales incorrectas");
       }
       
        System.out.println(cliente.procesarPago(200, 2000));
    }
    
}
