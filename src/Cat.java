/**
 * Created by Ivona Zoricic
 * Date: 2020-09-28
 * Time: 10:56
 * Project: Sprint1
 * Copywrite: MIT
 */
public class Cat extends Animal implements IFoodPortion {

    public Cat(String name, double weight){
        super(name, weight);
    }
    @Override
    public double portion() {  //polymorfism som yttrar sig genom interface
        return ((getWeight()*1000)/150);
    }
    public String getFoodType(){
        return FoodType.CATFOOD.getFoodType();
    }
}
