package com.example.houserentalpos.dao;

import com.example.houserentalpos.pojo.Property;

import java.util.ArrayList;

public interface PropertyDAO {
    public ArrayList<Property> getAllProperty();
    public Property getCoin(int id);

}
