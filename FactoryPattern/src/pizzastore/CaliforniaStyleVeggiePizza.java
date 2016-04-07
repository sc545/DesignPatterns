package pizzastore;

public class CaliforniaStyleVeggiePizza extends Pizza {
	public CaliforniaStyleVeggiePizza() {
		name = "California Style Deep Dish Veggie Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
		
	void cut(){
		System.out.println("Cutting the pizza into triangle slices");
	}
}