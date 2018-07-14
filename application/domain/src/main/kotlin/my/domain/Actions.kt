package my.domain

// File holding use case classes

interface UseCase<INPUT, OUTPUT> {
    fun execute(input: INPUT): OUTPUT
}

class BasicUseCase(private val domainEntity: RandomDomainEntity) : UseCase<Int, String> {

    companion object {
        private val logger = loggerFor<BasicUseCase>()
    }

    override fun execute(input: Int): String {
        logger.debug("Executing basic use case with input: $input")
        return domainEntity.doBusinessStuff(input)
    }

}