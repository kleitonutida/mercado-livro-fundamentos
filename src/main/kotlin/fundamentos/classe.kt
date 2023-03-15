package fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe: Pessoa. Nome: $nome, Idade: $idade"
    }
}

fun main() {
    var kleiton = Pessoa("Kleiton", 35)
    println(kleiton)
}
