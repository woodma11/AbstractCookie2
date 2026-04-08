public class SweetTreatFactory {

    public static Cookie createSweetTreat(int choice) {
        switch (choice) {
            case 1:
                return new ChocolateChipCookie();
            case 2:
                return new SugarCookie();
            case 3:
                return new OatmealRaisinCookie();
            default:
                return null;
        }
    }
}
