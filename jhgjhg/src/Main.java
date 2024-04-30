import javax.sound.sampled.*;
import java.io.File;
import java.util.Scanner;

class audioplayer{

    public static void main(String[] args){
        String path = "C:/Users/karma/OneDrive/Music/kishor kumar_hindi/AANE WALA PAL.wav";
        Scanner sc = new Scanner(System.in);
        Playaudio player = new Playaudio();
        player.Audio(path);
        sc.nextLine();
        player.stop();

    }
}
class Playaudio {
    Clip clip;
    public void Audio(String Path) {
        try {
            File file = new File(Path);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            AudioFormat Format = audioInputStream.getFormat();

            DataLine.Info info = new DataLine.Info(Clip.class, Format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioInputStream);
            clip.start();

        }
        catch (Exception e) {
            System.out.println("An error occurred while playing the song");
        }
    }
    public void stop() {
        clip.stop();
    }
}