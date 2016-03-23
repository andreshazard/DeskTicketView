<#include "common/header.ftl">
<#include "common/navegation-customer.ftl">


<div class="container">
    <h3 style="margin-left: 15px">Enter customer</h3>
    <form class="navbar-form navbar-left" role="search" action="/view_customer" method="post">
        <div class="form-group">
            <input type="text" pattern="[A-Za-z0-9\S]{1,25}" data-toggle="tooltip" data-placement="bottom" class="form-control"
                   placeholder="Eg: Alfresco" name="company" required="required" title="Enter company name. First word is enough">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>



















<#include "common/footer.ftl">
