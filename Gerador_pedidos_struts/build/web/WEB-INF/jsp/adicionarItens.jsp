<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <s:head/>
    <title>Edita Item</title>
    <link href="css/jquery-ui.css" rel="stylesheet">
    <script src="js/jquery.js"></script>
    <script src="js/jquery-ui.js"></script>
  </head>
  <body>
    <h1>Adiciona Item</h1>
    <hr/>
    <s:form action="criaEditaItem" method="post">
    	<s:textfield key="item.quantidade" label="Quantidade" />
        <s:hidden key="item.idPedido" value="1" />
    	
    	<s:if test="#idItem != 0">
    		<s:hidden key="idItem" />
    	</s:if>
    	<s:submit value="Gravar" /> 
    </s:form>
  </body>
</html>