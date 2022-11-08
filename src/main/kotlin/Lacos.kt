fun main() {
    var valor: Int = 0;

    println("--- While ---")

    while (valor < 6) {
        valor++;
        println("Valor => $valor")
    }

    println("--- Do while ---")

    valor = 0

    do {
        valor++;
        println("Valor => $valor")
    } while (valor < 6)

    println("--- For ---")


    for (valor in 0..6) {
        println("Valor => $valor")
    }

    println("--- Maps ---")

    var map = HashMap<String, String>()
    map.put("José", "Souza")
    map.put("Antônio", "Nunes")
    map.put("Mario", "Andrade")

    for ((nome, sobrenome) in map) {
        println("Nome: $nome - Sobrenome: $sobrenome")
    }
}