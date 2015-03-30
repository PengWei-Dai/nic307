/**
 * Created by Rain on 2015/4/1 0001.
 */

/**登录验证js*/
function login(){
    //1.获取name&passowrd的值
    var name = $("#user_login input:first").val();
    var password = $("#user_login input:eq(1)").val();
    //2.验证用户名的格式:英文4-8个，中文2-5个汉字
    var pattern = /\b\w{4,8}\b|[\u4e00-\u9fa5]{2,5}/;
    var flag = pattern.test(name);
    if(!flag){
        alert("用户名格式不正确！");
        //将用户名赋空值
        $("#user_login label:first").val("");
    }

    $.ajax({
        type:"POST",
        url:"user/UserLogin",
        data:{'userName':name,'userPassword':password},
        dataType: 'text',
        error: function(){
            alert('操作错误,请与系统管理员联系!');
        },
        success: function(data) {
            if ($.trim(data) != 'true') {
                alert("seccsee");
                            }
        }
    });

}

