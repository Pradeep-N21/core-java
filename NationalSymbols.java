public class NationalSymbols
{
public static void main(String[] args)
{
	String nationalFlag = "Tiranga";
	String nationalAnthem = "Jana Gana Mana";
	String nationalEmblem = "Lion Capital of Ashoka";
	String nationalBird = "Peacock";
	String nationalAnimal = "Indian Bengal Tiger";
	String nationalRiver = "     Gange       ";
	String nationalTree = "Banyan";
	String nationalFlower = "Lotus";
	String nationalFruit = "Mango";
	String nationalGame = "Field Hockey";
	String nationalSong = "Vande Mataram";


	
	int length = nationalFlag.length();
	System.out.println(length);
	
	boolean comparedValue = nationalAnthem.equals(nationalSong);
	System.out.println(comparedValue);
	
	char characterValue = nationalEmblem.charAt(7);
	System.out.println(characterValue);
	
	String lowerCaseValue = nationalAnimal.toLowerCase();
	System.out.println(lowerCaseValue);
	
	String upperCaseValue = nationalBird.toUpperCase();
	System.out.println(upperCaseValue);
	
	String trimmedValue = nationalRiver.trim();
	System.out.println(trimmedValue);
	
	String concatedValue = nationalTree.concat(nationalFlower);
	System.out.println(concatedValue);
	
	String updatedValue = nationalRiver.replace('e','a');
	System.out.println(updatedValue);
	
	boolean checkedValue = nationalFlower.equalsIgnoreCase(nationalFruit);
	System.out.println(checkedValue);
	
	int codePointValue = nationalGame.codePointAt(3);
	System.out.println(codePointValue);
	
	String booleanValue = String.valueOf(true);
	System.out.println(booleanValue);
	
	int beforeCodePointValue = nationalSong.codePointBefore(4);
	System.out.println(beforeCodePointValue);
	
	boolean startWithLion = nationalEmblem.startsWith("Lion");
	System.out.println(startWithLion);
	
	boolean endsWithTiger = nationalAnimal.endsWith("Tiger");
	System.out.println(endsWithTiger);
	
	int indexValue = nationalAnthem.indexOf("Gana");
	System.out.println(indexValue);
	
	char[] characterArray = nationalSong.toCharArray();
	for(int i=0; i<characterArray.length;i++)
	System.out.println(characterArray[i]);
	
	String[] splittedString = nationalAnimal.split(" ");
	for(int i=0; i<splittedString.length;i++)
	System.out.println(splittedString[i]);
}
}

	
	