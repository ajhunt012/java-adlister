import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ParksServlet", urlPatterns = "/parks")
public class ParksServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<String> parks = new ArrayList<>();
        parks.add("Rocky Mountain NP");
        parks.add("Yellowstone NP");
        parks.add("Big Bend NP");
        parks.add("Denali NP");
        parks.add("Olympic NP");

        req.setAttribute("parks", parks);

        String username = req.getParameter("username");
        req.setAttribute("username", username);

        req.getRequestDispatcher("/parks.jsp").forward(req, resp);

    }
}