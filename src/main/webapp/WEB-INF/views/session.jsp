<%@ include file="common/header.jspf"%>
<%@ include file="common/navbar.jspf"%>
<div class="container">
    <form:form method="post" commandName="session" class="form-horizontal">
        <form:hidden path="idSession" />
        <fieldset>
            <legend>Create/Update Session Form</legend>
            <div class="form-group">
                <div class="col-md-6">
                    <form:label path="date">Date</form:label>
                    <div class="input-group bootstrap-datepicker datepicker">
                        <form:input path="date" type="text" class="form-control" required="required" />
                        <span class="input-group-addon">
                            <i class="glyphicon glyphicon-calendar"></i>
                        </span>
                        <form:errors path="date" cssClass="text-warning" />
                    </div>
                </div>
                <div class="col-md-6">
                    <form:label path="time">Time</form:label>
                    <div class="input-group bootstrap-timepicker timepicker">
                        <form:input path="time" id="timepicker" type="text" class="form-control" required="required" />
                        <span class="input-group-addon">
                            <i class="glyphicon glyphicon-time"></i>
                        </span>
                    </div>
                    <form:errors path="time" cssClass="text-warning" />
                </div>
            </div>
            <div class="form-group">
                <form:label path="notes">Notes</form:label>
                <form:textarea path="notes" class="form-control"></form:textarea>
            </div>
        </fieldset>
        <button class="btn btn-success">Submit</button>
    </form:form>
</div>

<%@ include file="common/footer.jspf"%>

<script>
    $('#date').datepicker({
        format : 'dd/mm/yyyy'
    });
    $('#timepicker').timepicker({
        minuteStep: 1,
        template: 'modal',
        appendWidgetTo: 'body',
        showSeconds: false,
        showMeridian: false,
        defaultTime: false
    });
</script>