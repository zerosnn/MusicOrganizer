public class Main {
    public static void main(String[] args) {
        MusicManager manager = new MusicManager();

        // Menambahkan beberapa lagu dengan artisnya
        manager.addTrack("Song 1", "Artist A");
        manager.addTrack("Song 2", "Artist B");
        manager.addTrack("Song 3", "Artist C");

        // Menampilkan semua lagu
        manager.listAllTracks();

        // Memulai pemutaran lagu ke-2
        manager.playTrack(2);

        // Menghentikan pemutaran lagu
        manager.stopTrack();

        // Coba hentikan lagi (tidak ada lagu yang diputar)
        manager.stopTrack();

        // Menampilkan jumlah lagu
        System.out.println("Total number of tracks: " + manager.getTrackCount());
    }
}
