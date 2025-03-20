import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.hrtwt.Lexer
import org.hrtwt.Token
import org.hrtwt.Type
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource


class LexerTest {

    @Test
    fun test() {
        val actual = Lexer().lex("1+ 2")
        assertThat(actual).containsExactly(Token(Type.NUMBER, "1"), Token(Type.PLUS, "+"), Token(Type.NUMBER, "2"))
    }

    @ParameterizedTest
    @ValueSource(strings = ["", " "])
    fun empty(src: String) {
        val actual = Lexer().lex(src)
        assertThat(actual).isEmpty()
    }

    @Test
    fun exception() {
        assertThatThrownBy {
            Lexer().lex("1+a")
        }.hasMessage("Char a can not be recognized")
    }
}