import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.*;



public class ControllerInline extends HttpServlet{

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String enviar = req.getParameter("enviar");
        
    switch (enviar) {
        case "user":
            req.getRequestDispatcher("FormsUser/indexUser.jsp").forward(req, resp);
            break;


    }
}
}