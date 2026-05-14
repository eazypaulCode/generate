package es.paulcod.generate.generator

import es.paulcod.generate.encoder.ByteArrayEncoder
import java.security.SecureRandom

object BytesGenerator {

    private val secureRandom = SecureRandom()

    fun generateBytes(length: Int, encoder: ByteArrayEncoder): String {
        val bytes = ByteArray(length)
        secureRandom.nextBytes(bytes)

        return encoder.encode(bytes)
    }

}