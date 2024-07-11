public class Tree {
    private int lengthTree;
    private int heightTree;
    private String colorTree;
    private int countLeaf;
    private String nameTree;

    public void getCountWind(int countWind) {
        System.out.println("Порыв ветра состовляет: " + countWind);
    }

    public String getFruits(String season) {
        switch (season) {
            case :
                "Осень";
                return "Плодов мало";
            case :
                "Лето";
                return "Плодов много";
            case :
                "Зима";
                return "Плодов нет";
            case :
                "Весна";
                return "Плоды начали расти";
            default:
                "Соси пизду"
        }
    }

    public Tree() {
    }

    public Tree(int lengthTree, int heightTree, String colorTree, int countLeaf, String nameTree) {
        this.colorTree = colorTree;
        this.lengthTree = lengthTree;
        this.heightTree = heightTree;
        this.countLeaf = countLeaf;
        this.nameTree = nameTree;
    }

    public Tree(int nameTree, int countLeaf) {
        this.nameTree;
        this.colorTree;
    }

}
