<#include "common/header.ftl">
<#include "common/navegation-customer.ftl">


<#list deskTickets>
    <table class="table table-striped">
        <caption>${(numberOfTickets)!} Open Tickets with search <i>${(company)!}</i></caption>
        <thead>
        <tr>
            <th>View</th>
            <th>ID</th>
            <th>Subject</th>
            <th>Created</th>
            <th>Priority</th>
            <th>Status</th>
            <th>Substatus</th>
            <th>Jira ID</th>
        </tr>
        </thead>
        <tbody>
    <#items  as deskTicket>
        <tr>
            <td><a type="button" class="btn btn-primary" href="/view_ticket?id=${deskTicket.getId()?c}">View</a></td>
            <td>${deskTicket.getId()?c}</td>
            <td>${(deskTicket.getSubject())!"no subject"}</td>
            <div style="white-space: nowrap">
                <td style="width: 10%">${(((deskTicket.getCreatedAt())?substring(0, 10)))!}</td>
            </div>
            <td>${(deskTicket.getPriority())!}</td>
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
        <p>No open tickets were found. Please check spelling of customer</p>
    </div>
</#list>
<#if gotError??>
<h3 style="margin-left: 15px">Enter Customer</h3>
<form class="navbar-form navbar-left" role="search" action="/view_customer" method="post">
    <div class="form-group">
        <input type="text" class="form-control" placeholder="Eg: Alfresco" name="company" required="required">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<#else>
<hr>
<h3 style="margin-left: 15px">Search Another Customer</h3>
<form class="navbar-form navbar-left" role="search" action="/view_customer" method="post">
    <div class="form-group">
        <input type="text" class="form-control" placeholder="Eg: Alfresco" name="company" required="required">
    </div>
    <button type="submit" class="btn btn-success">Submit</button>
</form>
</#if>






<#include "common/footer.ftl">
