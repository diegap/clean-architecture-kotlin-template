package my.dataprovider.database

import my.domain.RandomDomainEntity

// Database interfaces and classes

class RandomDomainEntityJdbc : RandomDomainEntity {

    override fun doBusinessStuff(value: Int): String {
        // execute query to db with given parameter
        return "some retrieved result from db given value $value"
    }

}