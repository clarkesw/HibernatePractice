package com.coupon;

import com.coupon.models.Coupon;
import com.coupon.repositories.CouponRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Disabled("Not Ready")
class CouponServiceApplicationTests {

    @Autowired
    CouponRepository repo;

    @Test
    void testSaveCoupon() {
        repo.save(new Coupon("HnK", 10.0, "12/31/25"));
    }

//    @Test(expected = JsonMappingException.class)
//    public void givenBidirectionRelation_whenSerializing_thenException()
//            throws JsonProcessingException {
//
//        User user = new User(1, "John");
//        Item item = new Item(2, "book", user);
//        user.addItem(item);
//
//        new ObjectMapper().writeValueAsString(item);
//    }
}
