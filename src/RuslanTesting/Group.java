package RuslanTesting;

public class Group {
    private Ruslan r1;
//    private Vladislav v1;

    public Group(Ruslan r1) {
        this.r1 = r1;
//        this.v1 = v1;
    }
    public String getStudentsNames (){
        return r1.getName();
    }

    public static void main(String[] args) {
//        Ruslan r1 = new Ruslan ("Ruslan", 26);
        Vladislav v1 = new Vladislav("Vladislav", 27);
//        Group g1 = new Group(r1);
        Vladislav.Pool("Vlad");
//        System.out.println(g1.getStudentsNames());
        Ruslan.getPi();System.out.println(Ruslan.getPi());
    }
}

