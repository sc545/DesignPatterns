package pizzastore;

public class CaliforniaStylePepperoniPizza extends Pizza {
	public CaliforniaStylePepperoniPizza() {
		name = "California Style Deep Dish Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
		
	void cut(){
		System.out.println("Cutting the pizza into triangle slices");
	}
}