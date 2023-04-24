package org.example.DR3;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}