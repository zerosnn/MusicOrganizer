public class Main {
    public static void main(String[] args) {
        MusicManager manager = new MusicManager();

        manager.addTrack("About You", "The 1975");
        manager.addTrack("the stars", "Chelsea Cutler");
        manager.addTrack("Moments", "One Direction");

        manager.listAllTracks();

        manager.playTrack(2);

        manager.stopTrack();

        manager.stopTrack();

        System.out.println("Total number of tracks: " + manager.getTrackCount());
    }
}
