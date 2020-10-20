package com.mezonworks.business_delegate_pattern.with_simple_business;

public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
