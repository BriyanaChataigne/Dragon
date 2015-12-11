//start class
import java.util.Scanner;
class Dragon{
   private int wings;
   private int age;
   private String color;
   private String element;
	private Strength strength;
	

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

// start of strength class
class Strength{
   private int strength;
   private int stamina;
	private int person;
	
	public Strength(){
	strength = 9000;
	stamina = 8000;
	person = 1;
	}
   
   public void setStrength(int sTR){
      strength = sTR;
      return;
   }
   public void setStamina(int sTA){
      stamina = sTA;
      return;
   }
   public int getStrength(){
      return strength;
   }
   public int getStamina(){
      return stamina;
   }
   public void changeStrength(int sTR){
	   strength = sTR;
   }
   public void changeStamina(int sTA){
	   stamina = sTA;
	}
	public void eatPerson(){
		strength = strength + 10;
		stamina = stamina + 2;
	}

   public void print(){
   System.out.println("Stength (in power levels) is: " + strength);
   System.out.println("Stamina (in numbers) is: " + stamina);
   }

}
//end of strength class

//start of new class
 public class DragonDriver {
	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);
		String answer = "";
		Dragon Katara = new Dragon(2, 1300, "Blue", "Water");
      Dragon Toph = new Dragon();
		Dragon Zuko  = new Dragon(2, "Red", "Fire");
      Dragon Aang = new Dragon(3, 1200, "Orange and Tan", "Air" );
      Dragon Korra = new Dragon();
      Strength Azula = new Strength();
		Dragon Azula1 = new Dragon();
      System.out.println("Dragons of the Four Nations");
      System.out.println("Water. Earth. Fire. Air. \nLong ago, the four nations lived together in harmony. Then everything changed when the fire nation attacked. \nOnly the avatar, master of all four elements could stop them, but when the world needed him most... he vanished. \nA hundred years passed and my brother and I discovered the new avatar, an airbender named Aang. \nAnd although his airbending skills are great, he has a lot to learn before he's ready to save anyone. \nBut I beleive Aang can save the world.");
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
      Korra.changeWings(4);
		Korra.changeAge(17);
		Korra.changeColor("Blue"); 
      Korra.changeElement("Avatar");
      
      Azula.setStrength(9000);
      Azula.setStamina(8400);
      
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
      
		Azula1.changeWings(2);
		Azula1.changeAge(17);
		Azula1.changeColor("Hazel"); 
      Azula1.changeElement("Ligthning");

		
		// Calling Second Class
      System.out.println();
		System.out.println("No. She's crazy and she needs to be brought down.");
		System.out.println(Azula1);
      Azula.print();
      
      System.out.println();
		System.out.println("Seems to me like you should worry less about the tides who already made up their mind about killing you,\nand worry more about me, who's still mulling it over.");
      System.out.println();
		Azula.changeStrength(9000);
      Azula.changeStamina(8000);
      Azula.print();
		
		System.out.println("Feed your dragon?");
		answer = scnr.next();
		if(answer.equals("yes")){
			Azula.eatPerson();
			}
			
		System.out.println("Don't flater yourself. You were never even a player.");
		System.out.println(Azula1);
      Azula.print();



		
		System.out.println();
		System.out.println("Testing started");
		
      assert (Toph.getWings() == 1) : "Assertion (Toph.getWings() == 1) failed";
		assert (Toph.getAge() == 400) : "Assertion (Toph.getAge() == 400) failed";
		assert (Toph.getColor() == "Brown") : "Assertion (Toph.getColor() == Brown) failed";
		assert (Toph.getElement() != "Earth") : "Assertion (Toph.getElement() != Earth) failed";




	}
}
