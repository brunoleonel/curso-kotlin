enum class Cores(val nome: String) {
    VERMELHO("vermelho"),
    AMARELO("amarelo"),
    VERDE("verde");
}

fun main() {
    println(Cores.VERDE)
    println(Cores.AMARELO)
    println(Cores.VERMELHO)

    println(Cores.VERDE.nome)
    println(Cores.AMARELO.nome)
    println(Cores.VERMELHO.nome)
}