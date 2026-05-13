package es.paulcod.generate.encoder.impl

import es.paulcod.generate.encoder.ByteArrayEncoder

class HexByteArrayEncoder: ByteArrayEncoder {

    override val name: String = "hex"

    override fun encode(byteArray: ByteArray): String = byteArray.toHexString()

}