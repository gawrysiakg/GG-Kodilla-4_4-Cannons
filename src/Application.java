import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main (String[] args) {

        List<Cannon> cannonList = new LinkedList<>();
        cannonList.add(new Cannon(true) );
        cannonList.add(new Cannon(false) );
        cannonList.add(new Cannon(false) );
        cannonList.add(new Cannon(true) );
        cannonList.add(new Cannon(true) );

        for (int i=0; i<cannonList.size(); i++) {
            cannonList.get(i).fire();
        }

    }
}
