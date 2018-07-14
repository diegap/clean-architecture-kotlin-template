package my.entrypoint

import org.springframework.boot.test.util.EnvironmentTestUtils
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests
import org.testng.annotations.*

abstract class BaseTest : AbstractTestNGSpringContextTests() {

    @BeforeSuite
    fun start() {
        //
    }

    @AfterSuite
    fun shutdown() {
        //
    }

    @AfterTest
    fun stop() {
        //
    }

    @AfterMethod
    fun reset() {
        //
    }

    @BeforeTest
    fun setSystemProperties() {
        //
    }

    companion object {

        class Initializer : ApplicationContextInitializer<ConfigurableApplicationContext> {

            override fun initialize(applicationContext: ConfigurableApplicationContext) {
                EnvironmentTestUtils.addEnvironment(
                        "it", applicationContext.environment
                )
            }
        }

    }

}