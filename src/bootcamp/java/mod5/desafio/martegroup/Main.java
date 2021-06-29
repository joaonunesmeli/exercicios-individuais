package bootcamp.java.mod5.desafio.martegroup;

public class Main {
    public static void main(String[] args) {
        Event e = new Event();

        e.addMeliGuests("Batman",  "Superman",  "Wonder Woman",  "Aquaman",  "Flash");
        e.addStandardGuests("Ironman", "Thor", "Hulk", "Hawkeye", "Black Widow", "Cap'n Murica!");
        e.addFirecrackers(
                new SingleFirecracker("Bum!"),
                new SingleFirecracker("Bum! Bam!"),
                new SingleFirecracker("Bum! Bam! Pa!"),
                new FirecrackerPackage(
                        new SingleFirecracker("Tra-tra!"),
                        new SingleFirecracker("Tra-tra! Tum!"),
                        new FirecrackerPackage(
                                new SingleFirecracker("Pa-pa-pa-pa-pa!"),
                                new SingleFirecracker("Sssshhhhhhhhhh!")
                        )
                )
        );

        e.party();
    }
}
