<#include "common/header.ftl">
<#include "common/navegation-ticket.ftl">

<div class="container">
    ${(error)!""}
    <h3 style="margin-left: 15px">Enter Ticket Number</h3>
    <form class="navbar-form navbar-left" role="search" action="/view_ticket" method="post">
        <div class="form-group">
            <input type="number" min="1000" class="form-control" placeholder="EG : 16839" name="id" required="required">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

<#include "common/footer.ftl">
