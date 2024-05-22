-- Exibir todas as informações da tabela `PRODUTOS`.
SELECT * FROM PRODUTOS;

-- Mostrar os nomes e preços dos produtos que custam mais de 50,00.
SELECT NOME_PRO, PRECO FROM PRODUTOS
WHERE PRECO>50;

 -- Listar os nomes e cidades dos fornecedores
 SELECT NOME_FOR, CIDADE FROM FORNECEDORES;
 
 -- Exibir os detalhes dos pedidos de compra: ID do pedido, data, hora e nome do fornecedor
 SELECT DISTINCT PC.ID_PEDIDO, GROUP_CONCAT(CONCAT_WS('|',PC.DATA_PEDIDO,PC.HORA_PEDIDO,F.NOME_FOR) SEPARATOR'-') FROM PEDIDOS_COMPRA AS PC
 JOIN FORNECEDORES AS F ON F.ID_FORNECEDOR=PC.FORNECEDOR
 GROUP BY PC.ID_PEDIDO;
 
 -- Listar o nome dos produtos e a quantidade disponível em cada armazém
 SELECT NOME_PRO, ARMAZEM, QUANTIDADE FROM PRODUTOS_ARMAZENS
 JOIN PRODUTOS ON NOME_PRO;
 
--  Mostrar os nomes dos fornecedores que têm produtos no armazém de "São Paulo"
SELECT NOME_FOR FROM FORNECEDORES
JOIN ARMAZENS ON CIDADE_ARMAZEM
WHERE CIDADE_ARMAZEM='Sâo Paulo';

-- Listar todos os armazéns, ordenados pelo nome do armazém de A a Z.
SELECT NOME_ARMAZEM FROM ARMAZENS
ORDER BY NOME_ARMAZEM;

--  Mostrar os nomes dos produtos que têm a palavra "Premium" na descrição
SELECT NOME_PRO FROM PRODUTOS
WHERE DESCRICAO LIKE '%premium%';

-- Exibir os detalhes dos produtos: ID do produto, nome, descrição, preço e nome dos fornecedores
SELECT ID_PRODUTO, NOME_PRO, DESCRICAO, PRECO, NOME_FOR
FROM PRODUTOS JOIN FORNECEDORES ON NOME_FOR;

-- Para cada pedido de compra, mostrar o ID do pedido e a quantidade total de produtos solicitados
SELECT ID_PEDIDO,QUANTIDADE FROM PEDIDOS_COMPRA;

-- Contar quantos produtos cada fornecedor oferece, ordenando em ordem decrescente.
SELECT NOME_FOR, QUANTIDADE FROM FORNECEDORES
JOIN PRODUTOS_ARMAZENS ON QUANTIDADE
ORDER BY QUANTIDADE DESC;

-- Listar os nomes dos produtos e a quantidade disponível no armazém "Rio de Janeiro"
SELECT P.NOME_PRO, PA.QUANTIDADE FROM PRODUTOS P
JOIN PRODUTOS_ARMAZENS PA ON PA.PRODUTO = P.ID_PRODUTO
JOIN ARMAZENS A ON PA.ARMAZEM = A.ID_ARMAZEM
WHERE A.CIDADE_ARMAZEM = "Rio de Janeiro";

-- Mostrar o nome dos fornecedores e a data e hora do último pedido de compra que eles receberam
SELECT F.NOME_FOR, PC.DATA_PEDIDO,PC.HORA_PEDIDO 
FROM (SELECT MAX(PC.DATA_PEDIDO) FROM PEDIDOS_COMPRA PC)
JOIN FORNECEDORES F ON PC.FORNECEDOR= F.ID_FORNECEDOR;

-- Contar quantos pedidos de compra cada fornecedor recebeu.


-- Para cada armazém, exibir o nome do armazém e a quantidade total de produtos armazenados nele.