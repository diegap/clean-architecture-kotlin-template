package my.domain

import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test

class `Execute basic use case` {

    @MockK
    private lateinit var domainEntity: RandomDomainEntity

    @Before
    fun init() {
        MockKAnnotations.init(this)
    }

    @Test
    fun `simple execution of basic use case`() {

        // given
        val message = "Business magic done"

        every { domainEntity.doBusinessStuff(10) } answers {
            message
        }

        val subject = BasicUseCase(domainEntity)

        // when
        val result = subject.execute(10)

        // then
        assertThat(result).isNotBlank()
        assertThat(result).isEqualTo(message)

    }

}