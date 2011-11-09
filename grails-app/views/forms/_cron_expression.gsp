<div class="clearfix">
	<label>${message(code: 'cronExpression.time')}</label>

	<div class="input">
		<div class="inline-inputs">
			<input id="${field}.hour" name="${field}.hour" class="mini" type="text" value="${bean.hour}" placeholder="hh"/>
			<input id="${field}.minute" name="${field}.minute" class="mini" type="text" value="${bean.minute}" placeholder="mm"/>
			<input id="${field}.second" name="${field}.second" class="mini " type="text" value="${bean.second}" placeholder="ss"/>
		</div>
		<span class="help-inline">Indica la <strong>hora</strong>, <strong>minutos</strong> y <strong>segundos</strong></span>
	</div>
</div>

<div class="clearfix">
	<label>${message(code: 'cronExpression.daysOfWeek')}</label>

	<div class="input">
		<ul class="inputs-list">
			<g:each in="[2, 3, 4, 5, 6, 7, 1]" var="number">
				<li>
					<label>
						<input type="checkbox" name="${field}.daysOfWeek" <g:if test="${bean.daysOfWeek.contains(number)}">checked</g:if> value="${number}"/>
						<span>${message(code: "daysOfWeek."+number)}</span>
					</label>
				</li>
			</g:each>
		</ul>
		<span class="help-inline">Marca los días de la semana en los que quieres que se ejecute</span>
	</div>
</div>