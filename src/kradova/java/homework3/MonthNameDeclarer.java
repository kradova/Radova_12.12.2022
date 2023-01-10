package homework3;

public class MonthNameDeclarer {
    enum Month {
        NOT_VALID,
        JAN,
        FEB,
        MAR,
        APR,
        MAY,
        JUN,
        JUL,
        AUG,
        SEP,
        OCT,
        NOV,
        DEC
    }

    public void printMonthInWordIfElse(int month) {
        System.out.println(monthInWordIfElse(month));
    }//printMonthInWordIfElse

    public String monthInWordIfElse(int month) {
        if (month == 1) {
            return Month.values()[month].toString();
            //return Month.JAN.toString();
            //return "JAN";
        } else if (month == 2) {
            return Month.values()[month].toString();
        } else if (month == 3) {
            return Month.values()[month].toString();
        } else if (month == 4) {
            return Month.values()[month].toString();
        } else if (month == 5) {
            return Month.values()[month].toString();
        } else if (month == 6) {
            return Month.values()[month].toString();
        } else if (month == 7) {
            return Month.values()[month].toString();
        } else if (month == 8) {
            return Month.values()[month].toString();
        } else if (month == 9) {
            return Month.values()[month].toString();
        } else if (month == 10) {
            return Month.values()[month].toString();
        } else if (month == 11) {
            return Month.values()[month].toString();
        } else if (month == 12) {
            return Month.values()[month].toString();
        } else {
            return "Not a valid month";
        }
    }//monthInWordIfElse

    public void printMonthInWordSwitch(int month) {
        System.out.println(monthInWordSwitch(month));
    }//printMonthInWordSwitch

    public String monthInWordSwitch(int month) {
        return switch (month) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 -> Month.values()[month].toString();
            default -> "Not a valid month";
        };
    }//monthInWordSwitch
}
