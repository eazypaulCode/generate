package es.paulcod.generate.encoder.impl

import es.paulcod.generate.encoder.ByteArrayEncoder

class BinaryByteArrayEncoder : ByteArrayEncoder {

    override val name: String = "binary"

    override fun encode(byteArray: ByteArray): String = byteArray.joinToString(" ") {
        it.toUByte().toString(2).padStart(8, '0')
    }

}