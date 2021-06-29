package bootcamp.java.mod5.desafio.martegroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirecrackerPackage implements Firecracker {
    private List<Firecracker> packet = new ArrayList<>();
    private boolean exploded;


    public FirecrackerPackage() {
    }

    public FirecrackerPackage(Firecracker ...packet) {
        add(packet);
    }

    public void add(Firecracker ...fireworks) {
        this.packet.addAll(Arrays.asList(fireworks));
    }

    @Override
    public void explode(int level) {
        if (!exploded) {
            exploded = true;
            for (Firecracker p : packet) {
                p.explode(level + 1);
            }
        }
    }
}
