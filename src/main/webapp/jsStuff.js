/**
 * Created by User on 16.04.2015.
 */
$(function() {

    $("#myForm").on("submit", function(e) {
        e.preventDefault();
        var data = new FormData();
        $.each(jQuery('#file')[0].files, function (i, file) {
            data.append('file-' + i, file);
        });

        jQuery.ajax({
            url: $(this).attr("action"),
            data: data,
            cache: false,
            contentType: false,
            processData: false,
            type: 'POST',
            success: function (data) {
                var html = ' ';
                $.each(data, function(i,item){
                    html += '<div class="picItem">';
                    html += '<div class="picInfo">';
                    html += '<span>Высота:'+ item.height +'px, Ширина: ' + item.width + 'px, Размер: ' +item.size + '</span>';
                    html += '<br>';
                    html += '<a href="'+item.link+'">Ссылка</a>';
                    html += '<br>';
                    html += '<a href="'+item.linkToOrigin+'">Ссылка на оригинал</a>';
                    html += '</div>';
                    html += '</div>';
                });


                $("#response").html(html);
            }
        });
    });

    //    $.ajax({
    //        url: $(this).attr("action"),
    //        type: 'POST',
    //        data: $(this).serialize(),
    //        contentType: $(this).attr("enctype"),
    //        beforeSend: function() {
    //            $("#message").html("sending...");
    //        },
    //        success: function(data) {
    //            $("#message").hide();
    //            $("#response").html(data);
    //        }
    //    });
    //});
});
