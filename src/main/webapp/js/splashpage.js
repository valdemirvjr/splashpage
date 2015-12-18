$.fn.serializeObject = function() {
        var o = {};
        var a = this.serializeArray();
        $.each(a, function() {
            if (o[this.name]) {
                if (!o[this.name].push) {
                    o[this.name] = [o[this.name]];
                }
                o[this.name].push(this.value || '');
            } else {
                o[this.name] = this.value || '';
            }
        });
        return o;
    };

$(function(){
    $('button#register').click(function(){
        $.ajax({
            type: "POST",
            url: "/splashpage/rest/register",
            data: $('form#registerForm').serialize().replace('%40', '@'),
            success: function(data, textStatus, jqXHR){
                alert(jqXHR.responseText);
            },
            error: function(jqXHR, textStatus, errorThrown){
                alert(jqXHR.responseText);
            },
        });
    });
});