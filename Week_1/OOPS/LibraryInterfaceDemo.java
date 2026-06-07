public class LibraryInterfaceDemo
{
    public static void main(String[] args)
    {
        KidUser k1 = new KidUser();
        k1.age = 10;
        k1.registerAccount();
        k1.bookType = "Kids";
        k1.requestBook();
        System.out.println();

        k1.age = 18;
        k1.registerAccount();
        k1.bookType = "Fiction";
        k1.requestBook();
        System.out.println();

        AdultUser a1 = new AdultUser();
        a1.age = 5;
        a1.registerAccount();
        a1.bookType = "Kids";
        a1.requestBook();
        System.out.println();

        a1.age = 23;
        a1.registerAccount();
        a1.bookType = "Fiction";
        a1.requestBook();
    } 
}