package com.microservices.service.impl;

import com.microservices.database.DBHelper;
import com.microservices.model.AddPayment;
import com.microservices.model.OrderDTO;
import com.microservices.model.Payment;
import com.microservices.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;

@Service
public class PaymentServiceImpl implements PaymentService {
    private DBHelper dbHelper;

    @Autowired
    public PaymentServiceImpl(){
        this.dbHelper = new DBHelper();
    }

    @Override
    public Payment getPaymentById(int id) throws SQLException {
        return dbHelper.getPaymentById(id);
    }

    @Override
    public ArrayList<Payment> getPaymentsByOrderId(int orderId) throws SQLException {
        return dbHelper.searchItemsByOrderId(orderId);
    }

    @Override
    public ArrayList<Payment> showAllPayments() throws SQLException {
        return dbHelper.showAllPayments();
    }

    @Override
    public OrderDTO addPayment(AddPayment addPayment) throws SQLException {
        return dbHelper.createPayment(addPayment);
    }
}
