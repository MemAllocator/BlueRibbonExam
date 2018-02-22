package com.BlueRibbon;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by omer on 2/13/2018.
 */
@RestController
@RequestMapping("/")
public class RestApiController {
    StaticDB DB = new StaticDB();
    private Random randomGenerator =new Random();
    public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);



    // -------------------Retrieve All Users---------------------------------------------
    @Scope("session")
    @RequestMapping(value = "/tickets/ticketId={ticketId}", method = RequestMethod.GET)
        public boolean ticketIdCheck(@PathVariable long ticketId) {

            return DB.getTicketId().contains(ticketId);

    }
    @Scope("session")
    @RequestMapping(value = "/baggage/destId={destId}&baggageId={baggageId}", method = RequestMethod.GET)
    public boolean baggageCheck(@PathVariable long destId, @PathVariable String baggageId) {
        return (DB.getDestinationId().contains(destId) && DB.getBaggageId().contains(baggageId));
    }
    @Scope("session")
    @RequestMapping(value = "/coupon/couponId={couponId}&price={price}", method = RequestMethod.GET)
    public String couponCheck(@PathVariable long couponId, @PathVariable double price) {
        if(DB.getCouponId().contains(couponId)){
            int index = randomGenerator.nextInt(DB.getFixedPrice().size());
            double afterDiscount = price*DB.getFixedPrice().get(index);
            return "price after discount: " + afterDiscount;
        }
    return "couponId " + couponId + " is not valid";
    }
}