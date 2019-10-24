<#include "../../include/imports.ftl">

<h1>PRODOTTI FILTRATI:</h1>
<ul>
	<#list products as product>
		<li><b>${product.title}</b> costa: ${product.price}€</li>
  </#list>
</ul>