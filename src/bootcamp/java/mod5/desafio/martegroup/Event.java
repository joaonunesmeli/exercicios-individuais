package bootcamp.java.mod5.desafio.martegroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Event {
    private List<Guest> guests = new ArrayList<>();
    private List<Firecracker> fireworks = new ArrayList<>();

    private void addGuests(GuestType type, String[] names) {
        for (String n : names) {
            this.guests.add(new Guest(n, type));
        }
    }

    public void addMeliGuests(String ...names) {
        addGuests(GuestType.MELI, names);
    }

    public void addStandardGuests(String ...names) {
        addGuests(GuestType.STANDARD, names);
    }

    public void addFirecrackers(Firecracker ...firecrackers) {
        this.fireworks.addAll(Arrays.asList(firecrackers));
    }

    public void party() {
        System.out.println("[VELAS APAGADAS]");
        for (Firecracker f : this.fireworks) {
            f.explode(0);
        }
        for (Guest g : guests) {
            g.eat();
        }
    }
}
