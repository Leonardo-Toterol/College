package Observer;

import Classes.Pedido;

public class ClienteObservador implements Observador {

    @Override
    public void atualizar(Pedido pedido) {

        IO.println("\nAviso ao cliente\nCliente: " + pedido.getCliente().getNome());
        IO.println("\nStatus do pedido: " + pedido.getStatus());
        IO.println("\n");

    }

}