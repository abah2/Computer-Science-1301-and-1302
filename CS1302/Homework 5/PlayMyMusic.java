// Amadou Bah
// Homework 5: Ipod
// 10/7/2017

import java.io.*;
import java.util.*;


public class PlayMyMusic {
	public static void main (String[] args) throws IOException{
		
		// Reading the music from a text file
      Scanner music = new Scanner(new File("musicList.txt"));
		//-------------------------------------------------------------
      
		// The First Ipod Object
      // Loading the music
      ArrayList<String> songs_a = new ArrayList<String>();
      for (int i = 0; i < 10 ;i++){
			songs_a.add(music.nextLine());
		}
      // The object
		Ipod ipod_a = new Ipod(songs_a,20,98.1,songs_a.get(2));
      //-------------------------------------------------------------
      
      // The Second Ipod Object
      // Loading the music
      ArrayList<String> songs_b = new ArrayList<String>();
		for (int i = 0; i<10;i++){
			songs_b.add(music.nextLine());
		}
      // The object
		Ipod ipod_b = new Ipod(songs_b,3,50.1,songs_b.get(9));
      ipod_b.powerOn();
      ipod_b.powerOff();
      System.out.println(ipod_b.getPowerStatus());
      
		//-------------------------------------------------------------
      
      // The Third Ipod Object
      // Loading the music
      ArrayList<String> songs_c = new ArrayList<String>();
		for (int i = 0; i<10;i++){
			songs_c.add(music.nextLine());
		}
      // The object
		Ipod ipod_c = new Ipod(songs_c,20,98.1,songs_c.get(4));
	}
}
