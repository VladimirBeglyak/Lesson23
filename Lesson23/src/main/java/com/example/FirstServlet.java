package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/form")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        request.setAttribute("name",name);
        request.setAttribute("age",age);
        if (age<18){
            response.sendRedirect("/registration.jsp");
        } else {
            getServletContext()
                    .getRequestDispatcher("/second-servlet")
                    .forward(request,response);
        }

    }
}
