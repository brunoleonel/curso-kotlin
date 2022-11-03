//Classes por padrão tem valores imutáveis
//Também existem acessores padrão para todos os valores
class Pessoa(
    val nome: String,
    val idade: Int) {

    //Acessor customizado
    val isMenorDeIdade
        get() = idade < 18
}

fun main() {
    val pessoa1 = Pessoa("Ronaldo", 9);
    val pessoa2 = Pessoa("Pablo", 19)
    println("Pessoa 1 - nome: ${pessoa1.nome} - idade: ${pessoa1.idade} -> Menor: ${pessoa1.isMenorDeIdade}")
    println("Pessoa 2 - nome: ${pessoa2.nome} - idade: ${pessoa2.idade} -> Menor: ${pessoa2.isMenorDeIdade}")
}