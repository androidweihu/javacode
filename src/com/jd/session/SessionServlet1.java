package com.jd.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        if(name!=null){
            name=new String(name.getBytes("iso-8859-1"),"UTF-8");
        }
        //获取session对象
        HttpSession session = request.getSession();
        session.setAttribute("name",name);
        response.getWriter().write(session.getId());


    }
}
