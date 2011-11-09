<div class="alert-message block-message error fade in" data-alert="alert">
	<a class="close" href="#">x</a>

	<p><strong>Oops!</strong> Hay algún error en el formulario:</p>
	<ul>
		<g:eachError bean="${bean}">
			<li><g:message error="${it}"/></li>
		</g:eachError>
	</ul>
</div>
<script type="text/javascript">
	$(".alert-message").alert();
</script>