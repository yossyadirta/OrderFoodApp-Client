package com.example.yossy.orderfood.Model;

import java.util.List;

public class Request {
    private String noMeja;
    private String total;
    private String status;
    private List<Order> foods;

    public Request() {
    }

    public Request(String noMeja, String total, List<Order> foods) {
        this.noMeja = noMeja;
        this.total = total;
        this.foods = foods;
        this.status = "0"; //0: Diproses 1:Diantarkan 2:Diterima
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNoMeja() {
        return noMeja;
    }

    public void setNoMeja(String noMeja) {
        this.noMeja = noMeja;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<Order> getFoods() {
        return foods;
    }

    public void setFoods(List<Order> foods) {
        this.foods = foods;
    }
}
