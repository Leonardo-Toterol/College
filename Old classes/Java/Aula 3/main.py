''' Finanças

- Adicionar e categorizar receitas, despesas
- ver onde gasto mais
- exibir meu saldo'''



from utilitarios import (
    cadastrar_categoria,
    cadastrar_transacao,
    saldo_total
)

categoria_receitas = cadastrar_categoria("Receita")
categoria_extra = cadastrar_categoria("Extra")


cadastrar_transacao(
    descricao= "salario",
    valor = 1500.0,
    categoria=categoria_receitas
)

cadastrar_transacao(
    descricao= "extra",
    valor = 1000.0,
    categoria=categoria_receitas
)

cadastrar_transacao(
    descricao= "sim",
    valor =-100.0,
    categoria=categoria_receitas
)

total = saldo_total()

print("Saldo: ", total)