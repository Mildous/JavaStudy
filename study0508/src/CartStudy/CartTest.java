package CartStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class CartTest {

    static boolean shutdown = false;

    public static void main(String[] args) {


        while (!shutdown) {

            System.out.println("insert user name..");
            Scanner s = new Scanner(System.in);
            Cart cart = new Cart();
            cart.userName = s.nextLine();
            List<Product> productList = new ArrayList();
            for(int i = 0 ; i < 10; i++){
                productList.add(new Product(i%2+"", UUID.randomUUID().toString(), i+1*1000));
            }
            productOutput(cart, productList);

        }


    }

    public static void productOutput(Cart cart, List<Product> productList) {
        for(int i = 0 ; i < productList.size(); i++){
            Product v = productList.get(i);
            System.out.println("num : " + i + "[" + v.categoryName + " - " +v.name + " - "+v.price+"]");
        }
        System.out.println("choice product number..");
        Scanner s = new Scanner(System.in);
        int select = Integer.parseInt(s.nextLine());
        cart.products.add(productList.get(select));

        for(int i = 0; i < cart.products.size() ; i++) {
            System.out.println("insert product name is "+cart.products.get(i).name);
        }

        System.out.println("user name is "+cart.userName);
        System.out.println("cart item total price is " + cart.getTotalAmount());

        System.out.println("do next product insert? [Y/N]");
        s = new Scanner(System.in);
        shutdown = "N".equalsIgnoreCase(s.nextLine()) ? true : false;
        if(!shutdown) {
            productList.remove(select);
            productOutput(cart, productList);
        }
    }

}
