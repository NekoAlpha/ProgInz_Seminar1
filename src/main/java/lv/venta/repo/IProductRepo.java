package lv.venta.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import lv.venta.models.Product;

public interface IProductRepo extends CrudRepository<Product, Integer>{
	//SELECT * FROM product_table WHERE price < var;
	ArrayList<Product> findByPriceLessThan(float var);
	
	//TODO atlasa pēc nosaukuma
	//SELECT * From product_table Where title='<var>';
	ArrayList<Product> findByTitle(String var);
	
	//TODO atlasa tos produktus, kuru daudzums ir lielāks par 10, bet cena mazāka par 4 euro
	//SELECT * WHERE product_table WHERE quantity > varQ AND price < varP;
	ArrayList<Product> findByQuantityGreaterThanAndPriceLessThan(int varQ, float varP);
	
	//@Query(nativeQuery = countBy)
	//ArrayList<Product> funcNameDoesNotMatter();
}
