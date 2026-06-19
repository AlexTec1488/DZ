package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = {
                new Piano(),
                new Guitar(),
                new Flute(),
                new Guitar()
        };

        boolean[][] shouldPlay = {
                { false, true, true, true, true, false },
                { true, false, true, false, true, false},
                { false, false, true, true, false, false},
                { false, true, true, true, true, false},
        };

        Song song = new Song(instruments, shouldPlay);
        song.play();

    }
}
