
import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Video> store;

    // Constructor
    public VideoStore() {
        this.store = new ArrayList<>();
    }

    // Add a video to the store
    public void addVideo(String name) {
        Video video = new Video(name);
        store.add(video);
    }

    // Check out a video from the store
    public void doCheckout(String name) {
        for (Video video : store) {
            if (video.getName().equals(name) && !video.getCheckout()) {
                video.doCheckout();
                System.out.println(name + " has been checked out.");
                return;
            }
        }
        System.out.println("Video not found or already checked out: " + name);
    }

    // Return a video to the store
    public void doReturn(String name) {
        for (Video video : store) {
            if (video.getName().equals(name) && video.getCheckout()) {
                video.doReturn();
                System.out.println(name + " has been returned.");
                return;
            }
        }
        System.out.println("Video not found or not checked out: " + name);
    }

    // Receive a rating for a video
    public void receiveRating(String name, int rating) {
        for (Video video : store) {
            if (video.getName().equals(name)) {
                video.receiveRating(rating);
                System.out.println(name + " has received a rating of " + rating);
                return;
            }
        }
        System.out.println("Video not found: " + name);
    }

    // List the inventory of the store
    public void listInventory() {
        System.out.println("Video Inventory:");
        for (Video video : store) {
            System.out.println(video);
        }
    }
}