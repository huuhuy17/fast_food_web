<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link href="css/DangNhap.css" rel="stylesheet" type="text/css"/>
        
        <title>Đăng nhập</title>
    </head>
    <body>
        <div id="form-dang-nhap">
            <form class="form-DN" action="login" method="post">
                <h1 style="text-align: center"> Đăng nhập</h1>
                
                <input name="user"  type="text" id="inputEmail" class="form-dieu-khien" placeholder="Tên đăng nhập" style ="width:90% ">
                <input name="pass"  type="password" id="inputPassword" class="form-dieu-khien" placeholder="Mật khẩu" style ="width:90% ">

                <div>
                    <input name="remember" value="1" type="checkbox" class="form-check-input" id="kiemtra1">
                    <label class="form-check-label" for="kiemtra1">Ghi nhớ</label>
                </div>
                <hr style="width:85%;">
                <button  type="submit"> Đăng nhập</button>
                <hr style="width:85%;">
                <button  type="button" id="nut_DK" > Đăng ký tài khoản mới</button>
            </form>

            <form action="signup" method="post" class="form-dang-ky">
                <h1 style="text-align: center"> Đăng ký</h1>
                <input name="user" type="text" id="ten-nd" class="form-dieu-khien" placeholder="Tên đăng nhập" style ="width:90% ">
                <input name="pass" type="password" id="matkhau-nd" class="form-dieu-khien" placeholder="Mật khẩu" style ="width:90% ">
                <input name="repass" type="password" id="nhaplai-mk" class="form-dieu-khien" placeholder="Nhập lại mật khẩu" style ="width:90% ">

                <button type="submit"> Đăng ký</button>
                <a href="#" id="boqua_DN"> Trở lại</a>
            </form>
            <br>

        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script>
            function toggleResetPswd(e) {
                e.preventDefault();
                $('#form-dang-nhap .form-DN').toggle() // display:block or none
                $('#form-dang-nhap .form-cai-lai').toggle() // display:block or none
            }

            function toggleSignUp(e) {
                e.preventDefault();
                $('#form-dang-nhap .form-DN').toggle(); // display:block or none
                $('#form-dang-nhap .form-dang-ky').toggle(); // display:block or none
            }

            $(() => {
                // Login Register Form
                $('#form-dang-nhap #forgot_pswd').click(toggleResetPswd);
                $('#form-dang-nhap #cancel_reset').click(toggleResetPswd);
                $('#form-dang-nhap #nut_DK').click(toggleSignUp);
                $('#form-dang-nhap #boqua_DN').click(toggleSignUp);
            })
        </script>
    </body>
</html>