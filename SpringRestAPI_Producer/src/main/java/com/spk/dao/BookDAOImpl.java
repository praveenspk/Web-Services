package com.spk.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.spk.model.Book;

@Repository
public class BookDAOImpl implements BookDAO {

	@PersistenceContext(unitName = "demoRestPersistence")
	private EntityManager entityManager;

	@PersistenceContext(unitName = "demoRestPersistenceLegacy")
	private EntityManager entityManagerLegacy;

	@Override
	public List<Book> getBooks() {
		String qlString = "SELECT book FROM BookDetails book";
		TypedQuery<Book> query = entityManager.createQuery(qlString, Book.class);
		return query.getResultList();
	}

	@Override
	public Book getBookById(Long id) {
		try {
			String qlString = "SELECT p FROM BookDetails p WHERE p.id = ?1";
			TypedQuery<Book> query = entityManager.createQuery(qlString, Book.class);
			query.setParameter(1, id);

			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public void deleteBookById(int theId) {
		Book book = entityManager.find(Book.class, theId);
		entityManager.remove(book);
	}

	@Override
	public void createBook(Book book) {
		// book.setInsertionDate(new Date());
		entityManager.persist(book);
		entityManager.flush();// force insert to receive the id of the podcast

		// return book.getId();

	}

	@Override
	public void deleteBook() {
		Query query = entityManager.createNativeQuery("TRUNCATE TABLE BookDetails");
		query.executeUpdate();

	}

	@Override
	public int updateBook(Book book) {

		entityManager.merge(book);

		return 1;
	}

}
