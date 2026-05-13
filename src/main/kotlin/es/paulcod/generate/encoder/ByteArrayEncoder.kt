package es.paulcod.generate.encoder

interface ByteArrayEncoder {

    val name: String

    fun encode(byteArray: ByteArray): String

}