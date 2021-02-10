package services;

import entities.Person;

public interface CRUDservice {

    void create(Person person);
    void read(String searchName);
    void update(String newName,Double newSalary,String oldName);
    void delete(String nameDelete);
    
}
