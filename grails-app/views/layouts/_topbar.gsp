<div class="topbar">
	<div class="topbar-inner">
		<div class="container">

			<a class="brand" href="${createLink(controller: 'book', action: 'index')}">Biblioteca</a>
			<ul class="nav">
				<li class="<g:if test="${actionName == 'list'}">active</g:if> dropdown">
					<a class="dropdown-toggle" href="#">Libros</a>
					<ul class="dropdown-menu">
						<li><a href="${createLink(controller: 'book', action: 'list')}">Listado</a></li>
						<li><a href="${createLink(controller: 'book', action: 'create')}">Crear un libro</a></li>
					</ul>
				</li>
                <li class="<g:if test="${actionName == 'listByAuthorSlug'}">active</g:if> dropdown">
					<a class="dropdown-toggle" href="#">Autores</a>
					<ul class="dropdown-menu">
						<li><a href="${createLink(controller: 'book', action: 'listByAuthorSlug', params: [authorSlug: 'charles-dickens'])}">Charles Dickens</a></li>
						<li><a href="${createLink(controller: 'book', action: 'listByAuthorSlug', params: [authorSlug: 'miguel-de-cervantes'])}">Miguel de Cervantes</a></li>
					</ul>
				</li>

			</ul>
		</div>
	</div>
</div>

<script>
	$(document).ready(function() {
		$('.topbar').dropdown();
	});
</script>