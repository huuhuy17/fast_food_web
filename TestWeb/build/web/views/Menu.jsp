<%-- 
    Document   : Nemu
    Created on : May 14, 2022, 8:36:09 PM
    Author     : ihado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--bat dau of menu-->
<nav class="dieu-huong dieu-huong-con-md dieu-huong-toi bg-toi">
    <div class="o-chua">
        <a class="thanh-dieu-huong-thuong-hieu" href="TrangChu.jsp">Đồ Ăn Nhanh</a>


        <div class="thu-gon thanh-dieu-huong-thu-gon noi-dung-ket-thuc" id="thanh-dieu-huong-vi-du-mac-dinh">
            <ul class="thanh-dieu-huong m-tu-dong">
                <li class="muc-thanh-dieu-huong">
                    <a class="lien-ket-thanh-dieu-huong" href="QLSanPham.jsp">Quản lý</a>
                </li>
                <li class="muc-thanh-dieu-huong">
                    <a class="lien-ket-thanh-dieu-huong" href="GioiThieu.jsp">Giới thiệu</a>
                </li>
                <li class="muc-thanh-dieu-huong">
                    <a class="lien-ket-thanh-dieu-huong" href="TrangChu.jsp">Đăng xuất</a>
                </li>
                <li class="muc-thanh-dieu-huong">
                    <a class="lien-ket-thanh-dieu-huong" href="DangNhap.jsp">Đăng nhập</a>
                </li>
            </ul>

            <form action="search" method="post" class="bieu-mau cua-toi-2 blog-cua-toi">
                <div class="dau-vao-nhom dau-vao-nhom-sm">
                    <input value="${tuKhoaCu}" name="txt" type="text" class="bieu-mau-kiem-soat" aria-label="Small" aria-describedby="inputGroup-sizing-sm" placeholder="Search...">
                    <div class="dau-vao-nhom-phu">
                        <button type="submit" class="nut nut-phu nut-so">
                            <i class="fa fa-search">tim kiem</i>
                        </button>
                    </div>
                </div>
                <a class="nut nut-thanh-cong nut-sm ml-3" href="show">

                    <i class="fa fa-shopping-cart"></i> Giỏ hàng
                    <span class="huy-hieu den-huy-hieu">3</span>
                </a>
            </form>
        </div>
    </div>
</nav>
<section class="jumbotron can-giua">
    <div class="o-chua">
        <h1 class="jumbotron-phan-dau">Siêu thị đồ ăn nhanh chất lượng cao</h1>
        <p class="phan-dau van-ban-dau mb-0">Uy tín tạo nên thương hiệu với hơn 10 năm cung cấp các sản phầm giày nhập từ mọi miền trên Thế Giới</p>
    </div>
</section>
<!-- ket thuc menu-->


