package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GioHang_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Giỏ hàng</title>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("           \n");
      out.write("            .text-center {\n");
      out.write("                text-align: center!important;\n");
      out.write("            }   \n");
      out.write("\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"gio-hang\">\n");
      out.write("                <div class=\"px-4 px-lg-0\">\n");
      out.write("\n");
      out.write("                    <div class=\"pb-5\">\n");
      out.write("                        <div class=\"o-chua\">\n");
      out.write("                            <div class=\"hang\">\n");
      out.write("                                <div class=\"cot-lg-12 p-5 bg-trang lam-tron do-bong mb-5\">\n");
      out.write("\n");
      out.write("                                    <!-- Shopping cart table -->\n");
      out.write("                                    <div class=\"bang-responsive\">\n");
      out.write("                                        <table class=\"bang\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th scope=\"col\" class=\"vien-0 bg-sang\">\n");
      out.write("                                                        <div class=\"p-2 px-3 viet-hoa\">Đồ ăn</div>\n");
      out.write("                                                    </th>\n");
      out.write("                                                    <th scope=\"col\" class=\"vien-0 bg-sang\">\n");
      out.write("                                                        <div class=\"py-2 viet-hoa\">Đơn Giá</div>\n");
      out.write("                                                    </th>\n");
      out.write("                                                    <th scope=\"col\" class=\"vien-0 bg-sang\">\n");
      out.write("                                                        <div class=\"py-2 viet-hoa\">Số Lượng</div>\n");
      out.write("                                                    </th>\n");
      out.write("                                                    <th scope=\"col\" class=\"vien-0 bg-sang\">\n");
      out.write("                                                        <div class=\"py-2 viet-hoa\">Xóa</div>\n");
      out.write("                                                    </th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            <tbody>\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- End -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"hang py-5 p-4 bg-trang lam-tron do-bong d-flex\">\n");
      out.write("                            <div class=\"cot-lg-6\">\n");
      out.write("                                <div class=\"bg-sang ma-giam-gia px-4 py-3 viet-hoa chu-in-dam\">Mã giảm giá</div>\n");
      out.write("                                <div class=\"p-4\">\n");
      out.write("                                    <div class=\"dau-vao-nhom mb-4 vien ma-giam-gia p-2\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Nhập mã giảm giá\" aria-describedby=\"button-addon3\" class=\"bieu-mau-kiem-soat vien-0\" style=\"margin-bottom:10px;\">\n");
      out.write("                                        <div class=\"dau-vao-nhom-phu vien-0\" style=\"margin-left:500px;\">\n");
      out.write("                                            <button id=\"nut-su-dung\" type=\"button\" class=\"nut nut-toi px-4 ma-giam-gia\">Sử dụng</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cot-lg-6\">\n");
      out.write("                                <div class=\"bg-sang ma-giam-gia px-4 py-3 viet-hoa chu-in-dam\">Thành tiền</div>\n");
      out.write("                                <div class=\"p-4\">\n");
      out.write("                                    <ul class=\"danh-sach-khong-kieu mb-4\">\n");
      out.write("                                        <li class=\"d-flex noi-dung-can-giua py-3 vien-duoi\"><strong class=\"van-ban-dau\">Tổng tiền hàng</strong><strong>100.000</strong></li>\n");
      out.write("                                        <li class=\"d-flex noi-dung-can-giua py-3 vien-duoi\"><strong class=\"van-ban-dau\">Phí vận chuyển</strong><strong>Miễn phí</strong></li>\n");
      out.write("                                        <li class=\"d-flex noi-dung-can-giua py-3 vien-duoi\"><strong class=\"van-ban-dau\">VAT</strong><strong>10.000</strong></li>\n");
      out.write("                                        <li class=\"d-flex noi-dung-can-giua py-3 vien-duoi\"><strong class=\"van-ban-dau\">Tổng thanh toán</strong>\n");
      out.write("                                            <h5 class=\"chu-in-dam\">110.000</h5>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul><a href=\"buy\" class=\"nut nut-toi ma-giam-gia py-2 khoi-nut\">Đặt món</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("<!--        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>-->\n");
      out.write("        <!-- Footer -->\n");
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
      out.write("               \n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                <tr>\n");
          out.write("                                                    <th scope=\"hang\">\n");
          out.write("                                                        <div class=\"p-2\">\n");
          out.write("                                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" width=\"70\" class=\"anh-tinh lam-tron do-bong\">\n");
          out.write("                                                            <div class=\"ml-3 d-inline-khoi can-giua-2\">\n");
          out.write("                                                                <h5 class=\"mb-0\"> <a href=\"#\" class=\"chu-toi d-inline-khoi\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5><span class=\"van-ban-dau chu-thuong chu-nghieng\"></span>\n");
          out.write("                                                            </div>\n");
          out.write("                                                        </div>\n");
          out.write("                                                    </th>\n");
          out.write("                                                    <td class=\"can-giua-2\"><strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong></td>\n");
          out.write("                                                    <td class=\"can-giua-2\">\n");
          out.write("                                                        <a href=\"#\"><button class=\"nut-nop\">-</button></a> \n");
          out.write("                                                        <strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong>\n");
          out.write("                                                        <a href=\"#\"><button class=\"nut-them\">+</button></a>\n");
          out.write("                                                    </td>\n");
          out.write("                                                    <td class=\"can-giua-2\"><a href=\"#\" class=\"chu-toi\">\n");
          out.write("                                                            <button type=\"button\" class=\"nut nut-nguy-hien\">Xóa</button>\n");
          out.write("                                                        </a>\n");
          out.write("                                                    </td>\n");
          out.write("                                                </tr> \n");
          out.write("                                            ");
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
}
