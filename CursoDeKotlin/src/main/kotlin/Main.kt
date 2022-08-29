fun main() {
    //GLOSSARIO (var, val, fun, class, double, String, int, false, true)

    // int, double, string, byte, long, float, boolean


    // CONDICOES (CONTROLE DE FLUXO) - deve ser uma expressao booleana
    // ( < , > , <= , =>, !, ==, !=)

    val produto = "iPhone"

    // se, senão if else
    if (produto.length < 3) {
        println("Você não pode cadastrar produtos com nomes pequenos")
    } else {
        println("Produto cadastrado com sucesso")
    }

    if (!(produto.length < 3)) {
        println("Produto cadastrado com sucesso")

    } else {
        println("Você não pode cadastrar produtos com nomes pequenos")
    }

    if (produto.length == 0) {
        println("Você não pode cadastrar produtos com nomes pequenos")
    } else {
        println("Produto cadastrado com sucesso")
    }

    if (produto.length != 0) {
        println("Você não pode cadastrar produtos com nomes pequenos")
    } else {
        println("Produto cadastrado com sucesso")
    }

    val preco = 20_000
    if (preco > 30_000) {
        println("voce ganhou 30% de desconto")
    } else if (preco > 20_00) {
        println("voce ganhou 20% de desconto")
    } else {
        println("voce nao ganhou desconto")
    }


    val idade = 31
    if (idade > 30) {
        println("tenho mais de 30")
    } else {
        println("terminou")
    }


}