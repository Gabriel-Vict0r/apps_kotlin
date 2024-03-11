package atv.funcoes
import java.util.*

val input = Scanner(System.`in`)
fun questao11() {
    val ano: Int;
    print("Digite o seu ano de nascimento: ");
    ano = input.nextInt();
    if (2024 - ano > 17) {
    print("Você poderá votar esse ano")
    }
    else {
    print("Você não vai poder votar")
    }
}
fun questao12() {
    val senhaCorreta = 1234;
    val senha: Int;
    print("Digite a senha: ");
    senha = input.nextInt();
    val resultado = if (senha == senhaCorreta) "ACESSO PERMITIDO" else "ACESSO NEGADO"
    print(resultado);
}

fun questao13() {
    val altura: Double;
    val sexo: Int;
    var pesoIdeal: Double = 0.0;
    print("informe o seu sexo [1]masculino [2]feminino: ");
    sexo = input.nextInt();
    print("Informe sua altura: ");
    altura = input.nextDouble();
    if (sexo == 1)  {
        pesoIdeal = (72.7 * altura) - 58;
    } else if(sexo == 2) {
        pesoIdeal = (62.1 * altura) - 44.7;
    }
    else {
        print("código de sexo inválido, tente novamente");
    }
    print("seu peso ideal: $pesoIdeal")
}

fun questao14() {
    val matricula: Int;
    var notas = emptyArray<Double>()
    var nota: Double = 0.0;
    var soma: Double = 0.0;
    val mediaAproveitamento: Double;
    var conceito: String = "";
    var aprovacao: String = "";
    print("Digite sua matrícula: ");
    matricula = input.nextInt();
    for(i in 0..<3) {
        print("Digite a ${i+1}º nota: ");
        nota = input.nextDouble()
        notas+=nota;
        soma+=nota;
    }
    for (i in 0..<3) {
        println("${i+1}º nota: ${notas[i]}")
    }
    println("Média: ${soma / 3}");
    mediaAproveitamento = (soma / 30) * 100
    println("Média de aproveitamento: $mediaAproveitamento")

    if(mediaAproveitamento in (0.0..40.0)) {
        conceito = "E";
        aprovacao = "Reprovado"
    }
    else if (mediaAproveitamento in 40.0..60.0) {
        conceito = "D";
        aprovacao = "Reprovado"
    } else if (mediaAproveitamento in 60.0..75.0) {
        conceito = "C";
        aprovacao = "Aprovado"
    }
    else if (mediaAproveitamento in 75.0..90.0) {
        conceito = "B";
        aprovacao = "Aprovado"
    }
    else if (mediaAproveitamento >= 90.0) {
        conceito = "A";
        aprovacao = "Aprovado"
    }
    println("Conceito: $conceito");
    println(aprovacao);
}

fun questao15(arg: Int) {
    if (arg > 0) print("P") else print("N")
}

fun questao16() {
    for(i in 1..50) {
        if (i % 2 != 0) println(i)
    }
}