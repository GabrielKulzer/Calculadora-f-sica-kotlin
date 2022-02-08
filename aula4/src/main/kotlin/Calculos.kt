import kotlin.math.*

class Calculos {
    fun calcularForcaPeso(massa:Float,gravidade:Float): Float{
        return massa * gravidade
    }
    fun calcularForcaCentripeta(massa:Float,velocidade:Double,raio:Float): Double {
        return (massa * (velocidade.pow(2) / raio))
    }
    fun calcularImpulso(forca:Float,tempo:Float): Float{
        return forca * tempo
    }
    fun calcularForcaElastica(constanteElastica:Float,deformacao:Float):Float{
    return constanteElastica * deformacao
    }
    fun calcularVelocidadeMedia(deslocamento:Float,tempo:Float):Float{
    return deslocamento / tempo
    }
    fun calcularMovimentoUniforme(velocidade:Float,tempo:Float,posicaoInicial:Float):Float{
    return  posicaoInicial + (velocidade * tempo)
    }
    //fun calcularMovimentoUniformeVariado():Float{

    //}
}