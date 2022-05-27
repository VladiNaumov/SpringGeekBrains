package com.naumdeveloper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/*
HW1
Задание
1. Установить сервер приложений TomCat или Wildfly (либо любой другой по выбору);
2. Создать и запустить новый проект по инструкции из данной методички;
3. Создайте класс Product с полями (id, title, cost);
4. Реализуйте сервлет выводящий на страницу список из 10 продуктов (создаете продукты в момент обработки запроса).
 */
@WebServlet(name = "ProdiutServlet", urlPatterns = "/show_product")
public class ProdiutServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(ProdiutServlet.class);

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1,"Bread", 1));
        products.add(new Product(2,"Milk", 2));
        products.add(new Product(3,"Apple", 4));
        products.add(new Product(4,"Sideri", 3));
        products.add(new Product(5,"HotDog", 10));
        products.add(new Product(6,"Apelsini", 7));
        products.add(new Product(7,"Beer", 3));


        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");

        for (Product p : products){
            resp.getWriter().printf("<h1> " + p + "</h1>");
        }


        resp.getWriter().printf("</body></html>");
        resp.getWriter().close();
    }

}
