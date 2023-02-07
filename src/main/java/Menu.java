class Menu {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name ="Mojito";
        drink1.price = 13.0;
        drink1.alcoholic = true;
        drink1.ingridients = new Ingridients();
        drink1.ingridients.ing1 = "woda";
        drink1.ingridients.ing2 = "sok";
        drink1.ingridients.ing3 = "wódka";
        drink1.ingridients.ing1Vol = 150;
        drink1.ingridients.ing2Vol = 110;
        drink1.ingridients.ing3Vol = 50;
        drink1.drinkVol = (drink1.ingridients.ing1Vol + drink1.ingridients.ing2Vol + drink1.ingridients.ing3Vol);

        Drink drink2 = new Drink();
        drink2.name ="Caipirinha";
        drink2.price = 15.0;
        drink2.alcoholic = true;
        drink2.ingridients = new Ingridients();
        drink2.ingridients.ing1 = "woda mineralna";
        drink2.ingridients.ing2 = "sok z limonki";
        drink2.ingridients.ing3 = "rum";
        drink2.ingridients.ing1Vol = 160;
        drink2.ingridients.ing2Vol = 150;
        drink2.ingridients.ing3Vol = 20;
        drink2.drinkVol = (drink2.ingridients.ing1Vol + drink2.ingridients.ing2Vol + drink2.ingridients.ing3Vol);

        String format = "%nDrink: %s%nCena: %.2fzł%nCzy zawiera alkohol?: %b%nSkładniki:%n %s%n %s%n %s%nPojemność: %.0fml%n";
        String outputDrink1 = format.formatted(drink1.name, drink1.price, drink1.alcoholic, drink1.ingridients.ing1, drink1.ingridients.ing2, drink1.ingridients.ing3, drink1.drinkVol);
        String outputDrink2 = format.formatted(drink2.name, drink2.price, drink2.alcoholic, drink2.ingridients.ing1, drink2.ingridients.ing2, drink2.ingridients.ing3, drink2.drinkVol);

        System.out.printf(outputDrink1);
        System.out.printf(outputDrink2);

    }
}
