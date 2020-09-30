/**
 * Created by Ivona Zoricic
 * Date: 2020-09-28
 * Time: 11:13
 * Project: Sprint1
 * Copywrite: MIT
 */
public class Snake extends Animal implements IFoodPortion{

    public Snake(String name, double weight){
        super(name, weight);
    }
    public double portion(){
        return 20;
    }
    public String getFoodType(){
        return FoodType.SNAKEFOOD.getFoodType();
    }

}
