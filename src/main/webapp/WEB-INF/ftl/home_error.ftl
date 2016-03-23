<#include "common/header.ftl">
<#include "common/navegation-ticket.ftl">

<div class="container">
    <div class="alert alert-danger" role="alert">
        <p style="margin-left: 15px">Ticket not found. Make sure you have the correct id</p>
    </div>
    <h3 style="margin-left: 15px">Enter Ticket Number</h3>
    <form class="navbar-form navbar-left" role="search" action="/view_ticket" method="post">
        <div class="form-group">
            <input type="text" class="form-control" placeholder="EG : 16839" name="id" required="required">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

<#include "common/footer.ftl">
