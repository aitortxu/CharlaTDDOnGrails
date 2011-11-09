<html>
<head>
    <title>Nuevo libro</title>
    <meta name="layout" content="main"/>
    <script src="${resource(dir: 'js/vendor', file: 'bootstrap-alerts.js')}"></script>
</head>

<body>
<div class="page-header">
    <h1>Nuevo libro</h1>
</div>

<g:if test="${flash.message}">
    <g:render template="/layouts/alert" model="['message':flash.message]"/>
</g:if>

<div class="row">
    <div class="span3">
        <ul class="unstyled">
            <li><a href="${createLink(action: 'list')}" class="list">Volver al listado</a></li>
        </ul>
    </div>

    <div class="span13">
        <g:hasErrors bean="${book}">
            <g:render template="/forms/errors" model="['bean': book]"/>
        </g:hasErrors>

        <g:form method="post" action="save">
            <fieldset>
                <legend>Datos del nuevo libro:</legend>

                <g:render template="/forms/input_text"
                          model="['bean': book, 'field': 'title', 'value': book?.title, 'label': 'Título', 'placeholder': 'el título...']"/>
                <g:render template="/forms/select_multiple"
                          model="['bean': book, 'field': 'authors', 'values': book.authors*.id, 'options': authors, 'optionMethod': 'centuryAndName', 'label': 'Autores']"/>
            </fieldset>

            <div class="actions">
                <g:submitButton name="create" class="btn primary" value="${message(code: 'default.button.create.label')}"/>
            </div>

        </g:form>

    </div>
</div>
</body>
</html>