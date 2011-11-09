<div class="clearfix <g:hasErrors bean="${bean}" field="${field}">error</g:hasErrors>">
	<label for="${field}">
		<g:if test="${locale != null}">${t.message(code: label, locale: [locale])}</g:if><g:else>${message(code: label)}</g:else>
	</label>
	<div class="input">
		<ul class="media-grid">
			<li>
				<a href="${image}">
			      <img class="thumbnail" src="${image}" alt="">
			    </a>
	    	</li>
	    </ul>
    </div>
	
    
</div>