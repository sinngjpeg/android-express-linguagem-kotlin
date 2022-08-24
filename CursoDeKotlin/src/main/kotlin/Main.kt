fun main() {
    //GLOSSARIO (var, val, fun, class, double, String, int, false, true)

    // int, double, string, byte, long, float, boolean

    // formatacao de textos

    //1.
    val massage = "Ola Sinng.\nSeu produto chegou!"
    println(massage)

    //2.
    val welcome = """
        Ola Tiago,
        Seu produto chegou!
    """.trimIndent()
    println(welcome)

    //3.
    val text = """
        Texto1,
        Texto2,
        Texto3
    """.replaceIndent(";")
    println(text)

    //4.
    val name = "Tiago"
    val age = 31
    val price = 19.90
    println("ola, " + name + ", sua idade é " + age + ", seu desconto é " + price)
    println("Olá, $name. Sua idade é $age. Seu desconto é: $price")

    val idadeComDez = age + 10

    println("Olá, $name. Sua idade é $idadeComDez. Seu desconto é: $price")
    println("Olá, $name. Sua idade é ${age + 11}. Seu desconto é: $price")

    println("Olá, $name. Sua idade é ${age + 11}. Seu desconto é: $price e seu nome tem ${name.length} caracteres")


}