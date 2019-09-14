package com.ustglobal.dev.songsystem;

import java.util.Scanner;

public class MainSongClass {

	public static void main(String[] args) {

		SongInterfaceImplementation so = new SongInterfaceImplementation();

		Scanner sc = new Scanner(System.in);

		System.out.println("to play the song  press 1");
		System.out.println("to search song press 2");
		System.out.println("to show all song names press 3");
		System.out.println("to perform operations on songs press 4");

		System.out.println("===welcome to music application========");
		System.out.println("enter ur choise");
		int i = sc.nextInt();
		
		
		
		if(i==1) {
			
			System.out.println("to play all the songs press 1");
			System.out.println("to play all random songs press 2");
			System.out.println("to play a particular song press 3");
			

			System.out.println("enter ur choise");
			
			int choise=sc.nextInt();
			
			if(choise==1) {
				so.playSongs();
			}else if(choise==2) {
				so.PlayAllRandomSong();
			}else {
				so.playSpecificSong();
			}
			
			
			
			
		}else if(i==2) {
			so.searchsong();
		}else if(i==3) {
			so.showallSongs();
		}else {
			
			System.out.println("to insert music in music player press 1");
			System.out.println("to edit music in music player press 2");
			System.out.println("to delete music in music player press 3");
			
			System.out.println("enter ur choise");
			int choise=sc.nextInt();

			
			
			if(choise==1) {
				so.Operations();
			}else if(choise==2){
				 
				so.edit();
				}else {
					so.delete();
				}
			
			
		}
	}

	}


