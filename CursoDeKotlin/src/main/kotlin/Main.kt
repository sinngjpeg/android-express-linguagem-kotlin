fun main() {
    //GLOSSARIO (var, val, fun, class, double, String, int, false, true)

    // int, double, string, byte, long, float, boolean


    // CONDICOES (CONTROLE DE FLUXO) - deve ser uma expressao booleana
    // ( < , > , <= , =>, !, ==, !=, &&, ||)

    // E
    // TRUE | TRUE = TRUE
    // TRUE | FALSE = FALSE
    // FALSE | TRUE = FALSE
    // FALSE | FALSE  = FALSE

    //OU
    // TRUE | TRUE = TRUE
    // TRUE | FALSE = TRUE
    // FALSE | TRUE = TRUE
    // FALSE | FALSE = FALSE

    val produto = "Teclado"
    val preco = 49

    if (preco == 49 && produto == "Teclado") {
        println("sucesso")
    } else {
        println("falha")
    }

    if (preco == 49 || produto == "Teclado") {
        println("sucesso")
    } else {
        println("falha")
    }
}