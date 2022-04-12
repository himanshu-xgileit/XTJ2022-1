class InstanceofOperators {
  public static void main(String[] args) {

    String str = "Programiz";
	 String str2= null;
    boolean result;

    // checks if str is an instance of
    // the String class
    result = str instanceof String;
    System.out.println("Is str an object of String? " + result);
	
	  result = str2 instanceof String;
    System.out.println("Is str an object of String? " + result);
  }
}