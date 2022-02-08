fun main() {
    val calculos = Calculos()

    //println("Digite a massa:")
    //val massa:Float = readLine()!!.toFloat()
    //println("Digite a gravidade:")
    //val gravidade:Float = readLine()!!.toFloat()
    //println("Digite a velocidade:")
    //val velocidade:Float = readLine()!!.toFloat()
    //println("Digite ao raio:")
    //val raio:Float = readLine()!!.toFloat()
    //println("Digite o tempo:")
    //val tempo:Float = readLine()!!.toFloat()
    //println("Digite o deslocamento:")
    //val deslocamento:Float = readLine()!!.toFloat()
    println("Digite a constante elastica:")
    val constanteElastica:Float = readLine()!!.toFloat()
    println("Digite a deformação:")
    val deformacao:Float = readLine()!!.toFloat()
    //println("Digite a força:")
    //val forca:Float = readLine()!!.toFloat()
    //println("Digite a so (posição inicial):")
    //val posicaoInicial:Float = readLine()!!.toFloat()




    //val forcaCentripeta = calculos.calcularForcaCentripeta(massa,velocidade.toDouble(),raio)
    //val impulso = calculos.calcularImpulso(forca,tempo)
    //val forcaPeso = calculos.calcularForcaPeso(massa,gravidade)
    val forcaElastica = calculos.calcularForcaElastica(constanteElastica,deformacao)
    //val velocidadeMedia = calculos.calcularVelocidadeMedia(deslocamento,tempo)
    //val movimentoUniforme = calculos.calcularMovimentoUniforme(velocidade,tempo,posicaoInicial)
    //val movimentoUniformeVariado = calculos.calcularMovimentoUniformeVariado()

    //println("Força Centrípeta: $forcaCentripeta")
    //println("Força peso: $forcaPeso")
    //println("Impulso: $impulso")
    println("Força elastica: $forcaElastica")
    //println("Velocidade média: $velocidadeMedia")
    //println("Distância MRU: $movimentoUniforme metros")
}