package br.com.ptbank.forum.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.Size
import org.jetbrains.annotations.NotNull

data class TopicoForm (

    @field:NotEmpty
    @field:Size(min = 5, max = 100)
    val titulo: String,
    @field:NotEmpty
    val mensagem: String,
    @field:NotNull
    val idDepartamento: Long,
    @field:NotNull
    val idAutor: Long
)
