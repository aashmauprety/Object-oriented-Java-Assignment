package org.howard.edu.lsp.exam.question42.junit;

import org.howard.edu.lsp.exam.question42.songdatabase.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

public class TestSongsDatabase {

	@Test
	public void testAddSong() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("rock", "into minto london maa");
		db.addSong("rock", "goji ma daam chaina");
		db.addSong("hindi", "mera naam pooki");
		db.addSong("pop", "sunday morning love you");
		db.addSong("hindi", "ganga teri ghata");
	}	
		
		
	@Test 
	public void testGetSong() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("rock", "into minto london maa");
		db.addSong("rock", "goji ma daam chaina");
		db.addSong("hindi", "mera naam pooki");
		db.addSong("pop", "sunday morning love you");
		db.addSong("hindi", "ganga teri ghata");
		
		//test getSong
		Set<String> expectedSongs = new HashSet<String>();
		Collections.addAll(expectedSongs,"into minto london maa", "goji ma daam chaina" );
		Set<String> actualSongs  = db.getSongs("rock");
		assertEquals(expectedSongs,actualSongs);
		
	}
	
	@Test
	public void testGetGenreOfSong() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("rock", "into minto london maa");
		db.addSong("rock", "goji ma daam chaina");
		db.addSong("hindi", "mera naam pooki");
		db.addSong("pop", "sunday morning love you");
		db.addSong("hindi", "ganga teri ghata");
	
		//test getGenreOfSong
		String expectedGenre = "hindi";
		String actualGenre = db.getGenreOfSong("mera naam pooki");
		assertEquals(expectedGenre, actualGenre);
	}	
		
}
