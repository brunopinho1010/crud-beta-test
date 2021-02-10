package services;

import entities.Person;
import exceptions.EmptyNameException;
import exceptions.NameNotFoundException;

public class PersonService extends Person implements CRUDservice {



	// adicionar uma pessoa
	@Override
	public void create(Person person) {
		getList().add(person);
	}



// ==================================================================================================================

	// ver uma pessoa por um nome
/*	@Override
	public void read(String searchName) {

		if(getList().isEmpty()){
			throw new  EmptyNameException("Lista esta vazia");
		}
		for(int i = 0;i<getList().size();i++){
			
			if(getList().stream().filter(x->x.getName().equals(searchName)).findFirst().orElse(null) == null ){
				throw new NameNotAddedException("Esse nome nao foi adicionado na lista !!");
			}
			if(getList().equals(searchName)){
				System.out.println(getList().get(i));
			}
		
		}
		

	}
*/
	@Override
	public void read(String searchName) {

		if(getList().isEmpty()){
			throw new  EmptyNameException("Lista esta vazia");
		}
	

		for (int i = 0; i < getList().size(); i++) {

	
			if (getList().stream().filter(x -> x.getName().equals(searchName)).findFirst().orElse(null) == null) {
				throw new NameNotFoundException("Nome nao existe");
			}

			if(getList().get(i).getName().equals(searchName)){
				System.out.println(getList().get(i));
			}
			

			
		
		}
		
	}
	



// ==================================================================================================================

	// atualizando dados de uma pessoa
	@Override
	public void update( String newName, Double newSalary, String oldName) {
		// se a lista estiver vazia
		if (getList().isEmpty()) {

			throw new EmptyNameException("A lista de  nomes esta vazia");
		}

		// se os nomes nao se cruzam
		if (getList().stream().filter(x -> x.getName().equals(oldName)).findFirst().orElse(null) == null) {
			throw new NameNotFoundException("Nao foi possivel alterar os dados ! Nome : "+oldName+", nao existe na lista...");
		}
		for (int i = 0; i < getList().size(); i++) {

			// se os nomes se cruzam
			if (getList().stream().filter(x -> x.getName().equals(oldName)).findFirst().orElse(null) != null) {
				// removemos o nome
				getList().remove(i);
				// instanciamos um novo valor para o nome e salario
				setName(newName);
				setSalary(newSalary);
				// adicionamos esse nome na lista
				getList().add(new Person(newName, newSalary));
			}
		}

	}

// ==================================================================================================================

	// deletando uma pessoa pelo seu nome
	@Override
	public void delete( String nameDelete) {

		if (getList().isEmpty()) {
			throw new EmptyNameException("Lista vazia");
		}
		for (int i = 0; i < getList().size(); i++) {

			// se os nomes cruzarem ,vamos remover 
			if (getList().get(i).getName().equals(nameDelete)) {
				getList().remove(i);
				System.out.println("Pessoa removida !! Total de Pessoas na Lista : " + getList().size());
			}

		}

	}

}
