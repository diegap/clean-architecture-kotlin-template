package my.entrypoint

import org.assertj.core.api.Assertions.assertThat
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.testng.annotations.Test

@SpringBootTest(properties = ["spring.profiles.active=it"], webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(initializers = [BaseTest.Companion.Initializer::class])
class EntrypointIT : BaseTest() {

    @Test(priority = 1)
    fun someIntegrationTest() {
        assertThat(2).isEqualTo(2)
    }


}