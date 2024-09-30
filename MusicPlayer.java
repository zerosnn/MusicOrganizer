public class MusicPlayer {
    private Track currentTrack;

    public void playTrack(Track track) {
        if (track != null) {
            currentTrack = track;
            System.out.println("Playing: " + currentTrack.getTitle() + " by " + currentTrack.getArtist());
        } else {
            System.out.println("No track to play.");
        }
    }

    public void stopTrack() {
        if (currentTrack != null) {
            System.out.println("Stopping: " + currentTrack.getTitle() + " by " + currentTrack.getArtist());
            currentTrack = null;
        } else {
            System.out.println("No track is currently playing.");
        }
    }

    public boolean isTrackPlaying() {
        return currentTrack != null;
    }
}
