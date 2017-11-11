package com.nosipo.dumani.Service.Implementation;

import com.nosipo.dumani.domain.Invoice;
import com.nosipo.dumani.Service.Payable;

public class PayableImpl implements Payable
{
    public Invoice getPaymentAmount()
    {
        Invoice invoice = new  Invoice("4521", "IoT device", 80, 8000.00 );
        invoice.getPaymentAmount();
        return invoice;
    }
}