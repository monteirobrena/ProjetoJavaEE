package entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author monteirobrena
 */
@Entity
@NamedQuery(name="calcularValorTotalPedido",
            query="SELECT SUM(ip.precoProduto * ip.quantidadeProduto) "
                + "FROM ItemPedido ip "
                + "WHERE ip.pedido.id = :idPedido")
public class ItemPedido implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Double precoProduto;
    private int quantidadeProduto;
    @OneToOne
    private Produto produto;
    @ManyToOne
    private Pedido pedido;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemPedido)) {
            return false;
        }
        ItemPedido other = (ItemPedido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.ItemPedido[ id=" + id + " ]";
    }

    /**
     * @return the precoProduto
     */
    public Double getPrecoProduto() {
        return precoProduto;
    }

    /**
     * @param precoProduto the precoProduto to set
     */
    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    /**
     * @return the quantidadeProduto
     */
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    /**
     * @param quantidadeProduto the quantidadeProduto to set
     */
    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the pedido
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
}
