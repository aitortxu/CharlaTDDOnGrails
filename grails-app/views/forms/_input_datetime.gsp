<div class="clearfix <g:hasErrors bean="${bean}" field="${field}">error</g:hasErrors>">
	<label>
		<g:if test="${locale != null}">${t.message(code: label, locale: [locale])}</g:if><g:else>${message(code: label)}</g:else>
	</label>

	<div class="input">
		<div class="inline-inputs">
			<input id="${field}.date" name="${field}.date" class="small" type="text" value="${formatDate(format: 'yyyy-MM-dd', date: value)}" placeholder="Ej. 1980-05-02"/>
			<input id="${field}.time" name="${field}.time" class="mini" type="text" value="${formatDate(format: 'HH:mm', date: value)}" placeholder="Ej. 13:45"/>
		</div>
	</div>
</div>