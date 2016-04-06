/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorpedidos.action;

import geradorpedidos.dao.ClienteDAO;
import geradorpedidos.model.Cliente;

/**
 *
 * @author fabiano.eger
 */
public class ActionFormEditarCliente {

    private Cliente cliente;
    private int idCliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String execute() throws Exception {
        cliente = new Cliente();
        if (idCliente != 0 ) {
            ClienteDAO dao = new ClienteDAO();
            cliente = dao.getClienteById(idCliente);
        }

        return "success";
    }

}
