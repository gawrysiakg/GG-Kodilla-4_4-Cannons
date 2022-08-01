public class Cannon {
    boolean loaded = false;

    public Cannon (boolean loaded) {
        this.loaded=loaded;
    }

    public void fire() {
        if (loaded) {
            System.out.println("Cannon is loaded!");
        } else {
            System.out.println("The cannon is not loaded. Loading the ball... Cannon is loaded!");
            loaded = true;
        }

    }

}
