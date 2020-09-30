/**
 * Created by Ivona Zoricic
 * Date: 2020-09-28
 * Time: 09:51
 * Project: Sprint1
 * Copywrite: MIT
 */
public class Animal {

    private String name;  //inkapsling
    private double weight;

    public Animal(String name, double weight){
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public double portion() {
        return 0;
    }
    public String getFoodType(){
        return "";
    }
}
