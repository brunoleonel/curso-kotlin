enum class Cores(val nome: String) {
    VERMELHO("vermelho"),
    AMARELO("amarelo"),
    VERDE("verde");
    fun sugestao(): String = if (nome == "amarelo") "Boa!" else "Prefiro amarelo!"
}

fun main() {
    println(Cores.VERDE)
    println(Cores.AMARELO)
    println(Cores.VERMELHO)

    println(Cores.VERDE.nome)
    println(Cores.AMARELO.nome)
    println(Cores.VERMELHO.nome)

    println(Cores.VERDE.sugestao())
    println(Cores.AMARELO.sugestao())
}