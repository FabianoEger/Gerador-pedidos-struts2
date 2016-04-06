/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorpedidos.action;
import geradorpedidos.dao.ItemDAO;
import geradorpedidos.model.Item;
import java.util.List;

/**
 *
 * @author fabiano.eger
 */
public class ActionCriarEditarItem {
     private int idItem;
    private int quantidade;
    private int idPedido;
    private Item item;
    private String mensagem;
    private List<Item> itens;

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
     public String execute() throws Exception {
         ItemDAO dao = new ItemDAO();

        if (idItem != 0) {

            item.setIdItem(idItem);
            item.setQuantidade(quantidade);
            item.setIdPedido(idPedido);
            dao.atualizar(item);

            mensagem = "Item alterado com sucesso.";
        } else {
            dao.inserir(item);
            mensagem = "Item adicionado com sucesso";
        }

         setItens(dao.getItens());

        return "success";
    }
    
}
