fun main() {
    //Na declaração, o tipo pode ser omitido e o compilador fará a inferência
    //Constante
    val nome: String = "João"

    //Variável
    var idade: Int = 13
    idade = 12

    //String template - ${variavel}
    println("Nome = ${nome} - Idade: ${idade} anos")
    println("O dobro da idade seria ${(idade * 2)}")
}