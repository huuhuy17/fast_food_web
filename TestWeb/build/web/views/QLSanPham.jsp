
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Quản lý sản phẩm</title>
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
                        <div>
                            <h2>Quản lý  <b> món ăn </b></h2>
                        </div>
                        <div class="cot6">
                            <a href="#nhanvien-them"  class="nut nut-thanhcong" data-toggle="modal"><button style ="color: blue;">Thêm món ăn</button></a>
                            <a href="#nhanvien-xoa" class="nut nut-nguyhiem" data-toggle="modal"><button style ="color : blue;">Xóa món ăn</button></a>						
                        </div>
                    </div>
                </div>
                <table class="bang bang-ke bang-hover">
                    <thead>
                        <tr>
                            <th>
                                <span class="hop-tuy-chinh">
                                    <input type="checkbox" id="chon">
                                    <label for="chon"></label>
                                </span>
                            </th>
                            <th>ID</th>
                            <th>Tên</th>
                            <th>Ảnh</th>
                            <th>Giá</th>
                            <th>Mô tả</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listP}" var="o">
                            <tr>
                                <td>
                                    <span class="hop-tuy-chinh">
                                        <input type="checkbox" id="checkbox1" name="options[]" value="1">
                                        <label for="checkbox1"></label>
                                    </span>
                                </td>
                                <td>${o.id}</td>
                                <td>${o.name}</td>
                                <td>
                                    <img src="${o.image}">
                                </td>
                                <td>${o.price} $</td>
                                <td>
                                    <a href="#nhanvien-them"  class="chinhsua" data-toggle="modal"> </a>
                                    <a href="#nhanvien-xoa" class="xoa" data-toggle="modal"> </a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                <div class="sua-chua">
                    <div class="van-ban-goi-y">Hiển thị <b>5</b> của <b>25</b> mục</div>
                    <ul class="phan_trang">
                        <li class="trang-item vo-hieu-hoa"><a href="#">Truoc</a></li>
                        <li class="trang-item"><a href="#" class="trang-link">1</a></li>
                        <li class="trang-item"><a href="#" class="trang-link">2</a></li>
                        <li class="trang-item hoat-dong"><a href="#" class="trang-link">3</a></li>
                        <li class="trang-item"><a href="#" class="trang-link">4</a></li>
                        <li class="trang-item"><a href="#" class="trang-link">5</a></li>
                        <li class="trang-item"><a href="#" class="tranglink">sau</a></li>
                    </ul>
                </div>
            </div>
        </div>
        

        <div class="bieu-mau">
            <div id="nhanvien-them" class="phuong-thuc fade">
                <div class="hop-thoai">
                    <div class="phuongthuc-noidung">
                        <form action="add" method="post">
                            <div class="phuong-thuc-header">						
                                <h4 class="phuong-thuc-tieu-de">Thêm món ăn</h4>
                                <button type="button" class="dong" data-dismiss="modal" aria-hidden="true">&times;</button>
                            </div>
                            <div class="phuong-thuc-body">					
                                <div class="form-nhom">
                                    <label>Ten</label>
                                    <input name="name" type="text" class="form-dieu-khien" required>
                                </div>
                                <div class="form-nhom">
                                    <label>Anh</label>
                                    <input name="image" type="text" class="form-dieu-khien" required>
                                </div>
                                <div class="form-nhom">
                                    <label>Gia</label>
                                    <input name="price" type="text" class="form-dieu-khien" required>
                                </div>
                                <div class="form-nhom">
                                    <label>Tiêu đề</label>
                                    <textarea name="title" class="form-dieu-khien" required></textarea>
                                </div>
                                <div class="form-nhom">
                                    <label>Miêu tả</label>
                                    <textarea name="description" class="form-dieu-khien" required></textarea>
                                </div>
                                <div class="form-nhom">
                                    <label>Danh mục</label>
                                    <select name="category" class="form-select" aria-label="Default select example">
                                        <c:forEach items="${listC}" var="o">
                                            <option value="${o.id}">${o.name}</option>
                                        </c:forEach>
                                    </select>
                                </div>

                            </div>
                            <div class="phuong-thuc-footer">
                                <input type="button" class="nut nut-macdinh" data-dismiss="modal" value="Cancel">
                                <input type="submit" class="nut nut-thanhcong" value="Add">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
                <!--       Nhân viên sửa lỗi-->
                <div id="nhanvien-chinhsua" class="phuong-thuc phai-mau">
                    <form class="hop-thoai" method="post">
                        <div class="phuong-thuc-noi-dung">
                            <div class="phuong-thuc-header">						
                                <h4 class="phuong-thuc-tieu-de" style="padding-left:30px;">Nhân viên chỉnh sửa</h4>
                                <button type="button" class="dong" data-dismiss="modal" aria-hidden="true">&times;</button>
                            </div>
                            <div class="phuong-thuc-body">					
                                <div class="form-nhom">
                                    <label>Ten</label>
                                    <input type="text" class="form-dieu-khien" required>
                                </div>
                                <div class="form-nhom">
                                    <label>Email</label>
                                    <input type="email" class="form-dieu-khien" required>
                                </div>
                                <div class="form-nhom">
                                    <label>Địa chỉ</label>
                                    <textarea  type="text" class="form-dieu-khien" required></textarea>
                                </div>
                                <div class="form-nhom">
                                    <label>Điện thoại</label>
                                    <input type="text" class="form-dieu-khien" required>
                                </div>					
                            </div>
                            <div class="phuong-thuc-footer">
                                <input type="button" class="nut nut-macdinh" data-dismiss="modal" value="Cancel">
                                <input type="submit" class="nut nut-thongtin" value="Save">
                            </div>
                        </div>
                    </form>
                </div>


                    <div id="nhanvien-xoa" class="phuong-thuc phai-mau">
                        <form class="hop-thoai">
                            <div class="phuong-thuc-noi-dung">
                                <form>
                                    <div class="phuong-thuc-header">						
                                        <h4 class="phuong-thuc-tieu-de">Xóa món ăn</h4>
                                        <button type="button" class="dong" data-dismiss="modal" aria-hidden="true">&times;</button>
                                    </div>
                                    <div class="phuong-thuc-body">					
                                        <p>Bạn có muốn xóa mục này không ?</p>
                                    </div>
                                    <div class="phuong-thuc-footer">
                                        <input type="button" class="nut nut-macdinh" data-dismiss="modal" value="Cancel">
                                        <input type="submit" class="nut nut-nguyhiem" value="Delete">
                                    </div>
                                </form>
                            </div>
                        </form>
                    </div>
            </div>
        <a href="TrangChu.jsp" style="margin : 10px;"><button type="button" color ="blue">Trở lại trang chủ</button>
        
        
    </body>
</html>