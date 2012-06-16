package beans;

import beans.visao.ItemPedidoFacade;
import javax.ejb.Stateless;

/**
 *
 * @author monteirobrena
 */
@Stateless
public class ControleTotalVendas implements ControleTotalVendasLocal {

    @Override
    public Double RetornarTotalPedido(Long idPedido) {

        ItemPedidoFacade ipf = new ItemPedidoFacade();
        return ipf.calcularValorTotalPedido(idPedido);
    }
}
