package servlets;

import java.io.IOException;
import static java.lang.Integer.parseInt;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cprg352
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
        String age = request.getParameter("age");        
        request.setAttribute("age", age);
        
        if (age == null || age.equals("")) {
            request.setAttribute("message", "You must give your current age.");
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            
            return;
        } else {
            int ageInt = parseInt(age) + 1;
            String ageNextBDay = String.valueOf(ageInt);
            
            request.setAttribute("message", "You age next birthday will be " + ageNextBDay);
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        }
    }
}
