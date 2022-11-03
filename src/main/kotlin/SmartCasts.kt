import java.lang.IllegalArgumentException

interface Expressao

class Numero(val valor: Int) : Expressao

class Soma(val termoEsquerdo: Expressao, val termoDireito: Expressao) : Expressao

fun avaliacao(expressao: Expressao): Int {

    //A instrução is tem a mesma função que o instanceof no Java
    //Quando é utilizada, não é necessário fazer um cast explícito. O compilador já faz automaticamente
    if (expressao is Numero) {
        return expressao.valor
    }

    if (expressao is Soma) {
        return avaliacao(expressao.termoEsquerdo) + avaliacao(expressao.termoDireito)
    }

    throw IllegalArgumentException("Expressão desconhecida.")
}

fun main() {
    println(avaliacao(Soma(Numero(3), Soma(Numero(1), Numero(2)))))
    println(avaliacao(Soma(Numero(1), Soma(Numero(1), Numero(1)))))
}