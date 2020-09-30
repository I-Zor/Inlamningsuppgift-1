import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ivona Zoricic
 * Date: 2020-09-28
 * Time: 11:43
 * Project: Sprint1
 * Copywrite: MIT
 */
public class Main {
    public static void main(String[] args) {

        List<Animal> animalList = new LinkedList<>();
        animalList.add(new Cat("Venus", 5));
        animalList.add(new Cat("Ove", 3));
        animalList.add(new Dog("Sixten", 5));
        animalList.add(new Snake("Hypno", 1));
        animalList.add(new Dog("Dogge", 10));


        while (true) {
            String nameOfAnimal = JOptionPane.showInputDialog("Vilket djur ska få mat?");
            if (nameOfAnimal == null) {
                break;
            }
            boolean found = false;
            for (Animal a : animalList) {
                if (nameOfAnimal.equalsIgnoreCase(a.getName())) {
                    found = true;
                    String resultat = String.format("%s får %.1f g %s",a.getName(), a.portion(), a.getFoodType());
                    JOptionPane.showMessageDialog(null, resultat);
                }
            }
                if (!found)
                    JOptionPane.showMessageDialog(null,"Det finns inte sådant djur");
            }
        }
    }





