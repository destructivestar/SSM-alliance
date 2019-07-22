$(function () {
    $.post("/user/list",function (result) {
        $.each(result,function (index, element) {
            $("#tab").append(
                "   <tr>\n" +
                "   <td>"+element.id+"</td>\n" +
                "   <td>"+element.username+"</td>\n" +
                "   <td>"+element.age+"</td>\n" +
                "   <td>"+element.skill+"</td>\n" +
                "   <td>"+element.address+"</td>\n" +
                "   <td>"+element.beckon+"</td>\n" +
                "   </tr>")
        })
    },"json")
})