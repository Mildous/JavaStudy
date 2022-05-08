package CartStudy;

public class Product extends Category {

        public String name;
        public int price;

        public Product() {}

        public Product(String category, String name, int price) {
            super.categoryName = category;
            this.name = name;
            this.price = price;
        }

    }