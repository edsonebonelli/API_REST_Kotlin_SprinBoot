package br.com.ptbank.forum.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.Size
import org.jetbrains.annotations.NotNull

data class AtualizacaoTopicoForm (
    @field:NotNull
    val id: Long,
    @field:NotEmpty
    val titulo: String,
    @field:Size(min = 5, max = 100)
    val mensagem: String
)

