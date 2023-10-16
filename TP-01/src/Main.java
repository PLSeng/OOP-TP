public class Main {
    public static void main(String[] args) {
        System.out.println("*************************");
        System.out.println("*\t\t\t\t\t\t*");
        System.out.println("*\t\t\t\t\t\t*");
        System.out.println("*\t\t\t\t\t\t*");
        System.out.println("*\t\t\t\t\t\t*");
        System.out.println("*************************\n\n");

        System.out.println("    *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println(" ******* ");
        System.out.println("*********\n\n");

        System.out.println("*");
        System.out.println("***");
        System.out.println("*****");
        System.out.println("*******");
        System.out.println("*********\n\n");

        System.out.println("*********");
        System.out.println("  *******");
        System.out.println("    *****");
        System.out.println("      ***");
        System.out.println("        *\n\n");

        System.out.println("    *");
        System.out.println("   **");
        System.out.println("  ***");
        System.out.println("   **");
        System.out.println("    *\n\n");

        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");
        System.out.println(" ***");
        System.out.println("  *\n\n");

        System.out.println("""
                *****
                 ***
                  *
                 ***
                *****
                                
                                
                """);
        System.out.println("""
                  *
                 * *
                *   *
                 * *
                  *
                                
                                
                """);

        String ams = "AMSstudents";
        String action = "are so";
        String adj = "so friendly !";
        String sentence = ams + " " + action + " " + adj;
        System.out.println(sentence);

        String name = "Zhuge Liang";
        int age = 27;
        float weight = 50.9F;
        String hobby = "I like going jogging and swimming";

        System.out.printf("\nMy name is %s.\n", name);
        System.out.printf("I'm %d years old.\n", age);
        System.out.printf("I'm %.2f kg.\n", weight);
        System.out.println(hobby);
    }
}