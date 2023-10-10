enum class Nivel {BASICO, INTERMEDIARIO, DIFICIL}

data class Usuario (val nome: String, val sobrenome: String)

data class ConteudoEducacional(val nome_conteudo: String)

class Formacoes (val nome:String, val nivel: String, val conteudos: List<ConteudoEducacional>)
{
    public val inscritos = mutableListOf(
Usuario(
    nome = "Ana",
    sobrenome ="Souza"
),
    Usuario(
    nome = "Pedro",
    sobrenome ="Carvalho"
),
    Usuario(
    nome = "Antonio",
    sobrenome ="Silva"
)   
)
    fun matricular(usuario: Usuario) {
        listaUsuario.add(
        nome = "Paulo",
        sobrenome ="Ricardo")
}
    
    println ("$inscritos")

}
