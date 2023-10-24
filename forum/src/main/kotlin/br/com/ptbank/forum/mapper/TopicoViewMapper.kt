package br.com.ptbank.forum.mapper

import br.com.ptbank.forum.dto.TopicoView
import br.com.ptbank.forum.model.Topico
import org.springframework.stereotype.Component

@Component
class TopicoViewMapper : Mapper<Topico, TopicoView> {

    override fun map(t: Topico): TopicoView {
        return TopicoView(
            id = t.id,
            titulo = t.titulo,
            mensagem = t.mensagem,
            dataCriacao = t.dataCriação,
            status = t.status
        )
    }
}