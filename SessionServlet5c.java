import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Using Cookie
        Cookie[] cookies = request.getCookies();
        String user = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    user = cookie.getValue();
                }
            }
        }

        // Using HttpSession
        HttpSession session = request.getSession();
        session.setAttribute("visited", "yes");

        // Using URL Rewriting
        String rewriteURL = response.encodeURL("WelcomeServlet");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Session Handling Example</h1>");
        if (user != null) {
            out.println("<p>Welcome back, " + user + "</p>");
        } else {
            Cookie cookie = new Cookie("username", "MakeupLover");
            response.addCookie(cookie);
            out.println("<p>New session started!</p>");
        }
        out.println("<a href='" + rewriteURL + "'>Continue</a>");
    }
}
