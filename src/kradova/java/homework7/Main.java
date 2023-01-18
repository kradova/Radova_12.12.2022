package homework7;

public class Main {
    public static void main(String[] args) {
        Sportsman sportsman_1 = new Sportsman("Denis", "11111111");
        Sportsman sportsman_2 = new Sportsman("Masha", "22222222");
        Sportsman sportsman_3 = new Sportsman("Artur", "33333333");
        Coach coach = new Coach("Maks", "55555555");

        coach.addSportsman(sportsman_1);
        coach.addSportsman(sportsman_2);
        coach.addSportsman(sportsman_3);

        try {
            sportsman_1.leaveCoach(coach);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            sportsman_1.leaveCoach(new Coach("Error coach", "????????"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
