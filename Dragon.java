//start class
class Dragon{
   private int wings;
   private int age;
   private String color;
   private String element;

   public Dragon(){
	   wings = 0;
      age = 400;
	   color = "Green";
      element = "Earth";
   }
   public Dragon(int wG, int aG, String cL, String eL){
	   wings = wG;
	   age = aG;
	   color = cL;
      element = eL;
   }
   public Dragon(int wG, String cL, String eL){
	   wings = wG;
      color = cL;
      element = eL;
   }
   public void changeWings(int wG){
   wings = wG;
   }
   public void changeAge(int aG){
	   age = aG;
   }
   public void changeColor(String cL){
	   color = cL;
	}
   public void changeElement(String eL){
	   element = eL;
	}

	public int getWings(){
	   return wings;
	}
	public int getAge(){
		return age;
	}
	public String getColor(){
	   return color;
	}
   public String getElement(){
	   return element;
	}


	public String toString(){
	   return "Wings: "+ wings + "\nAge(in years): " + age + "\nColor: " + color + "\nElement: " + element;
	}
}// end of class

//start of new class
 public class DragonDriver {
	public static void main(String args[]) {
		Dragon Katara = new Dragon(2, 1300, "Blue", "Water");
      Dragon Toph = new Dragon();
		Dragon Zuko  = new Dragon(2, "Red", "Fire");
      Dragon Aang = new Dragon(3, 1200, "Orange and Tan", "Air" );
      System.out.println("Dragons of the Four Nations");
      System.out.println("Water. Earth. Fire. Air. \nLong ago, the four nations lived together in harmony. Then everything changed when the fire nation attacked. \nOnly the avatar, master of all four elements could stop them, but when the world needed him most... he vanished. \nA hundred years passed and my brother and I discovered the new avatar, an airbender named Aang. \nAnd although his airbending skills are great, he has a lot to learn before he's ready to save anyone. \nBut I beleive Aand can save the world.");
		System.out.println();

		
		System.out.println("Water Tribe");
		System.out.println(Katara);
		System.out.println();
		System.out.println("Earth Kingdom");
		System.out.println(Toph);
		System.out.println();
		System.out.println("Fire Nation");
		System.out.println(Zuko);
     System.out.println();
	  System.out.println("Air Nomads");
	  System.out.println(Aang);
		
	   Katara.changeWings(4);
		Toph.changeAge(7);
		Zuko.changeColor("Hazel"); 
      Aang.changeElement("Avatar");
		System.out.println();
		      
		System.out.println("Water Tribe");
		System.out.println(Katara);
		System.out.println();
		System.out.println("Earth Kingdom");
		System.out.println(Toph);
		System.out.println();
		System.out.println("Fire Nation");
		System.out.println(Zuko);
     System.out.println();
	  System.out.println("Air Nomads");
	  System.out.println(Aang);
		

		
		System.out.println();
		System.out.println("Previously on Avatar...");
		
		System.out.println("Wings: "+Katara.getWings());
      System.out.println("Age: "+Toph.getAge());
      System.out.println("Color: "+Zuko.getColor());
		System.out.println("Element: "+Aang.getElement());

	}
}
