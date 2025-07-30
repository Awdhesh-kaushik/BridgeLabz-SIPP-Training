interface MealPlan {
    void planInfo();
}

class VegetarianMeal implements MealPlan {
    public void planInfo() { System.out.println("Vegetarian Plan"); }
}

class KetoMeal implements MealPlan {
    public void planInfo() { System.out.println("Keto Plan"); }
}

class Meal<T extends MealPlan> {
    private T meal;
    public Meal(T meal) { this.meal = meal; }
    public void displayPlan() { meal.planInfo(); }
}

class MealGenerator {
    public static <T extends MealPlan> void generatePlan(T plan) {
        System.out.print("Generating: ");
        plan.planInfo();
    }
}
