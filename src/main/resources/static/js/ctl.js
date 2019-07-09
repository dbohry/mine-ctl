$(document).ready(function () {
    $('#btn_restart').click(function () {
        $.ajax({
            url: '/api/restart',
            type: 'POST',
            success: function (result) {
                console.log(result);
                $('#txt_response').text('Starting server, wait a few minutes...').delay(10000).fadeOut();
            },
            error: function (error) {
                console.log(error);
                $('#txt_response').text('Sorry but something went wrong: ' + error)
            }
        })
    });

    $('#btn_backup').click(function () {
        $.ajax({
            url: '/api/backup',
            type: 'POST',
            success: function (result) {
                console.log(result);
                $('#txt_response').text('Creating world backup file, wait a few minutes...').delay(10000).fadeOut();
            },
            error: function (error) {
                console.log(error);
                $('#txt_response').text('Sorry but something went wrong: ' + error)
            }
        })
    });

});