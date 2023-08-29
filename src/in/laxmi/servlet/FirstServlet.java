package in.laxmi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context =req.getServletContext();
		String website=context.getInitParameter("website");
		ServletConfig config = getServletConfig();
		String msg = config.getInitParameter("msg");
		PrintWriter pw = resp.getWriter();
		pw.append(msg);
		pw.append(website);
	}

}
