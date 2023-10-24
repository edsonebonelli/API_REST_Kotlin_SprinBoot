package br.com.ptbank.forum.service

import br.com.ptbank.forum.model.Departamento
import org.springframework.stereotype.Service
import java.util.*

@Service
class DepartamentoService(var departamentos: List<Departamento>) {

    init {
        val departamento = Departamento(
            id = 1,
            nome = "Cartões de Débito",
            categoria = "Pessoa Júridica"
        )
        departamentos = Arrays.asList(departamento)
    }

    fun buscarPorId(id: Long): Departamento {
        return departamentos.stream().filter({
            c -> c.id == id
        }).findFirst().get()
    }
}
