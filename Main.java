public class Main {
    public static void main(String[] args) {
        MusicManager manager = new MusicManager();

        manager.addTrack("Song 1", "Artist A");
        manager.addTrack("Song 2", "Artist B");
        manager.addTrack("Song 3", "Artist C");

        manager.listAllTracks();

        manager.playTrack(2);

        manager.stopTrack();

        manager.stopTrack();

        System.out.println("Total number of tracks: " + manager.getTrackCount());
    }
}
