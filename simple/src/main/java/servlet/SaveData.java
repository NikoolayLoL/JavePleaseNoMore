package servlet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveData
 */
public class SaveData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SaveData() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		String brand = request.getParameter("brand");
		String model = request.getParameter("model");
		String color = request.getParameter("color");
		String transmission = request.getParameter("transmission");
		Float passengers = Float.parseFloat(request.getParameter("passengers"));
		int year = Integer.parseInt(request.getParameter("year"));
		Float fuel_economy = Float.parseFloat(request.getParameter("fuel_economy"));
		
		Person person = new Person(brand,model,color,transmission,passengers,year,fuel_economy);
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append(person.toString1()).append("<br>");
		//http://localhost:8080/simple/index.html
		response.getWriter().append("<a href=\"http://localhost:8080/simple/index.html\">Go to main</a>");
		
		String filePath = getServletContext().getRealPath("\\data.txt");
		System.out.println(filePath);
		
		try (FileWriter fr = new FileWriter(filePath,true);
				BufferedWriter out = new BufferedWriter(fr))
		{
			out.write(person.toString1());
			out.newLine();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
