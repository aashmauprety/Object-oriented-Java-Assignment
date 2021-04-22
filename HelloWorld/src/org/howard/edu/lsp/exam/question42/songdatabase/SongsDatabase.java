package org.howard.edu.lsp.exam.question42.songdatabase;
import java.util.*;



public class SongsDatabase {
	private Map<String, Set<String>> map = 
			new HashMap<String, Set<String>>();

		/* Add a song title to a genre */
	public void addSong(String genre, String songTitle) {
			//Code it!!
		Set<String> genres = map.keySet();
		//check if genre already in hashmap
		if (! genres.contains(genre)) {
			map.put(genre, new HashSet<String>());
		}
		map.get(genre).add(songTitle);
	}


	/* Return the Set that contains all songs for a genre */
	public Set<String> getSongs(String genre) {
			// Code it!!
		return map.get(genre);
	}

	/* Return genre, i.e., jazz, given a song title */
	public String getGenreOfSong(String songTitle) {
			// Code it!!
		for (String genre : map.keySet()) {
			Set<String> titles = map.get(genre);
			if (titles.contains(songTitle)){
				return genre;
			}
		}
		return "Song Not in Database";
	}
}
