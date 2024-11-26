import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MakeupCategoriesServlet")
public class MakeupCategoriesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Makeup Categories</h1>");
        out.println("<ul>");
        out.println("<li>Lipsticks</li>");
        out.println("<li>Foundations</li>");
        out.println("<li>Eyeshadow Palettes</li>");
        out.println("<li>Blushes</li>");
        out.println("</ul>");
    }
}
