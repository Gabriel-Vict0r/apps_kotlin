package atv.estruturas_repeticao
import java.util.*;

val input = Scanner(System.`in`);
fun questao1() {
    for (i in 1..100) println(i)
}

fun questao2() {
    for (i in 11..87) println(i)
}

fun questao3() {
    for (i in 1..10) println("kotlin")
}
fun questao4() {
    for(i in 0..10) {
    println("3 x $i = ${i*3}");
    }
}
fun questao5() {
    var numbers = emptyArray<Int>();
    var number: Int;
    for (i in 1..<11) {
        print("Digite o ${i}º número: ");
        number = input.nextInt();
        if (number % 2 != 0) {
            numbers += number
        }
    }
    print("números impares: ${numbers.contentToString()}")
}
fun questao6() {
    var numbers = emptyArray<Int>();
    var number: Int;
    for (i in 0..<5) {
        print("Digite o ${i+1}º número: ");
        number = input.nextInt();
        numbers += number;
    }
    print(numbers.map { it * it })
}
fun questao7() {
    var numbers = emptyArray<Double>();
    var number: Double;
    for (i in 0..<6) {
        print("Digite o ${i+1}º número: ");
        number = input.nextDouble();
        numbers += number;
    }
    print(numbers.map { it / 2.0 })
}

fun questao8() {
    var soma: Int = 0;
    for (i in 1..<101) {
        println(i);
        soma+=i;
    }
    print("soma: $soma")
}

fun questao9() {
    val numeroNotas: Int;
    var soma: Double = 0.0;
    var nota: Double = 0.0;
    val media: Double;
    print("Digite o número de notas: ");
    numeroNotas = input.nextInt();
    for (i in 0..<numeroNotas) {
        print("digite a ${i+1}º nota: ");
        nota = input.nextDouble();
        soma+=nota;
    }
    media = soma / numeroNotas;
    print("Media: $media");
}

fun questao10() {
    var soma: Double = 0.0;
    var nota: Double = 0.0;
    val media: Double;
    for (i in 0..<5) {
        print("digite a ${i+1}º nota: ");
        nota = input.nextDouble();
        soma+=nota;
    }
    media = soma / 5;
    var resultado: String = if (media >= 5.0) "aluno aprovado" else "aluno reprovado"
    print(resultado);
}