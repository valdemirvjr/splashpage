function submitForm(formName, resourceUrl, httpMethod, dataType, contentType)
{
    var formData = JSON.stringify($("#"+formName).serializeArray());

    $.ajax({
        type: httpMethod,
        url: resourceUrl,
        data: formData,
        dataType: "json",
        contentType: "application/json"
    });
}