package ru.lenabobr.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.lenabobr.springcourse.controllers.model.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private List<Person> people;
    private static int PEOPLE_COUNT;

    {   people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "tom"));
        people.add(new Person(++PEOPLE_COUNT, "jane"));
        people.add(new Person(++PEOPLE_COUNT, "bob"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id){
        return  people.stream().filter(person->person.getId()==id).findAny().orElse(null);
    }
}
