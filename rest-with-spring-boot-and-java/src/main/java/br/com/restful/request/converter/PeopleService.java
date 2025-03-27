package br.com.restful.request.converter;

import br.com.restful.model.People;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PeopleService {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PeopleService.class.getName());

    public List<People> findAll(){
        List<People> people = new ArrayList<People>();
        for(int i = 0; i < 8; i++){
            People allPeople = mockPeople(i);
            people.add(allPeople);
        }
        return people;
    }

    private People mockPeople(int i) {
        logger.info("Finding all people");

        People people = new People();
        people.setId(counter.incrementAndGet());
        people.setFirstName("FirstName " + i);
        people.setLastName("LastName " + i);
        people.setAddress("Some address in Brazil");
        people.setGender("Male");
        return people;
    }

    public People findById(String id){
        logger.info("Finding a person");

        People people = new People();
        people.setId(counter.incrementAndGet());
        people.setFirstName("Jefferson");
        people.setLastName("Moura");
        people.setAddress("Fortaleza - Ceará");
        people.setGender("Male");
        return people;
    }

    public People create(People people){
        logger.info("Creating a person");
        return people;
    }

    public People update(People people){
        logger.info("Updating a person");
        return people;
    }

    public void delete(String id){
        logger.info("Deleting a person");

    }


}
