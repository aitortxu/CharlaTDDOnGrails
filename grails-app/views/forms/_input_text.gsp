<div class="clearfix <g:hasErrors bean="${bean}" field="${field}">error</g:hasErrors>">
	<label for="${field}">${label}</label>

	<div class="input">
		<input id="${field}" name="${field}" type="text" value="${value}" <g:if test="${placeholder != null}">placeholder="${placeholder}"</g:if>/>
	</div>
</div>