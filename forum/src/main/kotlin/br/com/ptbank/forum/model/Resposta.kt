package br.com.ptbank.forum.model

import java.time.LocalDateTime

data class Resposta (
    var id: Long? = null,
    val mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val autor: Usuario,
    val topico: Topico,
    val solucao: Boolean
)
