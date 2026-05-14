package es.paulcod.generate.generator

import java.security.SecureRandom

object CodeGenerator {

    private val secureRandom = SecureRandom()

    fun generateCode(length: Int): String = String(CharArray(length) {
        ('0' + secureRandom.nextInt(10))
    })

}