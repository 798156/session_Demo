package shopping.servlet;

import shopping.entity.Cake;
import shopping.entity.CakeDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

@WebServlet("/ListCakeServlet")
public class ListCakeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        //展示数据
        Collection<Cake> cakes = CakeDB.getAll();
        PrintWriter writer = resp.getWriter();
        writer.println("本店提供的蛋糕有:<br>");
        for (Cake cake : cakes) {
            String url = "PurchaseServlet?id=" + cake.getId();
            writer.write(cake.getName() + "<a href='" + url + "'>点击购买</a><br>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}