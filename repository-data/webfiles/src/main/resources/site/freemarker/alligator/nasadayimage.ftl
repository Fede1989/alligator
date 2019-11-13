<#include "../include/imports.ftl">
<#-- @ftlvariable name="nasaToday" type="it.esempio.models.NasaDayImage" -->
<#-- @ftlvariable name="isHd" type="it.esempio.components.NasaDayComponent" -->


<div >
    ${nasaToday.date}
    ${nasaToday.title}
    ${nasaToday.description}

    <#if isHd==true >
        <img src="${nasaToday.hdImage}" alt=""/>
    <#else>
        <img src="${nasaToday.image}" alt=""/>
    </#if>
</div>