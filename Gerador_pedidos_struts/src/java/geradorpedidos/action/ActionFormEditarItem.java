/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorpedidos.action;

import geradorpedidos.dao.ItemDAO;
import geradorpedidos.model.Item;

/**
 *
 * @author fabiano.eger
 */
public class ActionFormEditarItem {
    private Item item;
    private int idItem;

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
    
    public String execute() throws Exception {
        item = new Item();
        if (idItem != 0 ) {
            ItemDAO dao = new ItemDAO();
            item = dao.getItensById(idItem);
        }

        return "success";
    }
}
