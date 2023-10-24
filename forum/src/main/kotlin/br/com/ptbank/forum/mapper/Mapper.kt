package br.com.ptbank.forum.mapper

interface Mapper<T, U> {

    fun map(t: T): U
}
