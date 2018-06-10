package com.jd.jsp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DoLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String pwd = request.getParameter("pwd");
        if("tom".equals(userName) && "123".equals(pwd)){
            //使用session使登录用户名在回话中可用
            request.getSession().setAttribute("name",userName);

            //登录成功
            request.getRequestDispatcher("/success.jsp").forward(request,response);

        }else{
            //登录失败，重定向
            response.sendRedirect("/login.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
