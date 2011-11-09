<div class="clearfix <g:hasErrors bean="${bean}" field="${field}">error</g:hasErrors>">
	<label for="${field}">
		<g:if test="${locale != null}">${t.message(code: label, locale: [locale])}</g:if><g:else>${message(code: label)}</g:else>
	</label>

	<div class="input">
		<g:select name="${field}" from="${options}" optionKey="id" optionValue="name_es" value="${value}" noSelection="${['':'']}"/>
	</div>
</div>