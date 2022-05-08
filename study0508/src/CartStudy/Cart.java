package CartStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cart extends User {

    public List<Product> products = new ArrayList();

    public int getTotalAmount() {
        return (int) products.stream()
                .collect(Collectors.summarizingInt(v -> v.price)).getSum();
    }

}