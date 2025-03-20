import org.assertj.core.api.Assertions.assertThat
import org.hrtwt.Token
import org.hrtwt.Type
import org.hrtwt.ast.Number
import org.hrtwt.ast.Plus
import org.hrtwt.main
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    fun test() {
        assertThat(main("1+ 2")).isEqualTo(Plus(Number(Token(Type.NUMBER, "1")), Number(Token(Type.NUMBER, "2"))))
    }
}