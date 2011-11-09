<div class="clearfix <g:hasErrors bean="${bean}" field="${field}">error</g:hasErrors>">
	<label for="${field}">
		<g:if test="${locale != null}">${t.message(code: label, locale: [locale])}</g:if><g:else>${message(code: label)}</g:else>
	</label>
	<div class="input">
       	<input class="input-file" id="${field}" name="${field}" type="file" />
    </div> 
</div>