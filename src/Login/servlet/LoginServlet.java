package Login.servlet;

import Login.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
       //获取前端参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if ("itcast".equals(username) && "123".equals(password)) {
            //登录成功，将user对象，存入session域中
            HttpSession session = req.getSession();
            session.setAttribute("user", new User(username,password));
            //持久化
            Cookie cookie = new Cookie("JSESSIONID", session.getId());
            cookie.setMaxAge(60*30);
            cookie.setPath("/");
            resp.addCookie(cookie);

            resp.sendRedirect("/chapter05/IndexServlet");
        }else {//登录失败
            resp.getWriter().write("用户名或密码错误!");
        }
    }
}
