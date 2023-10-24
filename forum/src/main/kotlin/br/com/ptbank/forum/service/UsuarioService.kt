package br.com.ptbank.forum.service

import br.com.ptbank.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService(var usuarios: List<Usuario>) {

    init {
        val usuario = Usuario(
            id = 1,
            nome = "Edson E Bonelli",
            email = "edsonebonelli@gmail.com"
        )
        usuarios = listOf(usuario)
    }

    fun buscarPorId(id: Long): Usuario {
        return usuarios.stream().filter({
            c -> c.id == id
        }).findFirst().get()
    }
}

