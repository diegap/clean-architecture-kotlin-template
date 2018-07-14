package my.entrypoint

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest(properties = ["spring.profiles.active=it"], webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EntrypointIT {

    @Test
    fun someIntegrationTest() {
        assertThat(2).isEqualTo(1 + 1)
    }

}