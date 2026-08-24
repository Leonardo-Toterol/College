package Decorator;

import Classes.Produto;

public abstract class ProdutoDecorator extends Produto {

    protected Produto produto;

    public ProdutoDecorator(Produto produto) {
        super(produto.getNome(), produto.getPreco(), produto.isDisponivel());

        this.produto = produto;
    }

}