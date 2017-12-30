<%@ include file="common/header.jspf"%>
<%@ include file="common/navbar.jspf"%>

<div class="container">
    <table class="table table-striped">
        <caption>Your Sessions are</caption>
        <thead>
        <tr>
            <th>Date</th>
            <th>Time</th>
            <th>Stage</th>
            <th>Notes</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${sessions}" var="session">
            <tr>
                <td>${session.date}</td>
                <td>${session.time}</td>
                <td>${session.stage}</td>
                <td>${session.notes}</td>
                <td><a type="button" class="btn btn-primary" href="/update-session?id=${session.idSession}">Edit</a> <a
                        type="button" class="btn btn-warning" href="/delete-session?id=${session.idSession}">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div>
        <a type="button" class="btn btn-success" href="/add-session">New Session</a>
    </div>
</div>
<%@ include file="common/footer.jspf"%>