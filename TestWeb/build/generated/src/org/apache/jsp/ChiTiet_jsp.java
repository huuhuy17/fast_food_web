package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ChiTiet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Chi tiết món ăn</title>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("            .thu-vien-chua .anh-lon img {\n");
      out.write("                height: 450px;\n");
      out.write("                width: auto;\n");
      out.write("                display: inline-block;\n");
      out.write("                cursor: zoom-in;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .thu-vien-chua .anh-nho .item-thu-vien {\n");
      out.write("                width: 60px;\n");
      out.write("                height: 60px;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                margin: 7px 2px;\n");
      out.write("                display: inline-block;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .thu-vien-chua .anh-nho {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .thu-vien-chua .anh-nho img {\n");
      out.write("                max-width: 100%;\n");
      out.write("                max-height: 100%;\n");
      out.write("                object-fit: cover;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: zoom-in;\n");
      out.write("            }\n");
      out.write("            .anh-lon img{\n");
      out.write("                width: 100% !important;\n");
      out.write("                height: auto !important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"o-chua\">\n");
      out.write("                <div class=\"hang\">\n");
      out.write("                    <div class=\"cot-sm-3\">\n");
      out.write("                        <div class=\"the bg-sang mb-3\">\n");
      out.write("                            <div class=\"tieu-de-the bg-chinh chu-trang viet-hoa\"><i class=\"fa fa-list\"></i> Chuyên mục</div>\n");
      out.write("                            <ul class=\"danh-sach-nhom khoi-danh-muc\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"the bg-sang mb-3\">\n");
      out.write("                        <div class=\"tieu-de-the bg-thanh-cong chu-trang viet-hoa\">Sản phẩm bán chạy</div>\n");
      out.write("                        <div class=\"the-body\">\n");
      out.write("                            <img class=\"anh-tinh tieu-de-the\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${last.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                            <h5 class=\"tieu-de-the\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${last.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\n");
      out.write("                            <p class=\"chu-the\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${last.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <p class=\"gia-tien\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${last.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" $</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cot-sm-9\">\n");
      out.write("                    <div class=\"o-chua\">\n");
      out.write("                        <div class=\"the\">\n");
      out.write("                            <div class=\"hang\">\n");
      out.write("                                <aside class=\"cot-sm-5 vien-phai\">\n");
      out.write("                                    <article class=\"thu-vien-chua\"> \n");
      out.write("                                        <div class=\"anh-lon\">\n");
      out.write("                                            <div> <a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></a></div>\n");
      out.write("                                        </div> <!-- slider-product.// -->\n");
      out.write("                                        <div class=\"anh-nho\">\n");
      out.write("                                            <div class=\"item-thu-vien\"> <img src=\"anh1.jpg\"> </div>\n");
      out.write("                                            <div class=\"item-thu-vien\"> <img src=\"\"> </div>\n");
      out.write("                                            <div class=\"item-thu-vien\"> <img src=\"\"> </div>\n");
      out.write("                                            <div class=\"item-thu-vien\"> <img src=\"\"> </div>\n");
      out.write("                                        </div> <!-- slider-nav.// -->\n");
      out.write("                                    </article> <!-- thu-vien-chua .end// -->\n");
      out.write("                                </aside>\n");
      out.write("                                <aside class=\"cot-sm-7\">\n");
      out.write("                                    <article class=\"the-body p-5\">\n");
      out.write("                                        <h3 class=\"tieu-de mb-3\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("\n");
      out.write("                                        <p class=\"gia-chi-tiet\"> \n");
      out.write("                                            <span class=\"gia h3 canh-bao\"> \n");
      out.write("                                                <span class=\"tien-te\">Tên món ăn</span><span class=\"so\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                                            </span> \n");
      out.write("                                            <!--<span>/per kg</span>--> \n");
      out.write("                                        </p> <!-- price-detail-wrap .// -->\n");
      out.write("                                        <dl class=\"mo-ta-san-pham\">\n");
      out.write("                                            <dt>Mô tả</dt>\n");
      out.write("                                            <dd><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p></dd>\n");
      out.write("                                        </dl>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <hr>\n");
      out.write("                                        <div class=\"hang\">\n");
      out.write("                                            <div class=\"cot-sm-5\">\n");
      out.write("                                                <dl class=\"so-luong so-luong-trong-dong\">\n");
      out.write("                                                    <dt>Số lượng: </dt>\n");
      out.write("                                                    <dd>\n");
      out.write("                                                        <select class=\"bieu-mau-kiem-soat bieu-mau-kiem-soat-sm\" style=\"width:70px;\">\n");
      out.write("                                                            <option> 1 </option>\n");
      out.write("                                                            <option> 2 </option>\n");
      out.write("                                                            <option> 3 </option>\n");
      out.write("                                                        </select>\n");
      out.write("                                                    </dd>\n");
      out.write("                                                </dl>  <!-- item-property .// -->\n");
      out.write("                                            </div> <!-- col.// -->\n");
      out.write("                                            \n");
      out.write("                                        </div> <!-- row.// -->\n");
      out.write("                                        <hr>\n");
      out.write("                                        <a href=\"#\" class=\"nut nut-lg nut-chinh viet-hoa\"> Mua ngay </a>\n");
      out.write("                                        <a href=\"#\" class=\"nut nut-lg nut-phac-thao-chinh viet-hoa\"> <i class=\"fas fa-gio-hang\"></i> Thêm vào giỏ hàng </a>\n");
      out.write("                                    </article> <!-- card-body.// -->\n");
      out.write("                                </aside> <!-- col.// -->\n");
      out.write("                            </div> <!-- row.// -->\n");
      out.write("                        </div> <!-- card.// -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer class=van-ban-light>\n");
      out.write("            <div class=\"o-chua\">\n");
      out.write("                <div class=\"hang\">\n");
      out.write("                    <div class=\"cot-md-3 cot-lg-4 cot-xl-3\">\n");
      out.write("                        <h5>Về chúng tôi</h5>\n");
      out.write("                        <hr class=\"bg-trang mb-2 mt-0 d-inline-khoi mx-tu-dong w-25\">\n");
      out.write("                        <p class=\"mb-0\">\n");
      out.write("                            Sản phẩm chất lượng cao phù hợp với mọi lứa tuổi người tiêu dùng.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"cot-md-2 cot-lg-2 cot-xl-2 mx-tu-dong\">\n");
      out.write("                        <h5>Thông tin</h5>\n");
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
      out.write("                        <h5>Liên kết khác</h5>\n");
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
      out.write("                            <li><i class=\"fa fa-thu-dien-tu mr-2\"></i> ihado.tranthuhoaiexample.com</li>\n");
      out.write("                            <li><i class=\"fa fa-dien-thoai mr-2\"></i> + 33 12 14 15 16</li>\n");
      out.write("                            <li><i class=\"fa fa-in mr-2\"></i> + 33 12 14 15 16</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cot-12 ban-quyen mt-3\">\n");
      out.write("                        <p class=\"noi-trai\">\n");
      out.write("                            <a href=\"#\">Về đầu trang</a>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ALLCate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <li class=\"danh-sach-nhom-item chu-trang\"><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                            ");
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
