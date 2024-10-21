package lesson8;

public class Foods {
    private Food[] foods = new Food[1000000];

    public void addFood(Food food) {
        for (int i = 0; i < foods.length; i++) {
            if (foods[i] == null) {
                foods[i] = food;
                break;
            }
        }
    }

    public void printFoodObject(int foodId) {
        boolean foundFlag = false;
        for (Food food : this.foods) {
            if (food != null) {
                if (food.getFoodId() == foodId) {
                    System.out.println(food.toString());
                    foundFlag = true;
                    break;
                }
            }
        }
        if (!foundFlag) {
            System.out.println("Not Found");
        }
    }

    public Food[] getFoods() {
        return foods;
    }

    public void setFoods(Food[] foods) {
        this.foods = foods;
    }

    public static class Food {
        private int foodId;
        private String foodName;
        private static int foodCounter;

        public Food(String foodName) {
            foodCounter++;
            this.foodId = foodCounter;
            this.foodName = foodName;
        }

        public int getFoodId() {
            return foodId;
        }

        public void setFoodId(int foodId) {
            this.foodId = foodId;
        }

        public String getFoodName() {
            return foodName;
        }

        public void setFoodName(String foodName) {
            this.foodName = foodName;
        }

        public static int getFoodCounter() {
            return foodCounter;
        }

        public static void setFoodCounter(int foodCounter) {
            Food.foodCounter = foodCounter;
        }

        @Override
        public String toString() {
            return "Food{" +
                    "foodId=" + foodId +
                    ", foodName='" + foodName + '\'' +
                    '}';
        }
    }
}
