package TUI;

import java.util.Scanner;

import entities.Person;
import exceptions.EmptyNameException;
import exceptions.NameNotAddedException;
import exceptions.NameNotFoundException;
import exceptions.SalaryException;
import services.ApplyService;
import services.PersonService;

public class PersonTUI {

	public static void run() {

		Scanner sc = new Scanner(System.in);



		try {

			ApplyService as = new ApplyService(new PersonService());
		
			System.out.println("--------------------------------");
			Person person = new Person("bob",200.00);
			as.create(person);
			System.out.println("Pessoa : "+person);

	

			System.out.println("--------------------------------");
			System.out.println("Busque pessoa por nome : ");
			String searchName = sc.next();
			System.out.println("--------------------------------");
			as.read(searchName);
			System.out.println("--------------------------------");
			System.out.println("Atualize os dados de uma pessoa: ");
			System.out.println("Nome antigo :");
			String oldName = sc.next();
			System.out.println("Novo nome: ");
			String newName = sc.next();
			System.out.println("Novo Salario: ");
			double newSalary = sc.nextDouble();

			as.update(newName, newSalary, oldName);

			System.out.println("Busque pela pessoa: ");
			String newSearchPerson = sc.next();
			System.out.println("--------------------------------");
			as.read(newSearchPerson);
			System.out.println("--------------------------------");
			System.out.println("Remova  uma pessoa: ");
			String nameDelete = sc.next();
			as.delete(nameDelete);
		}catch (EmptyNameException e) {
			System.out.println(e.getMessage());
		} catch (NameNotAddedException e) {
			System.out.println(e.getMessage());
		} catch (NameNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SalaryException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Ocorreu um erro inesperado");
		} finally {
			sc.close();
		}


	}

}
