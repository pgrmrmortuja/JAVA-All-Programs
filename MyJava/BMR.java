import java.util.Scanner;

public class BMR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Name, Gender
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Your Gender (M/F): ");
        char gender = scanner.next().charAt(0);

        // Input: Height, Weight, Age
        System.out.print("Enter Your Height in feet: ");
        double heightFeet = scanner.nextDouble();
        System.out.print("And Inches: ");
        double heightInches = scanner.nextDouble();
        System.out.print("Enter Your Weight in KG: ");
        double weightKg = scanner.nextDouble();
        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();

        // Choose activity level
        int activityLevel = getActivityLevel(scanner);

        // Calculate BMR based on gender
        double bmr = (gender == 'M') ? calculateMaleBMR(heightFeet, heightInches, weightKg, age)
                                     : calculateFemaleBMR(heightFeet, heightInches, weightKg, age);

        // Calculate daily calorie needs based on activity level
        double dailyCalories = calculateDailyCalories(bmr, activityLevel);

        // Display results
        System.out.println("\nResults for " + name + ":");
        System.out.println("Your BMR is: " + bmr + " calories/day");
        System.out.println("Your estimated daily calorie needs based on activity level are: " + dailyCalories + " calories/day");

        // Seasonal Suggestions
        System.out.println("\nSample Seasonal Food Suggestions:");
        System.out.println("1. Summer");
        System.out.println("2. Rainy");
        System.out.println("3. Autumn");
        System.out.println("4. Late Autumn");
        System.out.println("5. Winter");
        System.out.println("6. Spring");
        System.out.println("Enter The Number of Current Season: ");
        int seasonChoice = scanner.nextInt();

        // Display seasonal suggestions
        switch (seasonChoice) {
            case 1:
                displaySummerSuggestions();
                break;
            case 2:
                displayRainySuggestions();
                break;
            case 3:
                displayAutumnSuggestions();
                break;
            case 4:
                displayLateAutumnSuggestions();
                break;
            case 5:
                displayWinterSuggestions();
                break;
            case 6:
                displaySpringSuggestions();
                break;
            default:
                System.out.println("Invalid season choice. No specific suggestions provided.");
        }

        // Conclusion
        System.out.println("\nThis is Only A Sample Suggestion. For Personalized Nutrition Advice, Consider Contacting A Nutritionist. \nThank You, " + name + "!");
        scanner.close();
    }

    private static int getActivityLevel(Scanner scanner) {
        System.out.println("Select Your Activity Level Number:");
        System.out.println("1. Sedentary (little or no exercise)");
        System.out.println("2. Lightly active (light exercise/sports 1-3 days/week)");
        System.out.println("3. Moderately active (moderate exercise/sports 3-5 days/week)");
        System.out.println("4. Very active (hard exercise/sports 6-7 days a week)");
        System.out.println("5. Extremely active (very hard exercise/sports & physical job or 2x training)");
        System.out.println("Enter the number corresponding to your activity level: ");
        return scanner.nextInt();
    }

    private static double calculateMaleBMR(double heightFeet, double heightInches, double weightKg, int age) {
        // Implement the BMR calculation for males
        // BMR = 10 * weight (kg) + 6.25 * height (cm) - 5 * age + 5
        double heightCm = (heightFeet * 12 + heightInches) * 2.54;
        return 10 * weightKg + 6.25 * heightCm - 5 * age + 5;
    }

    private static double calculateFemaleBMR(double heightFeet, double heightInches, double weightKg, int age) {
        // Implement the BMR calculation for females
        // BMR = 10 * weight (kg) + 6.25 * height (cm) - 5 * age - 161
        double heightCm = (heightFeet * 12 + heightInches) * 2.54;
        return 10 * weightKg + 6.25 * heightCm - 5 * age - 161;
    }

    private static double calculateDailyCalories(double bmr, int activityLevel) {
        // Implement the calculation of daily calories based on activity level
        switch (activityLevel) {
            case 1:
                return bmr * 1.2;
            case 2:
                return bmr * 1.375;
            case 3:
                return bmr * 1.55;
            case 4:
                return bmr * 1.725;
            case 5:
                return bmr * 1.9;
            default:
                return 0;
        }
    }

    private static void displaySummerSuggestions() {
    System.out.println("\nSummer Season Suggested Chart (calories per 1 gram):\n");

    // Fruits
    System.out.println("**Fruits:**");
    System.out.println("1. Apple (0.52 calories/g)");
    System.out.println("2. Banana (0.89 calories/g)");
    System.out.println("3. Orange (0.43 calories/g)");
    System.out.println("4. Grapes (0.69 calories/g)");
    System.out.println("5. Pomegranate (0.83 calories/g)");
    System.out.println("6. Strawberries (0.32 calories/g)");
    System.out.println("7. Blueberries (0.57 calories/g)");
    System.out.println("8. Mango (0.60 calories/g)");
    System.out.println("9. Pineapple (0.50 calories/g)");
    System.out.println("10. Watermelon (0.30 calories/g)");
    System.out.println("11. Kiwi (0.61 calories/g)");
    System.out.println("12. Papaya (0.43 calories/g)");
    System.out.println("13. Peach (0.39 calories/g)");
    System.out.println("14. Apricot (0.48 calories/g)");
    System.out.println("15. Plum (0.46 calories/g)");
    System.out.println("16. Cherries (0.50 calories/g)");
    System.out.println("17. Melons (e.g., cantaloupe, honeydew) (0.31 calories/g)");
    System.out.println("18. Lemon (0.29 calories/g)");
    System.out.println("19. Lime (0.30 calories/g)");
    System.out.println("20. Avocado (1.60 calories/g)");
    

    // Foods
    System.out.println("\n**Foods:**");
    System.out.println("1. Brown rice (1.11 calories/g)");
    System.out.println("2. Chicken breast (1.65 calories/g)");
    System.out.println("3. Beef (2.40 calories/g)");
    System.out.println("4. Mutton (2.60 calories/g)");
    System.out.println("5. Salmon (1.81 calories/g)");
    System.out.println("6. Tuna (0.94 calories/g)");
    System.out.println("7. Tilapia (0.96 calories/g)");
    System.out.println("8. Whole wheat bread (2.49 calories/g)");
    System.out.println("9. Quinoa (1.55 calories/g)");
    System.out.println("10. Sweet potatoes (0.86 calories/g)");
    System.out.println("11. Oats (3.75 calories/g)");
    System.out.println("12. Eggs (1.43 calories/g)");
    System.out.println("13. Cottage cheese (1.02 calories/g)");
    System.out.println("14. Greek yogurt (0.59 calories/g)");
    System.out.println("15. Nuts (e.g., almonds, walnuts) (5.89 calories/g)");
    System.out.println("16. Olive oil (8.81 calories/g)");
    System.out.println("17. Lentils (1.16 calories/g)");
    System.out.println("18. Spinach (0.23 calories/g)");
    System.out.println("19. Broccoli (0.33 calories/g)");
    System.out.println("20. Carrots (0.41 calories/g)");

    // Vegetables
    System.out.println("\n**Vegetables:**");
    System.out.println("1. Cucumbers (0.15 calories/g)");
    System.out.println("2. Tomatoes (0.18 calories/g)");
    System.out.println("3. Bell peppers (0.31 calories/g)");
    System.out.println("4. Zucchini (0.17 calories/g)");
    System.out.println("5. Spinach (0.23 calories/g)");
    System.out.println("6. Kale (0.50 calories/g)");
    System.out.println("7. Broccoli (0.33 calories/g)");
    System.out.println("8. Asparagus (0.20 calories/g)");
    System.out.println("9. Green beans (0.31 calories/g)");
    System.out.println("10. Carrots (0.41 calories/g)");
    System.out.println("11. Cauliflower (0.25 calories/g)");
    System.out.println("12. Brussels sprouts (0.43 calories/g)");
    System.out.println("13. Cabbage (0.25 calories/g)");
    System.out.println("14. Eggplant (0.25 calories/g)");
    System.out.println("15. Radishes (0.16 calories/g)");
  }
  
  private static void displayRainySuggestions() {
    System.out.println("\nRainy Season Suggested Chart (calories per 1 gram):\n");

    // Fruits
    System.out.println("**Fruits:**");
    System.out.println("1. Apple (0.52 calories/g)");
    System.out.println("2. Banana (0.89 calories/g)");
    System.out.println("3. Pear (0.57 calories/g)");
    System.out.println("4. Plum (0.46 calories/g)");
    System.out.println("5. Grapes (0.69 calories/g)");
    System.out.println("6. Pomegranate (0.83 calories/g)");
    System.out.println("7. Papaya (0.43 calories/g)");
    System.out.println("8. Pineapple (0.50 calories/g)");
    System.out.println("9. Mango (0.60 calories/g)");
    System.out.println("10. Orange (0.43 calories/g)");
    System.out.println("11. Berries (e.g., strawberries, blueberries) (0.57 calories/g)");
    System.out.println("12. Kiwi (0.61 calories/g)");
    System.out.println("13. Lychee (0.67 calories/g)");
    System.out.println("14. Guava (0.68 calories/g)");
    System.out.println("15. Watermelon (0.30 calories/g)");
    System.out.println("16. Cherries (0.50 calories/g)");
    System.out.println("17. Avocado (1.60 calories/g)");
    System.out.println("18. Dragon fruit (0.60 calories/g)");
    System.out.println("19. Fig (0.74 calories/g)");
    System.out.println("20. Jackfruit (0.95 calories/g)");
    

    // Foods
    System.out.println("\n**Foods:**");
    System.out.println("1. Brown rice (1.11 calories/g)");
    System.out.println("2. Chicken soup (1.10 calories/g)");
    System.out.println("3. Beef stew (2.40 calories/g)");
    System.out.println("4. Lentil soup (1.16 calories/g)");
    System.out.println("5. Salmon (1.81 calories/g)");
    System.out.println("6. Tuna (0.94 calories/g)");
    System.out.println("7. Cod (0.78 calories/g)");
    System.out.println("8. Quinoa (1.55 calories/g)");
    System.out.println("9. Sweet potatoes (0.86 calories/g)");
    System.out.println("10. Oats (3.75 calories/g)");
    System.out.println("11. Whole wheat bread (2.49 calories/g)");
    System.out.println("12. Chicken curry (1.65 calories/g)");
    System.out.println("13. Vegetable stir-fry (calories vary based on vegetables used)");
    System.out.println("14. Egg curry (1.43 calories/g)");
    System.out.println("15. Mushroom risotto (2.13 calories/g)");
    System.out.println("16. Pumpkin soup (0.26 calories/g)");
    System.out.println("17. Spinach and feta salad (0.23 calories/g)");
    System.out.println("18. Cottage cheese (1.02 calories/g)");
    System.out.println("19. Olive oil (8.81 calories/g)");
    System.out.println("20. Banana bread (2.57 calories/g)");

    // Vegetables
    System.out.println("\n**Vegetables:**");
    System.out.println("1. Spinach (0.23 calories/g)");
    System.out.println("2. Broccoli (0.33 calories/g)");
    System.out.println("3. Cauliflower (0.25 calories/g)");
    System.out.println("4. Bell peppers (0.31 calories/g)");
    System.out.println("5. Carrots (0.41 calories/g)");
    System.out.println("6. Cabbage (0.25 calories/g)");
    System.out.println("7. Mushrooms (0.28 calories/g)");
    System.out.println("8. Zucchini (0.17 calories/g)");
    System.out.println("9. Eggplant (0.25 calories/g)");
    System.out.println("10. Tomatoes (0.18 calories/g)");
    System.out.println("11. Corn (0.86 calories/g)");
    System.out.println("12. Green beans (0.31 calories/g)");
    System.out.println("13. Kale (0.50 calories/g)");
    System.out.println("14. Radishes (0.16 calories/g)");
    System.out.println("15. Beetroot (0.43 calories/g)");
}

private static void displayAutumnSuggestions() {
    System.out.println("\nAutumn Season Suggested Chart (calories per 1 gram):\n");

    // Fruits
    System.out.println("**Fruits:**");
    System.out.println("1. Apple (0.52 calories/g)");
    System.out.println("2. Pear (0.57 calories/g)");
    System.out.println("3. Grapes (0.69 calories/g)");
    System.out.println("4. Pomegranate (0.83 calories/g)");
    System.out.println("5. Persimmon (0.70 calories/g)");
    System.out.println("6. Fig (0.74 calories/g)");
    System.out.println("7. Cranberries (0.46 calories/g)");
    System.out.println("8. Plum (0.46 calories/g)");
    System.out.println("9. Kiwi (0.61 calories/g)");
    System.out.println("10. Pumpkin (0.26 calories/g)");
    System.out.println("11. Cranberries (0.46 calories/g)");
    System.out.println("12. Dates (2.78 calories/g)");
    System.out.println("13. Quince (0.57 calories/g)");
    System.out.println("14. Guava (0.68 calories/g)");
    System.out.println("15. Clementine (0.47 calories/g)");
    System.out.println("16. Banana (0.89 calories/g)");
    System.out.println("17. Passion fruit (0.97 calories/g)");
    System.out.println("18. Persimmon (0.70 calories/g)");
    System.out.println("19. Coconut (3.75 calories/g)");
    System.out.println("20. Blackberries (0.49 calories/g)");
    

    // Foods
    System.out.println("\n**Foods:**");
    System.out.println("1. Butternut squash soup (0.26 calories/g)");
    System.out.println("2. Roasted sweet potatoes (0.86 calories/g)");
    System.out.println("3. Pumpkin risotto (0.26 calories/g)");
    System.out.println("4. Baked apples (0.52 calories/g)");
    System.out.println("5. Turkey (1.13 calories/g)");
    System.out.println("6. Chicken and vegetable stew (1.10 calories/g)");
    System.out.println("7. Lentil and vegetable curry (1.16 calories/g)");
    System.out.println("8. Wild rice pilaf (1.07 calories/g)");
    System.out.println("9. Roast beef (2.40 calories/g)");
    System.out.println("10. Salmon (1.81 calories/g)");
    System.out.println("11. Roasted Brussels sprouts (0.43 calories/g)");
    System.out.println("12. Quinoa salad with roasted vegetables (1.55 calories/g)");
    System.out.println("13. Walnut and cranberry salad (5.89 calories/g)");
    System.out.println("14. Chestnuts (2.26 calories/g)");
    System.out.println("15. Cinnamon-spiced oatmeal (3.75 calories/g)");
    System.out.println("16. Apple cider (0.39 calories/g)");
    System.out.println("17. Whole grain bread (2.49 calories/g)");
    System.out.println("18. Carrot ginger soup (0.41 calories/g)");
    System.out.println("19. Honey-glazed carrots (0.41 calories/g)");
    System.out.println("20. Pumpkin pie (3.37 calories/g)");

    // Vegetables
    System.out.println("\n**Vegetables:**");
    System.out.println("1. Brussels sprouts (0.43 calories/g)");
    System.out.println("2. Sweet potatoes (0.86 calories/g)");
    System.out.println("3. Butternut squash (0.26 calories/g)");
    System.out.println("4. Carrots (0.41 calories/g)");
    System.out.println("5. Pumpkins (0.26 calories/g)");
    System.out.println("6. Kale (0.50 calories/g)");
    System.out.println("7. Beets (0.43 calories/g)");
    System.out.println("8. Cauliflower (0.25 calories/g)");
    System.out.println("9. Turnips (0.28 calories/g)");
    System.out.println("10. Parsnips (0.55 calories/g)");
    System.out.println("11. Radishes (0.16 calories/g)");
    System.out.println("12. Cabbage (0.25 calories/g)");
    System.out.println("13. Broccoli (0.33 calories/g)");
    System.out.println("14. Swiss chard (0.19 calories/g)");
    System.out.println("15. Spinach (0.23 calories/g)");
}

private static void displayLateAutumnSuggestions() {
    System.out.println("\nLate Autumn Season Suggested Chart (calories per 1 gram):\n");

    // Fruits
    System.out.println("**Fruits:**");
    System.out.println("1. Apple (0.52 calories/g)");
    System.out.println("2. Pear (0.57 calories/g)");
    System.out.println("3. Grapes (0.69 calories/g)");
    System.out.println("4. Pomegranate (0.83 calories/g)");
    System.out.println("5. Persimmon (0.70 calories/g)");
    System.out.println("6. Fig (0.74 calories/g)");
    System.out.println("7. Cranberries (0.46 calories/g)");
    System.out.println("8. Plum (0.46 calories/g)");
    System.out.println("9. Kiwi (0.61 calories/g)");
    System.out.println("10. Clementine (0.47 calories/g)");
    System.out.println("11. Banana (0.89 calories/g)");
    System.out.println("12. Passion fruit (0.97 calories/g)");
    System.out.println("13. Coconut (3.75 calories/g)");
    System.out.println("14. Blackberries (0.49 calories/g)");
    System.out.println("15. Raspberry (0.65 calories/g)");
    System.out.println("16. Blueberries (0.57 calories/g)");
    System.out.println("17. Apricot (0.48 calories/g)");
    System.out.println("18. Pineapple (0.50 calories/g)");
    System.out.println("19. Mango (0.60 calories/g)");
    System.out.println("20. Orange (0.43 calories/g)");
    

    // Foods
    System.out.println("\n**Foods:**");
    System.out.println("1. Roasted sweet potatoes (0.86 calories/g)");
    System.out.println("2. Pumpkin risotto (0.26 calories/g)");
    System.out.println("3. Baked apples (0.52 calories/g)");
    System.out.println("4. Turkey (1.13 calories/g)");
    System.out.println("5. Chicken and vegetable stew (1.10 calories/g)");
    System.out.println("6. Lentil and vegetable curry (1.16 calories/g)");
    System.out.println("7. Wild rice pilaf (1.07 calories/g)");
    System.out.println("8. Roast beef (2.40 calories/g)");
    System.out.println("9. Salmon (1.81 calories/g)");
    System.out.println("10. Roasted Brussels sprouts (0.43 calories/g)");
    System.out.println("11. Quinoa salad with roasted vegetables (1.55 calories/g)");
    System.out.println("12. Walnut and cranberry salad (5.89 calories/g)");
    System.out.println("13. Chestnuts (2.26 calories/g)");
    System.out.println("14. Cinnamon-spiced oatmeal (3.75 calories/g)");
    System.out.println("15. Whole grain bread (2.49 calories/g)");
    System.out.println("16. Carrot ginger soup (0.41 calories/g)");
    System.out.println("17. Honey-glazed carrots (0.41 calories/g)");
    System.out.println("18. Pumpkin pie (3.37 calories/g)");
    System.out.println("19. Pecan-crusted chicken (2.54 calories/g)");
    System.out.println("20. Butternut squash soup (0.26 calories/g)");

    // Vegetables
    System.out.println("\n**Vegetables:**");
    System.out.println("1. Brussels sprouts (0.43 calories/g)");
    System.out.println("2. Sweet potatoes (0.86 calories/g)");
    System.out.println("3. Butternut squash (0.26 calories/g)");
    System.out.println("4. Carrots (0.41 calories/g)");
    System.out.println("5. Pumpkins (0.26 calories/g)");
    System.out.println("6. Kale (0.50 calories/g)");
    System.out.println("7. Beets (0.43 calories/g)");
    System.out.println("8. Cauliflower (0.25 calories/g)");
    System.out.println("9. Turnips (0.28 calories/g)");
    System.out.println("10. Parsnips (0.55 calories/g)");
    System.out.println("11. Radishes (0.16 calories/g)");
    System.out.println("12. Cabbage (0.25 calories/g)");
    System.out.println("13. Broccoli (0.33 calories/g)");
    System.out.println("14. Swiss chard (0.19 calories/g)");
    System.out.println("15. Spinach (0.23 calories/g)");
}

private static void displayWinterSuggestions() {
    System.out.println("\nWinter Season Suggested Chart (calories per 1 gram):\n");

    // Fruits
    System.out.println("**Fruits:**");
    System.out.println("1. Apple (0.52 calories/g)");
    System.out.println("2. Pear (0.57 calories/g)");
    System.out.println("3. Citrus fruits (e.g., oranges, grapefruits) (0.43 calories/g)");
    System.out.println("4. Pomegranate (0.83 calories/g)");
    System.out.println("5. Persimmon (0.70 calories/g)");
    System.out.println("6. Kiwi (0.61 calories/g)");
    System.out.println("7. Banana (0.89 calories/g)");
    System.out.println("8. Grapes (0.69 calories/g)");
    System.out.println("9. Pineapple (0.50 calories/g)");
    System.out.println("10. Mango (0.60 calories/g)");
    System.out.println("11. Papaya (0.43 calories/g)");
    System.out.println("12. Avocado (1.60 calories/g)");
    System.out.println("13. Cranberries (0.46 calories/g)");
    System.out.println("14. Berries (e.g., strawberries, blueberries) (0.57 calories/g)");
    System.out.println("15. Fig (0.74 calories/g)");
    System.out.println("16. Dates (2.78 calories/g)");
    System.out.println("17. Grapefruit (0.43 calories/g)");
    System.out.println("18. Clementine (0.47 calories/g)");
    System.out.println("19. Passion fruit (0.97 calories/g)");
    System.out.println("20. Coconut (3.75 calories/g)");
    

    // Foods
    System.out.println("\n**Foods:**");
    System.out.println("1. Roasted sweet potatoes (0.86 calories/g)");
    System.out.println("2. Butternut squash soup (0.26 calories/g)");
    System.out.println("3. Lentil soup (1.16 calories/g)");
    System.out.println("4. Chicken stew (1.10 calories/g)");
    System.out.println("5. Beef stew (2.40 calories/g)");
    System.out.println("6. Salmon (1.81 calories/g)");
    System.out.println("7. Cod (0.78 calories/g)");
    System.out.println("8. Quinoa (1.55 calories/g)");
    System.out.println("9. Brown rice (1.11 calories/g)");
    System.out.println("10. Whole grain bread (2.49 calories/g)");
    System.out.println("11. Oats (3.75 calories/g)");
    System.out.println("12. Olive oil (8.81 calories/g)");
    System.out.println("13. Almonds (5.89 calories/g)");
    System.out.println("14. Walnuts (6.78 calories/g)");
    System.out.println("15. Greek yogurt (0.59 calories/g)");
    System.out.println("16. Eggs (1.43 calories/g)");
    System.out.println("17. Cottage cheese (1.02 calories/g)");
    System.out.println("18. Honey (3.87 calories/g)");
    System.out.println("19. Dark chocolate (5.67 calories/g)");
    System.out.println("20. Roast turkey (1.13 calories/g)");

    // Vegetables
    System.out.println("\n**Vegetables:**");
    System.out.println("1. Brussels sprouts (0.43 calories/g)");
    System.out.println("2. Sweet potatoes (0.86 calories/g)");
    System.out.println("3. Carrots (0.41 calories/g)");
    System.out.println("4. Beets (0.43 calories/g)");
    System.out.println("5. Cauliflower (0.25 calories/g)");
    System.out.println("6. Broccoli (0.33 calories/g)");
    System.out.println("7. Spinach (0.23 calories/g)");
    System.out.println("8. Kale (0.50 calories/g)");
    System.out.println("9. Cabbage (0.25 calories/g)");
    System.out.println("10. Turnips (0.28 calories/g)");
    System.out.println("11. Parsnips (0.55 calories/g)");
    System.out.println("12. Radishes (0.16 calories/g)");
    System.out.println("13. Butternut squash (0.26 calories/g)");
    System.out.println("14. Winter squash (0.26 calories/g)");
    System.out.println("15. Potatoes (0.77 calories/g)");
}

private static void displaySpringSuggestions() {
    System.out.println("\nSpring Season Suggested Chart (calories per 1 gram):\n");

    // Fruits
    System.out.println("**Fruits:**");
    System.out.println("1. Apple (0.52 calories/g)");
    System.out.println("2. Pear (0.57 calories/g)");
    System.out.println("3. Strawberries (0.32 calories/g)");
    System.out.println("4. Blueberries (0.57 calories/g)");
    System.out.println("5. Pineapple (0.50 calories/g)");
    System.out.println("6. Mango (0.60 calories/g)");
    System.out.println("7. Kiwi (0.61 calories/g)");
    System.out.println("8. Apricot (0.48 calories/g)");
    System.out.println("9. Peaches (0.39 calories/g)");
    System.out.println("10. Cherries (0.50 calories/g)");
    System.out.println("11. Grapefruit (0.43 calories/g)");
    System.out.println("12. Oranges (0.43 calories/g)");
    System.out.println("13. Lemon (0.29 calories/g)");
    System.out.println("14. Lime (0.30 calories/g)");
    System.out.println("15. Watermelon (0.30 calories/g)");
    System.out.println("16. Cantaloupe (0.34 calories/g)");
    System.out.println("17. Honeydew melon (0.36 calories/g)");
    System.out.println("18. Avocado (1.60 calories/g)");
    System.out.println("19. Banana (0.89 calories/g)");
    System.out.println("20. Raspberry (0.65 calories/g)");
    

    // Foods
    System.out.println("\n**Foods:**");
    System.out.println("1. Grilled chicken breast (1.65 calories/g)");
    System.out.println("2. Baked salmon (1.81 calories/g)");
    System.out.println("3. Quinoa salad with fresh vegetables (1.55 calories/g)");
    System.out.println("4. Brown rice (1.11 calories/g)");
    System.out.println("5. Whole grain bread (2.49 calories/g)");
    System.out.println("6. Vegetable stir-fry (calories vary based on vegetables used)");
    System.out.println("7. Spinach and feta omelette (0.23 calories/g)");
    System.out.println("8. Greek yogurt with berries (0.59 calories/g)");
    System.out.println("9. Shrimp and vegetable skewers (calories vary based on vegetables used)");
    System.out.println("10. Lentil soup (1.16 calories/g)");
    System.out.println("11. Asparagus and mushroom risotto (2.13 calories/g)");
    System.out.println("12. Grilled tilapia (0.96 calories/g)");
    System.out.println("13. Quiche with spinach and feta (2.35 calories/g)");
    System.out.println("14. Oats with fresh fruit (3.75 calories/g)");
    System.out.println("15. Hummus with carrot and cucumber sticks (calories vary based on quantity)");
    System.out.println("16. Roasted vegetable pizza (calories vary based on toppings)");
    System.out.println("17. Chicken Caesar salad (calories vary based on ingredients)");
    System.out.println("18. Whole grain pasta with pesto and cherry tomatoes (calories vary based on quantity)");
    System.out.println("19. Tuna salad with mixed greens (calories vary based on ingredients)");
    System.out.println("20. Greek salad with olives and feta (calories vary based on ingredients)");


    // Vegetables
    System.out.println("\n**Vegetables:**");
    System.out.println("1. Asparagus (0.20 calories/g)");
    System.out.println("2. Spinach (0.23 calories/g)");
    System.out.println("3. Broccoli (0.33 calories/g)");
    System.out.println("4. Artichokes (0.47 calories/g)");
    System.out.println("5. Radishes (0.16 calories/g)");
    System.out.println("6. Carrots (0.41 calories/g)");
    System.out.println("7. Peas (0.81 calories/g)");
    System.out.println("8. Bell peppers (0.31 calories/g)");
    System.out.println("9. Zucchini (0.17 calories/g)");
    System.out.println("10. Cucumbers (0.15 calories/g)");
    System.out.println("11. Tomatoes (0.18 calories/g)");
    System.out.println("12. Spring onions (0.32 calories/g)");
    System.out.println("13. Asparagus (0.20 calories/g)");
    System.out.println("14. Lettuce (0.16 calories/g)");
    System.out.println("15. Arugula (0.25 calories/g)");
  }
    
}
