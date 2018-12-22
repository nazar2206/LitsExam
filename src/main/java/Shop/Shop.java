package Shop;

import Shop.ProductsTypes.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;



import static java.lang.Double.parseDouble;


public class Shop {
    public static void main(String[] args) throws IOException {

        Map < String, Double > productsList = new HashMap < > ();
        Map < String, Double > drinksList = new HashMap < > ();
        Map < String, Double > chemistriesList = new HashMap < > ();
        Map < String, Double > electronicsList = new HashMap < > ();
        Map < String, Double > basketList = new TreeMap<>();


        productsList.put("Bread", 2.0);
        productsList.put("Fish", 10.0);
        productsList.put("Beef", 8.0);
        drinksList.put("Milk", 3.0);
        drinksList.put("Beer", 5.0);
        drinksList.put("Coca", 2.5);
        chemistriesList.put("Soap", 2.0);
        chemistriesList.put("Shampoo", 4.0);
        chemistriesList.put("toothpaste", 4.0);
        electronicsList.put("Computer", 2000.0);
        electronicsList.put("AirPods", 150.0);
        electronicsList.put("Phone", 1000.0);

        String input = " ";
        String WelcomeText = "Welcome!";
        String ByeText = "Bye!";
        String CostText = "It's cost: ";
        String AllSumText = "You need to pay: %s $";
        String WantBuyText = "Do you want to but smth?";
        String HowMuchText = "How much do you want to buy?";
        String MoreText = "Do you need smth more?";
        String ChooseTypeText = "Choose type of goods: ";
        String ChooseObjectText = "Choose one object: ";
        String GoodsListText = "Products, Drinks, Chemistry, Electronics";
        String ProductsText = "Products";
        String DrinksText = "Drinks";
        String ChemistryText = "Chemistry";
        String ElectronicsText = "Electronics";
        String ErrorInputText = "You can only enter %s";
        String YesOrQuiteText = "y or q";
        String YesOrQuiteOrBackOrBasketText = "y, b, basket or q";
        String GoodsListError = "Products, Drinks, Chemistry, Electronics, b, basket or q";
        String ProductsError = "Bread, Fish, Beef, b, basket or q";
        String DrinksError = "Milk, Beer, Coca, b, basket or q";
        String ChemistryError = "Soap, Shampoo, Toothpaste, b, basket or q";
        String ElectronicsError = "Computer, AirPods, Phone, b, basket or q";
        String BackEnter = "b";
        String YesEnter = "y";
        String QuiteEnter = "q";
        String BasketEnter = "basket";

        int step = 0;
        double sum = 0;


        System.out.println(WelcomeText);

        do {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            if (step == 0) {
                System.out.println(WantBuyText);
                input = bufferedReader.readLine();
                if (YesEnter.equals(input)) {
                    step = 1;
                } else if (QuiteEnter.equals(input)) {
                    System.out.println(" ");
                } else {
                    System.out.println(String.format(ErrorInputText, YesOrQuiteText));
                    step = 0;
                }
            } else if (step == 1) {
                System.out.println(GoodsListText);
                System.out.println(ChooseTypeText);
                input = bufferedReader.readLine();
                if (ProductsText.equals(input)) {
                    step = 2;
                } else if (DrinksText.equals(input)) {
                    step = 3;
                } else if (ChemistryText.equals(input)) {
                    step = 4;
                } else if (ElectronicsText.equals(input)) {
                    step = 5;
                } else if (BasketEnter.equals(input)) {
                    System.out.println(basketList);
                    System.out.println(MoreText);
                    input = bufferedReader.readLine();
                } else if(YesEnter.equals(input)){
                    System.out.println(GoodsListText);
                    System.out.println(ChooseTypeText);
                    input = bufferedReader.readLine();
                }else if (QuiteEnter.equals(input)) {
                    System.out.println(" ");
                }
    /*else if (BackEnter.equals(input)) {
                       step = 0;
                   } */
                else {
                    System.out.println(String.format(ErrorInputText, GoodsListError));
                    step = 1;
                }
            } else if (step == 2) {
                System.out.println(ProductType.PRODUCTS.getDescription());
                System.out.println(productsList);
                System.out.println(ChooseObjectText);
                input = bufferedReader.readLine();
                if (productsList.containsKey(input)) {
                    step = 6;
                } else if (QuiteEnter.equals(input)) {
                    System.out.println(" ");
                } else if (BasketEnter.equals(input)) {
                    System.out.println(basketList);
                    System.out.println(MoreText);
                    input = bufferedReader.readLine();

                } else if (BackEnter.equals(input)) {
                    step = 1;
                } else {
                    System.out.println(String.format(ErrorInputText, ProductsError));
                    step = 2;
                }
            } else if (step == 3) {
                System.out.println(ProductType.DRINKS.getDescription());
                System.out.println(drinksList);
                System.out.println(ChooseObjectText);
                input = bufferedReader.readLine();
                if (drinksList.containsKey(input)) {
                    step = 7;
                } else if (BasketEnter.equals(input)) {
                    System.out.println(basketList);
                    System.out.println(MoreText);
                    input = bufferedReader.readLine();
                } else if (QuiteEnter.equals(input)) {
                    System.out.println(" ");
                } else if (BackEnter.equals(input)) {
                    step = 1;
                } else {
                    System.out.println(String.format(ErrorInputText, DrinksError));
                    step = 3;
                }
            } else if (step == 4) {
                System.out.println(ProductType.CHEMISTRY.getDescription());
                System.out.println(chemistriesList);
                System.out.println(ChooseObjectText);
                input = bufferedReader.readLine();
                if (chemistriesList.containsKey(input)) {
                    step = 8;
                } else if (QuiteEnter.equals(input)) {
                    System.out.println(" ");
                } else if (BasketEnter.equals(input)) {
                    System.out.println(basketList);
                    System.out.println(MoreText);
                    input = bufferedReader.readLine();
                } else if (BackEnter.equals(input)) {
                    step = 1;
                } else {
                    System.out.println(String.format(ErrorInputText, ChemistryError));
                    step = 4;
                }
            } else if (step == 5) {
                System.out.println(ProductType.ELECTRONICS.getDescription());
                System.out.println(electronicsList);
                System.out.println(ChooseObjectText);
                input = bufferedReader.readLine();
                if (electronicsList.containsKey(input)) {
                    step = 9;
                } else if (QuiteEnter.equals(input)) {
                    System.out.println(" ");
                } else if (BasketEnter.equals(input)) {
                    System.out.println(basketList);
                    System.out.println(MoreText);
                    input = bufferedReader.readLine();
                } else if (BackEnter.equals(input)) {
                    step = 1;
                } else {
                    System.out.println(String.format(ErrorInputText, ElectronicsError));
                    step = 5;
                }
            } else if (step == 6) {
                if (productsList.containsKey(input)) {
                    String temp = input;
                    System.out.println(HowMuchText);
                    input = bufferedReader.readLine();
                    System.out.println(CostText + (parseDouble(input) * productsList.get(temp)));
                    basketList.put(temp,parseDouble(input) );
                    sum += parseDouble(input) * productsList.get(temp);
                    System.out.println(MoreText);
                    input = bufferedReader.readLine();

                }else if (QuiteEnter.equals(input)) {
                        System.out.println(" ");
                    } else if (YesEnter.equals(input)) {
                        step = 1;
                    } else if (BasketEnter.equals(input)) {
                        System.out.println(basketList);
                        System.out.println(MoreText);
                        input = bufferedReader.readLine();
                    } else if (BackEnter.equals(input)) {
                        step = 2;
                    } else {
                        System.out.println(String.format(ErrorInputText, YesOrQuiteOrBackOrBasketText));
                        step = 2;
                    }
            } else if (step == 7) {
                if (drinksList.containsKey(input)) {
                    String temp = input;
                    System.out.println(HowMuchText);
                    input = bufferedReader.readLine();
                    System.out.println(CostText + (parseDouble(input) * drinksList.get(temp)));
                    basketList.put(temp, parseDouble(input));
                    sum += parseDouble(input) * drinksList.get(temp);
                    System.out.println(MoreText);
                    input = bufferedReader.readLine();
                }else if (QuiteEnter.equals(input)) {
                    System.out.println(" ");
                } else if (YesEnter.equals(input)) {
                    step = 1;
                } else if (BasketEnter.equals(input)) {
                    System.out.println(basketList);
                    System.out.println(MoreText);
                    input = bufferedReader.readLine();
                } else if (BackEnter.equals(input)) {
                    step = 3;
                } else {
                    System.out.println(String.format(ErrorInputText, YesOrQuiteOrBackOrBasketText));
                    step = 3;
                }
            } else if (step == 8) {
                if (chemistriesList.containsKey(input)) {
                    String temp = input;
                    System.out.println(HowMuchText);
                    input = bufferedReader.readLine();
                    System.out.println(CostText + (parseDouble(input) * chemistriesList.get(temp)));
                    basketList.put(temp, parseDouble(input));
                    sum += parseDouble(input) * chemistriesList.get(temp);
                    System.out.println(MoreText);
                    input = bufferedReader.readLine();
                }else if (QuiteEnter.equals(input)) {
                    System.out.println(" ");
                } else if (YesEnter.equals(input)) {
                    step = 1;
                } else if (BasketEnter.equals(input)) {
                    System.out.println(basketList);
                    System.out.println(MoreText);
                    input = bufferedReader.readLine();
                } else if (BackEnter.equals(input)) {
                    step = 4;
                } else {
                    System.out.println(String.format(ErrorInputText, YesOrQuiteOrBackOrBasketText));
                    step = 4;
                }
            } else if (step == 9){
                if (drinksList.containsKey(input)) {
                    String temp = input;
                    System.out.println(HowMuchText);
                    input = bufferedReader.readLine();
                    System.out.println(CostText + (parseDouble(input) * electronicsList.get(temp)));
                    System.out.println(parseDouble(input) * electronicsList.get(temp));
                    basketList.put(temp, parseDouble(input));
                    sum += parseDouble(input) * electronicsList.get(temp);
                    System.out.println(MoreText);
                    input = bufferedReader.readLine();
                }else if (QuiteEnter.equals(input)) {
                    System.out.println(" ");
                } else if (YesEnter.equals(input)) {
                    step = 1;
                } else if (BasketEnter.equals(input)) {
                    System.out.println(basketList);
                    System.out.println(MoreText);
                    input = bufferedReader.readLine();
                } else if (BackEnter.equals(input)) {
                    step = 5;
                } else {
                    System.out.println(String.format(ErrorInputText, YesOrQuiteOrBackOrBasketText));

                    step = 5;
                }
            }else  {
                step = 1;
            }

        } while (!input.equals(QuiteEnter));

        if (basketList.isEmpty()) {} else {
            System.out.println(basketList);
            System.out.println(String.format(AllSumText, sum));
        }
        System.out.println(ByeText);
    }
}