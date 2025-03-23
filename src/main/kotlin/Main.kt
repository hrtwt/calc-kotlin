package org.hrtwt

fun main(src: String): Double {
    val tokens = Lexer().lex(src)
    val exp = Parser().parse(tokens)
    val value = Calculator().calculate(exp)

    return value
}