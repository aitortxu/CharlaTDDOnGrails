<div class="clearfix <g:hasErrors bean="${bean}" field="${field}">error</g:hasErrors>">
	<label for="${field}">
		<g:if test="${locale != null}">${t.message(code: label, locale: [locale])}</g:if><g:else>${message(code: label)}</g:else>
	</label>

	<div class="input">
		<ul class="inputs-list">
			<g:each in="${values}" var="radio">
				<li>
				<label>
					<input type="radio" <g:if test="${value == radio.value}">checked</g:if> name="${field}" value="${radio.value}"/>
					<span>${radio.text}</span>
				</label>
			</li>
			</g:each>
		</ul>
	</div>
</div>