package io.amecodelabs.servlets;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.amecodelabs.locationservice.Location;
import io.amecodelabs.locationservice.Service;

/**
 * Servlet implementation class GatewayService
 */
@WebServlet({ "/services/*", "/gateway/*", "/functions/*" })
public class GatewayService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GatewayService() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		return null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] parts = request.getRequestURI().split("/");
		
		String nameService = parts[3];
		if(parts.length > 3) {
			String[] data = Arrays.copyOfRange(parts, 4, parts.length);
			Service service = Location.findService(nameService);
			String result = service.execute(data);
			response.getWriter().append("Service ["+nameService+"] at: ")
			.append("\n")
			.append(result);
		} else {
			response.getWriter().append("Served at: ").append(nameService);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
