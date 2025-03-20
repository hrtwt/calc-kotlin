package org.hrtwt


class Lexer {
    fun lex(src: String): List<Token> {
        val que = ArrayDeque(src.filter { !it.isWhitespace() }.toList())
        val ret = ArrayList<Token>()

        while (que.isNotEmpty()) {
            if (que.first().isDigit()) {
                val digits = que.collectSeries { isDigit() }.joinToString()
                ret.add(Token(Type.NUMBER, digits))
                continue
            }
            if (que.first() == '+') {
                ret.add(Token(Type.PLUS, que.removeFirst().toString()))
                continue
            }

            throw Exception("Char ${que.first()} can not be recognized")
        }

        return ret
    }

    private fun <T> ArrayDeque<T>.collectSeries(predicate: T.() -> Boolean): List<T> {
        val ret = ArrayList<T>()

        while (this.isNotEmpty()) {
            if (!this.first().predicate()) {
                break
            }
            ret.add(this.removeFirst())
        }

        return ret
    }
}