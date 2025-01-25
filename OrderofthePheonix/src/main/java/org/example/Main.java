package org.example;

import org.example.Services.MainService;
import org.example.Utils.DatabaseIntegration;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Connection conn = DatabaseIntegration.getConnection();


    }
}