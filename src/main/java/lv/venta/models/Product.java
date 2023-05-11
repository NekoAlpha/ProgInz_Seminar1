package lv.venta.models;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Product {

	private int id;
	
	@NotNull
	@Pattern(regexp = "[A-ZĒŪĪĻĶŠĀŽČŅĢ]{1}[a-zēūīļķšžžčņģ\\ ]+", message = "Pirmajam burtam jābūt lielajam")
	@Size(min = 3, max = 30, message = "Jābūt vismaz 3 un ne vairāk kā 30 simboliem")
	private String title;
	
	@Min(value = 0, message = "Mazākā cena var būt nulle")
	@Max(value = 10000, message = "Lielākā cena var būt 10000")
	private float price;
	
	@NotNull
	@Pattern(regexp = "[A-ZĒŪĪĻĶŠĀŽČŅĢ]{1}[a-zēūīļķšžžčņģ\\ ]+", message = "Pirmajam burtam jābūt lielajam")
	@Size(min = 3, max = 100, message = "Jābūt vismaz 3 un ne vairāk kā 30 simboliem")
	private String description;
	
	@Min(value = 0, message = "Mazākais daudzums var būt nulle")
	@Max(value = 1000, message = "Lielākais daudzums var būt 10000")
	private int quantity;
	
	
	
	private static int idCounter = 0;
	
	public int getId() {
		return id;
	}

	public void setId() {
		this.id = idCounter++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product(String title, float price, String description, int quantity) {
		setId();
		this.title = title;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
	}

	public Product() {
	}

}
