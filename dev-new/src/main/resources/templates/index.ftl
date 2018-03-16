<html>
<head>
    <title>新版开发者后台</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>id</th>
        <th>名称</th>
        <th>工资</th>
    </tr>
    </thead>
    <tbody>
    <#list iterms as account>
    <tr>
        <td>${account.id}</td>
        <td>${account.name}</td>
        <td>${account.money}</td>
    </tr>
    </#list>
    </tbody>
</table>
</body>
</html>
<!DOCTYPE html>
<html lang="en">
<body>
</body>
</html>