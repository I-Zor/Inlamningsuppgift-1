/**
 * Created by Ivona Zoricic
 * Date: 2020-09-28
 * Time: 10:46
 * Project: Sprint1
 * Copywrite: MIT
 */
public class Dog extends Animal implements IFoodPortion {

    public Dog(String name, double weight){
        super(name, weight);
    }
    @Override
    public double portion() { //polymorfism
        return ((getWeight()*1000)/100);
    }
    public String getFoodType(){
        return FoodType.DOGFOOD.getFoodType();
    }

}
