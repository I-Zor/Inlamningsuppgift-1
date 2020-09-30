/**
 * Created by Ivona Zoricic
 * Date: 2020-09-28
 * Time: 11:18
 * Project: Sprint1
 * Copywrite: MIT
 */
public interface IFoodPortion {
    enum FoodType {
        CATFOOD("kattfoder"), DOGFOOD("hundfoder"), SNAKEFOOD("ormfoder");
        private final String foodType;
        FoodType(String type){
            foodType = type;
        }
        public String getFoodType() {
            return foodType;
        }
    }
}
