$(function () {

    $(document).on('click', '#send-form', function () {
        let houseType = $("#group").val();
        let group = $("#house_type").val();
        $.ajax({
            method: "POST",
            url: "/api/credit/percent",
            data: {houseType: houseType, group: group},
            success: function (response) {
                alert('Ставка по ипотеке ' + response + ' %')
            }, error: function (response) {
                console.log(response.status)
            }
        })
    })

})