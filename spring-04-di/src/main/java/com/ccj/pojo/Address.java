package com.ccj.pojo;

import java.nio.channels.Pipe;

/**
 * @author cc
 * @date 2020/7/15
 */
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
