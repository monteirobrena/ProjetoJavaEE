package services;

import beans.ControleTotalVendasLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author monteirobrena
 */
@WebService(serviceName = "WebServiceControleVendas")
@Stateless()
public class WebServiceControleVendas {
    @EJB
    private ControleTotalVendasLocal ejbRef;

    @WebMethod(operationName = "RetornarTotalPedido")
    public Double RetornarTotalPedido(@WebParam(name = "idPedido") Long idPedido) {
        return ejbRef.RetornarTotalPedido(idPedido);
    }
    
}
