package org.hrtwt

enum class Type {
    NUMBER,
    PLUS
}

data class Token(val type: Type, val value: String)