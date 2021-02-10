package entities;

import java.util.ArrayList;
import java.util.List;

import exceptions.SalaryException;

public class Person {
    

private String name;
private Double salary;

// -> Vamos ter uma lista de pessoas
List<Person> list = new ArrayList<>();


public Person(){

}
public Person(String name,Double salary){
    if(salary <= 0){
        throw new SalaryException("O Valor do salario necessita ser maior que zero(0).");

    }
    this.name = name;
    this.salary= salary;
}

public String getName() {
    return name;
}
public Double getSalary() {
    return salary;
}

public void setName(String name) {
    this.name = name;
}
public void setSalary(Double salary) {
    this.salary = salary;
}

public List<Person> getList() {
    return list;
}
public void setList(List<Person> list) {
    this.list = list;
}


public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append(getName());
    sb.append(" , ");
    sb.append(getSalary());

    return sb.toString();
}

}
