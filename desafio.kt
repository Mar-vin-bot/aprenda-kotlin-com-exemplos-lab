enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {
    val inscritos: MutableList<Usuario> = mutableListOf()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun Usuario.imprimirCursosMatriculados(formacao: Formacao) {
    println("Cursos matriculados: ${formacao.conteudos.joinToString(", ") { it.nome }}")
}

fun main() {
    val conteudos = listOf(
        ConteudoEducacional("Conteúdo 1"),
        ConteudoEducacional("Conteúdo 2")
    )

    val formacao = Formacao("Formação", conteudos)

    val usuarios = listOf(
        Usuario("João"),
        Usuario("Maria")
    )

    usuarios.forEach { formacao.matricular(it) }

    formacao.inscritos.forEach { usuario ->
        println("Aluno: ${usuario.nome}")
        usuario.imprimirCursosMatriculados(formacao)
        println()
    }
}
