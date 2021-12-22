package com.transactionalManagement.transactionalManagement.services;

import com.transactionalManagement.transactionalManagement.exception.AmountLess;

import java.util.HashMap;
import java.util.Map;

public class PaymentValidate {
    private static Map<String,Integer> accDetails=new HashMap<>();

    static{
        accDetails.put("vinoth",400000);
        accDetails.put("Ashok",300000);
        accDetails.put("Roshan",500000);
        accDetails.put("Niranjan",500000);
    }
    public static boolean CheckAmt(String accDet,Integer amt)
    {
        if(amt>accDetails.get(accDet))
        {
            throw new AmountLess("Amount is Lesser");
        }
        else
        {
            return true;
        }
    }

}
