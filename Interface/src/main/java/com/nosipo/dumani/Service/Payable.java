package com.nosipo.dumani.Service;

import com.nosipo.dumani.domain.Invoice;

public interface Payable
{
    Invoice getPaymentAmount();
}