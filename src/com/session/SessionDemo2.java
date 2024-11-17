package com.session;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sessionDemo2")
public class SessionDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取session
        HttpSession session = req.getSession();
        //本次会话的唯一标识
        String id = session.getId();

        PrintWriter writer = resp.getWriter();
        writer.println("id:"+id);
        int maxInactiveInterval = session.getMaxInactiveInterval(); // 获取会话可以处于非活动状态的最大时间间隔（以秒为单位）
        writer.println("maxInactiveInterval:"+maxInactiveInterval);//600(session的有效时间（秒）)

//        //session对象立即失效
//        session.invalidate();

//        //设置有效时间10秒
//        session.setMaxInactiveInterval(10);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
