import org.junit.Test;

import java.util.Collections;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PotterShopperShould {

    @Test
    public void calculate_price_for_empty_basket_as_zero() {
        PotterShopper bookshop = new PotterShopper();


        double price = bookshop.billFor(Collections.emptyList());


        assertThat(price, is(0.00));
    }
}
