package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<nav class=\"dieu-huong dieu-huong-con-md dieu-huong-toi bg-toi\">\n");
      out.write("            <div class=\"o-chua\">\n");
      out.write("                <a class=\"thanh-dieu-huong-thuong-hieu\" href=\"TrangChu.jsp\">Đồ Ăn Nhanh</a>\n");
      out.write("               \n");
      out.write("\n");
      out.write("                <div class=\"thu-gon thanh-dieu-huong-thu-gon noi-dung-ket-thuc\" id=\"thanh-dieu-huong-vi-du-mac-dinh\">\n");
      out.write("                    <ul class=\"thanh-dieu-huong m-tu-dong\">\n");
      out.write("                        <li class=\"muc-thanh-dieu-huong\">\n");
      out.write("                            <a class=\"lien-ket-thanh-dieu-huong\" href=\"#\">Quản lý</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"muc-thanh-dieu-huong\">\n");
      out.write("                            <a class=\"lien-ket-thanh-dieu-huong\" href=\"#\">Giới thiệu</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"muc-thanh-dieu-huong\">\n");
      out.write("                            <a class=\"lien-ket-thanh-dieu-huong\" href=\"#\">Đăng xuất</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"muc-thanh-dieu-huong\">\n");
      out.write("                            <a class=\"lien-ket-thanh-dieu-huong\" href=\"#\">Đăng nhập</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <form action=\"search\" method=\"post\" class=\"bieu-mau cua-toi-2 blog-cua-toi\">\n");
      out.write("                        <div class=\"dau-vao-nhom dau-vao-nhom-sm\">\n");
      out.write("                            <input name=\"txt\" type=\"text\" class=\"bieu-mau-kiem-soat\" aria-label=\"Small\" aria-describedby=\"inputGroup-sizing-sm\" placeholder=\"Search...\">\n");
      out.write("                            <div class=\"dau-vao-nhom-phu\">\n");
      out.write("                                <button type=\"submit\" class=\"nut nut-phu nut-so\">\n");
      out.write("                                    <i class=\"fa fa-search\">tim kiem</i>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a class=\"nut nut-thanh-cong nut-sm ml-3\" href=\"show\">\n");
      out.write("                            \n");
      out.write("                            <i class=\"fa fa-shopping-cart\"></i> Giỏ hàng\n");
      out.write("                            <span class=\"huy-hieu den-huy-hieu\">3</span>\n");
      out.write("                        </a>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("</nav>\n");
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
