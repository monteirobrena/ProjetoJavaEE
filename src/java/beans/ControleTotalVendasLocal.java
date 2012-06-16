package beans;

import javax.ejb.Local;

/**
 *
 * @author monteirobrena
 */
@Local
public interface ControleTotalVendasLocal {

    Double RetornarTotalPedido(Long idPedido);
    
}
