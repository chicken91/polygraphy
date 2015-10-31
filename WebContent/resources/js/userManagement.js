var rowChoose;

$(document).ready(function () {
    $('#userManagementTable').on('click-row.bs.table', function (e, row, $element) {
        rowChoose = row['id'];
        $('#modal-login-input').val(row['name']);
        $('#modal-email-input').val(row['email']);
        $('#modal-role-input').val(row['role']);
        $('#modal-password-input').val("");
        $('#modal-admin-password-input').val("");

        $('#userManagementModal').modal();
    });
});

function editUser() {
    var ajaxMessage = {
        "id": rowChoose,
        "name": $('#modal-login-input').val(),
        "email": $('#modal-email-input').val(),
        "role": $('#modal-role-input').val(),
        "password": $('#modal-password-input').val(),
        "securityPassword": $('#modal-admin-password-input').val()
    };
    editUserAjaxRequest(ajaxMessage);
}

function editUserAjaxRequest(ajaxMessage) {
    $.ajax({
        type: 'POST',
        dataType: 'json',
        data: JSON.stringify(ajaxMessage),
        url: 'editUser.po',
        contentType: 'application/json',
        success: function (response) {
            console.log(response.message);
            if (response.error != true) {
                $('#userManagementModal').modal('hide');
                editUserInTableRow(ajaxMessage);
            }
        }
    });
}

function editUserInTableRow(user) {
    $('#userManagementTable').bootstrapTable('updateRow', {
        index: user.id - 1,
        row: {
            name: user.name,
            email: user.email,
            role: user.role
        }
    });
}
