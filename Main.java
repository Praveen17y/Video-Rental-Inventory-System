import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        VideoStore store = new VideoStore();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            System.out.println("\nMAIN MENU");
            System.out.println("1. Add Videos:");
            System.out.println("2. Check Out Video:");
            System.out.println("3. Return Video:");
            System.out.println("4. Receive Rating:");
            System.out.println("5. List Inventory:");
            System.out.println("6. Exit:");
            System.out.print("Enter your choice (1..6): ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video you want to add: ");
                    String addVideoName = scanner.nextLine();
                    store.addVideo(addVideoName);
                    System.out.println("Video \"" + addVideoName + "\" added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out: ");
                    String checkoutVideoName = scanner.nextLine();
                    store.doCheckout(checkoutVideoName);
                    break;
                case 3:
                    System.out.print("Enter the name of the video you want to return: ");
                    String returnVideoName = scanner.nextLine();
                    store.doReturn(returnVideoName);
                    break;
                case 4:
                    System.out.print("Enter the name of the video you want to rate: ");
                    String rateVideoName = scanner.nextLine();
                    System.out.print("Enter the rating for this video: ");
                    int rating = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    store.receiveRating(rateVideoName, rating);
                    System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + rateVideoName + "\".");
                    break;
                case 5:
                    store.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    break;
            }
        }

        scanner.close();
    }
}