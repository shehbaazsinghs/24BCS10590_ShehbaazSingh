import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> Inventory = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> Section0 = new ArrayList<>();
        Section0.add(5);
        Section0.add(12);
        Section0.add(3);
        ArrayList<Integer> Section1 = new ArrayList<>();
        Section1.add(8);
        Section1.add(2);
        Section1.add(15);
        ArrayList<Integer> Section2 = new ArrayList<>();
        Section2.add(1);
        Section2.add(20);
        Section2.add(4);

        Inventory.add(Section0);
        Inventory.add(Section1);
        Inventory.add(Section2);

        System.out.println(Inventory);

        LinkedList<Integer> Alerts = new LinkedList<>();

        for (int i = 0; i < Inventory.size(); i++) {
            for (int j = 0; j < Inventory.get(i).size(); j++) {
                int stock = Inventory.get(i).get(j);
                if (stock < 5) {
                    stock = stock * 2;
                    Alerts.add(stock);
                }
            }
        }

        for (int i = 0; i < Inventory.size(); i++) {
            ArrayList<Integer> sec = Inventory.get(i);
            System.out.println("Section" + i + " " + sec);
        }
        System.out.println(Alerts);
    }
}