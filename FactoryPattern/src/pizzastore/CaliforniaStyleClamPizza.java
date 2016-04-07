package pizzastore;

public class CaliforniaStyleClamPizza extends Pizza {
	public CaliforniaStyleClamPizza() {
		name = "California Style Deep Dish Clam Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
		
	void cut(){
		System.out.println("Cutting the pizza into triangle slices");
	}
}