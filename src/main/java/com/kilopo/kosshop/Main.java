package com.kilopo.kosshop;

import com.kilopo.kosshop.DAO.AddressDAO;
import com.kilopo.kosshop.util.DatabaseConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(DatabaseConfig.class);
        context.refresh();
        AddressDAO a = context.getBean(AddressDAO.class);
        System.out.println(a.getById(2L));
        System.out.println(a.getById(2L));
    }
}
