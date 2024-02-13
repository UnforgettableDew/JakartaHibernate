package com.example.demo1;

import java.io.*;

import jakarta.ejb.EJB;
//import jakarta.inject.Inject;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    @EJB
    private JournalRepository journalRepository;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println(journalRepository.isHibernateConnectedToDatabase());
    }

}