import org.assertj.core.api.Assertions.assertThat
import org.hrtwt.Calculator
import org.hrtwt.Token
import org.hrtwt.Type
import org.hrtwt.ast.Number
import org.hrtwt.ast.Sum
import org.junit.jupiter.api.Test

class CalculatorTest {

    @Test
    fun test() {
        val actual = Calculator().calculate(Sum(Number(Token(Type.NUMBER, "1")), Number(Token(Type.NUMBER, "2"))))
        assertThat(actual).isEqualTo(3.0)
    }
}