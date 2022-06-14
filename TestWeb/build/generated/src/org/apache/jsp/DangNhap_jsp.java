package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DangNhap_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <link href=\"css/DangNhap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <title>Đăng nhập</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"form-dang-nhap\">\n");
      out.write("            <form class=\"form-DN\" action=\"login\" method=\"post\">\n");
      out.write("                <h1 style=\"text-align: center\"> Đăng nhập</h1>\n");
      out.write("                \n");
      out.write("                <input name=\"user\"  type=\"text\" id=\"inputEmail\" class=\"form-dieu-khien\" placeholder=\"Tên đăng nhập\" style =\"width:90% \">\n");
      out.write("                <input name=\"pass\"  type=\"password\" id=\"inputPassword\" class=\"form-dieu-khien\" placeholder=\"Mật khẩu\" style =\"width:90% \">\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <input name=\"remember\" value=\"1\" type=\"checkbox\" class=\"form-check-input\" id=\"kiemtra1\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"kiemtra1\">Ghi nhớ</label>\n");
      out.write("                </div>\n");
      out.write("                <hr style=\"width:85%;\">\n");
      out.write("                <button  type=\"submit\"> Đăng nhập</button>\n");
      out.write("                <hr style=\"width:85%;\">\n");
      out.write("                <button  type=\"button\" id=\"nut_DK\" > Đăng ký tài khoản mới</button>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <form action=\"signup\" method=\"post\" class=\"form-dang-ky\">\n");
      out.write("                <h1 style=\"text-align: center\"> Đăng ký</h1>\n");
      out.write("                <input name=\"user\" type=\"text\" id=\"ten-nd\" class=\"form-dieu-khien\" placeholder=\"Tên đăng nhập\" style =\"width:90% \">\n");
      out.write("                <input name=\"pass\" type=\"password\" id=\"matkhau-nd\" class=\"form-dieu-khien\" placeholder=\"Mật khẩu\" style =\"width:90% \">\n");
      out.write("                <input name=\"repass\" type=\"password\" id=\"nhaplai-mk\" class=\"form-dieu-khien\" placeholder=\"Nhập lại mật khẩu\" style =\"width:90% \">\n");
      out.write("\n");
      out.write("                <button type=\"submit\"> Đăng ký</button>\n");
      out.write("                <a href=\"#\" id=\"boqua_DN\"> Trở lại</a>\n");
      out.write("            </form>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function toggleResetPswd(e) {\n");
      out.write("                e.preventDefault();\n");
      out.write("                $('#form-dang-nhap .form-DN').toggle() // display:block or none\n");
      out.write("                $('#form-dang-nhap .form-cai-lai').toggle() // display:block or none\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function toggleSignUp(e) {\n");
      out.write("                e.preventDefault();\n");
      out.write("                $('#form-dang-nhap .form-DN').toggle(); // display:block or none\n");
      out.write("                $('#form-dang-nhap .form-dang-ky').toggle(); // display:block or none\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $(() => {\n");
      out.write("                // Login Register Form\n");
      out.write("                $('#form-dang-nhap #forgot_pswd').click(toggleResetPswd);\n");
      out.write("                $('#form-dang-nhap #cancel_reset').click(toggleResetPswd);\n");
      out.write("                $('#form-dang-nhap #nut_DK').click(toggleSignUp);\n");
      out.write("                $('#form-dang-nhap #boqua_DN').click(toggleSignUp);\n");
      out.write("            })\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
