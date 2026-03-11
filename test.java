public static void main(){
String apiKey = System.getenv("MY_API_KEY");
  if (apiKey == null) {
      System.err.println("MY_API_KEY environment variable not set!");
      // Handle error appropriately
  }
  String apiKey1 = System.getenv("MY_API_KEY1");
  if (apiKey1 == null) {
      System.err.println("MY_API_KEY1 environment variable not set!");
      // Handle error appropriately
  }
}
