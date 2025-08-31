public class AllTests {
    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println(" Running All Stack Test Scenarios ");
        System.out.println("=======================================\n");

        System.out.println(">> Running BasicTest:");
        BasicTest.main(null);
        System.out.println("\n---------------------------------------\n");

        System.out.println(">> Running DuplicateMinTest:");
        DuplicateMinTest.main(null);
        System.out.println("\n---------------------------------------\n");

        System.out.println(">> Running SingleElementTest:");
        SingleElementTest.main(null);
        System.out.println("\n---------------------------------------\n");

        System.out.println(">> Running IdenticalElementsTest:");
        IdenticalElementsTest.main(null);
        System.out.println("\n=======================================");
        System.out.println(" All Tests Completed ");
        System.out.println("=======================================");
    }
}
