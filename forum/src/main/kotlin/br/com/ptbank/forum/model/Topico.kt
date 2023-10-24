package br.com.ptbank.forum.model

import java.time.LocalDateTime

data class Topico (
    var id: Long? = null,
    val titulo: String,
    val mensagem: String,
    val dataCriação: LocalDateTime = LocalDateTime.now(),
    val departamento: Departamento,
    val autor: Usuario,
    val status: StatusTopico = StatusTopico.NAO_RESPONDIDO,
    val respostas: List<Resposta> = ArrayList()
)


