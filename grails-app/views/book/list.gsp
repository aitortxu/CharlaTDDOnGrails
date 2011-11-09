<html>
<head>
    <title>Listado de Libros</title>
    <meta name="layout" content="main"/>
    <script src="${resource(dir: 'js/vendor', file: 'bootstrap-alerts.js')}"></script>
    <script src="${resource(dir: 'js/vendor', file: 'jquery.tablesorter.min.js')}"></script>
</head>

<body>
<div class="page-header">
    <h1>Listado de Libros <g:if test="${author}"><small>Autor: ${author.name}&nbsp;<a href="<g:createLink action="list"/>">reset</a></small></g:if></h1>
</div>

<g:if test="${flash.message}">
    <g:render template="/layouts/alert" model="['flash': flash]"/>
</g:if>

<div class="row">
    <div class="span3">
        <ul class="unstyled">
            <li><a href="${createLink(action: 'create')}" class="new">Nuevo libro</a></li>
        </ul>
    </div>

    <div class="span13">

        <p>Total: ${total}</p>
        <table class="list zebra-striped">
            <thead>
            <tr>
                <th>ID</th>
                <th>Título</th>
                <th>Autores</th>
            </tr>
            </thead>
            <tbody>
            <g:each in="${books}" status="i" var="book">
                <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                    <td>${book.id}</td>
                    <td>${book.title}</td>
                    <td>
                        <g:each in="${book.authors}" var="author">
                            <a href="<g:createLink action="listByAuthorSlug"  params="['authorSlug': author.slug]"/>">${author.centuryAndName}</a>&nbsp;
                        </g:each>
                    </td>
                </tr>
            </g:each>
            </tbody>
        </table>
    </div>
</div>

<script>$(function() {
    $('table.list').tablesorter({ sortList: [
        [0,0]
    ] });
});</script>

</body>
</html>
