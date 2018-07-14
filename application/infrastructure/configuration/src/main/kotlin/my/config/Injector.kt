package my.config

import my.dataprovider.database.RandomDomainEntityJdbc
import my.domain.BasicUseCase
import my.domain.RandomDomainEntity
import my.domain.UseCase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 *  Implements the most generic interfaces in application (inner) with concrete implementations from the configuration layer (outer)
 */
@Configuration
class Injector {

    @Autowired(required = true)
    lateinit var appProperties: AppProperties

    @Bean
    fun basicUseCase(): UseCase<Int, String> {
        return BasicUseCase(randomDomainEntity())
    }

    // Implement abstractions from dataprovider and entrypoint layers
    @Bean
    fun randomDomainEntity(): RandomDomainEntity {
        return RandomDomainEntityJdbc()
    }

}