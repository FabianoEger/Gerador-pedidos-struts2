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
public class ActionListarItem {

    List<Item> itens;

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public String execute() throws Exception {

        ItemDAO dao = new ItemDAO();
        setItens(dao.getItens());

        return "success";
    }
}
