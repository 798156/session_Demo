package shopping.servlet;

import shopping.entity.Cake;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
//从session域中取出cart对象
        HttpSession session = req.getSession();
        List<Cake> cart = (List<Cake>) session.getAttribute("cart");
        //判断购物车是否为空
        if (cart.isEmpty()) {
            //为空，重定向到蛋糕展示列表
            resp.sendRedirect("/ListCartServlet");
        } else { //不为空，向页面输出购买的蛋糕
            PrintWriter writer = resp.getWriter();
            writer.write("您购物车的蛋糕有:<br>");
            for (Cake c : cart) {
                writer.write(c.getName() + "<br>");
            }
        }

    }
}
