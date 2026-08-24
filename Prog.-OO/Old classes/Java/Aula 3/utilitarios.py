from categoria import Categoria
from transacao import Transacao

lista_categorias = []
lista_transacao = []

def cadastrar_categoria(nome) :
    nova_categoria = Categoria(nome=nome)

    lista_categorias.append(nova_categoria)

    return nova_categoria

def cadastrar_transacao(descricao, valor, categoria) :
    nova_transacao = Transacao(
        descricao=descricao,
        valor=valor,
        categoria=categoria
        )

    lista_transacao.append(nova_transacao)

    return nova_transacao

def saldo_total():
    total = 0
    
    for i in lista_transacao :
        total = total + i.valor

    return total