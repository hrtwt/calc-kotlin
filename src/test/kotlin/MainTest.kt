import org.hrtwt.main
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class MainTest {

    @Test
    fun sample(){
        val main = main()
        assertThat(true).isTrue()
    }
}