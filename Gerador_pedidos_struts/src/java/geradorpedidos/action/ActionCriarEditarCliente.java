package geradorpedidos.action;

import geradorpedidos.dao.ClienteDAO;
import geradorpedidos.model.Cliente;
import java.util.List;

/**
 *
 * @author fabiano.eger
 */
public class ActionCriarEditarCliente {

    private int idCliente;
    private String mensagem;
    private Cliente cliente;
    private List<Cliente> clientes;

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

    public String getMensagem() {
        return mensagem;
    }

    public String execute() throws Exception {
        ClienteDAO dao = new ClienteDAO();

        if (idCliente != 0) {

            cliente.setIdCliente(idCliente);
            dao.atualizar(cliente);

            mensagem = "Contato alterado com sucesso.";
        } else {
            dao.inserir(cliente);
            mensagem = "Contato criado com sucesso";
        }

        setClientes(dao.getClientes());

        return "success";
    }

    /**
     * @return the clientes
     */
    public List<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

}
