package beans.visao;

import entidades.Produto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author monteirobrena
 */
@Stateless
public class ProdutoFacade extends AbstractFacade<Produto> {
    @PersistenceContext(unitName = "ProjetoJavaEEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProdutoFacade() {
        super(Produto.class);
    }
    
}
