package sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EjemploLectura {
	public static void main(String[] args) {
		// El factory pueden crearlo una unica vez.
		// "pepito" tiene que coincidir con lo que ponen en el persistence.xml
		EntityManagerFactory emFactory = Persistence
				.createEntityManagerFactory("pepito");

		// El entity manager, en cambio, debe crearse cada vez que se va a
		// realiziar un conjunto de operaciones. Luego se descarta.
		EntityManager em = emFactory.createEntityManager();

		for (Carrito carrito : em.createQuery("from Carrito", Carrito.class)
				.getResultList()) {
			System.out.println("Carrito con ID " + carrito.getId());
			for (Item item : carrito.getItems()) {
				System.out.println("- " + item.getDescripcion() + " $"
						+ item.getMonto());

			}
		}
		
		em.close();
	}
}
