package beans.visao;

import entidades.ItemPedido;
import javax.ejb.Stateless;
import javax.persistence.*;

/**
 *
 * @author monteirobrena
 */
@Stateless
public class ItemPedidoFacade extends AbstractFacade<ItemPedido> {

    @PersistenceContext(unitName = "ProjetoJavaEEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoJavaEEPU");
        em = emf.createEntityManager();
        return em;
    }

    public ItemPedidoFacade() {
        super(ItemPedido.class);
    }

    public Double calcularValorTotalPedido(Long idPedido) {
        try {
            return (Double) getEntityManager().createNamedQuery("calcularValorTotalPedido").setParameter("idPedido", idPedido).getSingleResult();
        } catch (NoResultException e) {
            System.err.print(e);
            return 0.0;
        } catch (NullPointerException e) {
            System.err.print(e);
            return 0.0;
        }
    }
}
