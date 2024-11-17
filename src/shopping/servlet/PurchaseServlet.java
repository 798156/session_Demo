package shopping.servlet;

import shopping.entity.Cake;
import shopping.entity.CakeDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@WebServlet("/PurchaseServlet")
public class PurchaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过id查看是否有该商品
         String id=req.getParameter("id");
         //没有，则重定向到蛋糕展示列表
        Cake cake=CakeDB.getCakeById(id);
        if(cake==null){
            resp.sendRedirect("/ListCakeServlet");
            return;
        }
        //有，加入购物车
        //从session域中获取购物车
        HttpSession session=req.getSession();
        //购物车就是一个list集合
        List <Cake> cart=(List)session.getAttribute("cart");
        //cart是否存在
        if(cart==null){//不存在，创建
            cart=new ArrayList<Cake>();
            session.setAttribute("cart",cart);//存在session域中
        }
        //无论存在与否，都要往购物车中添加要购买的蛋糕
        cart.add(cake);
        Cookie cookie=new Cookie("JSESSIONID",session.getId());
        //将session对应的ID持久化30分钟，目的和session域中存储的对象存储时间一致
        cookie.setMaxAge(1*5);
        cookie.setPath("/");
        resp.addCookie(cookie);

        //重定向购物车页面中
        resp.sendRedirect("/CartServlet");

    }
}
