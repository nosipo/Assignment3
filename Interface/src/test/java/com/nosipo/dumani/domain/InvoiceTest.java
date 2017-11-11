package com.nosipo.dumani.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.nosipo.dumani.domain.Invoice;
import com.nosipo.dumani.Service.Implementation.PayableImpl;
import com.nosipo.dumani.Service.Payable;

public class InvoiceTest {

    private Payable payable;

    @Before
    public void setUp() throwsException
    {
        payable = new PayableImpl();
    }

    @Test
    public void testInvoice() throws Exception
    {
        Invoice invoice = payable.getPaymentAmount();
        System.out.print("\tInvoice \n" + "**********************\n" + payable.getPaymentAmount() + "\n");
        System.out.print("Total amount due: " + invoice.getPaymentAmount());
        Assert.assertEquals(invoice.getPartNumber(), "4521");
    }

}