<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <script type="text/javascript" src="../js/jsapi.js"></script>
    <c:forEach items="${questions}" var="question">
        <script type="text/javascript">
                  google.load("visualization", "1", {packages:["corechart"]});
                  google.setOnLoadCallback(drawChart);
                  function drawChart() {

                    var data = google.visualization.arrayToDataTable([
                      ['Opcao', 'Votos'],
                      <c:forEach items="${question.options}" var="option" varStatus="loop">
                          ['${option.optionText}', <c:out value="${option.votes}" default="0"/>],
                      </c:forEach>
                    ]);

                    var options = {
                      title: '${question.questionText}'
                    };

                    var chart = new google.visualization.PieChart(document.getElementById('piechart${question.id}'));

                    chart.draw(data, options);
                  }
        </script>
    </c:forEach>

  </head>
  <body>
    <div id="piechart1" style="width: 900px; height: 500px;"></div>
    <div id="piechart2" style="width: 900px; height: 500px;"></div>
    <div id="piechart3" style="width: 900px; height: 500px;"></div>
    <div id="piechart4" style="width: 900px; height: 500px;"></div>
  </body>
</html>
