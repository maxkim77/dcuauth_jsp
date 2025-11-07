

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html; charset=EUC-KR");
		
		String ctx = request.getContextPath();
		PrintWriter out = response.getWriter();
		
        out.println("<!DOCTYPE html>");
        out.println("<html lang='ko-KR'>");
        out.println("<head>");
        out.println("<meta charset='EUC-KR'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>DCU STUDY</title>");
        out.println("<link rel='stylesheet' href='" + ctx + "/css/common.css'>");
        out.println("<link rel='stylesheet' href='" + ctx + "/css/index.css'>");
        out.println("</head>");
        out.println("<body>");
        
        // header
        out.println("<header class='layout-header'>");
        out.println("<h1><a href='" + ctx + "/login'>DCU STUDY</a></h1>");
        out.println("<div>");
        out.println("  <a href='" + ctx + "/profile'>프로필</a>");
        out.println("  <a href='" + ctx + "/login'>로그인</a>");
        out.println("  <button type='button'>로그아웃</button>");
        out.println("</div>");
        out.println("</header>");

        // main
        out.println("<main class='login'>");
        out.println("<h2 class='main-title'>로그인</h2>");
        out.println("<p class='main-desc'>아이디와 비밀번호를 입력하고 로그인하세요</p>");

        out.println("<form id='main-form' method='POST' action='" + ctx + "/ProfileServlet'>");
        out.println("  <div class='flex-input'>");
        out.println("    <label class='user-id'>아이디</label>");
        out.println("    <input class='user-id' name='user-id' type='text' required/>");
        out.println("  </div>");
        out.println("  <div class='flex-input'>");
        out.println("    <label class='user-pw'>비밀번호</label>");
        out.println("    <input class='user-pw' name='user-pw' type='password' required />");
        out.println("  </div>");
        out.println("  <button class='login-btn' type='submit'>로그인</button>");
        out.println("</form>");
        out.println("</main>");

        // footer
        out.println("<footer class='layout-footer'>");
        out.println("Copyright 2025. DCU practice.");
        out.println("</footer>");

        out.println("</body>");
        out.println("</html>");
        out.flush();
	}

	/*
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
