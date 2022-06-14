
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Giỏ hàng</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <style>
           
            .text-center {
                text-align: center!important;
            }   

            </style>
    </head>

    <body>
        <jsp:include page="Menu.jsp"></jsp:include>
            <div class="gio-hang">
                <div class="px-4 px-lg-0">

                    <div class="pb-5">
                        <div class="o-chua">
                            <div class="hang">
                                <div class="cot-lg-12 p-5 bg-trang lam-tron do-bong mb-5">

                                    <!-- Shopping cart table -->
                                    <div class="bang-responsive">
                                        <table class="bang">
                                            <thead>
                                                <tr>
                                                    <th scope="col" class="vien-0 bg-sang">
                                                        <div class="p-2 px-3 viet-hoa">Đồ ăn</div>
                                                    </th>
                                                    <th scope="col" class="vien-0 bg-sang">
                                                        <div class="py-2 viet-hoa">Đơn Giá</div>
                                                    </th>
                                                    <th scope="col" class="vien-0 bg-sang">
                                                        <div class="py-2 viet-hoa">Số Lượng</div>
                                                    </th>
                                                    <th scope="col" class="vien-0 bg-sang">
                                                        <div class="py-2 viet-hoa">Xóa</div>
                                                    </th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${list}" var="o">
                                                <tr>
                                                    <th scope="hang">
                                                        <div class="p-2">
                                                            <img src="${o.image}" alt="" width="70" class="anh-tinh lam-tron do-bong">
                                                            <div class="ml-3 d-inline-khoi can-giua-2">
                                                                <h5 class="mb-0"> <a href="#" class="chu-toi d-inline-khoi">${o.name}</a></h5><span class="van-ban-dau chu-thuong chu-nghieng"></span>
                                                            </div>
                                                        </div>
                                                    </th>
                                                    <td class="can-giua-2"><strong>${o.price}</strong></td>
                                                    <td class="can-giua-2">
                                                        <a href="#"><button class="nut-nop">-</button></a> 
                                                        <strong>${o.amount}</strong>
                                                        <a href="#"><button class="nut-them">+</button></a>
                                                    </td>
                                                    <td class="can-giua-2"><a href="#" class="chu-toi">
                                                            <button type="button" class="nut nut-nguy-hien">Xóa</button>
                                                        </a>
                                                    </td>
                                                </tr> 
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                                <!-- End -->
                            </div>
                        </div>

                        <div class="hang py-5 p-4 bg-trang lam-tron do-bong d-flex">
                            <div class="cot-lg-6">
                                <div class="bg-sang ma-giam-gia px-4 py-3 viet-hoa chu-in-dam">Mã giảm giá</div>
                                <div class="p-4">
                                    <div class="dau-vao-nhom mb-4 vien ma-giam-gia p-2">
                                        <input type="text" placeholder="Nhập mã giảm giá" aria-describedby="button-addon3" class="bieu-mau-kiem-soat vien-0" style="margin-bottom:10px;">
                                        <div class="dau-vao-nhom-phu vien-0" style="margin-left:500px;">
                                            <button id="nut-su-dung" type="button" class="nut nut-toi px-4 ma-giam-gia">Sử dụng</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="cot-lg-6">
                                <div class="bg-sang ma-giam-gia px-4 py-3 viet-hoa chu-in-dam">Thành tiền</div>
                                <div class="p-4">
                                    <ul class="danh-sach-khong-kieu mb-4">
                                        <li class="d-flex noi-dung-can-giua py-3 vien-duoi"><strong class="van-ban-dau">Tổng tiền hàng</strong><strong>100.000</strong></li>
                                        <li class="d-flex noi-dung-can-giua py-3 vien-duoi"><strong class="van-ban-dau">Phí vận chuyển</strong><strong>Miễn phí</strong></li>
                                        <li class="d-flex noi-dung-can-giua py-3 vien-duoi"><strong class="van-ban-dau">VAT</strong><strong>10.000</strong></li>
                                        <li class="d-flex noi-dung-can-giua py-3 vien-duoi"><strong class="van-ban-dau">Tổng thanh toán</strong>
                                            <h5 class="chu-in-dam">110.000</h5>
                                        </li>
                                    </ul><a href="buy" class="nut nut-toi ma-giam-gia py-2 khoi-nut">Đặt món</a>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
        <!-- Chan trang -->
        <footer class=" van-ban-light">
            <div class="o-chua">
                <div class="hang">
                    <div class="cot-md-3 cot-lg-4 cot-xl-3">
                        <h5>About</h5>
                        <hr class="bg-trang mb-2 mt-0 d-inline-khoi mx-tu-dong w-25">
                        <p class="mb-0">
                            Sản phẩm chất lượng cao phù hợp với mọi lứa tuổi người tiêu dùng.
                        </p>
                    </div>

                    <div class="cot-md-2 cot-lg-2 cot-xl-2 mx-tu-dong">
                        <h5>Informations</h5>
                        <hr class="bg-trang mb-2 mt-0 d-inline-khoi mx-tu-dong w-25">
                        <ul class="danh-sach-khong-kieu">
                            <li><a href="">Link 1</a></li>
                            <li><a href="">Link 2</a></li>
                            <li><a href="">Link 3</a></li>
                            <li><a href="">Link 4</a></li>
                        </ul>
                    </div>

                    <div class="cot-md-3 cot-lg-2 cot-xl-2 mx-tu-dong">
                        <h5>Others links</h5>
                        <hr class="bg-trang mb-2 mt-0 d-inline-khoi mx-tu-dong w-25">
                        <ul class="danh-sach-khong-kieu">
                            <li><a href="">Link 1</a></li>
                            <li><a href="">Link 2</a></li>
                            <li><a href="">Link 3</a></li>
                            <li><a href="">Link 4</a></li>
                        </ul>
                    </div>

                    <div class="cot-md-4 cot-lg-3 cot-xl-3">
                        <h5>Contact</h5>
                        <hr class="bg-trang mb-2 mt-0 d-inline-khoi mx-tu-dong w-25">
                        <ul class="danh-sach-khong-kieu">
                            <li><i class="fa fa-nha mr-2"></i> Công ty của tôi</li>
                            <li><i class="fa fa-thu-dien-tu mr-2"></i> ihado.tranthuhoai@gmail.com</li>
                            <li><i class="fa fa-dien-thoai mr-2"></i> + 33 12 14 15 16</li>
                            <li><i class="fa fa-in mr-2"></i> + 33 12 14 15 16</li>
                        </ul>
                    </div>
                    <div class="cot-12 ban-quyen mt-3">
                        <p class="noi-trai">
                            <a href="#">Trở lại đầu trang</a>
                        </p>
                    </div>
                </div>
            </div>
        </footer>
               
    </body>


</html>
