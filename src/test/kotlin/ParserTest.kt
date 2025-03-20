import org.assertj.core.api.Assertions.assertThat
import org.hrtwt.Parser
import org.hrtwt.Token
import org.hrtwt.Type
import org.hrtwt.ast.Number
import org.hrtwt.ast.Plus
import org.junit.jupiter.api.Test

class ParserTest {

    @Test
    fun test() {
        val tokens = listOf(Token(Type.NUMBER, "1"), Token(Type.PLUS, "+"), Token(Type.NUMBER, "2"))
        assertThat(Parser().parse(tokens)).isEqualTo(Plus(Number(tokens[0]), Number(tokens[2])))
    }
}