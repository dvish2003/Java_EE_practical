import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * Author: vishmee
 * Date: 12/5/24
 * Time: 1:35 PM
 * Description:
 */
/*
@WebServlet(urlPatterns = "/hello")   mapping krddi e e class wlr uniqe name use krnn one tawa class ekak name ekak use krnn be ekm web eke port dekak run krnn bri hind
*/
@WebServlet(urlPatterns = "/hi")
public class HelloServer_2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*super.doGet(req, resp);*/
        System.out.println("Hello Ijse");
    }
}
