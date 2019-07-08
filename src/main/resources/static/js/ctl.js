$(document).ready(function () {
    $('#btn_restart').click(function () {
        $.ajax({
            url: '/api',
            type: 'POST',
            success: function (result) {
                console.log(result);
                $('#txt_response').text('Starting server, wait a few minutes...').delay(10000).fadeOut();
            },
            error: function (error) {
                console.log(error);
                $('#txt_response').text('Sorry but something went wrong')
            }
        })
    });
});