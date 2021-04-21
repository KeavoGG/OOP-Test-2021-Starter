package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	ArrayList<Note> notes = new ArrayList<>();


	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	public void loadScore(){
		for (int i = 0; i < score.length(); i++) {
			char first = score.charAt(i);
			char second = 'A';
			if(i+1 < score.length()){
			second = score.charAt(i+1);
		    }
			if(Character.isDigit(second)){
				int dur = second - '0';
				notes.add(new Note(first,dur));
				i++;
			}else{
				notes.add(new Note(first,1));
			}
		}
	}
	public void printScores(){
		for (Note note : notes) {
			System.out.println(note.getNote()+"       "+note.getDuration()+"       "+ (note.getDuration()==1?"Quaver":"Crotchet"));
		}
	}  
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		loadScore();
		printScores();
	}

	public void draw()
	{
		background(255);
		
	}

	void drawNotes()
	{
	}
}
