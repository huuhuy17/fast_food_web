package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GioiThieu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Giới thiệu</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("            .noi-dung {\n");
      out.write("                margin: 50px 100px;\n");
      out.write("                /*width: 100%;*/\n");
      out.write("                color: #000;\n");
      out.write("                font-size: 16px;\n");
      out.write("                text-align: justify;\n");
      out.write("            }\n");
      out.write("            #anh1 {\n");
      out.write("                display: block; \n");
      out.write("                margin-left: auto; \n");
      out.write("                margin-right: auto;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"noi-dung\">\n");
      out.write("            <p class=\"noi-dung-1\">Thức ăn nhanh (tiếng Anh gọi là fast food), là thuật ngữ chỉ thức ăn có thể được chế biến và phục vụ cho người ăn rất nhanh chóng. Trong khi bất kỳ bữa ăn với ít thời gian chuẩn bị có thể được coi là thức ăn nhanh, thông thường thuật ngữ này nói đến thực phẩm được bán tại một nhà hàng hoặc cửa hàng với các thành phần làm nóng trước hoặc được nấu sẵn, và phục vụ cho khách hàng trong một hình thức đóng gói mang đi. Thuật ngữ fast food đã được công nhận trong từ điển tiếng anh Merriam - Webster năm 1951.\n");
      out.write("\n");
      out.write("Cửa hàng có thể được viết tắt hoặc các quán, có thể có hoặc không có chỗ ngồi cho thực khách, hay nhà hàng thức ăn nhanh (còn gọi là nhà hàng phục vụ nhanh chóng). Hoạt động quyền nhượng thương mại là một phần của chuỗi nhà hàng có thực phẩm được tiêu chuẩn hóa được vận chuyển đến các nhà hàng từ các địa điểm trung tâm.\n");
      out.write("\n");
      out.write("Các yêu cầu về vốn tham gia vào việc mở một nhà hàng thức ăn nhanh không nhượng quyền thương mại tương đối thấp. Nhà hàng phục vụ thực khách ngồi ăn có tỷ lệ cao hơn nhiều, nơi mà khách hàng có xu hướng ngồi và có đơn đặt hàng của họ mang lại cho họ trong một bầu không khí dường như cao cấp hơn, có thể được biết đến trong một số lĩnh vực như Quán ăn nhanh.\n");
      out.write("            </p>\n");
      out.write("            <img id=\"anh1\" src=\"img/anh1.jpg\" alt=\"quan-an\">\n");
      out.write("            <p class=\"noi-dung-1\">Trong khi người phương Tây đang cố gắng “lành mạnh hóa” các bữa ăn bằng cách tránh dùng thức ăn nhanh (fastfood) thì người châu Á nói chung chuộng thức ăn phương Tây hơn các món châu Á.\n");
      out.write("\n");
      out.write("Một nhà nghiên cứu người Úc gốc Á Mabel Kwong đã có bài viết về nguyên nhân của việc đi “lệch hướng” giữa hai nền văn hóa trên.\n");
      out.write("\n");
      out.write("Đầu tiên khi nghĩ đến ẩm thực châu Á, người ta nghĩ đến ngay hình ảnh của một tô mì chan nước dùng nóng hổi phục vụ tại bàn trong nhà hàng hay phổ biến hơn là các quán ăn xập xệ. Cách chuẩn bị món ăn của người Á châu là đầu bếp dùng tay trực tiếp để lấy mì, lấy rau và xếp thịt vào tô, sau đó chan nước dùng. Họ không chú trọng nhiều đến an toàn vệ sinh.\n");
      out.write("\n");
      out.write("Trái lại với người châu Á, đồ ăn phương Tây thường xuyên được đóng gói ngay tại nhà bếp nên trông có vẻ sạch sẽ hơn, khiến họ có cảm giác đó là thức ăn hạng A và yên tâm ăn thoải mái.\n");
      out.write("\n");
      out.write("Thứ hai, người châu Á cũng cho rằng việc ăn đồ Tây còn là cách biểu hiện vị thế đẳng cấp, phong cách sành điệu và thậm chí định vị họ là người giàu có, sang trọng, có gu ẩm thực. Miếng bò bít tết trang trí đẹp mắt trên dĩa trắng phau, món cá chiên, khoai tây chiên hay pizza lạ lẫm đã rất thành công trong việc “đốt cháy” túi tiền eo hẹp của những người có thu nhập trung bình.\n");
      out.write("\n");
      out.write("Một bữa ăn no tại McDonald’s có giá khoảng 10 USD trong khi một tô mì/bún/phở châu Á thuộc hàng khá cao cấp, trong nhà hàng máy lạnh giá chỉ khoảng 6-7 USD.\n");
      out.write("\n");
      out.write("Lý do khác nữa là một bộ phận giới trẻ châu Á muốn khẳng định mình và tự tách mình ra khỏi nền văn hóa truyền thống. Ngày nay, đồ ăn Tây được biết đến như một thứ “thời trang của giới trẻ Trung Quốc”. Ăn đồ Tây sẽ đẳng cấp hơn những người châu Á bình thường khác. Tiêu chuẩn phương Tây được coi là “của quý” trong nhiều quốc gia châu Á, chẳng hạn như các cô gái Á châu thường thích làm da trắng hơn cho giống Tây hay khoe khả năng nói tiếng Tây lưu loát.\n");
      out.write("\n");
      out.write("Nhiều trẻ em châu Á bị cha mẹ ép ăn những món truyền thống mà chúng ghét cay ghét đắng, như cà tím hay bắp cải. Chúng ăn như những đứa trẻ ngoan nghe lời cha mẹ nhưng vẫn cảm thấy không hài lòng và “nổi loạn” bằng cách ăn càng nhiều đồ Tây càng tốt.\n");
      out.write("\n");
      out.write("Các yếu tố phi văn hóa cũng giúp giải thích tại sao người châu Á thích ăn đồ ăn phương Tây. Trong một thế giới toàn cầu hóa, nở rộ phong trào nhượng quyền thương mại thì các chuỗi nhà hàng lắm tiền có đủ tiềm lực để đặt các chi nhánh của mình trên khắp đường phố, những địa điểm thuận lợi, bắt mắt để gây chú ý và rồi “gây nghiện” cho những người thích sự hiện đại. Rất tự nhiên, khẩu vị của thực khách cũng thay đổi dần theo đó.\n");
      out.write("\n");
      out.write("Trong khi châu Á lý tưởng hóa fastfood nói riêng hay đồ Tây nói chung thì dân bản địa phương Tây có hàng chục lý do để “tẩy chay” fastfood, theo trang buzzfeed.com. Họ nhận ra rằng không chỉ hamburger mà cả salad cũng là những món ăn độc hại, dư béo, quá nhiều mayonaise… sẽ giết chết họ trong một ngày nào đó.\n");
      out.write("\n");
      out.write("Thêm nữa là gian lận trong quảng cáo vì chiếc burger thực tế hoàn toàn khác xa hình ảnh minh họa, các video quảng cáo ồn ào phát liên tục trong nhà hàng, sáng tạo ra các món sandwich kết hợp các nguyên liệu kỳ dị. Đặc biệt nhất là “làm hỏng” một thế hệ trẻ em béo ụ vì căn bệnh béo phì.\n");
      out.write("\n");
      out.write("Thậm chí đến nay Nhật Bản đã nếm “trái đắng” từ việc Tây hóa các yếu tố ẩm thực nhiều béo và calo. Thời báo Nhật Bản báo động tình trạng béo phì gia tăng ngay tại quốc gia được mệnh danh có nền ẩm thực lành mạnh nhất thế giới.</p>\n");
      out.write("        <img id=\"anh1\" src=\"img/anh2.jpg\" alt=\"nguoi-an\">\n");
      out.write("        </div>\n");
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
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
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
}
