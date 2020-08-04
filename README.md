# TreinamentoWeb
Avaliação RDevs de Treinamento Web!

04_08_2020_Modulo_Aplicações_Web

1. Crie um projeto Web com o nome TreinamentoWeb

2. Crie uma pagina bem-vindo.html dentro da pasta WebContent que exiba a mensagem “Bem vindo ao Programa de Treinamento RD”.

3. Crie uma classe ModuloDAO e adicione um novo método consultarModulos( ) que devolva uma lista de treinamento com os campos informados abaixo. Os dados podem estar fixos (sem conexão com o BD)

Ex:
								Módulos do Treinamento
—————————————————————————————————————
NOME       		 | INSTRUTO| DT INIC R TITULAR   | INSTRUTOR AUXILIAR.   IO

NIVELAMENTO    | Ivo				        | Leonardo				      | 20/06/2020
HTML/CSS	     | Jonas				      | Leonardo				      | 27/06/2020
JAVASCRIPT	   | Jonas				      | Leonardo				      | 02/07/2020
POO		         | Ivo				        | Leonardo				      | 11/07/2020
Java			     | Leonardo			      | Ivo					          | 18/07/2020
BD				     | Leonardo			      | Fabio				          | 24/07/2020
Aplicações Web | Fabio				      | Ivo					          | 30/07/2020
Spring Boot	   | Fabio				      | Ivo					          | 05/08/2020
Angular		     | Jonas				      | Fabio				          | 13/08/2020
—————————————————————————————————————

4.  Crie uma servlet com o nome ModulosTreinamentoServlet que instancie a classe ModuloDAO adicione a lista como parâmetro e execute a chamada da pagina consultar-modulos.jsp. A url da servlet deve ser /modulos.

5. Crie uma pagina consultar-modulos.jsp que exiba os módulos do treinamento e seus respectivos instrutores. O conteúdo NÃO deve ser fixo. A lista será enviada através de uma servlet. Cada item da lista possuirá os campos “nomeModulo”, “instrutorTitular” e “instrutorAuxiliar” e “dtInicio”.  Formate o campo dtInicio no padrão “dd/MM/yyyy”

<DESAFIO>

6. Altere a implementação na classe ModuloDAO para realizar a busca na tabela TB_MODULO dinamicamente e comente o mock realizado no exercício 4. 

A tabela TB_MODULO possui os seguinte campos:
DS_NOME : varchar2(40)
DS_INSTRUTOR_TITULAR: varchar2(40)
DS_INSTRUTOR_AUXILIAR: varchar2(40)
DT_INICIO: DATE
