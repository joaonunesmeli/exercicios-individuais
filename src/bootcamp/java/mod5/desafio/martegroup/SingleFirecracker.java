package bootcamp.java.mod5.desafio.martegroup;

public class SingleFirecracker implements Firecracker {
    private String explosion;
    private boolean exploded;

    public SingleFirecracker(String explosion) {
        this.explosion = explosion;
    }

    @Override
    public void explode(int level) {
        if (!exploded) {
            exploded = true;
            System.out.println(" ".repeat(level * 2) + explosion);
        }
    }
}
