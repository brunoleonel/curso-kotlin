fun recuperaValor(cor: Cores): Float {
    return when(cor) {
        Cores.AMARELO -> 3.55f
        Cores.VERDE -> 4.20f
        Cores.VERMELHO -> 2.56f
    }
}
fun main() {
    println(recuperaValor(Cores.VERMELHO))
    println(recuperaValor(Cores.AMARELO))
    println(recuperaValor(Cores.VERDE))
}