package com.example.demoservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "form" , value = "/form-nguoi-dung")
public class FormPerson extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        // ben /them-nguoi-dung co phuong thuc doPost nen method o day la post.
        printWriter.println("<form action='/DemoServlet_war_exploded/them-nguoi-dung' method='post'>");
        printWriter.println("ten: <input type='text' name = 'ten'/>");
        printWriter.println("tuoi: <input type='text' name = 'tuoi'/>");
        printWriter.println("dia chi: <input type='text' name = 'diaChi'/>");
        printWriter.println("<button type='submit'>Submit</button>");

        printWriter.println("</form>");


    }
}
