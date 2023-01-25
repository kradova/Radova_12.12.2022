package homework7;

import java.util.ArrayList;
import java.util.List;

public class Coach extends Person {
    private static final MyLogger logger = new MyLogger();
    List<Sportsman> sportsmans = new ArrayList<Sportsman>();

    public Coach(String name, String phone) {
        super(name, phone);
    }

    public void addSportsman(Sportsman sportsman) {
        sportsmans.add(sportsman);
        logger.log("Coach " + this.getName() + " added sportsman " + sportsman.getName(), LogLevel.INFO);
    }

    public void removeSportsmen(int sportsman) {
        logger.log("Coach " + this.getName() + " try remove sportsman" + sportsman, LogLevel.WARN);
        this.sportsmans.remove(sportsman);
    }
}
