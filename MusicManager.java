public class MusicManager {
    private MusicOrganizer organizer;
    private MusicPlayer player;

    public MusicManager() {
        organizer = new MusicOrganizer();
        player = new MusicPlayer();
    }

    public void addTrack(String trackTitle, String artist) {
        organizer.addTrack(trackTitle, artist);
    }

    public void listAllTracks() {
        organizer.listAllTracks();
    }

    public void playTrack(int index) {
        Track track = organizer.getTrack(index - 1);
        if (track != null) {
            player.playTrack(track);
        }
    }

    public void stopTrack() {
        player.stopTrack();
    }

    public int getTrackCount() {
        return organizer.getTrackCount();
    }
}
