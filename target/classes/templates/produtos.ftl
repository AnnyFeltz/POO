<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicial</title>
</head>
<body>  
    <h1>Visualizar produtos</h1>

    <table>
        <tr>
            <th>Nome</th>
            <th>Preço</th>
        </tr>   
        <#list produtos as produto>
            <tr>
                <td><strong>${produto.nome}</strong></td>
                <td>${produto.preco}</td>
            </tr>
        </#list>
    </table>

    <a href="/">Pagina inicial</a>
</body>
</html>

