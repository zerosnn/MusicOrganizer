import java.util.ArrayList;

public class MusicOrganizer {
    private ArrayList<Track> tracks;

    public MusicOrganizer() {
        tracks = new ArrayList<>();
    }

    public void addTrack(String trackTitle, String artist) {
        Track newTrack = new Track(trackTitle, artist);
        tracks.add(newTrack);
        System.out.println("Track added: " + trackTitle + " by " + artist);
    }

    public int getTrackCount() {
        return tracks.size();
    }

    public void listAllTracks() {
        if (tracks.isEmpty()) {
            System.out.println("No tracks in the collection.");
        } else {
            System.out.println("Listing all tracks:");
            for (int i = 0; i < tracks.size(); i++) {
                Track track = tracks.get(i);
                System.out.println((i + 1) + ": " + track.getTitle() + " by " + track.getArtist());
            }
        }
    }

    public Track getTrack(int index) {
        if (index >= 0 && index < tracks.size()) {
            return tracks.get(index);
        } else {
            System.out.println("Invalid track index.");
            return null;
        }
    }
}
