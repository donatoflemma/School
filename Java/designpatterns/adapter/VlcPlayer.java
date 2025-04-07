package designpatterns.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
	   @Override
	   public void playVlc(String fileName) {
	      System.out.println("Playing vlc file. Name: "+ fileName);		
	   }

	   @Override
	   public void playMp4(String fileName) {
	      //do nothing
	   }
}
21 luglio 2 persone 58,08
Camila Isabel Miranda Fronhofer