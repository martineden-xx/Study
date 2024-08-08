package Lesson13.dz;

public class Month {
    private int month;

    Month(int month) {
        this.month = month;
    }

    public static void main(String[] args) {
        Month m1 = new Month(6);

        switch (m1.month) {
            case 12:
            case 10:
            case 8:
            case 7:
            case 5:
            case 3:
            case 1:
                System.out.println("31"); break;
            case 2:
                System.out.println("28"); break;
            case 6:
            case 9:
            case 11:
                case 4:
                System.out.println("30"); break;

            default:
                System.out.println("wrong month"); break;
        }
    }
}
