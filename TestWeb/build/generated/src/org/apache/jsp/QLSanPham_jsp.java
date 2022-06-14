package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class QLSanPham_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Quản lý sản phẩm</title>\n");
      out.write("        <link href=\"css/QuanLy.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("            img{\n");
      out.write("                width: 200px;\n");
      out.write("                height: 120px;\n");
      out.write("            }\n");
      out.write("            .cot6{\n");
      out.write("                padding-bottom: 20px ;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"noidung\">\n");
      out.write("            <div class=\"bang-chua\">\n");
      out.write("                <div class=\"tieu-de-bang\">\n");
      out.write("                    <div class=\"hang\">\n");
      out.write("                        <div>\n");
      out.write("                            <h2>Quản lý  <b> món ăn </b></h2>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"cot6\">\n");
      out.write("                            <a href=\"#nhanvien-them\"  class=\"nut nut-thanhcong\" data-toggle=\"modal\"><button style =\"color: blue;\">Thêm món ăn</button></a>\n");
      out.write("                            <a href=\"#nhanvien-xoa\" class=\"nut nut-nguyhiem\" data-toggle=\"modal\"><button style =\"color : blue;\">Xóa món ăn</button></a>\t\t\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <table class=\"bang bang-ke bang-hover\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>\n");
      out.write("                                <span class=\"hop-tuy-chinh\">\n");
      out.write("                                    <input type=\"checkbox\" id=\"chon\">\n");
      out.write("                                    <label for=\"chon\"></label>\n");
      out.write("                                </span>\n");
      out.write("                            </th>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>Tên</th>\n");
      out.write("                            <th>Ảnh</th>\n");
      out.write("                            <th>Giá</th>\n");
      out.write("                            <th>Mô tả</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                <div class=\"sua-chua\">\n");
      out.write("                    <div class=\"van-ban-goi-y\">Hiển thị <b>5</b> của <b>25</b> mục</div>\n");
      out.write("                    <ul class=\"phan_trang\">\n");
      out.write("                        <li class=\"trang-item vo-hieu-hoa\"><a href=\"#\">Truoc</a></li>\n");
      out.write("                        <li class=\"trang-item\"><a href=\"#\" class=\"trang-link\">1</a></li>\n");
      out.write("                        <li class=\"trang-item\"><a href=\"#\" class=\"trang-link\">2</a></li>\n");
      out.write("                        <li class=\"trang-item hoat-dong\"><a href=\"#\" class=\"trang-link\">3</a></li>\n");
      out.write("                        <li class=\"trang-item\"><a href=\"#\" class=\"trang-link\">4</a></li>\n");
      out.write("                        <li class=\"trang-item\"><a href=\"#\" class=\"trang-link\">5</a></li>\n");
      out.write("                        <li class=\"trang-item\"><a href=\"#\" class=\"tranglink\">sau</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div class=\"bieu-mau\">\n");
      out.write("            <div id=\"nhanvien-them\" class=\"phuong-thuc fade\">\n");
      out.write("                <div class=\"hop-thoai\">\n");
      out.write("                    <div class=\"phuongthuc-noidung\">\n");
      out.write("                        <form action=\"add\" method=\"post\">\n");
      out.write("                            <div class=\"phuong-thuc-header\">\t\t\t\t\t\t\n");
      out.write("                                <h4 class=\"phuong-thuc-tieu-de\">Thêm món ăn</h4>\n");
      out.write("                                <button type=\"button\" class=\"dong\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"phuong-thuc-body\">\t\t\t\t\t\n");
      out.write("                                <div class=\"form-nhom\">\n");
      out.write("                                    <label>Ten</label>\n");
      out.write("                                    <input name=\"name\" type=\"text\" class=\"form-dieu-khien\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-nhom\">\n");
      out.write("                                    <label>Anh</label>\n");
      out.write("                                    <input name=\"image\" type=\"text\" class=\"form-dieu-khien\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-nhom\">\n");
      out.write("                                    <label>Gia</label>\n");
      out.write("                                    <input name=\"price\" type=\"text\" class=\"form-dieu-khien\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-nhom\">\n");
      out.write("                                    <label>Tiêu đề</label>\n");
      out.write("                                    <textarea name=\"title\" class=\"form-dieu-khien\" required></textarea>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-nhom\">\n");
      out.write("                                    <label>Miêu tả</label>\n");
      out.write("                                    <textarea name=\"description\" class=\"form-dieu-khien\" required></textarea>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-nhom\">\n");
      out.write("                                    <label>Danh mục</label>\n");
      out.write("                                    <select name=\"category\" class=\"form-select\" aria-label=\"Default select example\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"phuong-thuc-footer\">\n");
      out.write("                                <input type=\"button\" class=\"nut nut-macdinh\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                                <input type=\"submit\" class=\"nut nut-thanhcong\" value=\"Add\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                <!--       Nhân viên sửa lỗi-->\n");
      out.write("                <div id=\"nhanvien-chinhsua\" class=\"phuong-thuc phai-mau\">\n");
      out.write("                    <form class=\"hop-thoai\" method=\"post\">\n");
      out.write("                        <div class=\"phuong-thuc-noi-dung\">\n");
      out.write("                            <div class=\"phuong-thuc-header\">\t\t\t\t\t\t\n");
      out.write("                                <h4 class=\"phuong-thuc-tieu-de\" style=\"padding-left:30px;\">Nhân viên chỉnh sửa</h4>\n");
      out.write("                                <button type=\"button\" class=\"dong\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"phuong-thuc-body\">\t\t\t\t\t\n");
      out.write("                                <div class=\"form-nhom\">\n");
      out.write("                                    <label>Ten</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-dieu-khien\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-nhom\">\n");
      out.write("                                    <label>Email</label>\n");
      out.write("                                    <input type=\"email\" class=\"form-dieu-khien\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-nhom\">\n");
      out.write("                                    <label>Địa chỉ</label>\n");
      out.write("                                    <textarea  type=\"text\" class=\"form-dieu-khien\" required></textarea>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-nhom\">\n");
      out.write("                                    <label>Điện thoại</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-dieu-khien\" required>\n");
      out.write("                                </div>\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"phuong-thuc-footer\">\n");
      out.write("                                <input type=\"button\" class=\"nut nut-macdinh\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                                <input type=\"submit\" class=\"nut nut-thongtin\" value=\"Save\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div id=\"nhanvien-xoa\" class=\"phuong-thuc phai-mau\">\n");
      out.write("                        <form class=\"hop-thoai\">\n");
      out.write("                            <div class=\"phuong-thuc-noi-dung\">\n");
      out.write("                                <form>\n");
      out.write("                                    <div class=\"phuong-thuc-header\">\t\t\t\t\t\t\n");
      out.write("                                        <h4 class=\"phuong-thuc-tieu-de\">Xóa món ăn</h4>\n");
      out.write("                                        <button type=\"button\" class=\"dong\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"phuong-thuc-body\">\t\t\t\t\t\n");
      out.write("                                        <p>Bạn có muốn xóa mục này không ?</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"phuong-thuc-footer\">\n");
      out.write("                                        <input type=\"button\" class=\"nut nut-macdinh\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                                        <input type=\"submit\" class=\"nut nut-nguyhiem\" value=\"Delete\">\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        <a href=\"TrangChu.jsp\" style=\"margin : 10px;\"><button type=\"button\" color =\"blue\">Trở lại trang chủ</button>\n");
      out.write("        <!--<script src=\"js/manager.js\" type=\"text/javascript\"></script>-->\n");
      out.write("        \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    <span class=\"hop-tuy-chinh\">\n");
          out.write("                                        <input type=\"checkbox\" id=\"checkbox1\" name=\"options[]\" value=\"1\">\n");
          out.write("                                        <label for=\"checkbox1\"></label>\n");
          out.write("                                    </span>\n");
          out.write("                                </td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>\n");
          out.write("                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                </td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" $</td>\n");
          out.write("                                <td>\n");
          out.write("                                    <a href=\"#nhanvien-them\"  class=\"chinhsua\" data-toggle=\"modal\"> </a>\n");
          out.write("                                    <a href=\"#nhanvien-xoa\" class=\"xoa\" data-toggle=\"modal\"> </a>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
