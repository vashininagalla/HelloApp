public class UC6Hello {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String result = "Hello, ";

            // Enhanced for loop
            for (String name : args) {
                result += name + ", ";
            }

            // Remove trailing ", " using substring
            result = result.substring(0, result.length() - 2);

            // Add !
            result += "!";

            System.out.println(result);
        }
    }
}
