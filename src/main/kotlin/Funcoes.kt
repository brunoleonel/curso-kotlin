fun main(args: Array<String>) {
    println(max(1, 2))
    println(max1(1, 2))
}

//Função como Expressão
fun max(a: Int, b: Int): Int = if (a > b) a else b;

//Função
fun max1(a: Int, b: Int): Int {
    return if (a > b) a else b;
}