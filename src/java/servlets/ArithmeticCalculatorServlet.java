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
public class ArithmeticCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
        String operation = request.getParameter("hdnbt");
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        if (first == null || first.equals("") || second == null || second.equals("")) {
            request.setAttribute("message", "Result: Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            
            return;
        } else {
            
            int firstNum = parseInt(first);
            int secondNum = parseInt(second);
            int result = 0;
            
            switch (operation) {
                case "+":
                    result = (firstNum + secondNum);
                    break;
                case "-":
                    result = (firstNum - secondNum);
                    break;
                case "*":
                    result = (firstNum * secondNum);
                    break;
                case "%":
                    result = (firstNum % secondNum);
                    break;
            }
            
            String finalResult = String.valueOf(result);
            
            request.setAttribute("message", "Result: " + finalResult);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        }
    }
}
