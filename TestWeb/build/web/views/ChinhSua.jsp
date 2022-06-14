<%-- 
    Document   : ManagerProduct
    Created on : Dec 28, 2020, 5:19:02 PM
    Author     : trinh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Chỉnh sửa </title>


        <link href="css/QuanLy.css" rel="stylesheet" type="text/css"/>
        <style>
            img{
                width: 200px;
                height: 120px;
            }
             .cot6{
                padding-bottom: 20px ;
            }
        </style>
    <body>
        <div class="noidung">
            <div class="bang-chua">
                <div class="tieu-de-bang">
                    <div class="hang">
                        <div class="cot6">
                            <h2>Chỉnh sửa <b>Món ăn</b></h2>
                        </div>
                       
                    </div>
                </div>
            </div>
            <div id="nhanvien_chinhsua">
                <div class="hop-thoai"  style="margin-left:auto;margin-right: auto;width :40%;padding: 16px;">
                    <div class="phuongthuc-noidung" style="padding:16px;">
                        <form action="edit" method="post">
                            <div class="phuong-thuc-header">						
                                <h4 class="phuong-thuc-tieu-de">Thêm món ăn </h4>
                                <button type="button" class="dong" style="margin-left:450px;margin-bottom:0px;" data-dismiss="modal" aria-hidden="true">&times;</button>
                            </div>
                            <div class="phuong-thuc-body">					
                                <div class="form-nhom">
                                    <label>ID</label>
                                    <input value="${detail.id}" name="id" type="text" class="form-dieu-khien" style="width :95%;margin-bottom:10px;" readonly required>
                                </div>
                                <div class="form-nhom">
                                    <label>Tên</label>
                                    <input value="${detail.name}" name="name" type="text" style="width :95%;margin-bottom: 10px;" class="form-dieu-khien" required>
                                </div>
                                <div class="form-nhom">
                                    <label>Ảnh</label>
                                    <input value="${detail.image}" name="image" type="text" style="width :95%;margin-bottom: 10px;" class="form-dieu-khien" required>
                                </div>
                                <div class="form-nhom">
                                    <label>Giá</label>
                                    <input value="${detail.price}" name="price" type="text" style="width :95%;margin-bottom: 10px;" class="form-dieu-khien" required>
                                </div>
                                <div class="form-nhom">
                                    <label>Tiêu đề</label>
                                    <textarea name="title" class="form-dieu-khien" style="width :95%;margin-bottom: 10px;" required>${detail.title}</textarea>
                                </div>
                                <div class="form-nhom">
                                    <label>Miêu tả</label>
                                    <textarea name="description" class="form-dieu-khien" style="width :95%;margin-bottom: 10px;" required>${detail.description}</textarea>
                                </div>
                                <div class="form-nhom">
                                    <label>Danh mục</label>
                                    <select name="category" class="form-select" style="margin-bottom: 10px;" aria-label="Default select example">
                                        <c:forEach items="${listCC}" var="o">
                                            <option value="${o.cid}">${o.cname}</option>
                                        </c:forEach>
                                    </select>
                                </div>

                            </div>
                            <div class="phuong-thuc-footer" style=" margin-bottom: 10px; width: 100%; margin-left: auto;margin-right: auto;" >
                                <input type="submit" class="nut nut-thanhcong" value="Edit" style="width: 100%; margin-left: auto;margin-right: auto;" >
                            </div>
                        </form>
                    </div>
                </div>
            </div>

        </div>


        <script src="js/manager.js" type="text/javascript"></script>
    </body>
</html>