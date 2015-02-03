package sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EjemploEscritura {
	public static void main(String[] args) {
		// El factory pueden crearlo una unica vez.
		// "pepito" tiene que coincidir con lo que ponen en el persistence.xml
		EntityManagerFactory emFactory = Persistence
				.createEntityManagerFactory("pepito");

		// El entity manager, en cambio, debe crearse cada vez que se va a
		// realiziar un conjunto de operaciones. Luego se descarta.
		EntityManager em = emFactory.createEntityManager();

		EntityTransaction tx = null;
		try {
			tx = em.getTransaction();
			tx.begin();

			Carrito carrito = new Carrito(new Item("Coca cola", 15.30),
					new Item("Fernet", 87.46));

			em.persist(carrito);

			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
			throw e;
		} finally {
			em.close();
		}
	}
}
