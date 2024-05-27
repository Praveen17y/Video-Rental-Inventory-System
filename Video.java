public class Video {
    private String videoName;
    private boolean checkout;
    private int rating;

    // Constructor
    public Video(String name) {
        this.videoName = name;
        this.checkout = false;
        this.rating = 0;
    }

    // Get the name of the video
    public String getName() {
        return videoName;
    }

    // Check out the video
    public void doCheckout() {
        this.checkout = true;
    }

    // Return the video
    public void doReturn() {
        this.checkout = false;
    }

    // Receive a rating for the video
    public void receiveRating(int rating) {
        this.rating = rating;
    }

    // Get the rating of the video
    public int getRating() {
        return rating;
    }

    // Get the checkout status of the video
    public boolean getCheckout() {
        return checkout;
    }

    @Override
    public String toString() {
        return "Video [name=" + videoName + ", checked out=" + checkout + ", rating=" + rating + "]";
    }
}