package com.nosipo.dumani.domain;

import java.io.Serializable;

public class Invoice implements Serializable
{
    private String partNumber;
    private String partDescription;
    private int qauntity;
    private double pricePerItem;

    public Invoice (String partNumber, String partDescription, int qauntity, double pricePerItem)
    {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.qauntity = qauntity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQauntity() {
        return qauntity;
    }

    public void setQauntity(int count) {
        if (count >= 0)
            qauntity = count;
        else
            throw new IllegalArgumentException("Quantity cannot be 0");
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double price) {
        if (price >= 0.0)
            pricePerItem = price;
        else
            throw new IllegalArgumentException("Price cannot be 0");
    }

    @Override
    public String toString()
    {
        return "Part Number: " + getPartNumber() + "\n" + "Description: " + getPartDescription() + "\n" + "Quantity: "
                + getQauntity() + "\n" + "Price: " + getPricePerItem() + "\n";

    }
    public double getPaymentAmount()
    {
        return qauntity * pricePerItem;
    }
}