package my.config

import org.jetbrains.annotations.NotNull
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "my.app")
class AppProperties {

    @NotNull
    lateinit var property: String

    @NotNull
    lateinit var anotherProperty: String

}

