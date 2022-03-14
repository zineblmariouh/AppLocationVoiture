package com.example.applocationvoiture.dao;

import java.util.List;

public interface IDao <T> {
    public boolean Create(T o);
    public boolean Delete(T o);
    public boolean Update(T o);
    public List<T> findAll();
    public  T findById(int id);
}
