package fundamentos

fun main() {
    var nome = "Gustavo"
    val nomeVal = "Gustavo"

    nome = "Daniel"
//    nomeVal = "Daniel"

    val idade = 24
    println(idade)
}

class variaveis {
    lateinit var teste: String

    fun iniciaVariaveis() {
        teste = "Teste"
    }
}