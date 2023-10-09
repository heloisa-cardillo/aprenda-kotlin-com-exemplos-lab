enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario (val nome: String, val sobrenome: String)

data class ConteudoEducacional(val nome_conteudo: String, val nivel: String)

data class Formacao(val nome_conteudo: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}