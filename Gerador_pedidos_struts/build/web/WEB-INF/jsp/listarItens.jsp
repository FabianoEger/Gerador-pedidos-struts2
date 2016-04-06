<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de itens</title>
    </head>
    <body>
        <h2>
            <s:property value="mensagem"/>
        </h2>
        <a href="editaItem">Novo item</a>
        <table>
            <thead>
                <tr>
                    <th>Id item</th>
                    <th>Quantidade</th>
                    <th>Id pedido</th>
                    <th colspan="2">Acoes</th>
                </tr>
            </thead>
            <s:iterator value="itens" status="idItem">
                <s:if test="#idItem.even == true">
                    <s:set var="bgColor" value="%{'aaee88'}" />
                </s:if>
                <s:else>
                    <s:set var="bgColor" value="%{'ffffff'}" />
                </s:else>
                <tr bgcolor="<s:property value="bgColor"/>">
                    <td><s:property value="idItem"/></td>
                    <td><s:property value="quantidade"/></td>
                    <td><s:property value="idPedido"/></td>

                    <s:url id="editar" action="editaItem" var="editUrl">
                        <s:param name="idItem">
                            <s:property value="idItem" />
                        </s:param>
                    </s:url>
                    <s:url id="remover" action="removeItem" var="removeUrl">
                        <s:param name="idItem">
                            <s:property value="idItem" />
                        </s:param>
                    </s:url>
                    <td>
                        <a href='<s:property value="#editUrl"/>'>Editar</a>
                    </td>
                    <td>
                        <a href='<s:property value="#removeUrl"/>'>Remover</a>
                    </td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>