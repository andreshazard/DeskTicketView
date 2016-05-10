<#include "common/header.ftl">
<#include "common/navegation-today.ftl">

<div class="container">
    <#list todaysTickets>
    <table class="table table-striped">
        <caption>Open tickets of the last 24 hours</caption>
        <thead>
        <tr>
            <th>View</th>
            <th>ID</th>
            <th>Subject</th>
            <th>Created</th>
            <th>Status</th>
            <th>Substatus</th>
            <th>Jira ID</th>
        </tr>
        </thead>
        <tbody>
            <#items as deskTicket>
            <tr>
                <td><a type="button" class="btn btn-primary" href="/view_ticket?id=${deskTicket.getId()?c}">View</a></td>
                <td>${deskTicket.getId()?c}</td>
                <td>${(deskTicket.getSubject())!"no subject"}</td>
                <div style="white-space: nowrap">
                    <td style="width: 10%">${(((deskTicket.getCreatedAt())?substring(0, 10)))!}</td>
                </div>
                <td>${(deskTicket.getStatus())!}</td>
                <td>${(deskTicket.getCustomFields().getStatus())!}</td>
                <td>${(deskTicket.getCustomFields().getJiraId())!"No Jira Ticket Created"}</td>
            </tr>
            </#items>
        </tbody>
    </table>
    <#else>
        <#assign gotError=true>
    <div class="alert alert-danger" role="alert">
        <p>No open tickets</p>
    </div>
</div>
</#list>

<#include "common/footer.ftl">
