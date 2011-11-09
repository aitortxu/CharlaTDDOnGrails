<div class="alert-message <g:if test="${flash.type}">${flash.type} </g:if>fade in" data-alert="alert">
	<a class="close" href="#">×</a>

	<p>${flash.message}</p>
</div>
<script>
	$(".alert-message").alert();
</script>