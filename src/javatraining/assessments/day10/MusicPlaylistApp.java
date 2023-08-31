package javatraining.assessments.day10;

import java.util.Collections;
import java.util.LinkedList;

/**
Assignment 4: Music Playlist Shuffle
Build a music playlist application where users can create playlists and shuffle the order of songs. 
Use a LinkedList to represent the playlist. 
Implement methods to add songs, shuffle the playlist, and play songs in order.
 * @author ramya
 *
 */
public class MusicPlaylistApp {

	private static LinkedList<Music> musicList=null;
	
	/**
	 * addSongs()
	 */
	public static void addSongs() {
		musicList = new LinkedList<Music>();
		musicList.add(addMusic("let it go..","Frozen1"));
		musicList.add(addMusic("into the unknown..","Frozen2"));
		musicList.add(addMusic("song3..","album3"));
		System.out.println("Music List:::"+musicList.toString());
		System.out.println("SONGS ADDED SUCCESSFULLY::::");
	}

	/**
	 * addMusic
	 * @param musicName
	 * @param album
	 * @return
	 */
	public static Music addMusic(String musicName, String album) {
		Music music  = new Music();
		music.setSongName(musicName);
		music.setAlbum(album);
		return music;
	}
	
	/**
	 * shuffle
	 */
	public static void shuffle() {
		Collections.shuffle(musicList);
		System.out.println("SHUFFLED MUSIC PLAYLIST:::"+musicList.toString());
		System.out.println("SONGS SHUFFLED SUCCESSFULLY::::");
	}
	
	
	/**
	 * playSongs
	 */
	public static void playSongs() {
		for(Music music: musicList) {
			System.out.println("MUSIC PLAYLIST ORDER:::"+music);
		}
		System.out.println("SONGS PLAYED SUCCESSFULLY:::");
	}
	
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		MusicPlaylistApp.addSongs();
		MusicPlaylistApp.playSongs();
		MusicPlaylistApp.shuffle();
		MusicPlaylistApp.playSongs();
	}

}

class Music{
	
	private String songName;
	private String artist;
	private String album;
	/**
	 * @return the songName
	 */
	public String getSongName() {
		return songName;
	}
	/**
	 * @param songName the songName to set
	 */
	public void setSongName(String songName) {
		this.songName = songName;
	}
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	/**
	 * @return the album
	 */
	public String getAlbum() {
		return album;
	}
	/**
	 * @param album the album to set
	 */
	public void setAlbum(String album) {
		this.album = album;
	}
	@Override
	public String toString() {
		return "Music [songName=" + songName + ", artist=" + artist + ", album=" + album + "]";
	}
	
	
}

/**
OUTPUT:

Music List:::[Music [songName=let it go.., artist=null, album=Frozen1], Music [songName=into the unknown.., artist=null, album=Frozen2], Music [songName=song3.., artist=null, album=album3]]
SONGS ADDED SUCCESSFULLY::::
MUSIC PLAYLIST ORDER:::Music [songName=let it go.., artist=null, album=Frozen1]
MUSIC PLAYLIST ORDER:::Music [songName=into the unknown.., artist=null, album=Frozen2]
MUSIC PLAYLIST ORDER:::Music [songName=song3.., artist=null, album=album3]
SONGS PLAYED SUCCESSFULLY:::
SHUFFLED MUSIC PLAYLIST:::[Music [songName=song3.., artist=null, album=album3], Music [songName=let it go.., artist=null, album=Frozen1], Music [songName=into the unknown.., artist=null, album=Frozen2]]
SONGS SHUFFLED SUCCESSFULLY::::
MUSIC PLAYLIST ORDER:::Music [songName=song3.., artist=null, album=album3]
MUSIC PLAYLIST ORDER:::Music [songName=let it go.., artist=null, album=Frozen1]
MUSIC PLAYLIST ORDER:::Music [songName=into the unknown.., artist=null, album=Frozen2]
SONGS PLAYED SUCCESSFULLY:::



**/
