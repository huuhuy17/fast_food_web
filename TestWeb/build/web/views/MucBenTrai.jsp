<%-- 
    Document   : MucBenTrai
    Created on : Jun 14, 2022, 4:10:21 PM
    Author     : Avada Kedavra
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<div class="cot-sm-3">
    <div class="the  bg-sang mb-3">
        <div class="tieu-de-the bg-chinh chu-trang viet-hoa"><i class="fa fa-list"></i> Chuyên mục</div>
        <ul class="danh-sach-nhom khoi-danh-muc">
            <c:forEach items="${dsPhanLoai}" var="o">
                <li class="danh-sach-nhom-item chu-trang ${tag == o.cid ? "active":""}"><a href="category?cid=${o.cid}">${o.cname}</a></li>
            </c:forEach>

        </ul>
    </div>
    <div class="the  bg-sang mb-3">
        <div class="tieu-de-the bg-thanh-cong chu-trang viet-hoa">Sản phẩm bán chạy</div>
        <div class="the-body">
            <img class="anh-tinh" src="${spMoiNhat.image}" />
            <h5 class="tieu-de-the">${spMoiNhat.name}</h5>
            <p class="chu-the">${spMoiNhat.title}</p>
            <p class="gia-tien">${spMoiNhat.price} $</p>
        </div>
    </div>
</div>