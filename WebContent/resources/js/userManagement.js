var rowChoose;

$(document).ready(function () {
    $('#userManagementTable').on('click-row.bs.table', function (e, row, $element) {

        rowChoose = row['id'];
        $('#modal-login-input').val(row['name']);
        $('#modal-email-input').val(row['email']);
        $('#modal-role-input').val(row['role']);
        $('#userManagementModal').modal();

    });
});

function editUser(){
    var userDTO = {
        "id" : rowChoose,
        "name" : $('#modal-login-input').val(),
        "email" : $('#modal-email-input').val(),
        "role" : $('#modal-role-input').val()
    };

    editUserOnServer(JSON.stringify(userDTO))
}

function editUserOnServer(userDTO){
    $.ajax({
        type: 'POST',
        dataType: 'json',
        data: userDTO,
        url: 'editUser.po',
        contentType: 'application/json',
        complete: function () {
            $('#userManagementModal').modal('hide');
            $('#userManagementTable').bootstrapTable('destroy');
            $('#userManagementTable').bootstrapTable();
        }
    });
}

function getDataJson(){
    $.ajax({
        type: 'POST',
        dataType: 'json',
        url: 'getUsersTableData.po',
        success: function (data) {
            return data;
        }
    });
}