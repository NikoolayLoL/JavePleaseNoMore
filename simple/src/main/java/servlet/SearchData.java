package servlet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchData
 */

public class SearchData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SearchData() {
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String searchTerm = request.getParameter("q");
        response.setContentType("text/html;charset=UTF-8");
        String results = searchFile("D:\\Programming\\Java\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\simple\\data.txt", searchTerm);

        
        response.getWriter().append(results).append("<br>");
        response.getWriter().append("Search word: "+searchTerm);
        
      }

      private String searchFile(String fileName, String searchTerm) throws IOException {
        String results = "", altResults = "";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
        	String [] input = line.split(",");
        	for (int i = 0 ;i< input.length; i++) {
        		if (searchTerm.equals(input[i])) {
        	        results += line;
        	        reader.close();
        	        return results;
        		}
        		//altResults += input[i] + "/#" + (i+1) + "\\";
        		altResults += input[i]+" ";
        	}
        }
        reader.close();
    
        return "Not in file <br>" + altResults;
      }
      
      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		// TODO Auto-generated method stub
  		doGet(request, response);
  	}

}
