import java.lang.IllegalArgumentException

fun avaliacaoWhen(expressao: Expressao): Int =
    when(expressao) {
        is Numero -> expressao.valor
        is Soma -> avaliacaoWhen(expressao.termoEsquerdo) + avaliacaoWhen(expressao.termoDireito)
        else -> throw IllegalArgumentException("Expressão desconhecida.")
    }

fun main() {
    println(avaliacaoWhen(Soma(Numero(3), Soma(Numero(1), Numero(2)))))
    println(avaliacaoWhen(Soma(Numero(1), Soma(Numero(1), Numero(1)))))
}