import java.util.Scanner;

public class Static {
    public static void main(String[] args) {
//        invoke the static funcition info using className
        Website.info();
        Website.acceptData();
    }
}

class Website{
//    can only use static variables with in static methods
    static int year = 2019;
    static String companyName = "Camerinfolks";
    static void info(){
        System.out.println("Copyright @ " + year + " " + companyName);
    }

//    static function - 2
    static void acceptData(){
        Scanner authorName = new Scanner(System.in);
        System.out.print("Enter Author Name: ");
        String name = authorName.next();
//      get no of pages;
        Scanner bookPages = new Scanner(System.in);
        System.out.print("Book Pages: ");
        int pages= bookPages.nextInt();

//      print the data
        System.out.println("*******All Details********");
        String newLine = System.getProperty("line.separator");
        System.out.println("Author Name: " + name + newLine + "Pages: " + pages);
    }


}