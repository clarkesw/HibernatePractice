package com.coupon;

import com.coupon.models.Coupon;
import com.coupon.repositories.CouponRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CouponServiceApplicationTests {
    
        @Autowired
        CouponRepository repo;

	@Test
	void testSaveCoupon() {
            repo.save(new Coupon("HnK", 10.0, "12/31/25"));
	}

}
