class NullPointerExample {

 public static void main(String[] args) {
  String name = “James Gates”;
  System.out.println(name.length()); // Prints 11

  name = null; // assigning a value of null to name
  System.out.println(name.length()); // throws NullPointerException
 }
}
