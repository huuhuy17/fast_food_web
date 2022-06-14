<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chi tiết món ăn</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <style>
            .thu-vien-chua .anh-lon img {
                height: 450px;
                width: auto;
                display: inline-block;
                cursor: zoom-in;
            }


            .thu-vien-chua .anh-nho .item-thu-vien {
                width: 60px;
                height: 60px;
                border: 1px solid #ddd;
                margin: 7px 2px;
                display: inline-block;
                overflow: hidden;
            }

            .thu-vien-chua .anh-nho {
                text-align: center;
            }
            .thu-vien-chua .anh-nho img {
                max-width: 100%;
                max-height: 100%;
                object-fit: cover;
                border-radius: 4px;
                cursor: zoom-in;
            }
            .anh-lon img{
                width: 100% !important;
                height: auto !important;
            }
        </style>
    </head>
    <body>
        <!--        Phan menu-->
        <jsp:include page="Menu.jsp"></jsp:include>
            <!--        Ket thuc phan menu-->

            <div class="o-chua">
                <div class="hang">

                <jsp:include page="MucBenTrai.jsp"></jsp:include>
                <div class="cot-sm-9">
                    <div class="o-chua">
                        <div class="the">
                            <div class="hang">
                                <aside class="cot-sm-5 vien-phai">
                                    <article class="thu-vien-chua"> 
                                        <div class="anh-lon">
                                            <div> <a href="#"><img src="${detail.image}"></a></div>
                                    </div> <!-- slider-product.// -->
                                    <div class="anh-nho">
                                        <div class="item-thu-vien"> <img src="${detail.image}"> </div>
                                        <div class="item-thu-vien"> <img src="${detail.image}"> </div>
                                        <div class="item-thu-vien"> <img src="${detail.image}"> </div>
                                        <div class="item-thu-vien"> <img src="${detail.image}"> </div>
                                    </div> <!-- slider-nav.// -->
                                </article> <!-- thu-vien-chua .end// -->
                            </aside>
                            <aside class="cot-sm-7">
                                <article class="the-body p-5">
                                    <h3 class="tieu-de mb-3">${detail.name}</h3>

                                    <p class="gia-chi-tiet"> 
                                        <span class="gia h3 canh-bao"> 
                                            <span class="tien-te">Giá   </span><span class="so">${detail.price}$</span>
                                        </span> 
                                        <!--<span>/per kg</span>--> 
                                    </p> <!-- price-detail-wrap .// -->
                                    <dl class="mo-ta-san-pham">
                                        <dt>Mô tả</dt>
                                        <dd><p>${detail.description} </p></dd>
                                    </dl>


                                    <hr>
                                    <div class="hang">
                                        <div class="cot-sm-5">
                                            <dl class="so-luong so-luong-trong-dong">
                                                <dt>Số lượng: </dt>
                                                <dd>
                                                    <select class="bieu-mau-kiem-soat bieu-mau-kiem-soat-sm" style="width:70px;">
                                                        <option> 1 </option>
                                                        <option> 2 </option>
                                                        <option> 3 </option>
                                                    </select>
                                                </dd>
                                            </dl>  <!-- item-property .// -->
                                        </div> <!-- col.// -->

                                    </div> <!-- row.// -->
                                    <hr>
                                    <a href="#" class="nut nut-lg nut-chinh viet-hoa"> Mua ngay </a>
                                    <a href="#" class="nut nut-lg nut-phac-thao-chinh viet-hoa"> <i class="fas fa-gio-hang"></i> Thêm vào giỏ hàng </a>
                                </article> <!-- card-body.// -->
                            </aside> <!-- col.// -->
                        </div> <!-- row.// -->
                    </div> <!-- card.// -->


                </div>
            </div>
            </div>
        </div>

        <!--        Phan footer-->
        <jsp:include page="Footer.jsp"></jsp:include>
        <!--        Ket thuc phan footer-->
    </body>
</html>
