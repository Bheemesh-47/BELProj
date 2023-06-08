package com.skill.lync.p1;


import javax.sound.sampled.AudioInputStream;
import marytts.LocalMaryInterface;
import marytts.MaryInterface;
import marytts.util.data.audio.AudioPlayer;

public class Text2Speech {

	private AudioPlayer tts;
	private MaryInterface marytts;

	public Text2Speech() {
		try {
			marytts = new LocalMaryInterface();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void speak(String text) {
		try (AudioInputStream audio = marytts.generateAudio(text)) {
			tts = new AudioPlayer();
			tts.setAudio(audio);
			tts.start();
			tts.join();
		} 
		catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Error");
		}
	}

}
