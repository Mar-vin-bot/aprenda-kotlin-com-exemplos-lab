// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Conteúdo 1")
    val conteudo2 = ConteudoEducacional("Conteúdo 2")
    val conteudos = listOf(conteudo1, conteudo2)

    val formacao = Formacao("Formação", conteudos)

    val usuario1 = Usuario()
    val usuario2 = Usuario()

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
}
