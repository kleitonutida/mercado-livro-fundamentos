package fundamentos

fun main() {
//    val lista = listOf<Int>(1, 2, 3, 4, 6)

//    val pares = lista.filter { it % 2 == 0 }.first()
//    println(pares)

//    lista.forEach({
//        println(it)
//    })

//    for (numero in lista) {
//        println(numero)
//    }

//    println(lista.get(0))
//    println(lista[0])
//    println(lista.size)
//    println(lista.indexOf(6))

    val lista = mutableListOf(1, 2, 3, 10, 4, 20, 5, 6, 17)
    println(lista)

    lista.add(8)
    lista.removeAt(0)
    lista.remove(3)
    lista[0] = 20

    println(lista)

    lista.sort()
    println(lista)

    lista.shuffle()
    println(lista)

    var listaNomes = mutableListOf("Gustavo", "Daniel")
    println(listaNomes)
    listaNomes.sort()
    println(listaNomes)

    val setNumeros = setOf(1, 2, 3, 2)
    println(setNumeros)
    println(setNumeros.contains(2))

    var mapNomeIdade = mutableMapOf("Gustavo" to 24, "Daniel" to 20)
    println(mapNomeIdade)

//    mapNomeIdade.put("Bruno", 30)
    mapNomeIdade["Bruno"] = 30
    println(mapNomeIdade)

    mapNomeIdade.remove("Bruno")
    println(mapNomeIdade)

//    mapNomeIdade["Gustavo"] = 30
    mapNomeIdade.putIfAbsent("Gustavo", 30)
    mapNomeIdade.putIfAbsent("Bruno", 24)
    println(mapNomeIdade)
}