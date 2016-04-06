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
public class ActionRemoverItem {

    private int idItem;
    private String mensagem;
    private List<Item> itens;

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
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
            Item item = new Item();
            item.setIdItem(idItem);
            dao.remover(idItem);
            mensagem = "Contato removido com sucesso.";
        } else {
            mensagem = "Erro ao remover contato. ID não pode ser nulo.";
        }

        setItens(dao.getItens());
        return "success";
    }

}
