package ru.gb.Java_Spring_Hw7.service;

import org.springframework.stereotype.Service;

@Service
public class AdminService {

    public String getText() {
        return "Страница Администратора";
    }
}