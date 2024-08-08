package Lesson13;

public class Employee {
    public static void main(String[] args) {

        switch ("ponedelnik") {
            case "ponedelnik":
            case "vtornik":
            case "sreda":
            case "chetverg":
            case "pyatnica":
                System.out.println("rabotaem do 19:00");
                break;

            case "subbota":
                System.out.println("rabotaem do 15:00");
                break;
            case "vs":
                System.out.println("raboti net");
                break;
            default:
                System.out.println("napiwi pravnil'no");
                break;
        }
    }
}
