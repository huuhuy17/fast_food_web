package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TrangChu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Trang Chu</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("        <link id=\"link\" rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--bat dau of menu-->\n");
      out.write("        <nav class=\"dieu-huong dieu-huong-con-md dieu-huong-toi bg-toi\">\n");
      out.write("            <div class=\"o-chua\">\n");
      out.write("                <a class=\"thanh-dieu-huong-thuong-hieu\" href=\"TrangChu.jsp\">Đồ Ăn Nhanh</a>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <div class=\"thu-gon thanh-dieu-huong-thu-gon noi-dung-ket-thuc\" id=\"thanh-dieu-huong-vi-du-mac-dinh\">\n");
      out.write("                    <ul class=\"thanh-dieu-huong m-tu-dong\">\n");
      out.write("                        <li class=\"muc-thanh-dieu-huong\">\n");
      out.write("                            <a class=\"lien-ket-thanh-dieu-huong\" href=\"QLSanPham.jsp\">Quản lý</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"muc-thanh-dieu-huong\">\n");
      out.write("                            <a class=\"lien-ket-thanh-dieu-huong\" href=\"GioiThieu.jsp\">Giới thiệu</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"muc-thanh-dieu-huong\">\n");
      out.write("                            <a class=\"lien-ket-thanh-dieu-huong\" href=\"TrangChu.jsp\">Đăng xuất</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"muc-thanh-dieu-huong\">\n");
      out.write("                            <a class=\"lien-ket-thanh-dieu-huong\" href=\"DangNhap.jsp\">Đăng nhập</a>\n");
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
      out.write("        </nav>\n");
      out.write("        <section class=\"jumbotron can-giua\">\n");
      out.write("            <div class=\"o-chua\">\n");
      out.write("                <h1 class=\"jumbotron-phan-dau\">Siêu thị đồ ăn nhanh chất lượng cao</h1>\n");
      out.write("                <p class=\"phan-dau van-ban-dau mb-0\">Uy tín tạo nên thương hiệu với hơn 10 năm cung cấp các sản phầm giày nhập từ mọi miền trên Thế Giới</p>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- ket thuc menu-->\n");
      out.write("        <div class=\"o-chua\">\n");
      out.write("            <div class=\"hang\">\n");
      out.write("                <div class=\"cot\">\n");
      out.write("                    <nav aria-label=\"menu-dieu-huong\">\n");
      out.write("                        <nav aria-label=\"menu-dieu-huong\">\n");
      out.write("                        <ol class=\"menu-dieu-huong\">\n");
      out.write("                            <li class=\"menu-dieu-huong-item\"><a href=\"Home.jsp\">Trang Chủ</a></li>\n");
      out.write("                            <li class=\"menu-dieu-huong-item\"><a href=\"#\">Chuyên mục</a></li>\n");
      out.write("                            <li class=\"menu-dieu-huong-item hoat-dong\" aria-current=\"#\">Chuyên mục con</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"o-chua\">\n");
      out.write("            <div class=\"hang\">\n");
      out.write("                <div class=\"cot-sm-3\">\n");
      out.write("                    <div class=\"the  bg-sang mb-3\">\n");
      out.write("                        <div class=\"tieu-de-the bg-chinh chu-trang viet-hoa\"><i class=\"fa fa-list\"></i> Chuyên mục</div>\n");
      out.write("                        <ul class=\"danh-sach-nhom khoi-danh-muc\">\n");
      out.write("                            <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCC}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"o\">\n");
      out.write("                                <li class=\"danh-sach-nhom-item chu-trang\"><a href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                            </c:forEach>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"the  bg-sang mb-3\">\n");
      out.write("                        <div class=\"tieu-de-the bg-thanh-cong chu-trang viet-hoa\">Sản phẩm bán chạy</div>\n");
      out.write("                        <div class=\"the-body\">\n");
      out.write("                            <img class=\"anh-tinh\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                            <h5 class=\"tieu-de-the\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\n");
      out.write("                            <p class=\"chu-the\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <p class=\"gia-tien\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" $</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"cot-sm-9\">\n");
      out.write("                    <div class=\"hang\">\n");
      out.write("                        <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"o\">\n");
      out.write("                            <div class=\"cot-12 cot-md-6 cot-lg-4\">\n");
      out.write("                                <div class=\"the\">\n");
      out.write("                                    <img class=\"the-anh-tren\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"the-hinh-anh\">\n");
      out.write("                                    <div class=\"the-body\">\n");
      out.write("                                        <h4 class=\"tieu-de-the hien-thi-chu\"><a href=\"#\" title=\"Xem san pham\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></h4>\n");
      out.write("                                        <p class=\"chu-the hien-thi-chu\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                        <div class=\"hang\">\n");
      out.write("                                            <div class=\"cot\">\n");
      out.write("                                                <p class=\"nut nut-nguy-hien khoi-nut\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" $</p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"cot\">\n");
      out.write("                                                <a href=\"#\" class=\"nut nut-thanh-cong khoi-nut\">Add to cart</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </c:forEach>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Chan trang -->\n");
      out.write("        <footer class=\" van-ban-light\">\n");
      out.write("            <div class=\"o-chua\">\n");
      out.write("                <div class=\"hang\">\n");
      out.write("                    <div class=\"cot-md-3 cot-lg-4 cot-xl-3\">\n");
      out.write("                        <h5>About</h5>\n");
      out.write("                        <hr class=\"bg-trang mb-2 mt-0 d-inline-khoi mx-tu-dong w-25\">\n");
      out.write("                        <p class=\"mb-0\">\n");
      out.write("                            Sản phẩm chất lượng cao phù hợp với mọi lứa tuổi người tiêu dùng.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"cot-md-2 cot-lg-2 cot-xl-2 mx-tu-dong\">\n");
      out.write("                        <h5>Informations</h5>\n");
      out.write("                        <hr class=\"bg-trang mb-2 mt-0 d-inline-khoi mx-tu-dong w-25\">\n");
      out.write("                        <ul class=\"danh-sach-khong-kieu\">\n");
      out.write("                            <li><a href=\"\">Link 1</a></li>\n");
      out.write("                            <li><a href=\"\">Link 2</a></li>\n");
      out.write("                            <li><a href=\"\">Link 3</a></li>\n");
      out.write("                            <li><a href=\"\">Link 4</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"cot-md-3 cot-lg-2 cot-xl-2 mx-tu-dong\">\n");
      out.write("                        <h5>Others links</h5>\n");
      out.write("                        <hr class=\"bg-trang mb-2 mt-0 d-inline-khoi mx-tu-dong w-25\">\n");
      out.write("                        <ul class=\"danh-sach-khong-kieu\">\n");
      out.write("                            <li><a href=\"\">Link 1</a></li>\n");
      out.write("                            <li><a href=\"\">Link 2</a></li>\n");
      out.write("                            <li><a href=\"\">Link 3</a></li>\n");
      out.write("                            <li><a href=\"\">Link 4</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"cot-md-4 cot-lg-3 cot-xl-3\">\n");
      out.write("                        <h5>Contact</h5>\n");
      out.write("                        <hr class=\"bg-trang mb-2 mt-0 d-inline-khoi mx-tu-dong w-25\">\n");
      out.write("                        <ul class=\"danh-sach-khong-kieu\">\n");
      out.write("                            <li><i class=\"fa fa-nha mr-2\"></i> Công ty của tôi</li>\n");
      out.write("                            <li><i class=\"fa fa-thu-dien-tu mr-2\"></i> ihado.tranthuhoai@gmail.com</li>\n");
      out.write("                            <li><i class=\"fa fa-dien-thoai mr-2\"></i> + 33 12 14 15 16</li>\n");
      out.write("                            <li><i class=\"fa fa-in mr-2\"></i> + 33 12 14 15 16</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cot-12 ban-quyen mt-3\">\n");
      out.write("                        <p class=\"noi-trai\">\n");
      out.write("                            <a href=\"#\">Trở lại đầu trang</a>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
