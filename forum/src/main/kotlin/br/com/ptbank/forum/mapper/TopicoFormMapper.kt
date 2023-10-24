package br.com.ptbank.forum.mapper

import br.com.ptbank.forum.dto.TopicoForm
import br.com.ptbank.forum.model.Topico
import br.com.ptbank.forum.service.DepartamentoService
import br.com.ptbank.forum.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper(
    private val departamentoService: DepartamentoService,
    private val usuarioService: UsuarioService
) : Mapper<TopicoForm, Topico> {
    override fun map(t: TopicoForm): Topico {
        return Topico(
            titulo = t.titulo,
            mensagem = t.mensagem,
            departamento = departamentoService.buscarPorId(t.idDepartamento),
            autor = usuarioService.buscarPorId(t.idAutor)
        )
    }
}
