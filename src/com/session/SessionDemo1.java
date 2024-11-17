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

@WebServlet("/sessionDemo1")
public class SessionDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取session
        HttpSession session = req.getSession();
        //2.调用session对象的api方法
        String id = session.getId(); // 获取当前会话的唯一标识符
        int maxInactiveInterval = session.getMaxInactiveInterval(); // 获取会话可以处于非活动状态的最大时间间隔（以秒为单位）
        long creationTimed = session.getCreationTime(); // 获取会话被创建的时间（自1970年1月1日以来的毫秒数）
        long lastAccessedTime = session.getLastAccessedTime(); // 获取会话最后一次被访问的时间（自1970年1月1日以来的毫秒数）
        ServletContext servletContext = session.getServletContext(); // 获取当前会话的Servlet上下文对象
        boolean isNew = session.isNew(); // 判断当前会话是否是新建的

//        //让session失效
//        session.invalidate();//每次刷新的id都不一样了

        PrintWriter writer = resp.getWriter();

//        writer.write("id="+id);
        writer.println("id="+id);
        writer.println("maxInactiveInterval="+maxInactiveInterval);
        writer.println("creationTimed="+creationTimed);
        writer.println("lastAccessedTime="+lastAccessedTime);
        writer.println("servletContext="+servletContext);
        writer.println("isNew="+isNew);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
