/*$('#userManagementTable').bootstrapTable({
    url: getDataJson()
});*/

function getDataJson(){
    $.ajax({
        type: 'POST',
        dataType: 'json',
        url: 'getUsersTableData.po',
        success: function (data) {
            console.log(data);
            return data;
        }
    });
}

$(document).ready(function () {
    $('#userManagementTable').on('click-row.bs.table', function (e, row, $element) {

        $('#modal-body-text').text(row['id'] + ' ' + row['username'] + ' ' + row['email']);
        $('#userManagementModal').modal();

    });
});