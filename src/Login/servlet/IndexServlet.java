package Login.servlet;

import Login.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html;charset=utf-8");
       PrintWriter writer = resp.getWriter();
       //验证用户是否登录
        HttpSession session = req.getSession();
            //用户对象放入session域中，此时要取，通过取出的user对象是否为空，进而判断是否登录
        User user = (User) session.getAttribute("user");
        if (user == null) {//没有登录，超链接去登录页面login.html
            String url="/chapter05/login.html";
            writer.write("您还未登录，<a href='"+url+"'>请登录</a>");
        }else {//登录成功，显示欢迎登录
            writer.write("欢迎"+user.getUsername()+"登录成功! ");
            writer.write("<a href='/chapter05/LoginOutServlet'>退出登录</a>");


        }
    }
}
