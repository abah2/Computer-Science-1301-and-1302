// Amadou Bah
// Homework 5: Ipod
// 10/7/2017

import java.util.*;
import java.util.Random;

public class Ipod {
	
	private ArrayList<String> songs = new ArrayList<String>();

	private int volume;

	private boolean powerStatus;

	private double batteryLife;

	private String selectedSong;
	
   //Creating the class constructor
	public Ipod(ArrayList<String> songs, int volume, double batteryLife, String selectedSong) {
		this.songs = songs;
		this.volume = volume;
		this.powerStatus = false;
		this.batteryLife = batteryLife;
		this.selectedSong = selectedSong;
	}
   //-------------------------------------------------------------
   
	//Controlling the list of music of the ipod
	public ArrayList<String> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<String> songs) {
		this.songs = songs;
	}
   //-------------------------------------------------------------
   
   //Controlling the volume of the ipod
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
   
   public int increaseVolume(int volume){
      this.volume += volume;
        if (this.volume >= 100){
         this.volume = 100;
      }
      return this.volume;
   }
   public int decreaseVolume(int volume){
      this.volume -= volume;
      if (this.volume <= 0){
         this.volume = 0;
      }
      return this.volume;
   }
   //-------------------------------------------------------------

   //Controlling the power of the ipod
	public boolean getPowerStatus() {
		return powerStatus;
	}

	public void setPowerStatus(boolean powerStatus) {
		this.powerStatus = powerStatus;
	}
   //To turn the power on
	public boolean powerOn(){
		this.powerStatus = true;
		return powerStatus;	
	}
	
	//To turn the power off
	public boolean powerOff(){
		this.powerStatus = false;
		return powerStatus;	
	}
   //-------------------------------------------------------------

   //Controlling the battery life of the ipod
	public double getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(double batteryLife) {
		this.batteryLife = batteryLife;
	}
   //-------------------------------------------------------------

   //Controlling the selected song of the ipod
	public String getSelectedSong() {
		return selectedSong;
	}

	public void setSelectedSong(String selectedSong) {
		this.selectedSong = selectedSong;
	}
   public String changeSong(){
      Random r = new Random();
      int temp = r.nextInt(10);
      this.selectedSong = this.songs.get(temp); 
      return selectedSong;
   }		
}
