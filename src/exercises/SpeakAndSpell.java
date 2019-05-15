package exercises;

import java.util.Scanner;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

/**
 * The first Speak & Spell was introduced at the summer Consumer Electronics
 * Show in June 1978, making it one of the earliest hand-held electronic devices
 * with a visual display to use interchangeable game cartridges. 
 * It was my favorite game as a kid.
 * 
 * https://www.youtube.com/watch?v=qM8FcN0aAvU
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Spell the next word!");  
		speak("mandlebrot");
	
          String answer = scanner.nextLine();
      
	
       if (answer.equals("mandlebrot")) {speak("Correct.");
       }
       else {speak("Wrong!");
       }
      
		
		
	}

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
