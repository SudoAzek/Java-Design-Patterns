package com.mezonworks.business_delegate_pattern.with_simple_business;

public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();

        } else {
            return new JMSService();
        }
    }
}
