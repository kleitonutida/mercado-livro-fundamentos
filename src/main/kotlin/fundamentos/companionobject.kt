package fundamentos

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int,
) {
    companion object {
        fun criarComValoresPadrao(): MinhaClasse {
            return MinhaClasse("Gustavo", "Rua Teste", 24)
        }

        fun criarAPartirDeSegundaClasse(segundaClasse: SegundaClasse): MinhaClasse {
            return MinhaClasse(segundaClasse.nome, segundaClasse.endereco, segundaClasse.idade)
        }
    }
}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int,
) {
    fun criarComValoresPadrao(): SegundaClasse {
        return SegundaClasse("Gustavo", "Rua Teste", 24)
    }
}

fun main() {
    var segundaClasse = SegundaClasse("nome", "endereco", 10).criarComValoresPadrao()
    var minhaClasse = MinhaClasse.criarComValoresPadrao()
    var minhaClasseAPartirDaSegundaClasse = MinhaClasse.criarAPartirDeSegundaClasse(segundaClasse)
}