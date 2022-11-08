package br.com.lbs.services

import br.com.lbs.model.Person
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger

@Service
class PersonService {

    private val counter: AtomicLong = AtomicLong();

    private val logger = Logger.getLogger(PersonService::class.java.name)

    fun findById(id: Long?): Person {
        logger.info("Buscando pessoa")

        val person = Person()

        person.id = counter.incrementAndGet()
        person.firstName = "Lucas"
        person.lastName = "Silva"
        person.address = "Sao Leopoldo"
        person.gender = "Male"

        return person;
    }

    fun findAll(): List<Person> {
        logger.info("Buscando todas pessoas")

        val persons: MutableList<Person> = ArrayList()

        for (i in 0 .. 7) {
            val person = mockPerson(i)

            persons.add(person)
        }

        return persons;
    }

    fun create(person: Person) = person

    fun update(person: Person) = person

    fun delete(id: Long) {}

    private fun mockPerson(i: Int): Person {
        val person = Person()

        person.id = counter.incrementAndGet()
        person.firstName = "Person name $i"
        person.lastName = "Last Name $i"
        person.address = "Sao Leopoldo"
        person.gender = "Male"

        return person;
    }

}