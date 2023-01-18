package homework7;

public class Sportsman extends Person {
    private static final MyLogger logger = new MyLogger();

    public Sportsman(String name, String phone) {
        super(name, phone);
    }

    public void leaveCoach(Coach coach) throws Exception {
        if (coach.sportsmans.contains(this)) {
            coach.sportsmans.remove(this);
            logger.log("Sportsman " + this.getName() + " leaved coach " + coach.getName(), LogLevel.WARN);
        } else {
            String msg = "Error: Sportsman " + this.getName() + " tries to leave a non-existent coach " + coach.getName();
            logger.log(msg, LogLevel.ERROR);
            throw new Exception(msg);
        }
    }
}
