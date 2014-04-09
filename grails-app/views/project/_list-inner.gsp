<table class="table table-striped">
    <caption>
        <h1>
            <g:message code="project.list"/>
        </h1>
    </caption>
    <thead>
    <tr>
        <th>${message(code: 'project.name.label')}</th>
        <th>${message(code: 'project.dateCreated.label')}</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${list}" var="project">
        <tr>
            <td class="Data">
                ${project.name.encodeAsHTML()}
            </td>
            <td class="Data">
                <g:if test="${project.dateCreated != null}">
                    ${project.dateCreated}
                </g:if>
            </td>
        </tr>
    </g:each>
    </tbody>
</table>