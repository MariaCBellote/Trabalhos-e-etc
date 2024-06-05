use BDEX5_EVENTOS;
#1. Exibir todas as informações da tabela PARTICIPANTES.
SELECT * FROM PARTICIPANTES;


#2. Mostrar os nomes e empresas dos participantes que nasceram depois do ano 1990.
SELECT EMPRESA,NOME FROM PARTICIPANTES
WHERE YEAR(DATA_NASC)>1990;


#3. Listar os nomes dos eventos e as entidades organizadoras.
SELECT NOME_EVENTO, ENTIDADE_EVENTO FROM EVENTOS;


#4. Exibir os detalhes das atividades: ID da atividade, nome da atividade, data, hora, nome do evento.
SELECT  ATV.ID_ATIVIDADE, ATV.NOME_ATV,ATV.DATA_ATV,ATV.HORA_ATV,NOME_EVENTO FROM ATIVIDADES ATV
JOIN EVENTOS EVN ON ATV.EVENTO_ATV= EVN.ID_EVENTO;

#5. Listar o nome dos participantes e quantas atividades cada um participou.
SELECT PAR.NOME,SUM(PA.ATIVIDADE) AS TOTAL FROM PARTICIPANTES PAR
JOIN PARTICIPANTE_ATIVIDADE PA ON PA.CPF=PAR.CPF
GROUP BY PAR.NOME;

#6. Mostrar os nomes dos eventos realizados em 2023.
SELECT NOME_EVENTO FROM EVENTOS
WHERE YEAR(DATA_EVENTO)='2023';


#7. Listar todos os locais, ordenados pelo nome da cidade de A a Z.
SELECT LOC.NOME,LOC.CIDADE FROM LOCAIS LOC
ORDER BY LOC.CIDADE;
#8. Mostrar os nomes e CPFs dos participantes que não têm empresa cadastrada.
SELECT PAR.NOME,PAR.CPF FROM PARTICIPANTES PAR
WHERE PAR.EMPRESA IS NULL;
#9. Exibir os nomes dos participantes que estão inscritos em eventos realizados no local com nome 'Centro de Convenções'.
SELECT PAR.NOME FROM PARTICIPANTES PAR
JOIN LOCAIS   ON
JOIN          ON
JOIN          ON
WHERE LOCAIS.NOME LIKE 'Centro de Convenções';
#10. Para cada entidade organizadora, mostrar o nome da entidade e a média de eventos realizados.
SELECT ENTIDADE,AVG(EVENTO) AS MEDIA FROM
(SELECT ENTIDADE_EVENTO AS ENTIDADE


#11. Contar quantos participantes têm uma empresa cadastrada.
SELECT COUNT(*) AS COM_EMPRESA
WHERE EMPRESA IS NOT NULL;


#12. Listar os nomes dos participantes que participaram de mais de 5 atividades.
SELECT PAR.NOME FROM PARTICIPANTES PAR
JOIN PARTICIPANTE_ENTIDADE PA ON PA.CPF=  PAR.CPF AND PA.INSCRICAO=PAR.NUM_INSCRICAO
HAVING COUNT(PA.ATIVIDADE)>5;
#13. Mostrar o nome dos participantes e a data da última atividade que eles participaram.
SELECT PAR.NOME,ATV.DATA_ATV

#14. Contar quantas atividades cada evento possui.


#15. Para cada participante que participou de um evento, mostrar o CPF, o nome e a porcentagem de eventos em relação ao total de eventos realizados.