<%-- 
    Document   : TrangChu
    Created on : May 14, 2022, 6:10:11 PM
    Author     : ihado
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang Chu</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <link id="link" rel="stylesheet" href="css/style.css">
    </head>
    <body>
<!--        Phan menu-->
        <jsp:include page="Menu.jsp"></jsp:include>
<!--        Ket thuc phan menu-->

        <div class="o-chua">
            <div class="hang">
                <div class="cot">
                    <nav aria-label="menu-dieu-huong">
                        <nav aria-label="menu-dieu-huong">
                        <ol class="menu-dieu-huong">
                            <li class="menu-dieu-huong-item"><a href="Home.jsp">Trang Chủ</a></li>
                            <li class="menu-dieu-huong-item"><a href="#">Chuyên mục</a></li>
                            <li class="menu-dieu-huong-item hoat-dong" aria-current="#">Chuyên mục con</li>
                        </ol>
                    </nav>
                </div>
            </div>
        </div>
        <div class="o-chua">
            <div class="hang">
                <jsp:include page="MucBenTrai.jsp"></jsp:include>

                <div class="cot-sm-9">
                    <div class="hang">
                        <c:forEach items="${listP}" var="o">
                            <div class="cot-12 cot-md-6 cot-lg-4">
                                <div class="the">
                                    <img class="the-anh-tren" src="${o.image}" alt="the-hinh-anh">
                                    <div class="the-body">
                                        <h4 class="tieu-de-the hien-thi-chu"><a href="detail?pid=${o.id}" title="Xem san pham">${o.name}</a></h4>
                                        <p class="chu-the hien-thi-chu">${o.title}</p>
                                        <div class="hang">
                                            <div class="cot">
                                                <p class="nut nut-nguy-hien khoi-nut">${o.price} $</p>
                                            </div>
                                            <div class="cot">
                                                <a href="#" class="nut nut-thanh-cong khoi-nut">Add to cart</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>

            </div>
        </div>

<!--        Phan footer-->
        <jsp:include page="Footer.jsp"></jsp:include>
<!--        Ket thuc phan footer-->
    </body>
</html>


