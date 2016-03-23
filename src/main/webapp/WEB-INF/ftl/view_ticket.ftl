<#include "common/header.ftl">
<#include "common/navegation-ticket.ftl">

    <div style="font-size: 17px" class="panel panel-primary">
        <div class="panel-heading">
            <h3 class="panel-title">${deskTicket.getId()?c} - ${(deskTicket.getSubject())!"no subject"}</h3>
        </div>
        <div class="panel-body">
            <h3>Ticket Details</h3>
            <div style="white-space: nowrap">
                <p style="width: 10%"> Created ${(((deskTicket.getCreatedAt())?substring(0, 10)))!}</p>
            </div>
            <p>Priority : ${(deskTicket.getPriority())!}</p>
            <p>Status : ${(deskTicket.getStatus())!}</p>
            <p>SubStatus : <b>${(deskTicket.getCustomFields().getStatus())!}</b></p>
            <p>Jira ID : ${(deskTicket.getCustomFields().getJiraId())!"No Jira Ticket Created"}</p>
            <p>Customer : ${(customerInfo.getFirstName())!} ${(customerInfo.getLastName())!}</p>
            <p>Customer's Company : <a href="/view_customer?company=${(customerInfo.getCompanyName())!}">
                ${(customerInfo.getCompanyName())!}</a></p>
            <p>Engineer Assigned = ${(engineerAssigned.getName())!}</p>
            <p>Engineer's Email = ${(engineerAssigned.getEmail())!}<p/>
            <hr>
            <h3>Initial Message</h3>
            <p>${(message.getBody())!"No initail message on this ticket"}</p>
            <div style="overflow: auto; width: 300px height: 200px";>
                <#list replies>
                    <hr>
                    <h3>Replies</h3>
                    <#items as reply>
                        <div style="color: #989898;">
                            <#if reply.getBody() != "" && reply.getBody()??>
                            <hr>
                            <p>Sent At ${(reply.getCreatedAt()?substring(0, 10))!}</p>
                            <p>From ${(reply.getFrom())!}</p>
                            </#if>
                        </div>
                        <p>${(reply.getBody())!}</p>
                    </#items>
                <#else>
                    <p>No Replies Yet</p>
                </#list>
                <hr>
                <h3>Search Another Ticket</h3>
                    <form class="navbar-form navbar-left" role="search" action="/view_ticket" method="post">
                        <div class="form-group">
                            <input type="number" min="1000" class="form-control" placeholder="EG : 16839" name="id" required="required">
                        </div>
                        <button type="submit" class="btn btn-success">Submit</button>
                    </form>
            </div>
        </div>
    </div>


<#include "common/footer.ftl">
