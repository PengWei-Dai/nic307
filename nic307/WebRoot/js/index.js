/**
 * Created by Rain on 2015/4/1 0001.
 */

/**��¼��֤js*/
function login(){
    //1.��ȡname&passowrd��ֵ
    var name = $("#user_login input:first").val();
    var password = $("#user_login input:eq(1)").val();
    //2.��֤�û����ĸ�ʽ:Ӣ��4-8��������2-5������
    var pattern = /\b\w{4,8}\b|[\u4e00-\u9fa5]{2,5}/;
    var flag = pattern.test(name);
    if(!flag){
        alert("�û�����ʽ����ȷ��");
        //���û�������ֵ
        $("#user_login label:first").val("");
    }

    $.ajax({
        type:"POST",
        url:"user/UserLogin",
        data:{'userName':name,'userPassword':password},
        dataType: 'text',
        error: function(){
            alert('��������,����ϵͳ����Ա��ϵ!');
        },
        success: function(data) {
            if ($.trim(data) != 'true') {
                alert("seccsee");
                            }
        }
    });

}

