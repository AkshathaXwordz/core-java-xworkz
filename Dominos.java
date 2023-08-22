class Dominos{
 public static double search (String foodName) {
   double price =0.0;
		   System.out.println("invoked search: foodName (String)");
		   if (foodName == "pepsi") {
			   price=60.20;
               return price;}
               if (foodName == "merinda") {
			    price=80.60;
                 return price;}
				 if (foodName == "margherita pizza") {
			   price=129.00;
                return price;}
				 if (foodName == "corn and cheese paratha pizza") {
			    price=329.00;
                return price;}
				if (foodName == "moroccan spice pasta pizza") {
			    price=379.00;
                return price;}
				 if (foodName == "fresh veggi") {
			   price=379.00;
               return price;}
               if (foodName == "double cheese margherita") {
			    price=379.00;
                 return price;}
				 if (foodName == "mexican green wave") {
			   price=459.00;
                return price;}
				 if (foodName == "al fungi gourmet pizza") {
			    price=699.00;
                return price;}
				if (foodName == "cheese n corn") {
			    price=379.00;
                return price;}
				 if (foodName == "veg extravaganza") {
			   price=549.00;
               return price;}
               if (foodName == "indi tandoori") {
			    price=549.00;
                 return price;}
				 if (foodName == "peppy paneer") {
			   price=459.00;
                return price;}
				 if (foodName == "farm house") {
			    price=459.00;
                return price;}
				if (foodName == "blazing onion and paprika") {
			    price=329.00;
                return price;}
				 if (foodName == "fiery jalapeno paprika") {
			   price=160.20;
               return price;}
               if (foodName == "garlic bread") {
			    price=179.00;
                 return price;}
				 if (foodName == "taco mexican veg") {
			   price=139.20;
                return price;}
				 if (foodName == "taco mexican non veg") {
			    price=260.20;
                return price;}
				if (foodName == "cheese meat balls") {
			    price=149.00;
                return price;}
				 if (foodName == "veg parcel") {
			   price=45.00;
               return price;}
               if (foodName == "chicken parcel") {
			    price=55.00;
                 return price;}
				 if (foodName == "potato cheese shots") {
			   price=79.00;
                return price;}
				 if (foodName == "burger pizza - classic non veg") {
			    price=159.00;
                return price;}
				if (foodName == "roasted chicken wings") {
			    price=169.00;
                return price;}
				 if (foodName == "harissa dip") {
			   price=49.00;
               return price;}
               if (foodName == "tomato ketchup") {
			    price=1.00;
                 return price;}
				 if (foodName == "cheese jalapeno dip") {
			   price=30.00;
                return price;}
				 if (foodName == "crunchy strips") {
			    price=69.00;
                return price;}
				if (foodName == "basil pesto dip") {
			    price=49.20;
                return price;}
				 if (foodName == "boneless chicken wings peri peri") {
			   price=179.00;
               return price;}
               if (foodName == "red velvet lava cake") {
			    price=139.00;
                 return price;}
				 if (foodName == "chaco lava") {
			   price=109.20;
                return price;}
				 if (foodName == "butterscotch mousse cake") {
			    price=109.00;
                return price;}
				if (foodName == "blazing chicken and paprika") {
			    price=360.80;
                return price;}
				 if (foodName == "fiery sausage and paprika") {
			   price=160.20;
               return price;}
               if (foodName == "pepper barbecue chicken") {
			    price=160.00;
                 return price;}
				 if (foodName == "chicken dominator") {
			   price=360.00;
                return price;}
				 if (foodName == "chicken pepproni") {
			    price=540.00;
                return price;}
				if (foodName == "indi chicken tikka") {
			    price=279.00;
                return price;}
				 if (foodName == "smoked chicken gourmet pizza") {
			   price=450.30;
               return price;}
               if (foodName == "chicken fiesta") {
			    price=260.00;
                 return price;}
				 if (foodName == "chicken keema paratha pizza") {
			   price=179.00;
                return price;}
				 if (foodName == "chicken sausage") {
			    price=300.00;
                return price;}
				if (foodName == "chicken pepproni gourmet pizza") {
			    price=759.00;
                return price;}
				 if (foodName == "moroccan spice pasta pizza") {
			   price=379.00;
               return price;}
               if (foodName == "pepsi black can") {
			    price=60.00;
                 return price;}
				 if (foodName == "7up") {
			   price=70.00;
                return price;}
				 if (foodName == "B natural") {
			    price=60.00;
                return price;}
				if (foodName == "bailey one") {
			    price=20.00;
                return price;}
				System.out.println("end of search");
				return price;
}
public static double search (String foodName,int quantity) {
   double price =0.0;
		   System.out.println("invoked search: foodName (String),quantity (int)");
		   if (foodName == "pepsi") {
			   price=60.2*quantity;
               return price;}
               if (foodName == "merinda") {
			    price=80.6*quantity;
                 return price;}
				 if (foodName == "margherita pizza") {
			   price=129.0*quantity;
                return price;}
				 if (foodName == "corn and cheese paratha pizza") {
			    price=329.0*quantity;
                return price;}
				if (foodName == "moroccan spice pasta pizza") {
			    price=379.0*quantity;
                return price;}
				 if (foodName == "fresh veggi") {
			   price=379.0*quantity;
               return price;}
               if (foodName == "double cheese margherita") {
			    price=379.0*quantity;
                 return price;}
				 if (foodName == "mexican green wave") {
			   price=459.0*quantity;
                return price;}
				 if (foodName == "al fungi gourmet pizza") {
			    price=699.0*quantity;
                return price;}
				if (foodName == "cheese n corn") {
			    price=379.0*quantity;
                return price;}
				 if (foodName == "veg extravaganza") {
			   price=549.0*quantity;
               return price;}
               if (foodName == "indi tandoori") {
			    price=549.0*quantity;
                 return price;}
				 if (foodName == "peppy paneer") {
			   price=459.0*quantity;
                return price;}
				 if (foodName == "farm house") {
			    price=459.0*quantity;
                return price;}
				if (foodName == "blazing onion and paprika") {
			    price=329.0*quantity;
                return price;}
				 if (foodName == "fiery jalapeno paprika") {
			   price=160.2*quantity;
               return price;}
               if (foodName == "garlic bread") {
			    price=179.0*quantity;
                 return price;}
				 if (foodName == "taco mexican veg") {
			   price=139.2*quantity;
                return price;}
				 if (foodName == "taco mexican non veg") {
			    price=260.2*quantity;
                return price;}
				if (foodName == "cheese meat balls") {
			    price=149.0*quantity;
                return price;}
				 if (foodName == "veg parcel") {
			   price=45.0*quantity;
               return price;}
               if (foodName == "chicken parcel") {
			    price=55.0*quantity;
                 return price;}
				 if (foodName == "potato cheese shots") {
			   price=79.0*quantity;
                return price;}
				 if (foodName == "burger pizza - classic non veg") {
			    price=159.0*quantity;
                return price;}
				if (foodName == "roasted chicken wings") {
			    price=169.0*quantity;
                return price;}
				 if (foodName == "harissa dip") {
			   price=49.0*quantity;
               return price;}
               if (foodName == "tomato ketchup") {
			    price=1.0*quantity;
                 return price;}
				 if (foodName == "cheese jalapeno dip") {
			   price=30.0*quantity;
                return price;}
				 if (foodName == "crunchy strips") {
			    price=69.0*quantity;
                return price;}
				if (foodName == "basil pesto dip") {
			    price=49.2*quantity;
                return price;}
				 if (foodName == "boneless chicken wings peri peri") {
			   price=179.0*quantity;
               return price;}
               if (foodName == "red velvet lava cake") {
			    price=139.0*quantity;
                 return price;}
				 if (foodName == "chaco lava") {
			   price=109.2*quantity;
                return price;}
				 if (foodName == "butterscotch mousse cake") {
			    price=109.0*quantity;
                return price;}
				if (foodName == "blazing chicken and paprika") {
			    price=360.8*quantity;
                return price;}
				 if (foodName == "fiery sausage and paprika") {
			   price=160.2*quantity;
               return price;}
               if (foodName == "pepper barbecue chicken") {
			    price=160.0*quantity;
                 return price;}
				 if (foodName == "chicken dominator") {
			   price=360.0*quantity;
                return price;}
				 if (foodName == "chicken pepproni") {
			    price=540.0*quantity;
                return price;}
				if (foodName == "indi chicken tikka") {
			    price=279.0*quantity;
                return price;}
				 if (foodName == "smoked chicken gourmet pizza") {
			   price=450.3*quantity;
               return price;}
               if (foodName == "chicken fiesta") {
			    price=260.0*quantity;
                 return price;}
				 if (foodName == "chicken keema paratha pizza") {
			   price=179.0*quantity;
                return price;}
				 if (foodName == "chicken sausage") {
			    price=300.0*quantity;
                return price;}
				if (foodName == "chicken pepproni gourmet pizza") {
			    price=759.0*quantity;
                return price;}
				 if (foodName == "moroccan spice pasta pizza") {
			   price=379.0*quantity;
               return price;}
               if (foodName == "pepsi black can") {
			    price=60.0*quantity;
                 return price;}
				 if (foodName == "7up") {
			   price=70.0*quantity;
                return price;}
				 if (foodName == "B natural") {
			    price=60.0*quantity;
                return price;}
				if (foodName == "bailey one") {
			    price=20.0*quantity;
                return price;}
				System.out.println("end of search");
				return price;
}
}