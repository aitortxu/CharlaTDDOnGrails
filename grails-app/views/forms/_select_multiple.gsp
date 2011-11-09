<div class="clearfix <g:hasErrors bean="${bean}" field="${field}">error</g:hasErrors>">
	<label for="${field}">${label}</label>

	<div class="input">
		<g:select multiple="true" name="${field}" from="${options}" optionKey="id" optionValue="${optionMethod}" value="${values}"/>
	</div>
</div>