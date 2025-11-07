

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**     
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html; charset=EUC-KR");
		
		String id = nvl(request.getParameter("user-id"));
		String ctx = request.getContextPath();
		PrintWriter out = response.getWriter();
		
        out.println("<!DOCTYPE html>");
        out.println("<html lang='ko-KR'>");
        out.println("<head>");
        out.println("<meta charset='EUC-KR'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>dcustudy</title>");
        out.println("<link rel='stylesheet' href='" + ctx + "/css/common.css'>");
        out.println("<link rel='stylesheet' href='" + ctx + "/css/profile.css'>");
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

        // main (프로필)
        out.println("<main class='profile'>");
        out.println("<div class='welcome-container'>");
        out.println("<img src='" + ctx + "/img/user.png' alt='프로필이미지' class='profile-img'>");
        out.println("<h2>" + id + "님 환영합니다!</h2>");
        out.println("<p>서비스에 오신것을 진심으로 환영합니다.</p>");
        out.println("<p>오늘도 즐거운 하루 보내세요!</p>");
        out.println("</div>");
        out.println("</main>");

        // footer
        out.println("<footer class='layout-footer'>");
        out.println("Copyright 2025. DCU practice.");
        out.println("</footer>");

        out.println("</body>");
        out.println("</html>");
        out.flush();
		//doGet(request, response);
	}
    private String nvl(String s) {
    	if (s == null){
    		s = "";
    	}
    	return s;
    }
}
