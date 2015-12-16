$(function(){
    $('button#register').click(function(){
        $.ajax({
            type: "POST",
            url: "/splashpage/rest/register",
            data: $('form#registerForm').serialize(),
            success: function(data, textStatus, jqXHR){
                alert(jqXHR.responseText);
            },
            error: function(jqXHR, textStatus, errorThrown){
                alert(jqXHR.responseText);
            },
        });
    });
});