import org.assertj.core.api.Assertions.assertThat
import org.hrtwt.main
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    fun test() {
        assertThat(main("1+ 2")).isEqualTo(3.0)
    }
}