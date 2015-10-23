$('#userManagementTable').bootstrapTable({
    url: getDataJson()
});

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