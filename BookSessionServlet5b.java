import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BookSessionServlet")
public class BookSessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String date = request.getParameter("date");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Booking Confirmed</h1>");
        out.println("<p>Thank you, " + name + ". Your makeup session is booked for " + date + ".</p>");
        out.println("<p>Confirmation sent to: " + email + "</p>");
    }
}
