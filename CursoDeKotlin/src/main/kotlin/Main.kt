fun main() {
    // val é uma variavel imutavel
    // var é uma variavel mutavel

    val preco = 31.90  // TIPO INFERIDO

    // TIPOS PRIMITIVOS
    // ESPAÇOS DE MEMORIA EM TIPOS PRIMITIVOS

    val byte: Byte = 8 // 8 bit
    val short: Short = 16 // 16 bit
    val int: Int = 32 // 32 bit (usado 99% do tempo)
    val long : Long = 123185648949789798 // 64 bit

    // BOOLEANO (true | false)
    val booleano = true // 1 byte

    // PADRAO CAMEL CASE (voceDeveEscreverDessaManeira)
    val mediaDePreco = 22

    // . apos uma variavel instrucoes e comandos
    val resposta = mediaDePreco.toDouble()
    println(resposta)

    val price: Double = 31.90 // 64 bit ponto flutuante (floating point)
    val product: String = "iMac"
    val age: Int = 31


    println(preco)
    println(price)
    println(product)
    println(age)
}