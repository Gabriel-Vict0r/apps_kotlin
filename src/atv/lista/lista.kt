package atv.lista
import java.util.*;

val input = Scanner(System.`in`)
fun questao17() {
    //a
    var lista = mutableListOf(3, 4, "Programação", true, "Kotlin", 5.0);
    for (i in lista) println(i)

    lista.set(2, "Programação para dispositivos móveis");

    for (i in lista) println(i)

    //b
    lista.add(1, false);
    for (i in lista) println(i)

    //c
    lista.add("ultimo")
    for (i in lista) println(i)

    //d
    lista.removeAt(2)
    for (i in lista) println(i)

    //e
    var testPresent = false;
    for (i in lista) {
        if (i == false) testPresent  else testPresent = true
    }
    if (!testPresent) println("NOT OK") else println("OK")

    //e
    lista.clear()
    for (i in lista) println(i)
}

fun questao18() {
    var lista = mutableListOf<Double>()
    var valor: Double;
    for (i in 1..4) {
        print("digite a ${i}º nota: ");
        valor = input.nextDouble();
        lista.add(valor);
    }
    var total: Double = 0.0;
    for(i in lista) total+=i;
    val media = total / 4;
    print("Media: $media")
}

fun questao19() {
    var listaImpar = mutableListOf<Double>()
    var listaPar = mutableListOf<Double>()
    var lista = mutableListOf<Double>()
    var valor: Double;
    for (i in 1..4) {
        print("digite a ${i}º nota: ");
        valor = input.nextDouble();
        lista.add(valor)
        if (valor % 2 == 0.0) listaPar.add(valor) else listaImpar.add(valor)
    }
    println(lista)
    println("lista de impares: $listaImpar\nlista de pares: $listaPar");
}