class Zomato {
 public static double search (String foodName ) {
   double price =0.0;
		   System.out.println("invoked search: foodName (String)");
		   //expression
		   if (foodName == "pizza") {
			   price=180.00;
               return price;}
               if (foodName == "Burger") {
			    price=90.30;
                 return price;}
				 if (foodName == "french fries") {
			   price=60.00;
                return price;}
				 if (foodName == "pasta") {
			    price=160.00;
                return price;}
				if (foodName == "thali") {
			    price=360.00;
                return price;}
				 if (foodName == "biryani") {
			   price=180.00;
               return price;}
               if (foodName == "fried rice") {
			    price=110.00;
                 return price;}
				 if (foodName == "cheese french fries") {
			   price=120.00;
                return price;}
				 if (foodName == "masala french fries") {
			    price=85.00;
                return price;}
				if (foodName == "crinckle cut fries") {
			    price=170.00;
                return price;}
				 if (foodName == " smileys") {
			   price=60.00;
               return price;}
               if (foodName == "wedges") {
			    price=40.00;
                 return price;}
				 if (foodName == "shoestring fries") {
			   price=98.30;
                return price;}
				 if (foodName == "waffle") {
			    price=69.20;
                return price;}
				if (foodName == "steak cut fries") {
			    price=170.00;
                return price;}
				 if (foodName == "tatar tats") {
			   price=160.00;
               return price;}
               if (foodName == "lasanga") {
			    price=210.00;
                 return price;}
				 if (foodName == "cheese pasta") {
			   price=160.70;
                return price;}
				 if (foodName == "chicken pasta") {
			    price=158.00;
                return price;}
				if (foodName == "spaghetti") {
			    price=120.60;
                return price;}
				 if (foodName == "shrimp alfredo") {
			   price=190.00;
               return price;}
               if (foodName == "double cheese Burger") {
			    price=220.00;
                 return price;}
				 if (foodName == "veg burger") {
			   price=100.00;
                return price;}
				 if (foodName == "chicken burger") {
			    price=260.80;
                return price;}
				if (foodName == "lamb burger") {
			    price=299.00;
                return price;}
				 if (foodName == "crunchy veg burger") {
			   price=120.36;
               return price;}
               if (foodName == "crunchy non veg Burger") {
			    price=190.60;
                 return price;}
				 if (foodName == "chicken fried rice") {
			   price=160.20;
                return price;}
				 if (foodName == "egg fried rice") {
			    price=160.00;
                return price;}
				if (foodName == "kimchi friedrice") {
			    price=260.90;
                return price;}
				 if (foodName == "mushroom friedrice") {
			   price=180.50;
               return price;}
               if (foodName == "brown rice") {
			    price=100.00;
                 return price;}
				 if (foodName == "pork fried rice") {
			   price=120.00;
                return price;}
				 if (foodName == "mexican friedrice") {
			    price=230.00;
                return price;}
				if (foodName == "Hyderbadi biryani") {
			    price=360.00;
                return price;}
				 if (foodName == "veg biryani") {
			   price=120.00;
               return price;}
               if (foodName == "chicken biryani") {
			    price=150.00;
                 return price;}
				 if (foodName == "mutton biryani") {
			   price=200.00;
                return price;}
				 if (foodName == "veg dum biryani") {
			    price=170.00;
                return price;}
				if (foodName == "prawn biryani") {
			    price=260.00;
                return price;}
				 if (foodName == "mughlai biryani") {
			   price=160.00;
               return price;}
               if (foodName == "mushroom biryani") {
			    price=140.60;
                 return price;}
				 if (foodName == "egg biryani") {
			   price=160.20;
                return price;}
				 if (foodName == "ambur biryani") {
			    price=100.00;
                return price;}
				if (foodName == "north indian thali") {
			    price=360.00;
                return price;}
				 if (foodName == "south indian thali") {
			   price=250.00;
               return price;}
               if (foodName == "tomato soup") {
			    price=70.00;
                 return price;}
				 if (foodName == "leg soup") {
			   price=160.00;
                return price;}
				 if (foodName == "vegetable soup") {
			    price=110.00;
                return price;}
				if (foodName == "cream soup") {
			    price=160.00;
                return price;}
				System.out.println("end of search");
				return price;
}
public static double search (String foodName, int quantity ) {
   double price =0.0;
		   System.out.println("invoked search: foodName (String), quantity(int)");
		   //expression
		   if (foodName == "pizza") {
			   price=180.00*quantity;
               return price;}
               if (foodName == "Burger") {
			    price=90.30*quantity;
                 return price;}
				 if (foodName == "french fries") {
			   price=60.00*quantity;
                return price;}
				 if (foodName == "pasta") {
			    price=160.00*quantity;
                return price;}
				if (foodName == "thali") {
			    price=360.00*quantity;
                return price;}
				 if (foodName == "biryani") {
			   price=180.00*quantity;
               return price;}
               if (foodName == "fried rice") {
			    price=110.00*quantity;
                 return price;}
				 if (foodName == "cheese french fries") {
			   price=120.00*quantity;
                return price;}
				 if (foodName == "masala french fries") {
			    price=85.00*quantity;
                return price;}
				if (foodName == "crinckle cut fries") {
			    price=170.00*quantity;
                return price;}
				 if (foodName == " smileys") {
			   price=60.00*quantity;
               return price;}
               if (foodName == "wedges") {
			    price=40.00*quantity;
                 return price;}
				 if (foodName == "shoestring fries") {
			   price=98.30*quantity;
                return price;}
				 if (foodName == "waffle") {
			    price=69.20*quantity;
                return price;}
				if (foodName == "steak cut fries") {
			    price=170.00*quantity;
                return price;}
				 if (foodName == "tatar tats") {
			   price=160.00*quantity;
               return price;}
               if (foodName == "lasanga") {
			    price=210.00;
                 return price;}
				 if (foodName == "cheese pasta") {
			   price=160.70;
                return price;}
				 if (foodName == "chicken pasta") {
			    price=158.00;
                return price;}
				if (foodName == "spaghetti") {
			    price=120.60;
                return price;}
				 if (foodName == "shrimp alfredo") {
			   price=190.00;
               return price;}
               if (foodName == "double cheese Burger") {
			    price=220.00;
                 return price;}
				 if (foodName == "veg burger") {
			   price=100.00;
                return price;}
				 if (foodName == "chicken burger") {
			    price=260.80;
                return price;}
				if (foodName == "lamb burger") {
			    price=299.00;
                return price;}
				 if (foodName == "crunchy veg burger") {
			   price=120.36;
               return price;}
               if (foodName == "crunchy non veg Burger") {
			    price=190.60;
                 return price;}
				 if (foodName == "chicken fried rice") {
			   price=160.20;
                return price;}
				 if (foodName == "egg fried rice") {
			    price=160.00;
                return price;}
				if (foodName == "kimchi friedrice") {
			    price=260.90;
                return price;}
				 if (foodName == "mushroom friedrice") {
			   price=180.50;
               return price;}
               if (foodName == "brown rice") {
			    price=100.00;
                 return price;}
				 if (foodName == "pork fried rice") {
			   price=120.00;
                return price;}
				 if (foodName == "mexican friedrice") {
			    price=230.00;
                return price;}
				if (foodName == "Hyderbadi biryani") {
			    price=360.00;
                return price;}
				 if (foodName == "veg biryani") {
			   price=120.00;
               return price;}
               if (foodName == "chicken biryani") {
			    price=150.00;
                 return price;}
				 if (foodName == "mutton biryani") {
			   price=200.00;
                return price;}
				 if (foodName == "veg dum biryani") {
			    price=170.00;
                return price;}
				if (foodName == "prawn biryani") {
			    price=260.00;
                return price;}
				 if (foodName == "mughlai biryani") {
			   price=160.00;
               return price;}
               if (foodName == "mushroom biryani") {
			    price=140.60;
                 return price;}
				 if (foodName == "egg biryani") {
			   price=160.20;
                return price;}
				 if (foodName == "ambur biryani") {
			    price=100.00;
                return price;}
				if (foodName == "north indian thali") {
			    price=360.00;
                return price;}
				 if (foodName == "south indian thali") {
			   price=250.00;
               return price;}
               if (foodName == "tomato soup") {
			    price=70.00;
                 return price;}
				 if (foodName == "leg soup") {
			   price=160.00;
                return price;}
				 if (foodName == "vegetable soup") {
			    price=110.00;
                return price;}
				if (foodName == "cream soup") {
			    price=160.00*quantity;
                return price;}
				System.out.println("end of search with 2 parameters");
				return price;
}
}