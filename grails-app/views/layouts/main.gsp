<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8"/>
    <title><g:layoutTitle default="Txinzer"/></title>

    <!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
    <!--[if lt IE 9]>
	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

    <!-- Le styles -->
    <link rel="stylesheet/less" href="${resource(dir: 'less', file: 'bootstrap.less')}"/>
    <link rel="stylesheet/less" href="${resource(dir: 'less', file: 'main.less')}"/>

    <!-- Le javascript: Vendors -->
    <script src="${resource(dir: 'js/vendor', file: 'jquery-1.6.4.min.js')}"></script>
    <script src="${resource(dir: 'js/vendor', file: 'less-1.1.3.min.js')}"></script>
    <script src="${resource(dir: 'js/vendor', file: 'bootstrap-dropdown.js')}"></script>
    <script src="${resource(dir: 'js/vendor', file: 'bootstrap-scrollspy.js')}"></script>

    <!-- Le javascript: Our stuff -->

    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" type="image/x-icon" href="${resource(dir: 'images', file: 'favico.ico')}"/>

    <!-- Le header, overwritten by child pages -->
    <g:layoutHead/>
</head>

<body>
<g:render template="/layouts/topbar"/>
<div class="container">
    <g:layoutBody/>
</div>
<script>
    $('.topbar').scrollSpy()
</script>
</body>
</html>