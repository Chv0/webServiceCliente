/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Chv0
 */
@WebService(serviceName = "wsoperaciones")
public class wsoperaciones {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Loggin")
    public Boolean Loggin(@WebParam(name = "user") String user, @WebParam(name = "contrasena") String contrasena) {
        if(user.equals("paver")&& contrasena.equals("ta123")){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ProcesarPago")
    public int ProcesarPago(@WebParam(name = "total_pagar") int total_pagar, @WebParam(name = "total_pago") int total_pago) {
        if(total_pago>=total_pagar){
            return total_pago-total_pagar;
        }else{
            return -1;
        }
    }
}
