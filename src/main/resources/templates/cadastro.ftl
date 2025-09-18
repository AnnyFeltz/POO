<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="/produtos" method="post">
        <label for="Nome Produto">Nome do Produto</label>
        <input type="text" id="nome" name="nome" required><br>

        <label for="Preco Produto">Preço do Produto</label>
        <input type="number" id="preco" name="preco" required><br>

        <button type="submit">Cadastrar Produto</button>
    </form>
</body>
</html>